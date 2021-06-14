package com.qmetry.qaf.example.test;

import static com.qmetry.qaf.automation.step.CommonStep.click;
import static com.qmetry.qaf.automation.step.CommonStep.clear;
import static com.qmetry.qaf.automation.step.CommonStep.get;
import static com.qmetry.qaf.automation.step.CommonStep.sendKeys;
import static com.qmetry.qaf.example.steps.StepsLibrary.searchFor;
import static com.qmetry.qaf.automation.step.CommonStep.assertText;

import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.util.Reporter;

public class TC2_Addaddress extends WebDriverTestCase {
	
	/****************************************************************************
    '* NAME                : Verify user is able to Add an address after logged-in 
    '* APPLICATION NAME    : qloapps
    '* CREATED BY        : Suraj Sahoo
    '* CREATED DATE        : 09-06-2021
    '* PARAMETERS        : NA
    '***************************************************************************/

	@QAFDataProvider(dataFile = "resources/credentials.xls", sheetName="QLO")
    @Test(enabled=true)
	
	
	
	  public void Addaddress(Map <String, String> data) throws InterruptedException {
	  DOMConfigurator.configure("LogXML\\log4j.xml"); 
	  Logger log=Logger.getLogger(TC2_Addaddress.class); 
	  get("/");
	  getDriver().manage().window().maximize(); 
	  click("button.signin");
	  clear("input.emailadd");
	  sendKeys(data.get("email2"), "input.emailadd"); 
	  clear("input.pass");
	  sendKeys(data.get("password"), "input.pass");
	  click("button.submit");
	  click("button.myaddress");
	  sendKeys(data.get("company"), "input.company");
	  sendKeys(data.get("address1"), "input.address1");
	  sendKeys(data.get("address2"), "input.address2");
	  sendKeys(data.get("city"), "input.city");   
	  sendKeys(data.get("state"), "input.state"); 
	  sendKeys(String.valueOf(data.get("postcode")), "input.postcode");    
	  sendKeys(String.valueOf(data.get("telephone")), "input.homenumber");   
	  sendKeys(String.valueOf(data.get("mobile")), "input.mobile");  
	  sendKeys(data.get("additional"), "input.additional");     
	  sendKeys(data.get("address3"), "input.address3");    
	  click("button.save");
	  Thread.sleep(3000);
	  Reporter.logWithScreenShot("pass");
	  Thread.sleep(3000);
	  assertText("assertof_address","Your addresses are listed below.");
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