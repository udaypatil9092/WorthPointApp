package com.worthPoint.testLayer;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.util.concurrent.Uninterruptibles;
import com.worthPoint.pagelayer.PriceGuideCategoriesPage;
import baseLayer.TestBase;
import utilities.Utilities;


public class PriceGuideCategoriesTest extends TestBase{
	
	
	private String Categories="//android.view.View[@content-desc=\"Categories\"]";
	private String ImageView="(//android.widget.ImageView)[4]"; 
	private String BackButton1="(//android.widget.Button)[1]";
	private String Advertising="//android.view.View[@content-desc=\"Advertising\"]";
	private String FlagItem="//android.view.View[@content-desc=\"Flag item for content or copyright\"]";
	private String Success="//android.view.View[@content-desc=\"Success\"]";
	private String HANDMADEBATIKCOTTON ="//android.view.View[@content-desc=\"HANDMADE BATIK COTTON\"]";
	
	private String Filter="(//android.widget.ImageView)[3]";
	private String Filters="//android.view.View[@content-desc=\"Filters\"]";
	private String Sortby="//android.view.View[@content-desc=\"Sort by\"]";
	private String Category="//android.view.View[@content-desc=\"Category\"]";
	private String Source="//android.view.View[@content-desc=\"Source\"]";
	private String Location="//android.view.View[@content-desc=\"Location\"]";
	private String SearchPreferences="//android.view.View[@content-desc=\"Search Preferences\"]";
	private String SelectOrEnter="(//android.view.View[@content-desc=\"Select Or Enter\"])[2]";
	private String AlcoholandSmoking="//android.view.View[@content-desc=\"Alcohol & Smoking\"]";
	
	private String UpgradeToSeePrice="//android.view.View[@content-desc=\"Upgrade to see price\"]";
	private String eBay="//android.view.View[@content-desc=\"eBay\"]";
	private String RRAuction="//android.view.View[@content-desc=\"RR Auction #db\"]";
	private String KeyDate="//android.view.View[@content-desc=\"Key Date Coins\"]";
	
	

	@Test (priority=1)
	public void verifyPriceGuideCategoriesAdvertisingModuleFunctionality() throws InterruptedException{
		
		 pgcategories=new PriceGuideCategoriesPage(driver);
		 util= new Utilities(driver);
		 
		 pgcategories= new PriceGuideCategoriesPage(driver);
		 pgcategories.clickOnPriceGuideOption();
		 util.explicitWait(Categories);
		 pgcategories.clickOnAdvertisingOption();
		 util.explicitWait(ImageView);
		 Thread.sleep(2000);
		 
		  if(driver.findElements(By.xpath(ImageView)).size()>0)
			 Assert.assertTrue(true);
		  else
			 Assert.assertTrue(false);
		  
		  util.explicitWait(BackButton1);
		  pgcategories.clickOnBackButton1();
		  
		if(driver.findElements(By.xpath(Categories)).size()>0)
		  Assert.assertTrue(true);
		else
		  Assert.assertTrue(false);
		  			  
	}
	
	@Test (priority=2)
	public void verifyPriceGuideCategoriesAdvertisingListViewClickOnProductandSeeDetails() throws Exception{
		

		 pgcategories= new PriceGuideCategoriesPage(driver);
		 util= new Utilities(driver);
		 
		 pgcategories.clickOnPriceGuideOption();
		 util.explicitWait(Categories);
		 pgcategories.clickOnAdvertisingOption();
		 util.explicitWait(ImageView);
		  if(driver.findElements(By.xpath(ImageView)).size()>0)
			 Assert.assertTrue(true);
		  else
			 Assert.assertTrue(false);
		  pgcategories.clickOnListIcon();
		  util.explicitWait(ImageView);
		  
		  if(driver.findElements(By.xpath(ImageView)).size()>0)
				 Assert.assertTrue(true);
			  else
				 Assert.assertTrue(false);
		  pgcategories.clickOnGridIcon();
		  util.explicitWait(ImageView);
		  pgcategories.clickOnBackButton1();
		  
		  if(driver.findElements(By.xpath(Categories)).size()>0)
			Assert.assertTrue(true);
		  else
			Assert.assertTrue(false);	  
	}
	
