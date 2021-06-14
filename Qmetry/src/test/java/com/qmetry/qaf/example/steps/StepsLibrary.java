package com.qmetry.qaf.example.steps;

import static com.qmetry.qaf.automation.step.CommonStep.sendKeys;
import static com.qmetry.qaf.automation.step.CommonStep.click;


import com.qmetry.qaf.automation.step.QAFTestStep;

public class StepsLibrary {
	/**
	 * @param searchTerm
	 *            : search term to be searched
	 * @throws InterruptedException 
	 */
	    @QAFTestStep(description = "search for {0}")
	    public static void searchFor(String fname,String lname,String email,String password) throws InterruptedException {
	        click("button.signin");
	        sendKeys(email,"input.email");
	        sendKeys(fname, "input.firstname");
	        sendKeys(lname,"input.lastname");
	       
	        sendKeys(password,"input.password");
	        click("button.register");
	        Thread.sleep(5000);
	    }
}