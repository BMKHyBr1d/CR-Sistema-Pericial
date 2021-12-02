package com.sample.model.states;

import com.sample.model.data.SystemData;

public class AdapterState implements SystemState{
	private SystemData systemData;
	
	public AdapterState(SystemData systemData) {
		this.systemData = systemData;
	}
	
	protected SystemData getSystemData() {
		return systemData;
	}
	
	@Override
	public SystemState redirectToMode1() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SystemState redirectToMode2() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SystemState redirectToOpenningScreen() {
		// TODO Auto-generated method stub
		return null;
	}

}