	@Test (priority=3)
	public void verifyPriceGuideCategoriesModulesFunctionalityClickOnProductandSeeDetails() throws Exception{
		

		 pgcategories= new PriceGuideCategoriesPage(driver);
		 util= new Utilities(driver);
		 
		 pgcategories.clickOnPriceGuideOption();
		 util.explicitWait(Categories);
		 pgcategories.clickOnAdvertisingOption();
		 util.explicitWait(ImageView);
		 if(driver.findElements(By.xpath(ImageView)).size()>0)
		    Assert.assertTrue(true);
		 else
			Assert.assertTrue(false);
		 pgcategories.clickOnProduct();
		 if(driver.findElements(By.xpath(Advertising)).size()>0)
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
		 pgcategories.clickOnBackButton2();
		 util.explicitWait(BackButton1);
		 pgcategories.clickOnBackButton1();
		 
		 if(driver.findElements(By.xpath(Categories)).size()>0)
			Assert.assertTrue(true);
		 else
			Assert.assertTrue(false);
	
	}
	
	@Test (priority=4)
		public void verifyPriceGuideCategoriesModulesFunctionalityListViewClickOnProductandSeeDetails() throws Exception{
			
			 pgcategories= new PriceGuideCategoriesPage(driver);
			 util= new Utilities(driver);
			 
			 pgcategories.clickOnPriceGuideOption();
			 util.explicitWait(Categories);
			 pgcategories.clickOnAdvertisingOption();
			 util.explicitWait(ImageView);
			  if(driver.findElements(By.xpath(ImageView)).size()>0)
				 Assert.assertTrue(true);
			  else
				 Assert.assertTrue(false);
			  pgcategories.clickOnListIcon();
			  util.explicitWait(ImageView);
			  
			  if(driver.findElements(By.xpath(ImageView)).size()>0)
					 Assert.assertTrue(true);
				  else
					 Assert.assertTrue(false);
			  pgcategories.clickOnProduct();
			  util.explicitWait(ImageView);
		
			  if(driver.findElements(By.xpath(Advertising)).size()>0)
				Assert.assertTrue(true);
			  else
				Assert.assertTrue(false);
			  util.explicitWait(BackButton1);
			  pgcategories.clickOnBackButton2();
			  util.explicitWait(BackButton1);
			  pgcategories.clickOnBackButton1();
			  
			  if(driver.findElements(By.xpath(Categories)).size()>0)
				Assert.assertTrue(true);
			  else
				Assert.assertTrue(false);
				 
		}
	
	@Test (priority=5)
	public void verifyPriceGuideCategoriesModulesFunctionalitySaveSearch() throws Exception{
		
		// Prerequisite: we have to search price manually search WorthPoint tab to get recent search options.(EX : Price)
		
		 pgcategories= new PriceGuideCategoriesPage(driver);
		 util= new Utilities(driver);
		 
		 pgcategories.clickOnPriceGuideOption();
		 util.explicitWait(Categories);
		 pgcategories.clickOnAdvertisingOption();
		 util.explicitWait(ImageView);
		  
		 if(driver.findElements(By.xpath(ImageView)).size()>0)
			Assert.assertTrue(true);
		 else
			Assert.assertTrue(false);
		 
		 pgcategories.clickOnSearchWorthPoint();
		 Thread.sleep(2000);
		 pgcategories.clickOnPriceOption();
		 pgcategories.clickOnSaveButton();
		 pgcategories.clickOnNameOption("HANDMADE BATIK COTTON");
		 pgcategories.clickOnSaveSearch();
		  
		 if(driver.findElements(By.xpath(Success)).size()>0)
			 Assert.assertTrue(true);
		  else
			 Assert.assertTrue(false);
		 
		 util.explicitWait(BackButton1);
		 pgcategories.clickOnBackButton3();
		 pgcategories.clickOnBackButton2();
		 pgcategories.clickOnBackButton1();
		
		 if(driver.findElements(By.xpath(Categories)).size()>0)
			Assert.assertTrue(true);
		 else
			Assert.assertTrue(false);
		 pgcategories.clickOnSavedSearches();
		 util.explicitWait(HANDMADEBATIKCOTTON);

		 if(driver.findElements(By.xpath(HANDMADEBATIKCOTTON)).size()>0)
			Assert.assertTrue(true);
		 else
			Assert.assertTrue(false);

		 pgcategories.clickOnBackButton3();
		 if(driver.findElements(By.xpath(Categories)).size()>0)
			Assert.assertTrue(true);
		 else
			Assert.assertTrue(false);
			  
	}
	
