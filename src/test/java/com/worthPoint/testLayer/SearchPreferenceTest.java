package com.worthPoint.testLayer;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.worthPoint.pagelayer.SearchPreferencesPage;

import baseLayer.TestBase;
import utilities.Utilities;




public class SearchPreferenceTest extends TestBase{
	
	
	
	private String Categories="//android.view.View[@content-desc=\"Categories\"]";
	private String Advertising="//android.view.View[@content-desc=\"Advertising\"]";
	private String SearchesPreferences="//android.view.View[@content-desc=\"Search Preferences\"]";
	private String Filters="//android.view.View[@content-desc=\"Filters\"]";
	private String OnlyShowItemWithImages="//android.view.View[@content-desc=\"Only show items with images\"]";
	private String SearchByTitleOnly="//android.view.View[@content-desc=\"Search by title only\"]";
	private String ExcludeExplicitContent="//android.view.View[@content-desc=\"Exclude explicit content\"]";
	private String SavePreferencesForNextTime="//android.view.View[@content-desc=\"Save preferences for next time\"]";
	
	private String CheckboxOnlyShowItemWithImages="(//android.view.View)[12]";
	private String CheckboxSearchByTitleOnly="(//android.view.View)[15]";
	
	@Test(priority=1)
	public void verifyPriceGuideFilterSearchPreferencesDisplayFunctionality() throws InterruptedException
	{
		SearchPreferencesPage searchp= new SearchPreferencesPage(driver);
		util= new Utilities(driver);
		
		 searchp = new SearchPreferencesPage(driver);
		 searchp.clickOnPriceGuideOption();
		 searchp.clickOnAdvertisingOption();
		 Thread.sleep(2000);
		 util.explicitWait(Advertising);
		 
		  if(driver.findElements(By.xpath(Advertising)).size()>0)
			 Assert.assertTrue(true);
		  else
			 Assert.assertTrue(false);
		 
		 searchp.clickOnFilterOption();
		 Thread.sleep(2000);
		 
		  if(driver.findElements(By.xpath(Filters)).size()>0)
			 Assert.assertTrue(true);
		  else
			 Assert.assertTrue(false);
		  
		 searchp.clickOnClearAllOption();
		 util.scrollToEnd();
		 Thread.sleep(2000);
		 util.explicitWait(SearchesPreferences);
		 
		  if(driver.findElements(By.xpath(SearchesPreferences)).size()>0)
			 Assert.assertTrue(true);
		  else
			 Assert.assertTrue(false);
		  
		  if(driver.findElements(By.xpath(OnlyShowItemWithImages)).size()>0)
			 Assert.assertTrue(true);
		  else
			 Assert.assertTrue(false);
		  
		  if(driver.findElements(By.xpath(SearchByTitleOnly)).size()>0)
			 Assert.assertTrue(true);
		  else
			 Assert.assertTrue(false);
		  
		  if(driver.findElements(By.xpath(ExcludeExplicitContent)).size()>0)
			 Assert.assertTrue(true);
		  else
			 Assert.assertTrue(false);
		  
		  if(driver.findElements(By.xpath(SavePreferencesForNextTime)).size()>0)
			 Assert.assertTrue(true);
		  else
			 Assert.assertTrue(false);
		
	
		  searchp.clickOnBackButton2();
		  searchp.clickOnBackButton1();
		  
		  if(driver.findElements(By.xpath(Categories)).size()>0)
			 Assert.assertTrue(true);
		  else
			 Assert.assertTrue(false);
		
		}

	
	@Test(priority=2)
	public void verifyPriceGuideFilterSearchPreferencesOnlyShowItemsWithImagesFunctionality() throws InterruptedException
	{
		
	//prerequisite : We have to disable all search preferences first. then you can automate search preferences functionality.
		
		 searchp = new SearchPreferencesPage(driver);
		 util= new Utilities(driver);
		 
		 searchp.clickOnPriceGuideOption();
		 searchp.clickOnAdvertisingOption();
		 Thread.sleep(2000);
		 util.explicitWait(Advertising);
		 
		  if(driver.findElements(By.xpath(Advertising)).size()>0)
			 Assert.assertTrue(true);
		  else
			 Assert.assertTrue(false);
		 
		 searchp.clickOnFilterOption();
		 Thread.sleep(2000);
		 
		  if(driver.findElements(By.xpath(Filters)).size()>0)
			 Assert.assertTrue(true);
		  else
			 Assert.assertTrue(false);
		  
		 searchp.clickOnClearAllOption();
		 util.scrollToEnd();
		 Thread.sleep(2000);
		 util.explicitWait(SearchesPreferences);
		 
		  if(driver.findElements(By.xpath(SearchesPreferences)).size()>0)
			 Assert.assertTrue(true);
		  else
			 Assert.assertTrue(false);
		  
		  searchp.clickOnOnlyShowItemWithImages();
		  Thread.sleep(2000);
		  searchp.clickONSavePreferencesForNextTime();
		  searchp.clickOnShowResult();
		  Thread.sleep(2000);
		  searchp.clickOnBackButton1();
		  Thread.sleep(1000);
		  searchp.clickOnAlcoholAndSmoking();
		  searchp.clickOnFilterOption();
		  Thread.sleep(2000);
		  searchp.clickOnClearAllOption();
		  util.scrollToEnd();
		  Thread.sleep(2000);
		  
		  if(driver.findElements(By.xpath(OnlyShowItemWithImages)).size()>0)
			 Assert.assertTrue(true);
		  else
			 Assert.assertTrue(false);
		  
		  if(driver.findElements(By.xpath(CheckboxOnlyShowItemWithImages)).size()>0)
			 Assert.assertTrue(true);
		  else
			 Assert.assertTrue(false);
		  		  
//		  if(((WebElement)driver.findElements(By.xpath(CheckboxOnlyShowItemWithImages))).isSelected())
//			 Assert.assertTrue(true);
//		  else
//			 Assert.assertTrue(false);
		  
		  WebElement checkbox = driver.findElement(By.xpath("CheckboxOnlyShowItemWithImages"));
		  boolean isChecked = checkbox.isSelected();
		  Assert.assertTrue(isChecked, "Checkbox is selected");
		  	  
//		  WebElement checkbox = driver.findElement(By.id("CheckboxOnlyShowItemWithImages"));
//		  boolean isEnabled = checkbox.isEnabled();
//		  Assert.assertTrue(isEnabled, "Checkbox is enabled");
		  
	}
	
