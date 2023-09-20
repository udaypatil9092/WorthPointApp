package com.worthPoint.testLayer;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.worthPoint.pagelayer.MarksCategoriesPage;

import baseLayer.TestBase;
import utilities.Utilities;



public class MarksCategoriesTest extends TestBase{
	

	
	private String Categories="//android.view.View[@content-desc=\"Categories\"]";
	private String Advertising="//android.view.View[@content-desc=\"Advertising\"]";
	private String ProductImage="(//android.widget.ImageView)[3]";
	private String Keywords="//android.view.View[@content-desc=\"Keywords\"]";
	private String ImageView="(//android.widget.ImageView)[1]";
	
	private String TextView="(//android.widget.TextView)[1]";
	private String BackButton1="(//android.widget.Button)[1]";
	private String Filters="//android.view.View[@content-desc=\"Filters\"]";
	private String Category="//android.view.View[@content-desc=\"Category\"]";
	private String SelectOrEnter="//android.view.View[@content-desc=\"Select Or Enter\"]";
	private String AlcoholAndSmoking="//android.view.View[@content-desc=\"Alcohol & Smoking\"]";
	private String Success="//android.view.View[@content-desc=\"Success\"]";
	private String Vintage="//android.view.View[@content-desc=\"Vintage\"]";
	
	@Test (priority=1)
	public void verifyMarksCategoriesAdvertisingModuleFunctionality() throws InterruptedException{
		
		mcategories=new MarksCategoriesPage(driver);
		util= new Utilities(driver);
		
		mcategories=new MarksCategoriesPage(driver);
		mcategories.clickOnMarksOption();
		util.explicitWait(Categories);
		mcategories.clickOnAdvertisingOption();
		util.explicitWait(ImageView);
		Thread.sleep(2000);
	
		  if(driver.findElements(By.xpath(ImageView)).size()>0)
			 Assert.assertTrue(true);
		  else
			 Assert.assertTrue(false);
		  
		  util.explicitWait(BackButton1);
		  
		  mcategories.clickOnBackButton1();
		  
		if(driver.findElements(By.xpath(Categories)).size()>0)
		  Assert.assertTrue(true);
		else
		  Assert.assertTrue(false);
		  			  
	}
	
	@Test (priority=2)
	public void verifyMarksCategoriesAdvertisingListViewClickOnProductandSeeDetails() throws Exception{
		
		
		  mcategories=new MarksCategoriesPage(driver);
		  util= new Utilities(driver);
		  
		  mcategories.clickOnMarksOption();
		  util.explicitWait(Categories);
		  mcategories.clickOnAdvertisingOption();
		  util.explicitWait(ImageView);
		  Thread.sleep(2000);
	
		  if(driver.findElements(By.xpath(ImageView)).size()>0)
			 Assert.assertTrue(true);
		  else
			 Assert.assertTrue(false);
		  
		  mcategories.clickOnListIcon();
		  util.explicitWait(ImageView);

		  if(driver.findElements(By.xpath(ImageView)).size()>0)
				 Assert.assertTrue(true);
			  else
				 Assert.assertTrue(false);
		  util.explicitWait(ImageView);
		  mcategories.clickOnGridIcon();
		  util.explicitWait(ImageView);
		  mcategories.clickOnBackButton1();
		  
		  if(driver.findElements(By.xpath(Categories)).size()>0)
			Assert.assertTrue(true);
		  else
			Assert.assertTrue(false);	  
	}
	
	@Test (priority=3)
	public void verifyMarksCategoriesModulesFunctionalityClickOnProductandSeeDetails() throws Exception{
		

		  mcategories=new MarksCategoriesPage(driver);
		  util= new Utilities(driver);
		  
		  mcategories.clickOnMarksOption();
		  util.explicitWait(Categories);
		  mcategories.clickOnAdvertisingOption();
		  util.explicitWait(ImageView);
		  Thread.sleep(2000);
	
		  if(driver.findElements(By.xpath(ImageView)).size()>0)
			 Assert.assertTrue(true);
		  else
			 Assert.assertTrue(false);
		  
		  mcategories.clickOnProduct();
		  
		 if(driver.findElements(By.xpath(Advertising)).size()>0)
			Assert.assertTrue(true);
		 else
			Assert.assertTrue(false);
		 
		 util.scrollToEnd();
		 util.explicitWait(Keywords);
		 if(driver.findElements(By.xpath(Keywords)).size()>0)
			 Assert.assertTrue(true);
		  else
			 Assert.assertTrue(false);
		 util.scrollToBeginning();
		 mcategories.clickOnBackButton2();
		 util.explicitWait(BackButton1);
		 mcategories.clickOnBackButton1();
		 
		 if(driver.findElements(By.xpath(Categories)).size()>0)
			Assert.assertTrue(true);
		 else
			Assert.assertTrue(false);
	
	}
	
