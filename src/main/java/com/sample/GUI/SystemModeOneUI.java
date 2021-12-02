package com.sample.GUI;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;

import com.sample.GUI.Components.MyButton;
import com.sample.GUI.Components.MyLabel;
import com.sample.GUI.Components.MyRadioButton;
import com.sample.model.data.ObservableModel;
import com.sample.model.states.ModeOneState;
import com.sample.model.data.Patient;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;

public class SystemModeOneUI extends VBox implements PropertyChangeListener{
	private ObservableModel observableModel;
	
	private HBox topContainer;
	private HBox bottomContainer;
	
	private VBox topRightContainer;
	private VBox topLeftContainer;
	
	private HBox buttonGroup1;
	
	private MyLabel sexGroupLabel;
	private MyLabel firstNameLabel;
	private MyLabel lastNameLabel;
	private MyLabel ageLabel;
	private MyLabel tumorLengthLabel;
	private MyLabel indicatorWHOLabel;
	private MyLabel stage2DeseaseLabel;
	private MyLabel stage3DeseaseLabel;
	private MyLabel diagnose1Label;
	private MyLabel diagnose2Label;
	private MyLabel diagnose3Label;
	private MyLabel diagnose4Label;
	private MyLabel consentmentTermLabel;
	private MyLabel pregnancyLabel;
	private MyLabel radioterapyLabel;
	private MyLabel activeInfectionLabel;
	private MyLabel neutrofilosLabel;
	private MyLabel plaquetasLabel;
	private MyLabel bilirrubinaLabel;
	private MyLabel creatininaLabel;
	private MyLabel controloPulmonarLabel;
	
	private TextField firstName;
	private TextField lastName;
	private TextField age;
	private TextField tumorLength;
	private TextField indicatorWHO;
	private TextField neutrofilos;
	private TextField plaquetas;
	private TextField bilirrubina;
	private TextField creatinina;
	private TextField controloPulmonar;
	
	private ToggleGroup sex;
	private MyRadioButton male;
	private MyRadioButton female;
	
	private CheckBox stage2Desease;
	private CheckBox stage3Desease;
	private CheckBox diagnose1;
	private CheckBox diagnose2;
	private CheckBox diagnose3;
	private CheckBox diagnose4;
	private CheckBox consentmentTerm;
	private CheckBox pregnancy;
	private CheckBox radioterapy;
	private CheckBox activeInfection;
	
	private MyButton confirma;
	private MyButton voltar;
	private MyButton saveData;
	private TextArea results;
	
	private FileChooser fileChooser;
	
	public SystemModeOneUI(ObservableModel observableModel){
		setVisible(false);
		this.observableModel = observableModel;
		observableModel.addPropertyChangeListener(this);
		setupComponents();
		registaListeners();
		
		fileChooser = new FileChooser();
	}
	
	private void setupComponents() {
		
		topContainer = new HBox();
		bottomContainer = new HBox();
		
		topRightContainer = new VBox();
		topLeftContainer = new VBox(10);
		topContainer.getChildren().addAll(topLeftContainer, topRightContainer);
		topContainer.setAlignment(Pos.TOP_CENTER);
		topContainer.setSpacing(50);
		topContainer.setPadding(new Insets(25));
		getChildren().addAll(topContainer, bottomContainer);
		
		setupTopLeftContainer();
		setupTopRightContainer();
		setupBottomContainer();
	}

	private void setupTopLeftContainer() {
		sex = new ToggleGroup();
		buttonGroup1 = new HBox(); 
		sexGroupLabel = new MyLabel();
		sexGroupLabel.setText("Sexo: ");
		
		male = new MyRadioButton("Masculino");
		male.setToggleGroup(sex);
		female = new MyRadioButton("Feminino");
		female.setToggleGroup(sex);
		sex.selectToggle(male);
		
		
		buttonGroup1.getChildren().addAll(female, male);
		buttonGroup1.setSpacing(20);
		
		HBox box1 = new HBox(5);
		HBox box2 = new HBox(5);
		HBox box3 = new HBox(5);
		HBox box4 = new HBox(5);

		firstNameLabel = new MyLabel(); 
	  	firstNameLabel.setText("Primeiro nome:");
	  	firstName = new TextField(); 
	  	//firstName.setT
	  	firstName.setMaxWidth(200);
	  	
		lastNameLabel = new MyLabel();
		lastNameLabel.setText("Último nome:");
		lastName = new TextField();
		lastName.setMaxWidth(200);
		
		
		ageLabel = new MyLabel();
		ageLabel.setText("Idade: ");
		ageLabel.setMinWidth(230);
		age = new TextField();
		age.setMaxWidth(200);
		box1.getChildren().addAll(ageLabel, age);
		
		tumorLengthLabel = new MyLabel();
		tumorLengthLabel.setText("Tamanho do tumor:");
		tumorLength = new TextField();
		tumorLength.setMaxWidth(200);
		box2.getChildren().addAll(tumorLengthLabel, tumorLength);

		indicatorWHOLabel = new MyLabel();
		indicatorWHOLabel.setText("Indicador de saúde:");
		indicatorWHO = new TextField();
		indicatorWHO.setMaxWidth(200);
		box3.getChildren().addAll(indicatorWHOLabel, indicatorWHO);
		
		box4.getChildren().addAll(sexGroupLabel, buttonGroup1);
		results = new TextArea();
		results.setEditable(false);
		results.setMinSize(300, 300);
		topLeftContainer.getChildren().addAll(firstNameLabel, firstName, lastNameLabel, lastName, box1, box2, box3, box4, results);
	}
	
