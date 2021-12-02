package com.sample.model.data;

import com.sample.model.states.OpenningScreenState;
import com.sample.model.states.SystemState;

public class PericialSystem {
	private SystemData systemData;
	private SystemState systemState;
	private InferenceEngine inferenceEngine;
	
	public PericialSystem() {
		this.systemData = new SystemData();
		this.systemState = new OpenningScreenState(systemData);
		this.inferenceEngine = new InferenceEngine(systemData);
	}
	
	public SystemState getSystemState() {
		return systemState;
	}
	
	public SystemData getSystemData() {
		return systemData;
	}
	
	private void setSystemState(SystemState systemState) {
		this.systemState = systemState;
	}
	
	public void redirectToMode1(){
		setSystemState(systemState.redirectToMode1());
	}
	
	public void redirectToMode2(){
		setSystemState(systemState.redirectToMode2());
	}

	public void redirectToOpenningScreen() {
		systemData.resetSystemData();
		setSystemState(systemState.redirectToOpenningScreen());	
	}
	
	public void savePatientData(Patient patient) {
		systemData.savePatientData(patient);
	}
	
	public void loadPatientData() {
		systemData.loadPatientData();
	}
	
	public String getTextAreaContent() {
		return systemData.getTextAreaContent();
	}
	
	public void openPatientsFile(String filePath){
		systemData.openPatientsFile(filePath);
	}
	
	public void saveResultsOnFile(String filePath){
		systemData.saveResultsOnFile(filePath);
	}
	
	public void testPatient(Patient patient) {
		inferenceEngine.testPatient(patient);
	}
	
	public void startInferenceEngine(){
		inferenceEngine.fireRules();
	}
	
}
