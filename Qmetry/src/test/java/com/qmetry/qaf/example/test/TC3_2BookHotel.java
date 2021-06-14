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

public class TC3_2BookHotel extends WebDriverTestCase {
	/****************************************************************************
    '* NAME                : User is able to search the hotel room and book the room
    '* APPLICATION NAME    : qloapps
    '* CREATED BY        : Suraj Sahoo
    '* CREATED DATE        : 09-06-2021
    '* PARAMETERS        : NA
    '***************************************************************************/
	

	@QAFDataProvider(dataFile = "resources/credentials.xls", sheetName="QLO")
    @Test(enabled=true)
	
	
	
	  public void bookhotel(Map <String, String> data) throws InterruptedException {
	  DOMConfigurator.configure("LogXML\\log4j.xml"); 
	  Logger log=Logger.getLogger(TC3_2BookHotel.class); 
	  get("/");
	  getDriver().manage().window().maximize();
	  click("BookHThreeLines");
	  Thread.sleep(3000); 
	  click("BookHRooms"); 
	  Thread.sleep(3000);
	  click("BookHBooklux"); 
	  Thread.sleep(3000); 
	  
	  String parentHandle = getDriver().getWindowHandle();       
	  for (String winHandle : getDriver().getWindowHandles()) { 
		  getDriver().switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle 
	  } 
	  Thread.sleep(8000);
	  //click("room_in");
	  //Thread.sleep(3000);
	  //click("room_out");
	  //Thread.sleep(3000);
	  String parentHandle1 = getDriver().getWindowHandle();     
      for (String winHandle : getDriver().getWindowHandles()) {
          getDriver().switchTo().window(winHandle);
      }
      click("roomcheckin");
      Thread.sleep(3000);
      click("selctchkindate");
      Thread.sleep(3000);
      click("roomcheckout");
      Thread.sleep(3000);
      click("selctchkoutdate");
      Thread.sleep(5000);
	  click("BookHBookNow2"); 
	  Thread.sleep(3000); 

    //  click("BookHPTCout"); 
	  click("BookHProceedBtn"); 
	  Thread.sleep(3000); 
	  click("Proceed"); 
	  Thread.sleep(3000); 
	  click("BookHLoginnow"); 
	  sendKeys(data.get("email3"), "BookHEmail"); 

     // clear("LPassword"); 
	  sendKeys(data.get("password"), "BookHPassword"); 
	  Thread.sleep(3000); 
	  click("BookHSubmitLogin"); 
	  Thread.sleep(5000); 
	  click("BookHProceedBtn2");
	  Thread.sleep(4000); 
	  click("BookHAgreeCheckBox"); 
	  Thread.sleep(4000); 
	  click("BookHBankwire"); 
	  Thread.sleep(4000); 
	  click("BookHConfirmMyOrder"); 
	  Thread.sleep(4000); 
	  Reporter.logWithScreenShot("pass"); 
	  Thread.sleep(3000);
	  assertText("assertof_booking","Your order on Qlo Reservation System is complete.");
	  Thread.sleep(3000);   
          
          
          
          
          
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
          
	
	
	  
	  
	  
	
	
		/*
		 * public void Register(Map <String, String> data) throws InterruptedException {
		 * get("/");
		 * Register1(data.get("email"),data.get("firstname"),data.get("lastname"),data.
		 * get("password"));
		 */
  
}
}