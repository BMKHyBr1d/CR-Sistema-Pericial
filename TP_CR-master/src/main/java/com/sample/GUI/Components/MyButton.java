package com.sample.GUI.Components;

import javafx.scene.control.Button;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;

public class MyButton extends Button{
	private final String BUTTON_STYLE = "-fx-background-color: transparent;";
    
	public MyButton(String text) {
		setText(text);
		setTextAlignment(TextAlignment.CENTER);
		setFont(Font.font("Verdana", 23));
        setPrefHeight(50);
        this.setStyle(BUTTON_STYLE);
        setTextFill(Color.SANDYBROWN);
        registaListeners();
	}

    private void registaListeners() {
        this.setOnMouseEntered((e) -> {
            setEffect(new DropShadow());
        });
        
        this.setOnMouseExited((e) -> {
            setEffect(null);
        });
    }
}
