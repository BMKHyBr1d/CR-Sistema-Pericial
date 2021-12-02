package com.sample.GUI;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import com.sample.model.data.ObservableModel;
import com.sample.model.recursos.ImageLoader;

import javafx.geometry.Pos;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

public class SystemRoot extends StackPane{

	private ObservableModel observableModel;
	//SystemPane systemPane;
	private OpenningScreenUI openningScreen;
	private SystemModeOneUI modeOneInterface;
	private SystemModeTwoUI modeTwoInterface;
	
	public SystemRoot(ObservableModel observableModel) {
		this.observableModel = observableModel;
		
		setupLayout();
		setupComponents();
	}
	
	private void setupLayout() {
		setMinSize(1000, 700);
		setMaxSize(1200,700);
        setBackground(new Background(
        		new BackgroundImage(ImageLoader.getImage("bg.jpg"), 
        				BackgroundRepeat.SPACE, 
        				BackgroundRepeat.SPACE, 
        				BackgroundPosition.CENTER, 
        				BackgroundSize.DEFAULT)));
        //int dimMin = Math.min(1000, 600);
       // BackgroundSize backgroundSize = new BackgroundSize(1200,500, false, false, false, false);
	}
	
	private void  setupComponents() {
        openningScreen = new OpenningScreenUI(observableModel);
        modeOneInterface = new SystemModeOneUI(observableModel);
		modeTwoInterface = new SystemModeTwoUI(observableModel);

		getChildren().addAll(modeTwoInterface, modeOneInterface, openningScreen);
	}

}
