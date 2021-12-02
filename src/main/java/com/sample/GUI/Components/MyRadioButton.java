package com.sample.GUI.Components;

import javafx.scene.control.RadioButton;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;

public class MyRadioButton extends RadioButton{
	public MyRadioButton(String txt) {
		setText(txt);
		setTextAlignment(TextAlignment.CENTER);
		setFont(Font.font("Verdana", 18));
        setTextFill(Color.SANDYBROWN);
	}
}
