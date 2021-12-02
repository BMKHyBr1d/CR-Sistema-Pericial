package com.sample.model.data;

import java.io.Serializable;

public class Patient implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String firstName;
	private String lastName;
	private String sex;
	
	private float neutrophilsCount, plateletsCount, bilirubinCount, creatinineCount, controlOfLungFunction;
	private int age, tumorSize, healthIndicator;
	private boolean stage2Desease, stage3Desease;
	private boolean diagnose1, diagnose2, diagnose3;
	private boolean diagnose4, consentmentTerm, pregnancy;
	private boolean radioterapy, activeInfection;
	private boolean selectedForTreatment;
	
	private boolean stomachIncluded;
	private boolean lungsAffected;
	private boolean endoscopicInjuries;
	private String treatment;

	public Patient(String firstName, String lastName, String sex, float neutrophilsCount, float plateletsCount,
			float bilirubinCount, float creatinineCount, float controlOfLungFunction, int age, int tumorSize,
			int healthIndicator, boolean stage2Desease, boolean stage3Desease, boolean diagnose1, boolean diagnose2,
			boolean diagnose3, boolean diagnose4, boolean consentmentTerm, boolean pregnancy, boolean radioterapy,
			boolean activeInfection) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.sex = sex;
		this.neutrophilsCount = neutrophilsCount;
		this.plateletsCount = plateletsCount;
		this.bilirubinCount = bilirubinCount;
		this.creatinineCount = creatinineCount;
		this.controlOfLungFunction = controlOfLungFunction;
		this.age = age;
		this.tumorSize = tumorSize;
		this.healthIndicator = healthIndicator;
		this.stage2Desease = stage2Desease;
		this.stage3Desease = stage3Desease;
		this.diagnose1 = diagnose1;
		this.diagnose2 = diagnose2;
		this.diagnose3 = diagnose3;
		this.diagnose4 = diagnose4;
		this.consentmentTerm = consentmentTerm;
		this.pregnancy = pregnancy;
		this.radioterapy = radioterapy;
		this.activeInfection = activeInfection;
		this.selectedForTreatment = false;
	}

	public Patient() {
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public float getNeutrophilsCount() {
		return neutrophilsCount;
	}

	public void setNeutrophilsCount(float neutrophilsCount) {
		this.neutrophilsCount = neutrophilsCount;
	}

	public float getPlateletsCount() {
		return plateletsCount;
	}

	public void setPlateletsCount(float plateletsCount) {
		this.plateletsCount = plateletsCount;
	}

	public float getBilirubinCount() {
		return bilirubinCount;
	}

	public void setBilirubinCount(float bilirubinCount) {
		this.bilirubinCount = bilirubinCount;
	}

	public float getCreatinineCount() {
		return creatinineCount;
	}

	public void setCreatinineCount(float creatinineCount) {
		this.creatinineCount = creatinineCount;
	}

	public float getControlOfLungFunction() {
		return controlOfLungFunction;
	}

	public void setControlOfLungFunction(float controlOfLungFunction) {
		this.controlOfLungFunction = controlOfLungFunction;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getTumorSize() {
		return tumorSize;
	}

	public void setTumorSize(int tumorSize) {
		this.tumorSize = tumorSize;
	}

	public int getHealthIndicator() {
		return healthIndicator;
	}

	public void setHealthIndicator(int healthIndicator) {
		this.healthIndicator = healthIndicator;
	}

	public boolean isStage2Desease() {
		return stage2Desease;
	}

	public void setStage2Desease(boolean stage2Desease) {
		this.stage2Desease = stage2Desease;
	}

	public boolean isStage3Desease() {
		return stage3Desease;
	}

	public void setStage3Desease(boolean stage3Desease) {
		this.stage3Desease = stage3Desease;
	}

	public boolean isDiagnose1() {
		return diagnose1;
	}

	public void setDiagnose1(boolean diagnose1) {
		this.diagnose1 = diagnose1;
	}

	public boolean isDiagnose2() {
		return diagnose2;
	}

	public void setDiagnose2(boolean diagnose2) {
		this.diagnose2 = diagnose2;
	}

	public boolean isDiagnose3() {
		return diagnose3;
	}

	public void setDiagnose3(boolean diagnose3) {
		this.diagnose3 = diagnose3;
	}

	public boolean isDiagnose4() {
		return diagnose4;
	}

	public void setDiagnose4(boolean diagnose4) {
		this.diagnose4 = diagnose4;
	}

	public boolean isConsentmentTerm() {
		return consentmentTerm;
	}

	public void setConsentmentTerm(boolean consentmentTerm) {
		this.consentmentTerm = consentmentTerm;
	}

	public boolean isPregnancy() {
		return pregnancy;
	}

	public void setPregnancy(boolean pregnancy) {
		this.pregnancy = pregnancy;
	}

	public boolean isRadioterapy() {
		return radioterapy;
	}

	public void setRadioterapy(boolean radioterapy) {
		this.radioterapy = radioterapy;
	}

	public boolean isActiveInfection() {
		return activeInfection;
	}

	public void setActiveInfection(boolean activeInfection) {
		this.activeInfection = activeInfection;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public boolean isSelectedForTreatment() {
		return selectedForTreatment;
	}

	public void setSelectedForTreatment(boolean selectedForTreatment) {
		this.selectedForTreatment = selectedForTreatment;
	}
	
	public boolean isStomachIncluded() {
		return stomachIncluded;
	}

	public void setStomachIncluded(boolean StomachIncluded) {
		this.stomachIncluded = StomachIncluded;
	}

	public boolean isLungsAffected() {
		return lungsAffected;
	}

	public void setLungsAffected(boolean LungsAffected) {
		this.lungsAffected = LungsAffected;
	}

	public boolean hasEndoscopicInjuries() {
		return endoscopicInjuries;
	}

	public void setEndoscopicInjuries(boolean EndoscopicInjuries) {
		this.endoscopicInjuries = EndoscopicInjuries;
	}
	
	public String getTreatment() {
		return treatment;
	}

	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}
	
	@Override
	public String toString(){
		String patientInfo;
		
		patientInfo = "Nome: " + getFirstName() + " " +
				getLastName() + " Idade: " + getAge() +
				" Sexo: " + getSex();
		return patientInfo;
	}
}
