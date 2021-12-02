package com.sample.model.data;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class InferenceEngine {
	SystemData systemData;
	
	public InferenceEngine(SystemData systemData) {
		this.systemData = systemData;
	}
	
	public void fireRules() {
		try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");

            int i = 0;
        	
            while(i < systemData.getNumberOfPatients()){
            	kSession.insert(systemData.getPatientByIndex(i));
            	i++;
            }
        	
            kSession.fireAllRules();
            kSession.dispose();
        } catch (Throwable t) {
            t.printStackTrace();
        }
	}
	
	public void testPatient(Patient patient) {
		try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");

        	kSession.insert(patient);
        	
            kSession.fireAllRules();
            kSession.dispose();
            
        } catch (Throwable t) {
            t.printStackTrace();
        }
	}
}
