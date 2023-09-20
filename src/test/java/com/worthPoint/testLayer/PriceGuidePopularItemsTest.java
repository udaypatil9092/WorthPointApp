package com.worthPoint.testLayer;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.util.concurrent.Uninterruptibles;
import com.worthPoint.pagelayer.PriceGuidePopularItemsPage;

import baseLayer.TestBase;

import io.appium.java_client.android.Activity;
import io.appium.java_client.touch.offset.PointOption;
import utilities.Utilities;



public class PriceGuidePopularItemsTest extends TestBase{
		
	
	private	String PopularItems="//android.view.View[@content-desc=\"Popular Items\"]";
	private String Categories="//android.view.View[@content-desc=\"Categories\"]";
	private String ProductImage="(//android.widget.ImageView)[3]";
	private String FlagItem="//android.view.View[@content-desc=\"Flag item for content or copyright\"]";
	private String ViewAll="//android.widget.Button[@content-desc=\"View All\"]";
	private String View = "(//android.view.View)[3]";
	private String ImageView="(//android.widget.ImageView)[1]";

	private String TextView="(//android.widget.TextView)[1]";
	private String BackButton1="(//android.widget.Button)[1]";
	private String UpgradeToSeePrice="//android.view.View[@content-desc=\"Upgrade to see price\"]";
	
	
	
	@Test(priority=1)
	public void verifyPriceGuidePopularItemsDisplayFunctionality()
	{
		logger.info("Execution started for verifyPriceGuidePopularItemsDisplayFunctionality");
		
		priceguide=new PriceGuidePopularItemsPage(driver);
		util= new Utilities(driver);
		
		priceguide.clickOnPriceGuideOption();
		priceguide.clickOnPopularItems();

		if(driver.findElements(By.xpath(PopularItems)).size()>0)
		   Assert.assertTrue(true);
		else
		   Assert.assertTrue(false);
		
		priceguide.clickOnBackButton1();
		
		if(driver.findElements(By.xpath(Categories)).size()>0)
		   Assert.assertTrue(true);
		else
		   Assert.assertTrue(false);	
		
		
		logger.info("Execution completed for verifyPriceGuidePopularItemsDisplayFunctionality");
		
	}
	
	@Test (priority=2)
	public void verifyPriceGuidePopulorModulesFunctionalityListandGridView(){
		
			logger.info("Execution started for verifyPriceGuidePopulorModulesFunctionalityListandGridView");
			
			priceguide=new PriceGuidePopularItemsPage(driver);
			util= new Utilities(driver);
			
			priceguide.clickOnPriceGuideOption();
			priceguide.clickOnPopularItems();
			
			if(driver.findElements(By.xpath(PopularItems)).size()>0)
			   Assert.assertTrue(true);
			else
			   Assert.assertTrue(false);
			
			priceguide.clickOnListIcon();
			
			if(driver.findElements(By.xpath(ProductImage)).size()>0)
			   Assert.assertTrue(true);
			else
			   Assert.assertTrue(false);
			  
			priceguide.clickOnGridIcon();
			priceguide.clickOnBackButton1();
			
			if(driver.findElements(By.xpath(Categories)).size()>0)
			   Assert.assertTrue(true);
			else
			   Assert.assertTrue(false);
			
			logger.info("Execution completed for verifyPriceGuidePopulorModulesFunctionalityListandGridView");
		
	}
	
