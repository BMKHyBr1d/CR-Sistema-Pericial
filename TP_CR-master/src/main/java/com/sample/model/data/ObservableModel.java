package com.sample.model.data;

import java.beans.PropertyChangeSupport;

import com.sample.model.states.SystemState;

public class ObservableModel extends PropertyChangeSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PericialSystem pericialSystem;
	
	public ObservableModel(PericialSystem pericialSystem) {
		super(pericialSystem);
		this.pericialSystem = pericialSystem;
	}

	public SystemState getSystemState() {
		return pericialSystem.getSystemState();
	}
	
	public void redirectToMode1() {
        pericialSystem.redirectToMode1();
        firePropertyChange(null, false, true);
	}
	
	public void redirectToMode2() {
		pericialSystem.redirectToMode2();
        firePropertyChange(null, false, true);
	}

	public void redirectToOpenningScreen() {
		pericialSystem.redirectToOpenningScreen();
        firePropertyChange(null, false, true);
	}
	
	
	public void savePatientData(Patient patient) {
		pericialSystem.savePatientData(patient);
		firePropertyChange(null, false, true);
	}
	
	public void loadPatientData() {
		pericialSystem.loadPatientData();
	}
	
	public String getTextAreaContent() {
		return pericialSystem.getTextAreaContent();
	}
	
	public void saveResultsOnFile(String filePath) {
		pericialSystem.saveResultsOnFile(filePath);
		firePropertyChange(null, false, true);
	}
	
	public void openPatientsFile(String filePath) {
		pericialSystem.openPatientsFile(filePath);
		firePropertyChange(null, false, true);
	}
	
	public void testPatient(Patient patient) {
		pericialSystem.testPatient(patient);
		firePropertyChange(null, false, true);
	}
	
	public void startInferenceEngine() {
		pericialSystem.startInferenceEngine();
		firePropertyChange(null, false, true);
	}
}
