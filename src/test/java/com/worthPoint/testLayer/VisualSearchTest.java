package com.worthPoint.testLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.worthPoint.pagelayer.VisualSearchPage;

import baseLayer.TestBase;
import io.appium.java_client.android.Activity;
import utilities.Utilities;


public class VisualSearchTest extends TestBase {
	
		
	private String Results="//android.view.View[@content-desc=\"Results\"]";
	private String ProductImage="(//android.widget.ImageView)[4]";
	private String BackButton1="(//android.widget.Button)[1]";
	private String NoDataAvailable="//android.view.View[@content-desc=\"No Data Available\"]";


	
	@Test (priority=1)
	public void verifyVisualSearchFunctionalityByGalleryUsingPriceGuide() throws InterruptedException 
	{
	    visualsearch=new VisualSearchPage(driver);
	    util= new Utilities(driver);
		
		visualsearch= new VisualSearchPage(driver);
		visualsearch.clickOnSearchWorthPoint();
		visualsearch.clickOnCamera1();
		visualsearch.clickOnGallery();
		visualsearch.clickOnSelectImage();
		visualsearch.clickOnConfirmButton();
		
		util.explicitWait(Results);
		
		if(driver.findElements(By.xpath(Results)).size()>0)
			   Assert.assertTrue(true);
			else
			   Assert.assertTrue(false);
				
		Thread.sleep(7000);
		util.explicitWait(ProductImage);
		
		if(driver.findElements(By.xpath(ProductImage)).size()>0)
			Assert.assertTrue(true);
		else
			Assert.assertTrue(false);
		
		util.explicitWait(BackButton1);
		visualsearch.clickOnBackButton2();
		visualsearch.clickOnBackButton1();
	
	}
	
	@Test (priority=2)
	public void verifyVisualSearchFunctionalityByGalleryUsingMarks() throws InterruptedException
	{
		visualsearch= new VisualSearchPage(driver);
		util= new Utilities(driver);
		
		visualsearch.clickOnSearchWorthPoint();
		visualsearch.clickOnMarks();
		visualsearch.clickOnCamera1();
		visualsearch.clickOnGallery();
		visualsearch.clickOnSelectImage();
		visualsearch.clickOnConfirmButton();
		util.explicitWait(NoDataAvailable);
		
		Thread.sleep(3000);
		if(driver.findElements(By.xpath(NoDataAvailable)).size()>0)
			Assert.assertTrue(true);
		else
			Assert.assertTrue(false);
		
		util.explicitWait(BackButton1);
		visualsearch.clickOnBackButton2();
		visualsearch.clickOnBackButton1();
	}
	
}
