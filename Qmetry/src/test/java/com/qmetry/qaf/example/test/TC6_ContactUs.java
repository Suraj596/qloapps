package com.qmetry.qaf.example.test;

import static com.qmetry.qaf.automation.step.CommonStep.click;
import static com.qmetry.qaf.automation.step.CommonStep.get;
import static com.qmetry.qaf.automation.step.CommonStep.sendKeys;
import static com.qmetry.qaf.example.steps.StepsLibrary.searchFor;
import static com.qmetry.qaf.automation.step.CommonStep.waitForPresent;
import static com.qmetry.qaf.automation.step.CommonStep.assertText;

import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.util.Reporter;

public class TC6_ContactUs extends WebDriverTestCase {
	/****************************************************************************
    '* NAME                : Verify user is able to send a message by clicking on Contact Us  
    '* APPLICATION NAME    : qloapps
    '* CREATED BY        : Suraj Sahoo
    '* CREATED DATE        : 09-06-2021
    '* PARAMETERS        : NA
    '***************************************************************************/
	

	@QAFDataProvider(dataFile = "resources/credentials.xls", sheetName="QLO")
    @Test(enabled=true)
	
	
	
	  public void contactus(Map <String, String> data) throws InterruptedException {
	  DOMConfigurator.configure("LogXML\\log4j.xml"); 
	  Logger log=Logger.getLogger(TC6_ContactUs.class); 
	  get("/");
	  getDriver().manage().window().maximize();
	  click("button.menu");    
      click("button.contact");
      click("button.subject");
      click("buton.customer");
      sendKeys(data.get("email2"), "input.email2");
	  sendKeys(data.get("message"),"input.message");
	  click("button.submitmessage");
	  Thread.sleep(3000);
	  Reporter.logWithScreenShot("pass");
	  Thread.sleep(3000);
	  assertText("assertof_contactus","Your message has been successfully sent to our team.");     
	  Thread.sleep(3000);    
            
    
     
}   
          
          
          
          
          
          
	
	
	  
	  
	
	
	
	
	
	
	
	
	  
	
	
		/*
		 * public void Register(Map <String, String> data) throws InterruptedException {
		 * get("/");
		 * Register1(data.get("email"),data.get("firstname"),data.get("lastname"),data.
		 * get("password"));
		 */
  
}