	@Test (priority=4)
		public void verifyMarksCategoriesModulesFunctionalityListViewClickOnProductandSeeDetails() throws Exception{
			
		  mcategories=new MarksCategoriesPage(driver);
		  util= new Utilities(driver);
		  
		  mcategories.clickOnMarksOption();
		  util.explicitWait(Categories);
		  mcategories.clickOnAdvertisingOption();
		  util.explicitWait(ImageView);
		  Thread.sleep(2000);
	
		  if(driver.findElements(By.xpath(ImageView)).size()>0)
			 Assert.assertTrue(true);
		  else
			 Assert.assertTrue(false);
		  
		  mcategories.clickOnListIcon();
		  util.explicitWait(ImageView);
		
		 if(driver.findElements(By.xpath(ImageView)).size()>0)
			Assert.assertTrue(true);
		 else
			Assert.assertTrue(false);
			  
		 mcategories.clickOnProduct();
		 util.explicitWait(ImageView);
		 
		 if(driver.findElements(By.xpath(Advertising)).size()>0)
			Assert.assertTrue(true);
		 else
			Assert.assertTrue(false);
		 
		 Thread.sleep(2000);
		 util.explicitWait(BackButton1);
		 
		 mcategories.clickOnBackButton2();
		 util.explicitWait(BackButton1);
		 mcategories.clickOnBackButton1();
			  
		if(driver.findElements(By.xpath(Categories)).size()>0)
			Assert.assertTrue(true);
		else
			Assert.assertTrue(false);
				 
		}
	
	@Test(priority=5)
	public void verifyMarksCategoryFilterHeaderFunctionality() throws InterruptedException
	{
		  mcategories=new MarksCategoriesPage(driver);
		  util= new Utilities(driver);
		  
		  mcategories.clickOnMarksOption();
		  util.explicitWait(Categories);
		  mcategories.clickOnAdvertisingOption();
		  util.explicitWait(ImageView);
		  Thread.sleep(2000);
	
		  if(driver.findElements(By.xpath(ImageView)).size()>0)
			 Assert.assertTrue(true);
		  else
			 Assert.assertTrue(false);
		  
		  mcategories.clickOnFilterOption();
		 
		  util.explicitWait(Filters);
	
		 if(driver.findElements(By.xpath(Filters)).size()>0)
			Assert.assertTrue(true);
		 else
			 Assert.assertTrue(false);
		 
		 mcategories.clickOnClearAllOption();
	
		  if(driver.findElements(By.xpath(Category)).size()>0)
			 Assert.assertTrue(true);
		  else
			 Assert.assertTrue(false);
		  
		  util.explicitWait(BackButton1);
		  mcategories.clickOnBackButton2();
		  mcategories.clickOnBackButton1(); 	  
	}

	@Test(priority=6)
	public void verifyMarksCategoryFilterCategoryAdvertisingOption() throws InterruptedException
	{

		  mcategories=new MarksCategoriesPage(driver);
		  util= new Utilities(driver);
		  
		  mcategories.clickOnMarksOption();
		  util.explicitWait(Categories);
		  mcategories.clickOnAdvertisingOption();
		  util.explicitWait(ImageView);
		  Thread.sleep(2000);
	
		  if(driver.findElements(By.xpath(ImageView)).size()>0)
			 Assert.assertTrue(true);
		  else
			 Assert.assertTrue(false);
		  
		  mcategories.clickOnFilterOption();
		  util.explicitWait(Filters);
	
		 if(driver.findElements(By.xpath(Filters)).size()>0)
			Assert.assertTrue(true);
		 else
			 Assert.assertTrue(false);
		 
		 mcategories.clickOnClearAllOption();
		 util.explicitWait(SelectOrEnter);
		 mcategories.clickOnCategory2Dropdown();
		 mcategories.clickOnCategory2Option1();
		 mcategories.clickOnShowResult();
		 util.explicitWait(ImageView);
		 Thread.sleep(3000);
		 mcategories.clickOnProduct();
		 util.explicitWait(Advertising);
		 
		 if(driver.findElements(By.xpath(Advertising)).size()>0)
			Assert.assertTrue(true);
		 else
			Assert.assertTrue(false);
		 util.explicitWait(BackButton1);
		 mcategories.clickOnBackButton2();
		 mcategories.clickOnBackButton1();
		 
	}
	
