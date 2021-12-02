package com.sample;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import com.sample.model.data.Patient;
public class clonationMachine {
	
	public static final void main(String[] args){
		String folderPath = "C://Patients//";
		String fileName;
		int numberOfPacients;
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> floats = new ArrayList<Integer>();
		ArrayList<Integer> booleans = new ArrayList<Integer>();
		Random random = new Random();
		
		try {
			
			System.out.println("nome ficheiro: ");
			fileName = scanner.nextLine();
            String filePath = new String(folderPath.concat("\\" + fileName));
            
			FileOutputStream fileOutputStream = new FileOutputStream(filePath);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            
            System.out.println("numero de pacientes: ");
            numberOfPacients = scanner.nextInt();
            
            int i = 1;
            while(i <= numberOfPacients) {
            	Patient newPatient = new Patient();
            	
            	// 3 STRINGS
            	String paciente = "paciente";
            	
            	newPatient.setFirstName(paciente);
            	newPatient.setLastName(Integer.toString(i));
            	
            	int sex = random.nextInt(2);
            	if(sex == 0) {
            		newPatient.setSex("masculino");
            	}else{
            		newPatient.setSex("feminino");
            		int pregnant = random.nextInt(2);
            		if(pregnant == 0)
            			newPatient.setPregnancy(false);
            		else
            			newPatient.setPregnancy(true);
            	}
            	
            	//5 FLOATS 0-confima alinea 1-nao confirma alinea
            	int j = 0;
            	while(j < 5){
            		floats.add(new Integer(random.nextInt(2)));
            		j++;
            	}
            	if(floats.get(0) == 0) {
            		newPatient.setControlOfLungFunction(0);
            	}else {
            		newPatient.setControlOfLungFunction(30);
            	}
            	if(floats.get(1) == 0) {
            		newPatient.setNeutrophilsCount(0);
            	}else {
            		newPatient.setNeutrophilsCount(20);
            	}
            	if(floats.get(2) == 0) {
            		newPatient.setPlateletsCount(50);
            	}else {
            		newPatient.setPlateletsCount(200);
            	}
            	if(floats.get(3) == 0) {
            		newPatient.setBilirubinCount(5);
            	}else {
            		newPatient.setBilirubinCount(1);
            	}
            	if(floats.get(4) == 0) {
            		newPatient.setCreatinineCount(200);
            	}else {
            		newPatient.setCreatinineCount(100);
            	}
            	
            	
            	int age = random.nextInt(100);
            	newPatient.setAge(new Integer(age));
            	int healthIndicator = random.nextInt(4);
            	newPatient.setHealthIndicator(healthIndicator);
            	int tumorLocation = random.nextInt(2);
            	if(tumorLocation == 0) {
            		newPatient.setTumorSize(4);
            	}else {
            		newPatient.setTumorSize(0);
            	}
            	
            	int k = 0;
            	while(k < 9) {
            		booleans.add(new Integer(random.nextInt(2)));
            		k++; 
            	}
            	
            	if(booleans.get(0) == 0) {
            		newPatient.setDiagnose1(true);
            	}else {
            		newPatient.setDiagnose1(false);
            	}
            	if(booleans.get(1) == 0) {
            		newPatient.setDiagnose2(true);
            	}else {
            		newPatient.setDiagnose2(false);
            	}
            	if(booleans.get(2) == 0) {
            		newPatient.setDiagnose3(true);
            	}else {
            		newPatient.setDiagnose3(false);
            	}
            	if(booleans.get(3) == 0) {
            		newPatient.setDiagnose4(true);
            	}else {
            		newPatient.setDiagnose4(false);
            	}
            	if(booleans.get(4) == 0) {
            		newPatient.setStage2Desease(true);
            	}else {
            		newPatient.setStage2Desease(false);
            	}
            	if(booleans.get(5) == 0) {
            		newPatient.setStage3Desease(true);
            	}else {
            		newPatient.setStage3Desease(false);
            	}
            	if(booleans.get(6) == 0) {
            		newPatient.setConsentmentTerm(true);
            	}else {
            		newPatient.setConsentmentTerm(false);
            	}
            	if(booleans.get(7) == 0) {
            		newPatient.setRadioterapy(true);
            	}else {
            		newPatient.setRadioterapy(false);
            	}
            	if(booleans.get(8) == 0) {
            		newPatient.setActiveInfection(true);
            	}else {
            		newPatient.setActiveInfection(false);
            	}
            	System.out.println(newPatient.toString());
            	objectOutputStream.writeObject(newPatient);
            	floats.clear();
            	booleans.clear();
            	i++;
            }
            
            objectOutputStream.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
	}
}
