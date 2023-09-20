package com.worthPoint.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import baseLayer.TestBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class MarksCategoriesPage extends TestBase{
	
AndroidDriver driver;
	
	public MarksCategoriesPage(AndroidDriver driver)
	{
	
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//Object Repository
	
	@AndroidFindBy(xpath="//android.widget.ImageView[@content-desc=\"Marks\"]")
	private WebElement marks;
	
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
	
	@AndroidFindBy(xpath="(//android.widget.ImageView)[2]")
	private WebElement filter;
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Clear All\"]")
	private WebElement clearAll;
	
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Select Or Enter\"]")
	private WebElement category2Dropdown;
	
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Advertising\"]")
	private WebElement category2option1;
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Show Results\"]")
	private WebElement showresult;
	
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Alcohol & Smoking\"]")
	private WebElement category2option2;
	
	@AndroidFindBy(accessibility = "Search WorthPoint")
	private WebElement searchworthpoint;
	
	@AndroidFindBy(xpath ="//android.view.View[@content-desc=\"Price \"]")
	private WebElement price;
	
	@AndroidFindBy(xpath="(//android.widget.Button[@content-desc=\"View All\"])[1]")
	private WebElement viewAll;
	
	@AndroidFindBy(xpath="(//android.widget.ImageView)[2]")
	private WebElement savebutton;
	
	@AndroidFindBy(xpath="(//android.widget.EditText[contains(@text,'Enter Name')])[1]")
	private WebElement searchname;
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Save Search\"]")
	private WebElement saveSearch;
	
	
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Saved Searches\"]")
	private WebElement savedSearches;
	
	@AndroidFindBy(xpath="(//android.widget.Button)[1]")
	private WebElement backButton3;
	
	@AndroidFindBy(xpath="(//android.widget.Button)[1]")
	private WebElement backButton4;
	
	
	
	//Action methods
	public void clickOnMarksOption()
	{
		marks.click();
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
	
	public void clickOnFilterOption()
	{
		filter.click();
	}
	
	public void clickOnClearAllOption()
	{
		clearAll.click();
	}
	public void clickOnCategory2Dropdown()
	{
		category2Dropdown.click();
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
	public void clickOnSearchWorthPoint()
	{
		searchworthpoint.click();
	}
	public void clickOnPriceOption()
	{
		price.click();
	}
	public void clickOnViewAll()
	{
		viewAll.click();
	}

	public void clickOnSearchName(String name)
	{
		searchname.click();
		searchname.sendKeys(name);
	}
	public void clickOnSaveSearch()
	{
		saveSearch.click();
	}
    public void clickOnBackButton3()
    {
    	backButton3.click();
    }
    public void clickOnBackButton4()
    {
    	backButton4.click();
    }
    public void clickOnSavedSearches()
    {
    	savedSearches.click();
    }
	
	
	
}
