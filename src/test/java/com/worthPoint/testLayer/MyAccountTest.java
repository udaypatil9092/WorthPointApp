package com.worthPoint.testLayer;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.util.concurrent.Uninterruptibles;
import com.worthPoint.pagelayer.MyAccountPage;

import baseLayer.TestBase;
import utilities.Utilities;




public class MyAccountTest extends TestBase{

	public MyAccountPage myaccount;
	//public Utilities util;
	
	private	String MyFavorites = "//android.widget.ImageView[@content-desc=\"My Favorites\"]";
	private	String EditProfile = "//android.view.View[@content-desc=\"Edit Profile\"]";
	private	String FirstName = "(//android.widget.EditText[contains(@text,'First Name')])[1]";
	private	String LastName = "(//android.widget.EditText[contains(@text,'Last Name')])[1]";
	private	String EmailAddress = "(//android.view.View[contains(@text,'Email Address')])[1]";
	private	String Phone = "(//android.widget.EditText[contains(@text,'Phone')])[1]";
	private	String WhatDescribeYouTheBest = "//android.view.View[@content-desc=\"What describes you the best?\"]";
	private	String Save="//android.widget.Button[@content-desc=\"Save\"]";
		
	private String EnterFirstName="//android.view.View[@content-desc=\"Please enter First Name\"]";
	private String EnterLastName="//android.view.View[@content-desc=\"Please enter Last Name\"]";	
	private String EnterPhone= "//android.view.View[@content-desc=\"Please enter a valid Phone Number\"]";

	private String PleaseEnterValidPhone="//android.view.View[@content-desc=\"Please enter a valid phone number\"]";

	private String INHERITOR= "//android.widget.Button[@content-desc=\"INHERITOR\"]";
	private String PROFESSIONAL= "//android.widget.Button[@content-desc=\"PROFESSIONAL\"]";
	private String COLLECTOR="//android.widget.Button[@content-desc=\"COLLECTOR\"]";
	private String RESELLER="//android.widget.Button[@content-desc=\"RESELLER\"]";

	private String BackButton="(//android.widget.Button)[1]";
	private String MyAccount="//android.view.View[@content-desc=\"My Account\"]";

	private String ProfileEmailAddress="(//android.widget.EditText[contains(@text,'Email Address')])[1]";
	
	
	@Test (priority=1)
	public void verifyEditProfileHeaders() throws Exception{
		
		myaccount= new MyAccountPage(driver);
		util= new Utilities(driver);
		
		myaccount.clickOnPrpfileOption();
		Uninterruptibles.sleepUninterruptibly(Duration.ofMillis(2000));
		util.clickOnElementUsingCoordinates(933, 383);
//		util.clickOnElementUsingCoordinates(948, 411);
		
//		util.clickOnElementUsingCoordinates(620, 323);   //for Nokia 4.2 version
		
		if(driver.findElements(By.xpath(EditProfile)).size()>0)
		  Assert.assertTrue(true);
		else
		  Assert.assertTrue(false);
			  
		if(driver.findElements(By.xpath(FirstName)).size()>0)
		  Assert.assertTrue(true);
		else
		  Assert.assertTrue(false);
			  
		if(driver.findElements(By.xpath(LastName)).size()>0)
		  Assert.assertTrue(true);
		else
		  Assert.assertTrue(false);
			  
		if(driver.findElements(By.xpath(EmailAddress)).size()>0)
		  Assert.assertTrue(true);
		else
		  Assert.assertTrue(false);
			  
		if(driver.findElements(By.xpath(Phone)).size()>0)
		  Assert.assertTrue(true);
		else
		  Assert.assertTrue(false);
			  
		if(driver.findElements(By.xpath(WhatDescribeYouTheBest)).size()>0)
		  Assert.assertTrue(true);
		else
		  Assert.assertTrue(false);
			  
		if(driver.findElements(By.xpath(Save)).size()>0)
		  Assert.assertTrue(true);
		else
		  Assert.assertTrue(false);	
	}
	
	@Test (priority=2)
	public void verifyEditProfileRequiredfields() throws Exception{
		
		 myaccount= new MyAccountPage(driver);
		 util= new Utilities(driver);
		
		 myaccount.clickOnPrpfileOption();
		 Uninterruptibles.sleepUninterruptibly(Duration.ofMillis(2000));
		 util.clickOnElementUsingCoordinates(948, 411);
		 util.clickOnElementUsingCoordinates(620, 323);   //for Nokia 4.2 version
		 myaccount.clickOnFirstName();
	     myaccount.clickOnLastName();
		 myaccount.clickOnPhone();
		 myaccount.clickOnSaveButton();
	          
	          if(driver.findElements(By.xpath(EnterFirstName)).size()>0)
	     	     Assert.assertTrue(true);
	     	  else
	     		  Assert.assertTrue(false);
	          
	          if(driver.findElements(By.xpath(EnterLastName)).size()>0)
		     	 Assert.assertTrue(true);
		      else
		     	 Assert.assertTrue(false);
	          
	          if(driver.findElements(By.xpath(EnterPhone)).size()>0)
			     Assert.assertTrue(true);
			  else
			     Assert.assertTrue(false);
	          
		}
	
