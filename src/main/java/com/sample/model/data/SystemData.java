package com.sample.model.data;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SystemData{
	private ArrayList<Patient> patients;
	private String textAreaContent;
	
	public SystemData(){
		patients = new ArrayList<Patient>();
		textAreaContent = new String();
	}
	
	public String getTextAreaContent() {
		return textAreaContent;
	}
	
	public Patient getPatientByIndex(int index) {
		return patients.get(index);
	}
	
	public int getNumberOfPatients() {
		return patients.size();
	}
	
	public void openPatientsFile(String filePath) {
		 try {
	            FileInputStream fileInputStream = new FileInputStream(filePath);
	            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
	 
	            while(fileInputStream.available() != 0) {
	            	Patient obj = (Patient)objectInputStream.readObject();
	            	patients.add(obj);
	            	textAreaContent = textAreaContent.concat(patients.get(patients.size()-1).toString() + ".\n");
	            }
	            
	            int i = 0;
	            while(i < patients.size()) {
	            	System.out.println("Paciente "+ patients.get(i).getFirstName());
	            	i++;
	            }
	            
	            objectInputStream.close();

	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
	}
	
	public void showFileData() {
		int i = 0;
		
		while(i < patients.size()) {
        	System.out.println("Paciente " + i + ": " + patients.get(i).getFirstName()+
        			patients.get(i).getLastName());
        	i++;
        }
	}
	
	public void savePatientData(Patient patient) {
		patients.add(patient);
		
		textAreaContent = textAreaContent.concat(patients.get(patients.size()-1).toString() + ". Selecionado: " + patients.get(patients.size()-1).isSelectedForTreatment() + ".\n");
		if(patient.getTreatment() != null) {
			if(patient.getTreatment() == "") patient.setTreatment("Não necessita de fazer exames extra");
			textAreaContent = textAreaContent.concat("Extra: " + patient.getTreatment() + ".\n");
		}
	}
	
	public void loadPatientData() {
		int i = 0;
		textAreaContent = "";
		while (i < getNumberOfPatients()) {
			textAreaContent = textAreaContent.concat(patients.get(i).toString() + ". Selecionado: " + patients.get(i).isSelectedForTreatment() + ".\n");
			if(patients.get(i).getTreatment() != null) {
				if(patients.get(i).getTreatment() == "") patients.get(i).setTreatment("Não necessita de fazer exames extra");
				textAreaContent = textAreaContent.concat("Extra: " + patients.get(i).getTreatment() + ".\n");
			}
			i++;
		}
	}
	
	public void resetSystemData() {
		patients.clear();
		textAreaContent = "";
	}
	
	public void saveResultsOnFile(String filePath){
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(filePath);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            
            int i=0;
            while(i < patients.size()) {
            	objectOutputStream.writeObject(patients.get(i));
            	i++;
            }
            
            objectOutputStream.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
	}
}