		@Test(priority=6)
		public void verifyPriceGuideCategoryFilterHeaderFunctionality()
		{
			 pgcategories= new PriceGuideCategoriesPage(driver);
			 util= new Utilities(driver);
			 
			 pgcategories.clickOnPriceGuideOption();
			 util.explicitWait(Categories);
			 pgcategories.clickOnAdvertisingOption();
			 util.explicitWait(ImageView);
			  
			 if(driver.findElements(By.xpath(ImageView)).size()>0)
				Assert.assertTrue(true);
			 else
				Assert.assertTrue(false);
			 
			 pgcategories.clickOnFilterOption();
			 util.explicitWait(Filters);
			 if(driver.findElements(By.xpath(Filters)).size()>0)
				Assert.assertTrue(true);
			 else
				 Assert.assertTrue(false);
			 pgcategories.clickOnClearAllOption();
			 
			  if(driver.findElements(By.xpath(Sortby)).size()>0)
				 Assert.assertTrue(true);
			  else
				 Assert.assertTrue(false);
			  if(driver.findElements(By.xpath(Category)).size()>0)
				 Assert.assertTrue(true);
			  else
				 Assert.assertTrue(false);
			  if(driver.findElements(By.xpath(Source)).size()>0)
				 Assert.assertTrue(true);
			  else
				 Assert.assertTrue(false);
			  if(driver.findElements(By.xpath(Location)).size()>0)
				 Assert.assertTrue(true);
			  else
				 Assert.assertTrue(false);
			  if(driver.findElements(By.xpath(SearchPreferences)).size()>0)
				 Assert.assertTrue(true);
			  else
				 Assert.assertTrue(false);
			  
			  util.explicitWait(BackButton1);
			  pgcategories.clickOnBackButton2();
			  pgcategories.clickOnBackButton1();
			  	  
		}
	
	@Test(priority=7)
	public void verifyPriceGuideCategoryFilterCategoryAdvertisingOption() throws InterruptedException
	{

		 pgcategories= new PriceGuideCategoriesPage(driver);
		 util= new Utilities(driver);
		 
		 pgcategories.clickOnPriceGuideOption();
		 util.explicitWait(Categories);
		 pgcategories.clickOnAdvertisingOption();
		 util.explicitWait(ImageView);
		  
		 if(driver.findElements(By.xpath(ImageView)).size()>0)
			Assert.assertTrue(true);
		 else
			Assert.assertTrue(false);
		 
		 util.explicitWait("(//android.widget.ImageView)[3]");
		 pgcategories.clickOnFilterOption();
		 Thread.sleep(2000);
		 util.explicitWait(Filters);
		 if(driver.findElements(By.xpath(Filters)).size()>0)
			Assert.assertTrue(true);
		 else
			 Assert.assertTrue(false);
		 
		 pgcategories.clickOnClearAllOption();
		 Thread.sleep(2000);
		 util.explicitWait(SelectOrEnter);
		 pgcategories.clickOnCategoryDropdown();
		 Thread.sleep(2000);
		 pgcategories.clickOnCategory2Option1();
		 Thread.sleep(2000);
		 pgcategories.clickOnShowResult();
		 Thread.sleep(2000);
		 util.explicitWait(ImageView);
		 pgcategories.clickOnProduct();
		 util.explicitWait(Advertising);
		 if(driver.findElements(By.xpath(Advertising)).size()>0)
			Assert.assertTrue(true);
		 else
			Assert.assertTrue(false);
		 util.explicitWait(BackButton1);
		 pgcategories.clickOnBackButton2();
		 pgcategories.clickOnBackButton1();
		 
	}
	
