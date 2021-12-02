package com.sample.model.states;

import com.sample.model.data.SystemData;

public class ModeOneState extends AdapterState{

	public ModeOneState(SystemData systemData) {
		super(systemData);
		// TODO Auto-generated constructor stub
	}
	
	public SystemState redirectToOpenningScreen() {
		return new OpenningScreenState(this.getSystemData());
	}
}