	private void setupTopRightContainer() {
		VBox vbox1 = new VBox(5);
		vbox1.setAlignment(Pos.CENTER);
		VBox vbox2 = new VBox(5);
		vbox2.setAlignment(Pos.CENTER);
		VBox vbox3 = new VBox(5);
		vbox3.setAlignment(Pos.CENTER);
		
		HBox box1 = new HBox();
		HBox box2 = new HBox();
		HBox box3 = new HBox();
		HBox box4 = new HBox();
		HBox box5 = new HBox();
		HBox box6 = new HBox();
		HBox box7 = new HBox();
		HBox box8 = new HBox();
		HBox box9 = new HBox();
		HBox box10 = new HBox();
		HBox box11 = new HBox();
		HBox box12 = new HBox();
		HBox box13 = new HBox();
		HBox box14 = new HBox();
		HBox box15 = new HBox();
		
		stage2DeseaseLabel = new MyLabel();
		stage2DeseaseLabel.setText("Doença estágio 2 ");
		stage2DeseaseLabel.setMinWidth(350);
		stage2Desease = new CheckBox();
		box1.getChildren().addAll(stage2DeseaseLabel, stage2Desease);
		
		stage3DeseaseLabel = new MyLabel();
		stage3DeseaseLabel.setText("Doença estágio 3 ");
		stage3DeseaseLabel.setMinWidth(350);
		stage3Desease = new CheckBox();
		box2.getChildren().addAll(stage3DeseaseLabel, stage3Desease);
		
		diagnose1Label = new MyLabel();
		diagnose1Label.setText("Carcinoma espinocelular ");
		diagnose1Label.setMinWidth(350);
		diagnose1 = new CheckBox();
		box3.getChildren().addAll(diagnose1Label, diagnose1);
		
		diagnose2Label = new MyLabel();
		diagnose2Label.setText("Carcinoma indiferenciado ");
		diagnose2Label.setMinWidth(350);
		diagnose2 = new CheckBox();
		box4.getChildren().addAll(diagnose2Label, diagnose2);
		
		diagnose3Label = new MyLabel();
		diagnose3Label.setText("Siewert I ");
		diagnose3Label.setMinWidth(350);
		diagnose3 = new CheckBox();
		box5.getChildren().addAll(diagnose3Label, diagnose3);
		
		diagnose4Label = new MyLabel();
		diagnose4Label.setText("Siewert II ");
		diagnose4Label.setMinWidth(350);
		diagnose4 = new CheckBox();
		box6.getChildren().addAll(diagnose4Label, diagnose4);
		
		consentmentTermLabel = new MyLabel();
		consentmentTermLabel.setText("Termo de consentimento ");
		consentmentTermLabel.setMinWidth(350);
		consentmentTerm = new CheckBox();
		box7.getChildren().addAll(consentmentTermLabel, consentmentTerm);
		
		pregnancyLabel = new MyLabel();
		pregnancyLabel.setText("Gravida ou lactante ");
		pregnancyLabel.setMinWidth(350);
		pregnancy = new CheckBox();
		pregnancy.setSelected(false);
		pregnancy.setDisable(true);
		box8.getChildren().addAll(pregnancyLabel, pregnancy);
		
		radioterapyLabel = new MyLabel();
		radioterapyLabel.setText("Rádioterapia prévia ");
		radioterapyLabel.setMinWidth(350);
		radioterapy = new CheckBox();
		box9.getChildren().addAll(radioterapyLabel, radioterapy);
		
		activeInfectionLabel = new MyLabel();
		activeInfectionLabel.setText("Infeção ativa ");
		activeInfectionLabel.setMinWidth(350);
		activeInfection = new CheckBox();
		box10.getChildren().addAll(activeInfectionLabel, activeInfection);
		
		neutrofilosLabel = new MyLabel();
		neutrofilosLabel.setText("Contagem de neutrófilos ");
		neutrofilosLabel.setMinWidth(350);
		neutrofilos = new TextField("0");
		box11.getChildren().addAll(neutrofilosLabel, neutrofilos);
		
		plaquetasLabel = new MyLabel();
		plaquetasLabel.setText("Contagem de plaquetas ");
		plaquetasLabel.setMinWidth(350);
		plaquetas = new TextField("0");
		box12.getChildren().addAll(plaquetasLabel, plaquetas);
		
		bilirrubinaLabel = new MyLabel();
		bilirrubinaLabel.setText("Concentração de Bilirrubina ");
		bilirrubinaLabel.setMinWidth(350);
		bilirrubina = new TextField("0");
		box13.getChildren().addAll(bilirrubinaLabel, bilirrubina);
		
		creatininaLabel = new MyLabel();
		creatininaLabel.setText("Contagem de creatinina ");
		creatininaLabel.setMinWidth(350);
		creatinina = new TextField("0");
		box14.getChildren().addAll(creatininaLabel, creatinina);
		
		controloPulmonarLabel = new MyLabel();
		controloPulmonarLabel.setText("Controlo da função pulmonar ");
		controloPulmonarLabel.setMinWidth(350);
		controloPulmonar = new TextField("0");
		box15.getChildren().addAll(controloPulmonarLabel, controloPulmonar);
		
		vbox1.getChildren().addAll(box1, box2, box3, box4, box5, box6, box7);
		vbox2.getChildren().addAll(box8, box9, box10);
		vbox3.getChildren().addAll(box11, box12, box13, box14, box15);
		topRightContainer.getChildren().addAll(vbox1, vbox2, vbox3);
		topRightContainer.setSpacing(20);
	}
	
