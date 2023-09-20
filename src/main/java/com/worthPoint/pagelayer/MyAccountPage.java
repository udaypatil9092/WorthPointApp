package com.worthPoint.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import baseLayer.TestBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MyAccountPage extends TestBase{
	
	AndroidDriver driver;
	
	public MyAccountPage(AndroidDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	

	//Object Repository
	
	@AndroidFindBy(xpath="//*[@class='android.widget.ImageView'][1]")
	private WebElement Profile;

	@AndroidFindBy(xpath="(//android.widget.EditText[contains(@text,'First Name')])[1]")
	private WebElement Fname;
	
	@AndroidFindBy(xpath="(//android.widget.EditText[contains(@text,'Last Name')])[1]")
	private WebElement Lname;
	
	@AndroidFindBy(xpath="(//android.widget.EditText[contains(@text,'Phone')])[1]")
	private WebElement Phone;
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Save\"]")
	private WebElement Save;

	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"What describes you the best?\"]")
	private WebElement Best;

	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Check All\"]")
	private WebElement CheckAll;
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Save and Continue\"]")
	private WebElement SaveContinue;
	
	@AndroidFindBy(xpath="(//android.widget.Button)[1]")
	private WebElement BackButton;
	
	@AndroidFindBy(xpath="//android.widget.ImageView[@content-desc=\"Logout\"]")
	private WebElement Logout1;
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Logout\"]")
	private WebElement Logout2;
	
	@AndroidFindBy(xpath="(//*[@class='android.widget.Button'])[2]")
	private WebElement profile2;
	
	
	//Action methods
	public void clickOnPrpfileOption()
	{
		Profile.click();
	}
	
	public void clickOnFirstName()
	{
		Fname.click();
		Fname.clear();
	}
	
	public void clickOnLastName()
	{
		Lname.click();
		Lname.clear();
	}
	
	public void clickOnPhone()
	{
		Phone.click();
		Phone.clear();
	}
	
	public void clickOnSaveButton()
	{
		Save.click();
	}
	

	public void clickOnEnterFirstName(String fname)
	{
		Fname.click();
		Fname.sendKeys(fname);
	}
	
	public void clickOnEnterLastName(String lname)
	{
		Lname.click();
		Lname.sendKeys(lname);
	}
	
	public void clickOnEnterPhone(String mobile)
	{
		Phone.click();
		Phone.sendKeys(mobile);
	}
	
	public void clickOnEnterSaveButton()
	{
		Save.click();
	}
	
	public void clickOnUpdateFirstName(String Fname1)
	{
		 Fname.click();
		 Fname.clear();
         Fname.sendKeys(Fname1);
	}
	
	public void clickOnUpdateLastName(String Lname1)
	{
		Lname.click();
		Lname.clear();
   	    Lname.sendKeys(Lname1);
	}
	
	public void clickOnUpdateEnterPhone(String Phone1)
	{
		Phone.click();
		Phone.clear();
  	    Phone.sendKeys(Phone1);
	}
	
	public String GetProfileDetails()
	{
		return profile2.getAttribute("content-desc");
	}
	
	public void clickOnUpdateSaveButton()
	{
		Save.click();
	}
	
	public void clickOnBestOption()
	{
		Best.click();
	}
	
	public void CheckAllOptions()
	{
		CheckAll.click();
	}
	
	public void ClickOnSaveContinueButton()
	{
		SaveContinue.click();
	}
	
	public void ClickOnBackButton()
	{
		BackButton.click();
	}
	
	public void ClickOnLogout1Button()
	{
		Logout1.click();
	}
	
	public void ClickOnLogout2Button()
	{
		Logout2.click();
	}
}
