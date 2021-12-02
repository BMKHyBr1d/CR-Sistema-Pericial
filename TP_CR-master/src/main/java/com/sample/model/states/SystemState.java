package com.sample.model.states;

public interface SystemState {

	public SystemState redirectToMode1();
	public SystemState redirectToMode2();
	public SystemState redirectToOpenningScreen();
}
