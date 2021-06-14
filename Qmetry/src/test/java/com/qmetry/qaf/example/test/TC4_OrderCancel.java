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

public class TC4_OrderCancel extends WebDriverTestCase {
	
	/****************************************************************************
    '* NAME                : Verify the order and cancel the order
    '* APPLICATION NAME    : qloapps
    '* CREATED BY        : Suraj Sahoo
    '* CREATED DATE        : 09-06-2021
    '* PARAMETERS        : NA
    '***************************************************************************/

	@QAFDataProvider(dataFile = "resources/credentials.xls", sheetName="QLO")
    @Test(enabled=true)
	
	
	
	  public void ordercancel(Map <String, String> data) throws InterruptedException {
	  DOMConfigurator.configure("LogXML\\log4j.xml"); 
	  Logger log=Logger.getLogger(TC4_OrderCancel.class); 
	  get("/");
	  getDriver().manage().window().maximize(); 
	  click("button.signin");
	  clear("input.emailadd");
	  sendKeys(data.get("email3"), "input.emailadd"); 
	  clear("input.pass");
	  sendKeys(data.get("password"), "input.pass");
	  click("button.submit");
	  click("OrderHistory");
      Thread.sleep(3000);
	  click("Details");
	  Thread.sleep(3000);
	  Reporter.logWithScreenShot("pass");
	  Thread.sleep(3000);
	  click("Cancel");
	  Thread.sleep(3000);
	  click("Checkbox");
	  Thread.sleep(3000);
	  click("Submit");    
	  Thread.sleep(3000);
	  sendKeys(data.get("reason"), "reason");
	  Thread.sleep(3000);       
	  click("SubmitReason");
	  Thread.sleep(3000);
	  Reporter.logWithScreenShot("pass");
	  Thread.sleep(3000);
	  assertText("assertof_cancel","You have booking cancelation requests from this order. To see the cancelation request status Click Here");
	  Thread.sleep(3000);	


	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	
	
	  
	  
	  
	  
	  
	  
		/*
		 * public void Register(Map <String, String> data) throws InterruptedException {
		 * get("/");
		 * Register1(data.get("email"),data.get("firstname"),data.get("lastname"),data.
		 * get("password"));
		 */
  
}
}