	@Test(priority=3)
	public void verifyEditProfileInvalidPhoneNumber() throws Exception{
		
		 myaccount= new MyAccountPage(driver);
		 util= new Utilities(driver);
		
		 myaccount.clickOnPrpfileOption();
		 Uninterruptibles.sleepUninterruptibly(Duration.ofMillis(1000));
		 util.clickOnElementUsingCoordinates(948, 411);
		 util.clickOnElementUsingCoordinates(620, 323);   //for Nokia 4.2 version
		 myaccount.clickOnEnterFirstName("Uday");
		 myaccount.clickOnEnterLastName("Patil");
		 myaccount.clickOnEnterPhone("55");
		 myaccount.clickOnEnterSaveButton();
		 Uninterruptibles.sleepUninterruptibly(Duration.ofMillis(2000));
        if(driver.findElements(By.xpath(PleaseEnterValidPhone)).size()>0)
   	     Assert.assertTrue(true);
   	    else
   		  Assert.assertTrue(false);
	}
	
	@Test (priority=4)
	public void verifyEditProfileDataUpdatedSuccessfully() throws Exception {
		
		    myaccount= new MyAccountPage(driver);
		    util= new Utilities(driver);
		
		    myaccount.clickOnPrpfileOption();
			Uninterruptibles.sleepUninterruptibly(Duration.ofMillis(1000));
		    util.clickOnElementUsingCoordinates(948, 411);
		    util.clickOnElementUsingCoordinates(620, 323);   //for Nokia 4.2 version
	
		    String Fname1="Demo";
			String Lname1="User";
			String Phone1="919979127210";
		
			myaccount.clickOnUpdateFirstName(Fname1);
			myaccount.clickOnUpdateLastName(Lname1);
			myaccount.clickOnUpdateEnterPhone(Phone1);
			myaccount.clickOnUpdateSaveButton();
			
			String profiledetails=myaccount.GetProfileDetails();
			Assert.assertTrue(profiledetails.contains(Fname1));
			Assert.assertTrue(profiledetails.contains(Lname1));
			Assert.assertTrue(profiledetails.contains(Phone1));
        
		  }
	
	@Test(priority=5)
	public void verifyEditProfileWhatDescribeYoutheBestDataUpdatedSuccessfully() throws Exception{
		
		 myaccount= new MyAccountPage(driver);
		 util= new Utilities(driver);
		

		 myaccount.clickOnPrpfileOption();
		 Uninterruptibles.sleepUninterruptibly(Duration.ofMillis(1000));
		 util.clickOnElementUsingCoordinates(948, 411);
		 util.clickOnElementUsingCoordinates(620, 323);   //for Nokia 4.2 version
		 myaccount.clickOnBestOption();
		 myaccount.CheckAllOptions();
		 myaccount.ClickOnSaveContinueButton();
		 myaccount.clickOnSaveButton();
		
		if(driver.findElements(By.xpath(INHERITOR)).size()>0)
			Assert.assertTrue(true);
	    else
	    	Assert.assertTrue(false);
	        
	    if(driver.findElements(By.xpath(PROFESSIONAL)).size()>0)
	   	    Assert.assertTrue(true);
	   	else
	   		Assert.assertTrue(false);
	        
	    if(driver.findElements(By.xpath(COLLECTOR)).size()>0)
	        Assert.assertTrue(true);
	    else
	      	Assert.assertTrue(false);
	        
	    if(driver.findElements(By.xpath(RESELLER)).size()>0)
	      	Assert.assertTrue(true);
	    else
	        Assert.assertTrue(false);
	      }
	

	@Test(priority=6)
	public void verifyEditProfileBackButtonFunctionality() throws Exception{
		
		 myaccount= new MyAccountPage(driver);
		 util= new Utilities(driver);
		
		 myaccount.clickOnPrpfileOption();
		 Uninterruptibles.sleepUninterruptibly(Duration.ofMillis(1000));
		 util.clickOnElementUsingCoordinates(948, 411);
		 util.clickOnElementUsingCoordinates(620, 323);   //for Nokia 4.2 version
		 Uninterruptibles.sleepUninterruptibly(Duration.ofMillis(2000));

		 myaccount.ClickOnBackButton();
		 Uninterruptibles.sleepUninterruptibly(Duration.ofMillis(2000));
		 if(driver.findElements(By.xpath(MyAccount)).size()>0)
	        Assert.assertTrue(true);
	     else
	     	Assert.assertTrue(false);
		 }
	
	@Test (priority = 7)
	public void verifyLogoutFunctionality() throws Exception{
		
		 myaccount= new MyAccountPage(driver);
		 util= new Utilities(driver);
		
		 myaccount.clickOnPrpfileOption();
		 Uninterruptibles.sleepUninterruptibly(Duration.ofMillis(1000));
		 util.scrollToEnd();
		 myaccount.ClickOnLogout1Button();
		 myaccount.ClickOnLogout2Button();
		 
		 if(driver.findElements(By.xpath(ProfileEmailAddress)).size()>0)
			Assert.assertTrue(true);  
		 else
			Assert.assertTrue(false);

	}
	
}
