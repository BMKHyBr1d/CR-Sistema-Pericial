package com.sample.GUI.Components;

import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;

public class MyLabel extends Label {
	public MyLabel () {
		setTextAlignment(TextAlignment.LEFT);
		setFont(Font.font("Verdana", 23));
        setPrefHeight(25);
        setTextFill(Color.SANDYBROWN);
	}
}