	@Test(priority=8)
	public void verifyPriceGuideCategoryFilterAlcoholandSmokingOption() throws InterruptedException
	{
		pgcategories= new PriceGuideCategoriesPage(driver);
		util= new Utilities(driver);
		
		 pgcategories.clickOnPriceGuideOption();
		 util.explicitWait(Categories);
		 pgcategories.clickOnAdvertisingOption();
		 util.explicitWait(ImageView);
		  
		 if(driver.findElements(By.xpath(ImageView)).size()>0)
			Assert.assertTrue(true);
		 else
			Assert.assertTrue(false);
		 
		 pgcategories.clickOnFilterOption();
		 util.explicitWait(Filters);
		 if(driver.findElements(By.xpath(Filters)).size()>0)
			Assert.assertTrue(true);
		 else
			 Assert.assertTrue(false);
		 pgcategories.clickOnClearAllOption();
		 util.explicitWait(SelectOrEnter);
		 pgcategories.clickOnCategoryDropdown();
		 pgcategories.clickOnCategory2Option2();
		 pgcategories.clickOnShowResult();
		 util.explicitWait(ImageView);
		 pgcategories.clickOnProduct();
		 util.explicitWait(AlcoholandSmoking);
		 Uninterruptibles.sleepUninterruptibly(Duration.ofMillis(2000));
		 if(driver.findElements(By.xpath(AlcoholandSmoking)).size()>0)
			Assert.assertTrue(true);
		 else
			Assert.assertTrue(false);
		 util.explicitWait(BackButton1);
		 pgcategories.clickOnBackButton2();
		 pgcategories.clickOnBackButton1();
		 
	}

	@Test(priority=9)
	public void verifyPriceGuideCategoryFilterSourceEBayOption() throws InterruptedException
	{
		
		pgcategories= new PriceGuideCategoriesPage(driver);
		util= new Utilities(driver);
		
		 pgcategories.clickOnPriceGuideOption();
		 util.explicitWait(Categories);
		 pgcategories.clickOnAdvertisingOption();
		 util.explicitWait(ImageView);
		  
		 if(driver.findElements(By.xpath(ImageView)).size()>0)
			Assert.assertTrue(true);
		 else
			Assert.assertTrue(false);
		 
		 util.explicitWait(Filter);
		 pgcategories.clickOnFilterOption();
		 util.explicitWait(Filters);
		 if(driver.findElements(By.xpath(Filters)).size()>0)
			Assert.assertTrue(true);
		 else
			 Assert.assertTrue(false);
		 pgcategories.clickOnClearAllOption();
		 Thread.sleep(1000);
		 pgcategories.clickOnSource();
		 Thread.sleep(1000);
		 pgcategories.clickOnSourceeBayOption();
		 Thread.sleep(1000);
		 pgcategories.clickOnShowResult();
		 Thread.sleep(1000);
		 util.explicitWait(ImageView);
		 pgcategories.clickOnProduct();
		 
		 if(driver.findElements(By.xpath(UpgradeToSeePrice)).size()>0)
			 Assert.assertTrue(true);
		 else
			 Assert.assertTrue(false);
		 
		  WebElement element= driver.findElement(By.xpath(UpgradeToSeePrice));
		  util.scrollNTines(element, 10, "down");
	//    util.scrollToNumberOfTimes(10, element);
		  util.explicitWait(eBay);
		 
		  if(driver.findElements(By.xpath(eBay)).size()>0)
			 Assert.assertTrue(true);
		  else
			 Assert.assertTrue(false);
		  
		  util.explicitWait(BackButton1);
		  pgcategories.clickOnBackButton2();
		  pgcategories.clickOnBackButton1();
		  
	}
	
