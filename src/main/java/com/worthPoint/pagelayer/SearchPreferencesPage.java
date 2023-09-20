package com.worthPoint.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import baseLayer.TestBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class SearchPreferencesPage extends TestBase{
	
AndroidDriver driver;
	
	public SearchPreferencesPage(AndroidDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//Object Repository
	
	@AndroidFindBy(xpath="//android.widget.ImageView[@content-desc=\"Price Guide\"]")
	private WebElement priceGuide;

	@AndroidFindBy(xpath="//android.widget.ImageView[@content-desc=\"Advertising\"]")
	private WebElement advertising;
	
	@AndroidFindBy(xpath="(//android.widget.Button)[1]")
	private WebElement backButton1;
	
	@AndroidFindBy(xpath="(//android.widget.Button)[1]")
	private WebElement backButton2;
	@AndroidFindBy(xpath="(//android.widget.ImageView)[4]")
	private WebElement product;
	
	@AndroidFindBy(xpath="(//android.widget.ImageView)[2]")
	private WebElement filter;
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Clear All\"]")
	private WebElement clearAll;
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Show Results\"]")
	private WebElement showresult;
	
	@AndroidFindBy(xpath="(//android.view.View)[12]")
	private WebElement onlyshowitemswithimages;
	
	@AndroidFindBy(xpath="(//android.view.View)[15]")
	private WebElement searchbytitleonly;
	
	@AndroidFindBy(xpath="(//android.view.View)[18]")
	private WebElement excludeexplicitcontent;
	
	@AndroidFindBy(xpath="(//android.view.View)[21]")
	private WebElement savepreferencesfornexttime;
	
	@AndroidFindBy(xpath="//android.widget.ImageView[@content-desc=\"Alcohol & Smoking\"]")
	private WebElement alcoholandsmoking;
	
	//Action methods
	public void clickOnPriceGuideOption()
	{
		priceGuide.click();
	}
	
	public void clickOnAdvertisingOption()
	{
		advertising.click();
	}
	
	public void clickOnBackButton1()
	{
		backButton1.click();
	}
	public void clickOnBackButton2()
	{
		backButton2.click();
	}
	
	public void clickOnProduct()
	{
		product.click();
	}
	
	public void clickOnFilterOption()
	{
		filter.click();
	}
	public void clickOnClearAllOption()
	{
		clearAll.click();
	}
	
	public void clickOnShowResult()
	{
		showresult.click();
	}
	
	public void clickOnOnlyShowItemWithImages()
	{
		onlyshowitemswithimages.click();
	}
	
	public void clickOnSearchByTitleOnly()
	{
		searchbytitleonly.click();
	}
	
	public void clickOnExcludeExplicitContent()
	{
		excludeexplicitcontent.click();
	}
	
	public void clickONSavePreferencesForNextTime()
	{
		savepreferencesfornexttime.click();
	}
	
	public void clickOnAlcoholAndSmoking()
	{
		alcoholandsmoking.click();
	}
}
