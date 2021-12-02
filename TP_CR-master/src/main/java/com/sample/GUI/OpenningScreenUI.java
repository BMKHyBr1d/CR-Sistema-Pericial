package com.sample.GUI;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import com.sample.GUI.Components.MyButton;
import com.sample.model.data.ObservableModel;
import com.sample.model.states.OpenningScreenState;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class OpenningScreenUI extends VBox implements PropertyChangeListener {
	ObservableModel observableModel;
   
	public OpenningScreenUI(ObservableModel observableModel){
		this.observableModel = observableModel;
		observableModel.addPropertyChangeListener(this);
		
		setupComponents();
	}
	
	private void setupComponents() {
		MyButton redirectToMode1Btn = new MyButton("Modo 1 - Inserir dados manualmente");
		MyButton redirectToMode2Btn = new MyButton("Modo 2 - Utilizar ficheiro de dados");
		
		getChildren().addAll(redirectToMode1Btn, redirectToMode2Btn);
		setSpacing(50);
	    setAlignment(Pos.CENTER);
	    
	    redirectToMode1Btn.setOnAction(new RedirectToMode1());
	    redirectToMode2Btn.setOnAction(new RedirectToMode2());
	}
	
	public class RedirectToMode1 implements EventHandler<ActionEvent>{
		@Override
	    public void handle(ActionEvent e){
	        observableModel.redirectToMode1();
	    }
	}

	public class RedirectToMode2 implements EventHandler<ActionEvent>{
		@Override
	    public void handle(ActionEvent e){
	        observableModel.redirectToMode2();
	    }
	}
	
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		// TODO Auto-generated method stub
		setVisible(observableModel.getSystemState() instanceof OpenningScreenState);
	}
}


