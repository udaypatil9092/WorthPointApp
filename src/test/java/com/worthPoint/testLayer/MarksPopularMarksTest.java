package com.worthPoint.testLayer;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.worthPoint.pagelayer.MarksPopularMarksPage;

import baseLayer.TestBase;
import utilities.Utilities;


public class MarksPopularMarksTest extends TestBase{
	
	private	String PopularMarks="//android.view.View[@content-desc=\"Popular Marks\"]";
	private String Categories="//android.view.View[@content-desc=\"Categories\"]";
	private String ProductImage="(//android.widget.ImageView)[3]";
	private String Keywords="//android.view.View[@content-desc=\"Keywords\"]";
	private String ImageView="(//android.widget.ImageView)[1]";
	
	private String TextView="(//android.widget.TextView)[1]";
	private String BackButton1="(//android.widget.Button)[1]";

	
	@Test(priority=1)
	public void verifyMarksPopularMarksDisplayFunctionality()
	{
		MarksPopularMarksPage marks= new MarksPopularMarksPage(driver);
		util= new Utilities(driver);
		
		marks= new MarksPopularMarksPage(driver);
		marks.clickOnMarksOption();
		marks.clickOnPopularMarks();

		if(driver.findElements(By.xpath(PopularMarks)).size()>0)
		   Assert.assertTrue(true);
		else
		   Assert.assertTrue(false);
		
		marks.clickOnBackButton1();
		
		if(driver.findElements(By.xpath(Categories)).size()>0)
		   Assert.assertTrue(true);
		else
		   Assert.assertTrue(false);	
		
	}
	
	@Test(priority=2)
	public void verifyMarksPopularMarksFunctionalityListandGridView()
	{
		marks= new MarksPopularMarksPage(driver);
		util= new Utilities(driver);
		
		marks.clickOnMarksOption();
		marks.clickOnPopularMarks();

		if(driver.findElements(By.xpath(PopularMarks)).size()>0)
			   Assert.assertTrue(true);
		else
			   Assert.assertTrue(false);

		marks.clickOnListIcon();
		
		if(driver.findElements(By.xpath(ProductImage)).size()>0)
			   Assert.assertTrue(true);
		else
			   Assert.assertTrue(false);
		marks.clickOnGridIcon();
		marks.clickOnBackButton1();
		
		if(driver.findElements(By.xpath(Categories)).size()>0)
			   Assert.assertTrue(true);
		else
			   Assert.assertTrue(false);
	}
	
	@Test (priority=3)
	public void verifyMarksPopulorMarksFunctionalityClickOnProductandSeeDetails() {
		
		marks= new MarksPopularMarksPage(driver);
		util= new Utilities(driver);
		
		marks.clickOnMarksOption();
		marks.clickOnPopularMarks();

		if(driver.findElements(By.xpath(PopularMarks)).size()>0)
			   Assert.assertTrue(true);
		else
			   Assert.assertTrue(false);
		marks.clickOnProduct();
		util.explicitWait(ProductImage);
		util.scrollToEnd();
		util.explicitWait(Keywords);
		
    	if(driver.findElements(By.xpath(Keywords)).size()>0)
			Assert.assertTrue(true);
		else
			Assert.assertTrue(false);
		 
		 util.scrollToBeginning();
		 marks.clickOnBackButton2();
		 marks.clickOnBackButton1();
		 
		 if(driver.findElements(By.xpath(Categories)).size()>0)
			Assert.assertTrue(true);
		 else
			Assert.assertTrue(false);

	}
	
	
	@Test (priority=4)
	public void verifyMarksPopulorMarksFunctionalityListViewClickOnProductandSeeDetails() throws Exception{
		
		marks= new MarksPopularMarksPage(driver);
		util= new Utilities(driver);
		
		marks.clickOnMarksOption();
		marks.clickOnPopularMarks();

		if(driver.findElements(By.xpath(PopularMarks)).size()>0)
			   Assert.assertTrue(true);
		else
			   Assert.assertTrue(false);

		marks.clickOnListIcon();
	    util.explicitWait(ProductImage);
	    marks.clickOnListProduct();
	    
		if(driver.findElements(By.xpath(ImageView)).size()>0)
		   Assert.assertTrue(true);
		else
		   Assert.assertTrue(false);
		
		marks.clickOnBackButton2();
		marks.clickOnBackButton1();
		
		if(driver.findElements(By.xpath(Categories)).size()>0)
		   Assert.assertTrue(true);
		else
		   Assert.assertTrue(false);
	
		
	}
	
	@Test (priority=5)
	public void verifyMarksPopularMarksFunctionalityProductcLinkShare() throws Exception{
		
		marks= new MarksPopularMarksPage(driver);
		util= new Utilities(driver);
		
		marks.clickOnMarksOption();
		marks.clickOnPopularMarks();

		if(driver.findElements(By.xpath(PopularMarks)).size()>0)
			   Assert.assertTrue(true);
		else
			   Assert.assertTrue(false);
		Thread.sleep(2000);
		marks.clickOnProduct();
		Thread.sleep(1000);
		util.explicitWait(ProductImage);
		marks.clickOnShareButton();
		util.explicitWait(TextView);
		util.clickOnElementUsingCoordinates(541, 422);
	//	util.touchAction(541, 422);
		marks.clickOnBackButton2();
		util.explicitWait(BackButton1);
		
		marks.clickOnBackButton1();
		
		if(driver.findElements(By.xpath(Categories)).size()>0)
			   Assert.assertTrue(true);
		else
			   Assert.assertTrue(false);
	}
	
	@Test (priority=6)
	public void verifyMarksPopularMarksFunctionalityFavoriteProduct() throws Exception{
		
		marks= new MarksPopularMarksPage(driver);
		util= new Utilities(driver);
		
		marks.clickOnMarksOption();
		marks.clickOnPopularMarks();

		Thread.sleep(1000);
		if(driver.findElements(By.xpath(PopularMarks)).size()>0)
			   Assert.assertTrue(true);
		else
			   Assert.assertTrue(false);
		Thread.sleep(1000);
		marks.clickOnProduct();
		Thread.sleep(1000);
		util.explicitWait(ProductImage);
		marks.clickOnFavoriteIcon();
		Thread.sleep(1000);
		marks.clickOnBackButton2();
		util.explicitWait(BackButton1);
		Thread.sleep(1000);
		marks.clickOnBackButton1();
		
		if(driver.findElements(By.xpath(Categories)).size()>0)
			   Assert.assertTrue(true);
		else
			   Assert.assertTrue(false);
		
		marks.clickOnMyFavoriteButtton();
		Thread.sleep(1000);
		util.explicitWait(ProductImage);
		
		if(driver.findElements(By.xpath(ProductImage)).size()>0)
		   Assert.assertTrue(true);
		 else
		   Assert.assertTrue(false);
		marks.clickOnBackButton1();
		Thread.sleep(1000);
		if(driver.findElements(By.xpath(Categories)).size()>0)
			   Assert.assertTrue(true);
		else
			   Assert.assertTrue(false);
		
	}
	
	
	

}