	@Test(priority=7)
	public void verifyMarksCategoryFilterCategoryAlcoholAndSmokingOption() throws InterruptedException
	{

		  mcategories=new MarksCategoriesPage(driver);
		  util= new Utilities(driver);
		  
		  mcategories.clickOnMarksOption();
		  util.explicitWait(Categories);
		  mcategories.clickOnAdvertisingOption();
		  util.explicitWait(ImageView);
		  Thread.sleep(2000);
	
		  if(driver.findElements(By.xpath(ImageView)).size()>0)
			 Assert.assertTrue(true);
		  else
			 Assert.assertTrue(false);
		  
		  mcategories.clickOnFilterOption();
		  util.explicitWait(Filters);
	
		 if(driver.findElements(By.xpath(Filters)).size()>0)
			Assert.assertTrue(true);
		 else
			 Assert.assertTrue(false);
		 
		 mcategories.clickOnClearAllOption();
		 util.explicitWait(SelectOrEnter);
		 mcategories.clickOnCategory2Dropdown();
		 mcategories.clickOnCategory2Option2();
		 mcategories.clickOnShowResult();
		 util.explicitWait(ImageView);
		 Thread.sleep(3000);
		 mcategories.clickOnProduct();
		 util.explicitWait(AlcoholAndSmoking);
		 
		 if(driver.findElements(By.xpath(AlcoholAndSmoking)).size()>0)
			Assert.assertTrue(true);
		 else
			Assert.assertTrue(false);
		 util.explicitWait(BackButton1);
		 mcategories.clickOnBackButton2();
		 mcategories.clickOnBackButton1();
		 
	}
	
	@Test (priority=8)
	public void verifyMarksCategoriesModulesFunctionalitySaveSearch() throws Exception{
		
		// Prerequisite: we have to search price manually search WorthPoint tab to get recent search options.(EX : Price)
		
		  mcategories=new MarksCategoriesPage(driver);
		  util= new Utilities(driver);
		  
		  mcategories.clickOnMarksOption();
		  util.explicitWait(Categories);
		  mcategories.clickOnAdvertisingOption();
		  util.explicitWait(ImageView);
		  Thread.sleep(2000);
	
		  if(driver.findElements(By.xpath(ImageView)).size()>0)
			 Assert.assertTrue(true);
		  else
			 Assert.assertTrue(false);
		  mcategories.clickOnSearchWorthPoint();
		  Thread.sleep(2000);
		  
		 mcategories.clickOnPriceOption();
		  Thread.sleep(2000);
		  mcategories.clickOnViewAll();
		  Thread.sleep(3000);
		  mcategories.clickOnSaveButton();
		  mcategories.clickOnSearchName("Vintage");
		  mcategories.clickOnSaveSearch();
		  
		 if(driver.findElements(By.xpath(Success)).size()>0)
			 Assert.assertTrue(true);
		  else
			 Assert.assertTrue(false);
		 
		 util.explicitWait(BackButton1);
		 Thread.sleep(3000);
		 mcategories.clickOnBackButton4();
		 mcategories.clickOnBackButton3();
		 mcategories.clickOnBackButton2();
		 mcategories.clickOnBackButton1();
		 
		 if(driver.findElements(By.xpath(Categories)).size()>0)
			Assert.assertTrue(true);
		 else
			Assert.assertTrue(false);
		 mcategories.clickOnSavedSearches();
		
		 util.explicitWait(Vintage);
		 Thread.sleep(2000);

		 if(driver.findElements(By.xpath(Vintage)).size()>0)
			Assert.assertTrue(true);
		 else
			Assert.assertTrue(false);

		 mcategories.clickOnBackButton1();
	
		 if(driver.findElements(By.xpath(Categories)).size()>0)
			Assert.assertTrue(true);
		 else
			Assert.assertTrue(false);
			  
	}
}