	@Test(priority=10)
	public void verifyPriceGuideCategoryFilterSourceOtherRRAuctionOption() throws InterruptedException
	{
		
		pgcategories= new PriceGuideCategoriesPage(driver);
		util= new Utilities(driver);
		
		 pgcategories.clickOnPriceGuideOption();
		 util.explicitWait(Categories);
		 pgcategories.clickOnAdvertisingOption();
		 util.explicitWait(ImageView);
		  
		 if(driver.findElements(By.xpath(ImageView)).size()>0)
			Assert.assertTrue(true);
		 else
			Assert.assertTrue(false);
		 
		 util.explicitWait(Filter);
		 pgcategories.clickOnFilterOption();
		 util.explicitWait(Filters);
		 if(driver.findElements(By.xpath(Filters)).size()>0)
			Assert.assertTrue(true);
		 else
			 Assert.assertTrue(false);
		 pgcategories.clickOnClearAllOption();
		 pgcategories.clickOnSource();
		 pgcategories.clickOnSourceOtherOption();
		 pgcategories.clickOnSource();
		 pgcategories.clickOnSourcRRAuctionOption();
		 
		 pgcategories.clickOnShowResult();
		 util.explicitWait(ImageView);
		 pgcategories.clickOnProduct();
		 
		 if(driver.findElements(By.xpath(UpgradeToSeePrice)).size()>0)
			 Assert.assertTrue(true);
		 else
			 Assert.assertTrue(false);
		 
		  WebElement element= driver.findElement(By.xpath(UpgradeToSeePrice));
		  util.scrollNTines(element, 10, "down");
	//	  util.scrollToNumberOfTimes(10, element);
		  util.explicitWait(RRAuction);
		 
		  if(driver.findElements(By.xpath(RRAuction)).size()>0)
			 Assert.assertTrue(true);
		  else
			 Assert.assertTrue(false);
		  
		  util.explicitWait(RRAuction);
		  pgcategories.clickOnBackButton2();
		  pgcategories.clickOnBackButton1();
		  
	}
	
	
	
    //@Test(priority=11)
	public void verifyPriceGuideCategoryFilterSourceOtherKeyDateCoinsOption() throws InterruptedException
	{
		
		pgcategories= new PriceGuideCategoriesPage(driver);
		util= new Utilities(driver);
		
		 pgcategories.clickOnPriceGuideOption();
		 util.explicitWait(Categories);
		 pgcategories.clickOnAdvertisingOption();
		 util.explicitWait(ImageView);
		  
		 if(driver.findElements(By.xpath(ImageView)).size()>0)
			Assert.assertTrue(true);
		 else
			Assert.assertTrue(false);
		 
		 util.explicitWait(Filter);
		 pgcategories.clickOnFilterOption();
		 util.explicitWait(Filters);
		 if(driver.findElements(By.xpath(Filters)).size()>0)
			Assert.assertTrue(true);
		 else
			 Assert.assertTrue(false);
		 pgcategories.clickOnClearAllOption();
		 pgcategories.clickOnSource();
		 pgcategories.clickOnSourceOtherOption();
		 Thread.sleep(2000);
		 pgcategories.clickOnSource();
		 pgcategories.clickOnSourceKeyDateOption();
		 pgcategories.clickOnShowResult();
		 Thread.sleep(5000);
		 util.explicitWait(ImageView);
		 pgcategories.clickOnProduct();
		 
		 if(driver.findElements(By.xpath(UpgradeToSeePrice)).size()>0)
			 Assert.assertTrue(true);
		 else
			 Assert.assertTrue(false);
		 
		  WebElement element= driver.findElement(By.xpath(UpgradeToSeePrice));
		  util.scrollNTines(element, 10, "down");
		  util.scrollToNumberOfTimes(10, element);
		  util.explicitWait(KeyDate);
		 
		  if(driver.findElements(By.xpath(KeyDate)).size()>0)
			 Assert.assertTrue(true);
		  else
			 Assert.assertTrue(false);
		  
		  util.explicitWait(KeyDate);
		  pgcategories.clickOnBackButton2();
		  pgcategories.clickOnBackButton1();
		  
	}
	
}