	//@Test(priority=3)
	public void verifyPriceGuideFilterSearchPreferencesSearchByTitleOnlyFunctionality() throws InterruptedException
	{
		
	//prerequisite : We have to disable all search preferences first. then you can automate search preferences functionality.
		
		 searchp = new SearchPreferencesPage(driver);
		 util= new Utilities(driver);
		 
		 searchp.clickOnPriceGuideOption();
		 searchp.clickOnAdvertisingOption();
		 Thread.sleep(2000);
		 util.explicitWait(Advertising);
		 
		  if(driver.findElements(By.xpath(Advertising)).size()>0)
			 Assert.assertTrue(true);
		  else
			 Assert.assertTrue(false);
		 
		 searchp.clickOnFilterOption();
		 Thread.sleep(2000);
		 
		  if(driver.findElements(By.xpath(Filters)).size()>0)
			 Assert.assertTrue(true);
		  else
			 Assert.assertTrue(false);
		  
		 searchp.clickOnClearAllOption();
		 util.scrollToEnd();
		 Thread.sleep(2000);
		 util.explicitWait(SearchesPreferences);
		 
		  if(driver.findElements(By.xpath(SearchesPreferences)).size()>0)
			 Assert.assertTrue(true);
		  else
			 Assert.assertTrue(false);
		  
		 // searchp.clickOnOnlyShowItemWithImages();
		  searchp.clickOnSearchByTitleOnly();
		  Thread.sleep(2000);
		  searchp.clickONSavePreferencesForNextTime();
		  searchp.clickOnShowResult();
		  Thread.sleep(2000);
		  searchp.clickOnBackButton1();
		  Thread.sleep(1000);
		  searchp.clickOnAlcoholAndSmoking();
		  searchp.clickOnFilterOption();
		  Thread.sleep(2000);
		  searchp.clickOnClearAllOption();
		  util.scrollToEnd();
		  Thread.sleep(2000);
		  
		  if(driver.findElements(By.xpath(SearchByTitleOnly)).size()>0)
			 Assert.assertTrue(true);
		  else
			 Assert.assertTrue(false);
		  
		  if(driver.findElements(By.xpath(CheckboxSearchByTitleOnly)).size()>0)
			 Assert.assertTrue(true);
		  else
			 Assert.assertTrue(false);
		  		  
		  
//		  if(((WebElement)driver.findElements(By.xpath(CheckboxSearchByTitleOnly))).isSelected())
//			 Assert.assertTrue(true);
//		  else
//			 Assert.assertTrue(false);
		  
		  WebElement checkbox = driver.findElement(By.xpath("CheckboxSearchByTitleOnly"));
		  boolean isChecked = checkbox.isSelected();
		  Assert.assertTrue(isChecked, "Checkbox is selected");
		  	  
//		  WebElement checkbox = driver.findElement(By.id("CheckboxOnlyShowItemWithImages"));
//		  boolean isEnabled = checkbox.isEnabled();
//		  Assert.assertTrue(isEnabled, "Checkbox is enabled");
		  
	}
	
	
}
