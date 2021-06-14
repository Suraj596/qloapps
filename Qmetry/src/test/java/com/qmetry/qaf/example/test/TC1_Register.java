package com.qmetry.qaf.example.test;

import static com.qmetry.qaf.automation.step.CommonStep.click;
import static com.qmetry.qaf.automation.step.CommonStep.get;
import static com.qmetry.qaf.automation.step.CommonStep.getText;
import static com.qmetry.qaf.automation.step.CommonStep.assertText;
import static com.qmetry.qaf.automation.step.CommonStep.sendKeys;
import static com.qmetry.qaf.example.steps.StepsLibrary.searchFor;
import static com.qmetry.qaf.automation.step.CommonStep.waitForPresent;

import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.util.Reporter;

public class TC1_Register extends WebDriverTestCase {
	/****************************************************************************
    '* NAME                : Verify user is able to register account 
    '* APPLICATION NAME    : qloapps
    '* CREATED BY        : Suraj Sahoo
    '* CREATED DATE        : 09-06-2021
    '* PARAMETERS        : NA
    '***************************************************************************/
	

	@QAFDataProvider(dataFile = "resources/credentials.xls", sheetName="QLO")
    @Test(enabled=true)
	
	
	
	  public void Register(Map <String, String> data) throws InterruptedException {
	  DOMConfigurator.configure("LogXML\\log4j.xml"); 
	  Logger log=Logger.getLogger(TC1_Register.class); 
	  get("/");
	  getDriver().manage().window().maximize(); 
	  click("button.signin");
	  sendKeys(data.get("email"), "input.email"); 
	  click("button.create"); 
	  click("button.title"); 
	  sendKeys(data.get("firstname"),"input.firstname"); 
	  sendKeys(data.get("lastname"), "input.lastname"); 
	  sendKeys(data.get("password"), "input.password");
	  sendKeys(String.valueOf(data.get("days")), "input.days");
      sendKeys(data.get("month"), "input.months");
      sendKeys(String.valueOf(data.get("year")), "input.years");
	  click("button.register");
	  Thread.sleep(5000);
	  Reporter.logWithScreenShot("pass");
	  Thread.sleep(5000);
	  assertText("assertof_register","Your account has been created.");	
	  click("button.dropdown");
	  click("button.logout");
	  Thread.sleep(3000); 
     
         
          
          
          
          
          
          
	
	
	  
	  
	  
	
	
		/*
		 * public void Register(Map <String, String> data) throws InterruptedException {
		 * get("/");
		 * Register1(data.get("email"),data.get("firstname"),data.get("lastname"),data.
		 * get("password"));
		 */
  
}
}