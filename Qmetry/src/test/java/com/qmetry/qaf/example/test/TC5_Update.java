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

public class TC5_Update extends WebDriverTestCase {
	
	/****************************************************************************
    '* NAME                : Verify the user is able to update the personal details
    '* APPLICATION NAME    : qloapps
    '* CREATED BY        : Suraj Sahoo
    '* CREATED DATE        : 09-06-2021
    '* PARAMETERS        : NA
    '***************************************************************************/

	@QAFDataProvider(dataFile = "resources/credentials.xls", sheetName="QLO")
    @Test(enabled=true)
	
	
	
	  public void Addaddress(Map <String, String> data) throws InterruptedException {
	  DOMConfigurator.configure("LogXML\\log4j.xml"); 
	  Logger log=Logger.getLogger(TC5_Update.class); 
	  get("/");
	  getDriver().manage().window().maximize(); 
	  click("button.signin");
	  clear("input.emailadd");
	  sendKeys(data.get("email3"), "input.emailadd"); 
	  clear("input.pass");
	  sendKeys(data.get("password"), "input.pass");
	  click("button.submit");
	  click("button.personal");
	  clear("input.fname");
	  sendKeys(data.get("fname"), "input.fname");
	  sendKeys(String.valueOf(data.get("day")), "input.days");
      sendKeys(data.get("month"), "input.months");
      sendKeys(String.valueOf(data.get("year")), "input.years");
      Thread.sleep(5000);
      sendKeys(data.get("password"), "input.oldpass");
      Thread.sleep(3000);
      click("button.save1");
      Thread.sleep(3000);
      Reporter.logWithScreenShot("pass");
	  Thread.sleep(3000);
	  assertText("assertof_update","Your personal information has been successfully updated.");
	  Thread.sleep(3000);
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