	@Test (priority=3)
	public void verifyPriceGuidePopulorModulesFunctionalityClickOnProductandSeeDetails() throws Exception{
		
		logger.info("Execution started for verifyPriceGuidePopulorModulesFunctionalityClickOnProductandSeeDetails");
		
		priceguide=new PriceGuidePopularItemsPage(driver);
		util= new Utilities(driver);
		
		priceguide.clickOnPriceGuideOption();
		priceguide.clickOnPopularItems();
		priceguide.clickOnProduct();
	    Thread.sleep(6000);
	    util.explicitWait(ProductImage);
    	if(driver.findElements(By.xpath(UpgradeToSeePrice)).size()>0)
			Assert.assertTrue(true);
		else
			Assert.assertTrue(false);
		
		util.scrollToEnd();
		util.explicitWait(FlagItem);
    	
    	if(driver.findElements(By.xpath(FlagItem)).size()>0)
			Assert.assertTrue(true);
		else
			Assert.assertTrue(false);
		 
		 util.scrollToBeginning();
		 priceguide.clickOnBackButton2();
		 priceguide.clickOnBackButton1();
		 
		 if(driver.findElements(By.xpath(ViewAll)).size()>0)
			Assert.assertTrue(true);
		 else
			Assert.assertTrue(false);	

		 logger.info("Execution completed for verifyPriceGuidePopulorModulesFunctionalityClickOnProductandSeeDetails");
	}
	
	
	@Test (priority=4)
	public void verifyPriceGuidePopulorModulesFunctionalityListViewClickOnProductandSeeDetails() throws Exception{
  
		logger.info("Execution started for verifyPriceGuidePopulorModulesFunctionalityListViewClickOnProductandSeeDetails");
		
		priceguide=new PriceGuidePopularItemsPage(driver);
		util= new Utilities(driver);
		
		priceguide.clickOnPriceGuideOption();
		priceguide.clickOnPopularItems();
		util.explicitWait(ProductImage);
		  
	    if(driver.findElements(By.xpath(View)).size()>0)
		   Assert.assertTrue(true);
		else
		   Assert.assertTrue(false);
	    
	    priceguide.clickOnListIcon();
	    util.explicitWait(ProductImage);
	    priceguide.clickOnListProduct();
	    
		if(driver.findElements(By.xpath(ImageView)).size()>0)
		   Assert.assertTrue(true);
		else
		   Assert.assertTrue(false);
		
		priceguide.clickOnBackButton2();
		priceguide.clickOnBackButton1();
		
		if(driver.findElements(By.xpath(ViewAll)).size()>0)
		   Assert.assertTrue(true);
		else
		   Assert.assertTrue(false);
		
		logger.info("Execution completed for verifyPriceGuidePopulorModulesFunctionalityListViewClickOnProductandSeeDetails");
	}
	
	@Test (priority=5)
	public void verifyPriceGuidePopulorModulesFunctionalityProductcLinkShare() throws Exception{
		
		logger.info("Execution started for verifyPriceGuidePopulorModulesFunctionalityProductcLinkShare");
		
		priceguide=new PriceGuidePopularItemsPage(driver);
		util= new Utilities(driver);
		
		priceguide.clickOnPriceGuideOption();
		priceguide.clickOnPopularItems();
		Uninterruptibles.sleepUninterruptibly(Duration.ofMillis(2000));
		util.explicitWait(ImageView);
		priceguide.clickOnProduct();
		Thread.sleep(1000);
		priceguide.clickOnShareButton();
		Thread.sleep(1000);
		util.explicitWait(TextView);
		util.clickOnElementUsingCoordinates(541, 422);
		priceguide.clickOnBackButton2();
		Thread.sleep(1000);
		util.explicitWait(BackButton1);
		priceguide.clickOnBackButton1();
		Thread.sleep(1000);
		if(driver.findElements(By.xpath(ViewAll)).size()>0)
		   Assert.assertTrue(true);
		else
		   Assert.assertTrue(false);
		
		logger.info("Execution completed for verifyPriceGuidePopulorModulesFunctionalityProductcLinkShare");
	}
	
	
	@Test (priority=6)
	public void verifyPriceGuidePopulorModulesFunctionalityFavoriteProduct() throws Exception{
		
		logger.info("Execution started for verifyPriceGuidePopulorModulesFunctionalityFavoriteProduct");
		
		priceguide=new PriceGuidePopularItemsPage(driver);
		util= new Utilities(driver);
		
		priceguide.clickOnPriceGuideOption();
		priceguide.clickOnPopularItems();
		util.explicitWait(ProductImage);
		priceguide.clickOnProduct();
		Uninterruptibles.sleepUninterruptibly(Duration.ofMillis(2000));
		priceguide.clickOnFavoriteIcon();
		priceguide.clickOnBackButton2();
		util.explicitWait(BackButton1);
		priceguide.clickOnBackButton1();
		
		if(driver.findElements(By.xpath(ViewAll)).size()>0)
			Assert.assertTrue(true);
		else
			Assert.assertTrue(false);
		
		priceguide.clickOnMyFavoriteButtton();
		util.explicitWait(ProductImage);
		
		if(driver.findElements(By.xpath(ProductImage)).size()>0)
		   Assert.assertTrue(true);
		 else
		   Assert.assertTrue(false);
		priceguide.clickOnBackButton3();
		
		if(driver.findElements(By.xpath(ViewAll)).size()>0)
		   Assert.assertTrue(true);
		else
		   Assert.assertTrue(false);
		
		logger.info("Execution completed for verifyPriceGuidePopulorModulesFunctionalityFavoriteProduct");
	}

}
