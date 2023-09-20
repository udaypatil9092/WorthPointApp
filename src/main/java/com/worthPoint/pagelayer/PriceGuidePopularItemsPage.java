package com.worthPoint.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import baseLayer.TestBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class PriceGuidePopularItemsPage extends TestBase{
	
	
AndroidDriver driver;
	
	public PriceGuidePopularItemsPage(AndroidDriver driver)
	{
		
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//Object Repository
	
	@AndroidFindBy(xpath="//android.widget.ImageView[@content-desc=\"Price Guide\"]")
	private WebElement priceGuide;
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"View All\"]")
	private WebElement popularItems;
	
	@AndroidFindBy(xpath="(//android.widget.Button)[1]")
	private WebElement backButton1;
	
	@AndroidFindBy(xpath="(//android.widget.ImageView)[2]")
	private WebElement listIcon;
	
	@AndroidFindBy(xpath="(//android.widget.ImageView)[2]")
	private WebElement gridIcon;
	
	@AndroidFindBy(xpath="(//android.widget.ImageView)[3]")
	private WebElement product;
	
	@AndroidFindBy(xpath="(//android.widget.Button)[1]")
	private WebElement backButton2;
	
	@AndroidFindBy(xpath="(//android.widget.Button)[2]")
	private WebElement ShareButton;
	
	@AndroidFindBy(xpath="(//android.widget.Button)[3]")
	private WebElement FavIcon;
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Favorites\"]")
	private WebElement MyFavBtn;
	
	@AndroidFindBy(xpath="(//android.widget.Button)[1]")
	private WebElement backButton3;
	
	//Action methods
	public void clickOnPriceGuideOption()
	{
		priceGuide.click();
	}

	public void clickOnPopularItems()
	{
		popularItems.click();
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
	
	public void clickOnListProduct()
	{
		product.click();
	}
	
	public void clickOnBackButton2()
	{
		backButton2.click();
	}
	
	public void clickOnShareButton()
	{
		ShareButton.click();
	}
	
	public void clickOnFavoriteIcon()
	{
		FavIcon.click();
	}
	
	public void clickOnMyFavoriteButtton()
	{
		MyFavBtn.click();
	}
	
	public void clickOnBackButton3()
	{
		backButton3.click();
	}
}
