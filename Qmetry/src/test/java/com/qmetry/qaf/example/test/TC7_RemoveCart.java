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

public class TC7_RemoveCart extends WebDriverTestCase {
	/****************************************************************************
    '* NAME                : Verify if the user is able to remove selected Room from the cart  
    '* APPLICATION NAME    : qloapps
    '* CREATED BY        : Suraj Sahoo
    '* CREATED DATE        : 09-06-2021
    '* PARAMETERS        : NA
    '***************************************************************************/
	

	@QAFDataProvider(dataFile = "resources/credentials.xls", sheetName="QLO")
    @Test(enabled=true)
	
	
	
	  public void removecart(Map <String, String> data) throws InterruptedException {
	  DOMConfigurator.configure("LogXML\\log4j.xml"); 
	  Logger log=Logger.getLogger(TC7_RemoveCart.class); 
	  get("/");
	  getDriver().manage().window().maximize();
	  sendKeys(data.get("hotellocation"), "hotel_loc"); 
	  click("hotel_in"); 
	  Thread.sleep(3000); 
	  click("hotel_inD"); 
		Thread.sleep(3000); 
		click("hotel_out"); 
		Thread.sleep(3000); 
		click("hotel_ouD"); 
		Thread.sleep(3000); 
		click("hotel_sel"); 
		Thread.sleep(3000); 
		click("hotel_nam"); 
		Thread.sleep(3000); 
		click("search_hotel"); 
		Thread.sleep(3000); 
		click("book_lux"); 
		Thread.sleep(3000); 
		click("proceed"); 
		//Thread.sleep(6000); 
		//	mouseOver("cart"); 
		Thread.sleep(3000); 
		//	mouseOver("x"); 
		//	click("x"); 
		click("Remove"); 
		Thread.sleep(3000); 
		Reporter.logWithScreenShot("pass");
		Thread.sleep(3000);
		assertText("assertof_remove","Till now you did not added any room in your cart.");   
		Thread.sleep(3000);   
            
    
     
}   
          
          
          
          
          
          
	
	
	  
	  
	  
	
	
	
	
	
	
	
	
	
	
	
	
		/*
		 * public void Register(Map <String, String> data) throws InterruptedException {
		 * get("/");
		 * Register1(data.get("email"),data.get("firstname"),data.get("lastname"),data.
		 * get("password"));
		 */
  
}