	private void setupBottomContainer() {
		confirma = new MyButton("Confirmar");
		voltar = new MyButton("Cancelar");
		saveData = new MyButton("Guardar");
		
		HBox box1 = new HBox();
		box1.setAlignment(Pos.CENTER);
		box1.getChildren().addAll(confirma, voltar, saveData);
		box1.setSpacing(100);
		bottomContainer.getChildren().add(box1);
		bottomContainer.setAlignment(Pos.BASELINE_CENTER);
	}
	
	private void registaListeners() {
		confirma.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				
				Patient newPatient = new Patient();
				
				if(getPatientDataFromScreen(newPatient) == false) {
					Alert alerta = new Alert(AlertType.ERROR);
					alerta.setTitle("Erro");
					alerta.setContentText("Ocorreu um erro ao introduzir o paciente no sistema");
					alerta.showAndWait();
				}
				else {
					observableModel.testPatient(newPatient);
					observableModel.savePatientData(newPatient);
					results.setText(observableModel.getTextAreaContent());
					results.setScrollTop(Double.MAX_VALUE);
				}
			}
		});
		
		voltar.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				results.clear();
				observableModel.redirectToOpenningScreen();
			}
		});
		
		saveData.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				File f = fileChooser.showSaveDialog(getScene().getWindow());
                if (f != null) {
                	observableModel.saveResultsOnFile(f.getAbsolutePath());
                	System.out.println("funcionou");
                }
			}
		});
		female.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				pregnancy.setDisable(false);
			}
		});
		male.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				pregnancy.setSelected(false);
				pregnancy.setDisable(true);
			}
		});
	}
	
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		// TODO Auto-generated method stub
		if(observableModel.getSystemState() instanceof ModeOneState) {
			setVisible(true);
		}else{
			setVisible(false);
		}
	}
	
	private boolean getPatientDataFromScreen(Patient patient) {
		try {
			patient.setFirstName(firstName.getText());
			patient.setLastName(lastName.getText());
			
			int ageAux = Integer.parseInt(age.getText());
			patient.setAge(ageAux);
			int tumorLengthAux = Integer.parseInt(tumorLength.getText());
			patient.setTumorSize(tumorLengthAux);
			int healthIndicatorAux = Integer.parseInt(indicatorWHO.getText());
			patient.setHealthIndicator(healthIndicatorAux);
			
			String patientSex = new String();
			if(male.isSelected() == true) {
				patientSex = "masculino";
			}else {
				patientSex = "feminino";
			}
			patient.setSex(patientSex);
			
			patient.setStage2Desease(stage2Desease.isSelected());
			patient.setStage3Desease(stage3Desease.isSelected());
			patient.setDiagnose1(diagnose1.isSelected());
			patient.setDiagnose2(diagnose2.isSelected());
			patient.setDiagnose3(diagnose3.isSelected());
			patient.setDiagnose4(diagnose4.isSelected());
			patient.setConsentmentTerm(consentmentTerm.isSelected());
			patient.setPregnancy(pregnancy.isSelected());
			patient.setRadioterapy(radioterapy.isSelected());
			patient.setActiveInfection(activeInfection.isSelected());
			
			float neutrophilsCount = Float.parseFloat(neutrofilos.getText());
			patient.setNeutrophilsCount(neutrophilsCount);
			float plateletsCount = Float.parseFloat(plaquetas.getText());
			patient.setPlateletsCount(plateletsCount);
			float bilirubinCount = Float.parseFloat(bilirrubina.getText());
			patient.setBilirubinCount(bilirubinCount);
			float creatinineCount = Float.parseFloat(creatinina.getText());
			patient.setCreatinineCount(creatinineCount);
			float controlOfLungFunction =  Float.parseFloat(controloPulmonar.getText());
			patient.setControlOfLungFunction(controlOfLungFunction);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
}
