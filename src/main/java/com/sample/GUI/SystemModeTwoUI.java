package com.sample.GUI;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;

import com.sample.GUI.Components.MyButton;
import com.sample.GUI.Components.MyLabel;
import com.sample.model.data.ObservableModel;
import com.sample.model.states.ModeTwoState;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;

public class SystemModeTwoUI extends BorderPane implements PropertyChangeListener{
	private ObservableModel observableModel;
	
	private VBox container;
	private HBox topContainer, bottomContainer;
	TextArea pacientes, resultados;
	private MyButton btnConfirma, btnCancelar;
	
	public SystemModeTwoUI(ObservableModel observableModel) {
		setVisible(false);
		this.observableModel = observableModel;
		observableModel.addPropertyChangeListener(this);
		
		FileChooser fileChooser = new FileChooser();
        
        // Menu
        MenuBar menuBar = new MenuBar();

        Menu fileMenu = new Menu("File");
        MenuItem fileOpen = new MenuItem("Abrir");
        MenuItem fileSave = new MenuItem("Guardar");
        MenuItem fileExit = new MenuItem("Sair");

        fileMenu.getItems()
                .addAll(fileOpen, fileSave, fileExit);
        
        menuBar.getMenus()
                .add(fileMenu);
        
        //setTop();
        setTop(menuBar);
        
        // Event do menu
        // File -> Save
        fileOpen.setOnAction(
                (ActionEvent e) -> {
                    File f = fileChooser.showOpenDialog(getScene().getWindow());
                    if (f != null) {
                        // METODO DO OBSERVAVEL PARA ABRIR O FICHEIRO DE PACIENTES   EXEMPLO::: 
                    	observableModel.openPatientsFile(f.getAbsolutePath());
                    	pacientes.setText(observableModel.getTextAreaContent());
                    	pacientes.setScrollTop(Double.MAX_VALUE);
                    }
                    
                }
        );

        // File -> Load
        fileSave.setOnAction(
                (ActionEvent e) -> {
                    File f = fileChooser.showSaveDialog(getScene().getWindow());
                    if (f != null) {
                    	observableModel.saveResultsOnFile(f.getAbsolutePath());
                    	System.out.println("funcionou");
                    }
                }
        );

        // File -> Exit
        fileExit.setOnAction(
                (ActionEvent e) -> {
                    //Platform.exit();
                }
        );
		
        container = new VBox(50);
        
		topContainer = new HBox(25);
		topContainer.setAlignment(Pos.CENTER);
		bottomContainer = new HBox();
		bottomContainer.setAlignment(Pos.BOTTOM_CENTER);
		container.getChildren().addAll(topContainer, bottomContainer);
		container.setPadding(new Insets(25));
		container.setAlignment(Pos.TOP_CENTER);
		setCenter(container);
		setComponents();
		registaListeners();
	}

	public void setComponents() {
		MyLabel pacientesLabel, resultadosLabel;
		
		VBox vbox1 = new VBox(5);
		HBox hbox1 = new HBox(365);
		HBox hbox2 = new HBox(5);
		
		pacientesLabel = new MyLabel();
		pacientesLabel.setText("Pacientes: ");
	
		resultadosLabel = new MyLabel();
		resultadosLabel.setText("Resultados: ");
		pacientes = new TextArea();
		resultados = new TextArea();
		
		pacientes.setEditable(false);
		pacientes.setMinSize(300, 450);
		resultados.setEditable(false);
		resultados.setMinSize(300, 450);
		
		hbox1.getChildren().addAll(pacientesLabel, resultadosLabel);
		hbox2.getChildren().addAll(pacientes, resultados);
		vbox1.getChildren().addAll(hbox1, hbox2);
		topContainer.getChildren().addAll(vbox1);
		
		HBox hbox3 = new HBox();
		
		btnConfirma = new MyButton("Correr Regras");
		btnCancelar = new MyButton("Cancelar");
		
		hbox3.getChildren().addAll(btnConfirma, btnCancelar);
		bottomContainer.getChildren().add(hbox3);
	}
	
	private void registaListeners() {
		btnCancelar.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				pacientes.clear();
				resultados.clear();
				observableModel.redirectToOpenningScreen();
			}
		});
		
		btnConfirma.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				observableModel.startInferenceEngine();
				observableModel.loadPatientData();
				resultados.setText(observableModel.getTextAreaContent());
				resultados.setScrollTop(Double.MAX_VALUE);
			}
		});
	}
	
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		if(observableModel.getSystemState() instanceof ModeTwoState) {
			setVisible(true);
		}else{
			setVisible(false);
		}
	}
}
