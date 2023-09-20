package com.worthPoint.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import baseLayer.TestBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class PriceGuideCategoriesPage extends TestBase{


	AndroidDriver driver;
	
	public PriceGuideCategoriesPage(AndroidDriver driver)
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
	
	@AndroidFindBy(xpath="(//android.widget.ImageView)[3]")
	private WebElement listIcon;
	
	@AndroidFindBy(xpath="(//android.widget.ImageView)[3]")
	private WebElement gridIcon;
	
	@AndroidFindBy(xpath="(//android.widget.ImageView)[4]")
	private WebElement product;
	
	@AndroidFindBy(xpath="(//android.widget.Button)[1]")
	private WebElement backButton2;
	
	@AndroidFindBy(xpath="(//android.widget.ImageView)[2]")
	private WebElement saveButton;
	
	@AndroidFindBy(xpath="(//android.widget.EditText[contains(@text,'Enter Name')])[1]")
	private WebElement name;
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Save Search\"]")
	private WebElement saveSearch;
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Saved Searches\"]")
	private WebElement savedSearches;
	
	@AndroidFindBy(xpath="(//android.widget.Button)[1]")
	private WebElement backButton3;
	
	@AndroidFindBy(xpath="(//android.widget.ImageView)[2]")
	private WebElement filter;
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Clear All\"]")
	private WebElement clearAll;
	
	@AndroidFindBy(xpath="(//android.view.View[@content-desc=\"Select Or Enter\"])[2]")
	private WebElement category2;
	
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Advertising\"]")
	private WebElement category2option1;
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Show Results\"]")
	private WebElement showresult;
	
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Alcohol & Smoking\"]")
	private WebElement category2option2;
	
	@AndroidFindBy(xpath="//*[@class=\"android.widget.EditText\"]")
	private WebElement source;
	
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"eBay\"]")
	private WebElement sourceeBay;
	
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Other\"]")
	private WebElement sourceOther;
	
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"RR Auction #db\"]")
	private WebElement sourceRRAuction;
	
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Key Date Coins\"]")
	private WebElement sourceKeyDate;
	
	
	@AndroidFindBy(accessibility = "Search WorthPoint")
	private WebElement searchworthpoint;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Price \"]")
	private WebElement price;
	
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
	
	public void clickOnListIcon()
	{
		listIcon.click();
	}
	public void clickOnGridIcon()
	{
		gridIcon.click();
	}
	public void clickOnProduct()
	{
		product.click();
	}
	public void clickOnBackButton2()
	{
		backButton2.click();
	}
	
	public void clickOnSaveButton()
	{
		saveButton.click();
	}
	
	public void clickOnNameOption(String productname)
	{
		name.click();
		name.sendKeys(productname);
	}
	public void clickOnSaveSearch()
	{
		saveSearch.click();
	}
	
	public void clickOnSavedSearches()
	{
		savedSearches.click();
	}
	
	public void clickOnBackButton3()
	{
		backButton3.click();
	}
	public void clickOnFilterOption()
	{
		filter.click();
	}
	public void clickOnClearAllOption()
	{
		clearAll.click();
	}
	public void clickOnCategoryDropdown()
	{
		category2.click();
	}
	public void clickOnCategory2Option1()
	{
		category2option1.click();
	}
	public void clickOnShowResult()
	{
		showresult.click();
	}
	public void clickOnCategory2Option2()
	{
		category2option2.click();
	}
	public void clickOnSource()
	{
		source.click();
	}
	public void clickOnSourceeBayOption()
	{
		sourceeBay.click();
	}
	public void clickOnSourceOtherOption()
	{
		sourceOther.click();
	}
	public void clickOnSourcRRAuctionOption()
	{
		sourceRRAuction.click();
	}
	public void clickOnSourceKeyDateOption()
	{
		sourceKeyDate.click();
	}

	public void clickOnSearchWorthPoint() 
	{
		searchworthpoint.click();

	}
	public void clickOnPriceOption()
	{
		price.click();
	}
}
