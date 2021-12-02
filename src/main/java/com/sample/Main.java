package com.sample;

import com.sample.GUI.SystemOrganizer;
import com.sample.model.data.ObservableModel;
import com.sample.model.data.PericialSystem;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		ObservableModel observableModel = new ObservableModel(new PericialSystem());
		SystemOrganizer systemOrganizer = new SystemOrganizer(observableModel);
		
		Scene scene = new Scene(systemOrganizer.getSystemRoot());
		
		primaryStage.setTitle("Pericial system");
		primaryStage.setResizable(false);  
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static final void main(String[] args){
		launch(args);
	}
};
