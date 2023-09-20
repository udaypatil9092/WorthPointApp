package com.worthPoint.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import baseLayer.TestBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class VisualSearchPage extends TestBase{
	
	
    AndroidDriver driver;
	
	public VisualSearchPage(AndroidDriver driver)
	{
		
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//Obj Repo
	
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Search WorthPoint\"]")
	private WebElement SearchWorthPoint;
	
	@AndroidFindBy(xpath="(//android.widget.ImageView)[1]")
	private WebElement Camera1;

	@AndroidFindBy(xpath="(//android.widget.ImageView)[2]")
	private WebElement Gallery;
	
	@AndroidFindBy(xpath="(//android.widget.ImageView)[1]")
	private WebElement SelectImage;
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Confirm\"]")
	private WebElement Confirm1;
	
	@AndroidFindBy(xpath="(//android.widget.Button)[1]")
	private WebElement BackButton2;
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Marks\"]")
	private WebElement Marks;
	
	@AndroidFindBy(xpath="(//android.widget.Button)[1]")
	private WebElement BackButton1;
	
	//ActionMethods
	public void clickOnSearchWorthPoint()
	{
		SearchWorthPoint.click();
	}
	
	public void clickOnCamera1()
	{
		Camera1.click();
	}
	
	public void clickOnGallery()
	{
		Gallery.click();
	}
	
	public void clickOnSelectImage()
	{
		SelectImage.click();
	}
	
	public void clickOnConfirmButton()
	{
		Confirm1.click();
	}
	
	public void clickOnBackButton1()
	{
		BackButton1.click();
	}
	
	public void clickOnMarks()
	{
		Marks.click();
	}
	

	public void clickOnBackButton2()
	{
		BackButton1.click();
	}
	
}
