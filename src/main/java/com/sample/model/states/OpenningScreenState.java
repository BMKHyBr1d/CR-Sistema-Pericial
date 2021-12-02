package com.sample.model.states;

import com.sample.model.data.SystemData;

public class OpenningScreenState extends AdapterState{

	public OpenningScreenState(SystemData systemData) {
		super(systemData);
		// TODO Auto-generated constructor stub
	}
	
	public SystemState redirectToMode1() {
		return new ModeOneState(this.getSystemData());
	}
	
	public SystemState redirectToMode2() {
		return new ModeTwoState(this.getSystemData());
	}
}
