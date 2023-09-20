package com.worthPoint.pagelayer;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.google.common.util.concurrent.Uninterruptibles;

import baseLayer.TestBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utilities.Utilities;

public class LoginPage extends TestBase{

	AndroidDriver driver;
	Utilities util;
	
	public LoginPage(AndroidDriver driver) {

		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}


	//Object Repository

	@AndroidFindBy(accessibility = "Next")
	private WebElement next_button;

	@AndroidFindBy(accessibility = "Get Started")
	private WebElement getStarted_button;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text,'Email Address']")
	private WebElement email_field;

	@AndroidFindBy(xpath = "//(android.widget.EditText[@text,'Password'])[2]")
	private WebElement pass_field;

	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Login']")
	private WebElement login_button;

	//Action methods

	public void clickOnNext()
	{
		for(int i=0;i<3;i++)
		{
			next_button.click();
			
			try 
			{
				Thread.sleep(500);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}

	public void clickOnGetStarted()
	{
		getStarted_button.click();
	}

	public void enterEmail(String emailID)
	{
		 email_field.click();
		 Uninterruptibles.sleepUninterruptibly(Duration.ofMillis(1000));
		 util=new Utilities(driver);
		 util.sendTextToElement(emailID);
		 
		//email_field.sendKeys(emailID);

	}

	public void enterPassword(String pass)
	{
		 pass_field.click();
		 Uninterruptibles.sleepUninterruptibly(Duration.ofMillis(1000));
		 util=new Utilities(driver);
		 util.sendTextToElement(pass);
		 
		//pass_field.sendKeys(pass);


	}

	public void clickOnLogin()
	{
		login_button.click();
	}
}
