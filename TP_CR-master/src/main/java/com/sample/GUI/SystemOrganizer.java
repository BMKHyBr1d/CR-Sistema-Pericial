package com.sample.GUI;

import com.sample.model.data.ObservableModel;

import javafx.scene.layout.Pane;

public class SystemOrganizer {
	private Pane systemRoot;
	
	public SystemOrganizer(ObservableModel observableModel) {
		systemRoot = new SystemRoot(observableModel);
	}
	
	public Pane getSystemRoot() {
		return systemRoot;
	}
}
