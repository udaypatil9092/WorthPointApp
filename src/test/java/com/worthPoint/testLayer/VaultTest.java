package com.worthPoint.testLayer;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.util.concurrent.Uninterruptibles;
import com.worthPoint.pagelayer.VaultPage;

import baseLayer.TestBase;
import utilities.Utilities;


public class VaultTest extends TestBase{
	
	private String MYTAGS="//android.widget.ImageView[@content-desc=\"My Tags\"]";
	private String COLLECTIONTAG="//android.widget.ImageView[@content-desc=\"Collections\"]";
	private String INSURANCETAG="//android.widget.ImageView[@content-desc=\"Insurance Companies\"]";
	private String AddNewTag ="//android.widget.Button[@content-desc=\"Add new tag\"]";
	private String MyTags ="//android.widget.Button[@content-desc=\"My Tags\"]";
	
	private String ADDNEWTAGS="(//android.view.View[@content-desc=\"Add new tag\"])[1]";
	private String InvalidImage="//android.view.View[@content-desc=\"Please select at least one image\"]";
	private String DeletedSuccessfully="//android.view.View[@content-desc=\"Deleted Successfully\"]";
	
	private String EnterTitle="//android.view.View[@content-desc=\"Enter Title\"]";
	private String SelectCategory="//android.view.View[@content-desc=\"Select Category\"]";
		
	private String result="//android.view.View[contains(@content-desc,\"ABCD\")]";
	private String result2="//android.view.View[contains(@content-desc,\"ABCD123\")]";
	
	private String CreateCollection="//android.widget.ImageView[@content-desc=\"Collections\"]";
	private String AddNewCollection="//android.view.View[@content-desc=\"Add new Collection\"]";
	private String PublicCollection="//android.view.View[@content-desc=\"Public Collection\"]";
	private String PrivateCollection="//android.view.View[@content-desc=\"Private Collection\"]";
	private String CollectionElement="//android.view.View[contains(@content-desc,\"Collection1\")]";
	private String UpdatedElement="//android.view.View[contains(@content-desc,\"Collection123\")]";
	private String ShareLink="//android.view.View[@content-desc=\"Share link:\"]";
	private String ShareView="(//android.widget.TextView)[1]";
	
	private String Public="//android.view.View[@content-desc=\"Public\"]";
	private String CollectionElement2="//android.view.View[contains(@content-desc,\"Collection123\")]";
	private String Private="//android.view.View[@content-desc=\"Private Collection\"]";
	
	private String MYVAULT="//android.widget.ImageView[@content-desc=\"My Vault\"]";
	private String AddVaultItem="//android.widget.Button[@content-desc=\"Add vault item\"]";
	private String Categories="//android.view.View[@content-desc=\"Categories *\"]";
	
	private String TitleAndDescription="//android.view.View[@content-desc=\"Title & Description\"]";
	private String Description="//android.view.View[@content-desc=\"Description\"]";
	private String Collection="//android.view.View[@content-desc=\"Collection\"]";
	private String AdditionalOptions="//android.view.View[@content-desc=\"Additional Options\"]";
	
	private String VaultItem="//android.view.View[contains(@content-desc,\"ABCD\")]";
	private String UpdatedItem="//android.view.View[contains(@content-desc,\"ABCD123\")]";
	private String NumberOfYears="//android.view.View[@content-desc=\"Number of years in family\"]";
	private String PurchasePrice="//android.view.View[@content-desc=\"Purchase Price ($)\"]";
	private String StorageLocation="//android.view.View[@content-desc=\"Add new storage location *\"]";
	private String Success="//android.view.View[@content-desc=\"Success\"]";
	private String InsuranceCompany="//android.view.View[contains(@content-desc,\"insurance1\")]";
	private String UpdatedInsurance="//android.view.View[contains(@content-desc,\"insurance123\")]";
	private String StorageLocationE1="//android.view.View[contains(@content-desc,\"location1\")]";
	private String UpdatedStorageLocation="//android.view.View[contains(@content-desc,\"location123\")]";
	
	@Test(priority=1)
	public void verifyVaultMyTagsHeaderFunctionality()
	{
	    vault= new VaultPage(driver);
	    util= new Utilities(driver);
	    
		vault.clickOnVaultOption();
		Uninterruptibles.sleepUninterruptibly(Duration.ofMillis(2000));
		//util.explicitWait(MYTAGS);
		vault.clickOnMyTags();
		Uninterruptibles.sleepUninterruptibly(Duration.ofMillis(2000));
		
		if(driver.findElements(By.xpath(MyTags)).size()>0)
			  Assert.assertTrue(true);
			else
			  Assert.assertTrue(false);
		
		if(driver.findElements(By.xpath(AddNewTag)).size()>0)
			  Assert.assertTrue(true);
			else
			  Assert.assertTrue(false);
	
		
	}
	
	@Test(priority=2)
	public void verifyVaultAddNewTagFunctionality() throws InterruptedException
	{
		vault= new VaultPage(driver);
		util= new Utilities(driver);
		
		vault.clickOnVaultOption();
		util.explicitWait(MYTAGS);
		Thread.sleep(3000);
		vault.clickOnMyTags();
		Thread.sleep(2000);
		
		if(driver.findElements(By.xpath(MyTags)).size()>0)
			  Assert.assertTrue(true);
			else
			  Assert.assertTrue(false);
		
		vault.clickOnAddNewTags();
		
		if(driver.findElements(By.xpath(ADDNEWTAGS)).size()>0)
			  Assert.assertTrue(true);
		else
			  Assert.assertTrue(false);
		
		Thread.sleep(1000);
		vault.EnterTagName("ABCD");
		vault.ClickOnColorTab();
		vault.clickOnAddNewTags();
		vault.clickOnContinueButton();
		Thread.sleep(2000);
		
		if(driver.findElements(By.xpath(MyTags)).size()>0)
			  Assert.assertTrue(true);
		else
			  Assert.assertTrue(false);
				
		if(driver.findElements(By.xpath(AddNewTag)).size()>0)
			  Assert.assertTrue(true);
		else
			  Assert.assertTrue(false);
		
		if(driver.findElements(By.xpath(result)).size()>0)
			  Assert.assertTrue(true);
		else
			  Assert.assertTrue(false);
	}

	@Test(priority=3)
	public void verifyUpdateTagNameFunctionality() throws InterruptedException
	{
		// Prerequisite: existed tag should be available
		
		
		vault= new VaultPage(driver);
		util= new Utilities(driver);
		
		vault.clickOnVaultOption();
		util.explicitWait(MYTAGS);
		Thread.sleep(3000);
		vault.clickOnMyTags();
		Thread.sleep(2000);
		
		if(driver.findElements(By.xpath(MyTags)).size()>0)
			  Assert.assertTrue(true);
			else
			  Assert.assertTrue(false);
		
		util.explicitWait(MYTAGS);
		util.clickOnElementUsingCoordinates(390, 743);
//		util.touchAction(390, 743);
		Thread.sleep(1000);
		vault.EnterTagName("ABCD123");
		Thread.sleep(1000);
		vault.ClickOnColorTab2();
		vault.clickOnUpdateButton();
		vault.clickOnContinueButton();
		
		if(driver.findElements(By.xpath(MyTags)).size()>0)
			  Assert.assertTrue(true);
		else
			  Assert.assertTrue(false);
		
		if(driver.findElements(By.xpath(AddNewTag)).size()>0)
			  Assert.assertTrue(true);
		else
			  Assert.assertTrue(false);
		
		if(driver.findElements(By.xpath(result2)).size()>0)
			  Assert.assertTrue(true);
		else
			  Assert.assertTrue(false);
	}
	
	
	@Test(priority=4)
	public void verifyDelateTagFunctionality() throws InterruptedException
	{
		// Prerequisite: existed tag should be available
		
		vault= new VaultPage(driver);
		util= new Utilities(driver);
		
		vault.clickOnVaultOption();
		util.explicitWait(MYTAGS);
		Thread.sleep(3000);
		vault.clickOnMyTags();
		Thread.sleep(2000);
		
		if(driver.findElements(By.xpath(MyTags)).size()>0)
			  Assert.assertTrue(true);
			else
			  Assert.assertTrue(false);
		
		util.explicitWait(MYTAGS);
		util.clickOnElementUsingCoordinates(465, 747);
	//	util.touchAction(465, 747);
		Thread.sleep(1000);
		
		vault.clickOnDeleteYesButton();
		Thread.sleep(1000);
		
		
		if(driver.findElements(By.xpath(DeletedSuccessfully)).size()>0)
			  Assert.assertTrue(true);
		else
			  Assert.assertTrue(false);	
		
	}
	
	@Test(priority=5)
	public void verifyVaultMyTagsModuleFunctionality() throws InterruptedException
	{
		vault= new VaultPage(driver);
		util= new Utilities(driver);
		
		vault.clickOnVaultOption();
		util.explicitWait(MYTAGS);
		vault.clickOnMyTags();
		
		
		if(driver.findElements(By.xpath(MyTags)).size()>0)
			  Assert.assertTrue(true);
			else
			  Assert.assertTrue(false);
		
		if(driver.findElements(By.xpath(AddNewTag)).size()>0)
			  Assert.assertTrue(true);
			else
			  Assert.assertTrue(false);
	
		////// added
		
	vault.clickOnAddNewTags();
		
		if(driver.findElements(By.xpath(ADDNEWTAGS)).size()>0)
			  Assert.assertTrue(true);
		else
			  Assert.assertTrue(false);
		
		Thread.sleep(1000);
		vault.EnterTagName("ABCD1");
		vault.ClickOnColorTab();
		vault.clickOnAddNewTags();
		Thread.sleep(2000);
		vault.clickOnContinueButton();
		Thread.sleep(2000);
		
		if(driver.findElements(By.xpath(MyTags)).size()>0)
			  Assert.assertTrue(true);
		else
			  Assert.assertTrue(false);
				
		if(driver.findElements(By.xpath(AddNewTag)).size()>0)
			  Assert.assertTrue(true);
		else
			  Assert.assertTrue(false);
		
		if(driver.findElements(By.xpath(result)).size()>0)
			  Assert.assertTrue(true);
		else
			  Assert.assertTrue(false);
		
		/// Edit code
		
		util.clickOnElementUsingCoordinates(390, 743);
		
		Thread.sleep(1000);
		vault.EnterTagName("ABCD1234");
		Thread.sleep(1000);
		vault.ClickOnColorTab2();
		vault.clickOnUpdateButton();
		Thread.sleep(2000);
		vault.clickOnContinueButton();
		
		if(driver.findElements(By.xpath(MyTags)).size()>0)
			  Assert.assertTrue(true);
		else
			  Assert.assertTrue(false);
		
		if(driver.findElements(By.xpath(AddNewTag)).size()>0)
			  Assert.assertTrue(true);
		else
			  Assert.assertTrue(false);
		
		if(driver.findElements(By.xpath(result2)).size()>0)
			  Assert.assertTrue(true);
		else
			  Assert.assertTrue(false);
		
		
		// Delete code
	
		util.clickOnElementUsingCoordinates(465, 747);
		Thread.sleep(1000);
		
		vault.clickOnDeleteYesButton();
		Thread.sleep(1000);
		
		
		if(driver.findElements(By.xpath(DeletedSuccessfully)).size()>0)
			  Assert.assertTrue(true);
		else
			  Assert.assertTrue(false);	
		
	}

	@Test(priority=6)
	public void verifyVaultCollectionsHeaderFunctionality() throws InterruptedException
	{
		vault= new VaultPage(driver);
		util= new Utilities(driver);
		
		vault.clickOnVaultOption();
		util.explicitWait(MYTAGS);
		vault.clickOnCollectionsOption();
		
		Thread.sleep(2000);
		if(driver.findElements(By.xpath(CreateCollection)).size()>0)
			  Assert.assertTrue(true);
		else
			  Assert.assertTrue(false);
	
	}
	
	@Test(priority=7)
	public void verifyVaultCreateCollectionFunctionality() throws InterruptedException
	{
		vault= new VaultPage(driver);
		util= new Utilities(driver);
		
		vault.clickOnVaultOption();
		util.explicitWait(MYTAGS);
		Thread.sleep(3000);
		vault.clickOnCollectionsOption();
		Thread.sleep(2000);
		
		vault.clickOnCreateCollection();
		
		if(driver.findElements(By.xpath(AddNewCollection)).size()>0)
			  Assert.assertTrue(true);
		else
			  Assert.assertTrue(false);
		
		Thread.sleep(1000);
		vault.enterTitle("Collection1");
		vault.enterDescription("This is collection 1");
 
		util.scrollToEnd();
		vault.clickOnNextButton();
		Thread.sleep(2000);
		vault.clickOnCreateButton();
		Thread.sleep(2000);
		vault.clickOnContinueButton();
		Thread.sleep(2000);
		if(driver.findElements(By.xpath(PublicCollection)).size()>0)
			  Assert.assertTrue(true);
		else
			  Assert.assertTrue(false);
						
		if(driver.findElements(By.xpath(CollectionElement)).size()>0)
			  Assert.assertTrue(true);
		else
			  Assert.assertTrue(false);
	}
	
	@Test(priority=8)
	public void verifyVaultCollectionShareButtonFunctionality() throws InterruptedException
	{
		// Prerequisite: existed tag should be available
		
		vault= new VaultPage(driver);
		util= new Utilities(driver);
		
		vault.clickOnVaultOption();
		util.explicitWait(MYTAGS);
		Thread.sleep(3000);
		vault.clickOnCollectionsOption();
		Thread.sleep(2000);
				
		if(driver.findElements(By.xpath(PublicCollection)).size()>0)
			  Assert.assertTrue(true);
		else
			  Assert.assertTrue(false);
		
		Thread.sleep(1000);

		vault.clickOnCollectionElement();
		Thread.sleep(2000);
		util.scrollToEnd();
		
		if(driver.findElements(By.xpath(ShareLink)).size()>0)
			  Assert.assertTrue(true);
		else
			  Assert.assertTrue(false);
		vault.clickOnShareButton();
		
		if(driver.findElements(By.xpath(ShareView)).size()>0)
			  Assert.assertTrue(true);
		else
			  Assert.assertTrue(false);
		Thread.sleep(1000);
		util.clickOnElementUsingCoordinates(535, 400);
		vault.clickOnBackButton1();
	}
	
	@Test(priority=9)
	public void verifyVaultUpdateCollectionNameFunctionality() throws InterruptedException
	{
		// Prerequisite: existed tag should be available
		
		vault= new VaultPage(driver);
		util= new Utilities(driver);
		
		vault.clickOnVaultOption();
		util.explicitWait(MYTAGS);
		Thread.sleep(3000);
		vault.clickOnCollectionsOption();
		Thread.sleep(2000);
				
		if(driver.findElements(By.xpath(PublicCollection)).size()>0)
			  Assert.assertTrue(true);
		else
			  Assert.assertTrue(false);
		
		Thread.sleep(1000);

		vault.clickOnCollectionElement();
		Thread.sleep(2000);
	
		util.clickOnElementUsingCoordinates(94, 1365);
	//	util.touchAction(94, 1365);
		Thread.sleep(2000);
		vault.enterTitle("Collection123");
		vault.enterDescription("This is collection 123");
		util.scrollToEnd();
		vault.clickOnNextButton();
		vault.clickOnUpdateButton();
		vault.clickOnContinueButton();
		Thread.sleep(1000);
		vault.clickOnBackButton1();
		Thread.sleep(2000);
		
		if(driver.findElements(By.xpath(UpdatedElement)).size()>0)
			  Assert.assertTrue(true);
		else
			  Assert.assertTrue(false);
	}
	
	@Test(priority=10)
	public void verifyVaultDeleteCollectionFunctionality() throws InterruptedException
	{
		// Prerequisite: existed tag should be available
		
		vault= new VaultPage(driver);
		util= new Utilities(driver);
		
		vault.clickOnVaultOption();
		util.explicitWait(MYTAGS);
		Thread.sleep(3000);
		vault.clickOnCollectionsOption();
		Thread.sleep(2000);
				
		if(driver.findElements(By.xpath(PublicCollection)).size()>0)
			  Assert.assertTrue(true);
		else
			  Assert.assertTrue(false);
		
		Thread.sleep(1000);

		vault.clickOnCollectionElement();
		Thread.sleep(2000);
	
		util.clickOnElementUsingCoordinates(205, 1365);
	//	util.touchAction(205, 1365);
		Thread.sleep(2000);
	 
		vault.clickOnDeleteYesButton();
	
		Thread.sleep(1000);
		if(driver.findElements(By.xpath(DeletedSuccessfully)).size()>0)
			  Assert.assertTrue(true);
		else
			  Assert.assertTrue(false);
	}
	
	@Test(priority=11)
	public void verifyVaultCollectionsModuleFunctionality() throws InterruptedException
	{
		vault= new VaultPage(driver);
		util= new Utilities(driver);
		
		vault.clickOnVaultOption();
		util.explicitWait(MYTAGS);
		vault.clickOnCollectionsOption();
		
		Thread.sleep(2000);
		if(driver.findElements(By.xpath(CreateCollection)).size()>0)
			  Assert.assertTrue(true);
		else
			  Assert.assertTrue(false);
		
		
		//---------------------Create collection----------------------//
		Thread.sleep(2000);
        vault.clickOnCreateCollection();
		
		if(driver.findElements(By.xpath(AddNewCollection)).size()>0)
			  Assert.assertTrue(true);
		else
			  Assert.assertTrue(false);
		
		Thread.sleep(1000);
		vault.enterTitle("Collection1");
		vault.enterDescription("This is collection 1");
 
		util.scrollToEnd();
		vault.clickOnNextButton();
		Thread.sleep(2000);
		vault.clickOnCreateButton();
		Thread.sleep(2000);
		vault.clickOnContinueButton();
		Thread.sleep(2000);
		if(driver.findElements(By.xpath(PublicCollection)).size()>0)
			  Assert.assertTrue(true);
		else
			  Assert.assertTrue(false);
						
		if(driver.findElements(By.xpath(CollectionElement)).size()>0)
			  Assert.assertTrue(true);
		else
			  Assert.assertTrue(false);
	
		
		//--------------------------share collection link------------------------//
		Thread.sleep(2000);
		if(driver.findElements(By.xpath(PublicCollection)).size()>0)
			  Assert.assertTrue(true);
		else
			  Assert.assertTrue(false);
		
		Thread.sleep(1000);

		vault.clickOnCollectionElement();
		Thread.sleep(2000);
		util.scrollToEnd();
		
		if(driver.findElements(By.xpath(ShareLink)).size()>0)
			  Assert.assertTrue(true);
		else
			  Assert.assertTrue(false);
		vault.clickOnShareButton();
		
		if(driver.findElements(By.xpath(ShareView)).size()>0)
			  Assert.assertTrue(true);
		else
			  Assert.assertTrue(false);
		Thread.sleep(1000);
		util.clickOnElementUsingCoordinates(535, 400);
		vault.clickOnBackButton1();
		
		
		//---------------------------Update Collection Name----------------------------//
		Thread.sleep(2000);
		if(driver.findElements(By.xpath(PublicCollection)).size()>0)
			  Assert.assertTrue(true);
		else
			  Assert.assertTrue(false);
		
		Thread.sleep(1000);

		vault.clickOnCollectionElement();
		Thread.sleep(2000);
	
		util.clickOnElementUsingCoordinates(94, 1365);
		Thread.sleep(2000);
		vault.enterTitle("Collection123");
		vault.enterDescription("This is collection 123");
		util.scrollToEnd();
		vault.clickOnNextButton();
		vault.clickOnUpdateButton();
		vault.clickOnContinueButton();
		Thread.sleep(1000);
		vault.clickOnBackButton1();
		Thread.sleep(2000);
		
		if(driver.findElements(By.xpath(UpdatedElement)).size()>0)
			  Assert.assertTrue(true);
		else
			  Assert.assertTrue(false);
		
		//---------------------------Delete Collection--------------------------//
		Thread.sleep(2000);
		if(driver.findElements(By.xpath(PublicCollection)).size()>0)
			  Assert.assertTrue(true);
		else
			  Assert.assertTrue(false);
		
		Thread.sleep(1000);

		vault.clickOnCollectionElement();
		Thread.sleep(2000);
	
		util.clickOnElementUsingCoordinates(205, 1365);
		Thread.sleep(2000);
	 
		vault.clickOnDeleteYesButton();
	
		Thread.sleep(1000);
		if(driver.findElements(By.xpath(DeletedSuccessfully)).size()>0)
			  Assert.assertTrue(true);
		else
			  Assert.assertTrue(false);
		
	}
	
	//@Test(priority=12)
	public void verifyVaultCreatePublicAndPrivateCollectionFilterFunctionality() throws InterruptedException
	{
		vault= new VaultPage(driver);
		util= new Utilities(driver);
		
		vault.clickOnVaultOption();
		util.explicitWait(MYTAGS);
		Thread.sleep(3000);
		vault.clickOnCollectionsOption();
		Thread.sleep(2000);
		
		vault.clickOnCreateCollection();
		
		if(driver.findElements(By.xpath(AddNewCollection)).size()>0)
			  Assert.assertTrue(true);
		else
			  Assert.assertTrue(false);
		
		Thread.sleep(1000);
		vault.enterTitle("Collection1");
		vault.enterDescription("This is collection 1");
 
		util.scrollToEnd();
		vault.clickOnNextButton();
		Thread.sleep(1000);
		vault.clickOnCreateButton();
		Thread.sleep(1000);
		vault.clickOnContinueButton();
		Thread.sleep(1000);
		
		if(driver.findElements(By.xpath(PublicCollection)).size()>0)
			  Assert.assertTrue(true);
		else
			  Assert.assertTrue(false);
		
		//--------------new collection------------------//
		Thread.sleep(1000);
		vault.clickOnCreateCollection2();
		vault.enterTitle("Collection123");
		vault.enterDescription("This is collection 123");
		util.scrollToEnd();
		Thread.sleep(1000);
		vault.clickOnPrivateCollection();
		vault.clickOnNextButton();
		vault.clickOnCreateButton();
		vault.clickOnContinueButton();
		Thread.sleep(1000);
		
		if(driver.findElements(By.xpath(PrivateCollection)).size()>0)
			  Assert.assertTrue(true);
		else
			  Assert.assertTrue(false);

		
	}
	
	//@Test(priority=13)
	public void verifyVaultCollectionFilterStatusPublicFunctionality() throws InterruptedException
	{
		// Prerequisite: existed tag should be available
		
		vault= new VaultPage(driver);
		util= new Utilities(driver);
		
		vault.clickOnVaultOption();
		util.explicitWait(MYTAGS);
		Thread.sleep(3000);
		vault.clickOnCollectionsOption();
		Thread.sleep(2000);
				
		if(driver.findElements(By.xpath(PublicCollection)).size()>0)
			  Assert.assertTrue(true);
		else
			  Assert.assertTrue(false);
		
		if(driver.findElements(By.xpath(PrivateCollection)).size()>0)
			  Assert.assertTrue(true);
		else
			  Assert.assertTrue(false);
		Thread.sleep(1000);

	    vault.clickOnViewAll();
	    Thread.sleep(2000);
	    vault.clickOnFilterOption();
	    vault.clickOnClearAll();
	    vault.clickOnStatusDropdown();
	    vault.clickOnPublicStatus();
	    vault.clickOnShowResults();
				
		if(driver.findElements(By.xpath(CollectionElement)).size()>0)
		Assert.assertTrue(true);
		else
		Assert.assertTrue(false);
		
		vault.clickOnCollectionElement();
		Thread.sleep(1000);
		util.scrollToEnd();
		Thread.sleep(1000);
		if(driver.findElements(By.xpath(Public)).size()>0)
		Assert.assertTrue(true);
		else
		Assert.assertTrue(false);
	}
	
	//@Test(priority=14)
	public void verifyVaultCollectionFilterStatusPrivateFunctionality() throws InterruptedException
	{
		// Prerequisite: existed tag should be available
		
		vault= new VaultPage(driver);
		util= new Utilities(driver);
		
		vault.clickOnVaultOption();
		util.explicitWait(MYTAGS);
		Thread.sleep(3000);
		vault.clickOnCollectionsOption();
		Thread.sleep(2000);
				
		if(driver.findElements(By.xpath(PublicCollection)).size()>0)
			  Assert.assertTrue(true);
		else
			  Assert.assertTrue(false);
		
		if(driver.findElements(By.xpath(PrivateCollection)).size()>0)
			  Assert.assertTrue(true);
		else
			  Assert.assertTrue(false);
		Thread.sleep(1000);

	    vault.clickOnViewAll();
	    Thread.sleep(2000);
	    vault.clickOnFilterOption();
	    vault.clickOnClearAll();
	    vault.clickOnStatusDropdown();
	    vault.clickOnPrivateStatus();
	    vault.clickOnShowResults();
				
		if(driver.findElements(By.xpath(CollectionElement2)).size()>0)
		Assert.assertTrue(true);
		else
		Assert.assertTrue(false);
		
		vault.clickOnCollectionElement();
		Thread.sleep(1000);
		util.scrollToEnd();
		Thread.sleep(1000);
		if(driver.findElements(By.xpath(Private)).size()>0)
		Assert.assertTrue(true);
		else
		Assert.assertTrue(false);
	}
	
	//@Test(priority=15)
		public void verifyVaultCollectionFilterTitleNameFunctionality() throws InterruptedException
		{
			// Prerequisite: existed tag should be available
			
			vault= new VaultPage(driver);
			util= new Utilities(driver);
			
			vault.clickOnVaultOption();
			util.explicitWait(MYTAGS);
			Thread.sleep(3000);
			vault.clickOnCollectionsOption();
			Thread.sleep(2000);
					
			if(driver.findElements(By.xpath(PublicCollection)).size()>0)
				  Assert.assertTrue(true);
			else
				  Assert.assertTrue(false);
			
			if(driver.findElements(By.xpath(PrivateCollection)).size()>0)
				  Assert.assertTrue(true);
			else
				  Assert.assertTrue(false);
			Thread.sleep(1000);

		    vault.clickOnViewAll();
		    Thread.sleep(2000);
		    vault.clickOnFilterOption();
		    vault.clickOnClearAll();
	        vault.enterTitle("Collection");
		    vault.clickOnShowResults();
			
			if(driver.findElements(By.xpath(CollectionElement)).size()>0)
			Assert.assertTrue(true);
			else
			Assert.assertTrue(false);
		    
			if(driver.findElements(By.xpath(CollectionElement2)).size()>0)
			Assert.assertTrue(true);
			else
			Assert.assertTrue(false);

		}
		
		//@Test(priority=16)
		public void verifyVaultCollectionFilterTitleNameAndPublicStatusFunctionality() throws InterruptedException
		{
			// Prerequisite: existed tag should be available
			
			vault= new VaultPage(driver);
			util= new Utilities(driver);
			
			vault.clickOnVaultOption();
			util.explicitWait(MYTAGS);
			Thread.sleep(3000);
			vault.clickOnCollectionsOption();
			Thread.sleep(2000);
					
			if(driver.findElements(By.xpath(PublicCollection)).size()>0)
				  Assert.assertTrue(true);
			else
				  Assert.assertTrue(false);
			
			if(driver.findElements(By.xpath(PrivateCollection)).size()>0)
				  Assert.assertTrue(true);
			else
				  Assert.assertTrue(false);
			Thread.sleep(1000);

		    vault.clickOnViewAll();
		    Thread.sleep(2000);
		    vault.clickOnFilterOption();
		    vault.clickOnClearAll();
	        vault.enterTitle("Collection");
		    vault.clickOnStatusDropdown();
		    vault.clickOnPublicStatus();
		    vault.clickOnShowResults();
			
			if(driver.findElements(By.xpath(CollectionElement)).size()>0)
			Assert.assertTrue(true);
			else
			Assert.assertTrue(false);
		}
		
		//@Test(priority=17)
		public void verifyVaultCollectionFilterTitleNameAndPrivateStatusFunctionality() throws InterruptedException
		{
			// Prerequisite: existed tag should be available
			
			vault= new VaultPage(driver);
			util= new Utilities(driver);
			
			vault.clickOnVaultOption();
			util.explicitWait(MYTAGS);
			Thread.sleep(3000);
			vault.clickOnCollectionsOption();
			Thread.sleep(2000);
					
			if(driver.findElements(By.xpath(PublicCollection)).size()>0)
				  Assert.assertTrue(true);
			else
				  Assert.assertTrue(false);
			
			if(driver.findElements(By.xpath(PrivateCollection)).size()>0)
				  Assert.assertTrue(true);
			else
				  Assert.assertTrue(false);
			Thread.sleep(1000);

		    vault.clickOnViewAll();
		    Thread.sleep(2000);
		    vault.clickOnFilterOption();
		    vault.clickOnClearAll();
	        vault.enterTitle("Collection");
		    vault.clickOnStatusDropdown();
		    vault.clickOnPrivateStatus();
		    vault.clickOnShowResults();
			
			if(driver.findElements(By.xpath(CollectionElement2)).size()>0)
			Assert.assertTrue(true);
			else
			Assert.assertTrue(false);
		    
		}
		
		//@Test(priority=18)
		public void verifyVaultDeletePublicAndPrivateCollectionFunctionality() throws InterruptedException
		{
			// Prerequisite: existed tag should be available
			
			vault= new VaultPage(driver);
			util= new Utilities(driver);
			
			vault.clickOnVaultOption();
			util.explicitWait(MYTAGS);
			Thread.sleep(3000);
			vault.clickOnCollectionsOption();
			Thread.sleep(2000);
					
			if(driver.findElements(By.xpath(PublicCollection)).size()>0)
				  Assert.assertTrue(true);
			else
				  Assert.assertTrue(false);
			
			Thread.sleep(1000);

			vault.clickOnCollectionElement();
			Thread.sleep(2000);
		
			util.clickOnElementUsingCoordinates(205, 1365);
			Thread.sleep(2000);
		 
			vault.clickOnDeleteYesButton();
		
			Thread.sleep(1000);
			if(driver.findElements(By.xpath(DeletedSuccessfully)).size()>0)
				  Assert.assertTrue(true);
			else
				  Assert.assertTrue(false);
			
			Thread.sleep(2000);
			
			vault.clickOnCollectionElement();
			Thread.sleep(2000);
		
			util.clickOnElementUsingCoordinates(205, 1365);
			Thread.sleep(2000);
		 
			vault.clickOnDeleteYesButton();
		
			Thread.sleep(1000);
			if(driver.findElements(By.xpath(DeletedSuccessfully)).size()>0)
				  Assert.assertTrue(true);
			else
				  Assert.assertTrue(false);
		}
		
		@Test(priority=19)
		public void verifyVaultCollectionFilterModuleFunctionality() throws InterruptedException
		{
			vault= new VaultPage(driver);
			util= new Utilities(driver);
			
			vault.clickOnVaultOption();
			util.explicitWait(MYTAGS);
			Thread.sleep(3000);
			vault.clickOnCollectionsOption();
			Thread.sleep(2000);
			
			vault.clickOnCreateCollection();
			
			if(driver.findElements(By.xpath(AddNewCollection)).size()>0)
				  Assert.assertTrue(true);
			else
				  Assert.assertTrue(false);
			
			Thread.sleep(1000);
			vault.enterTitle("Collection1");
			vault.enterDescription("This is collection 1");
	 
			util.scrollToEnd();
			vault.clickOnNextButton();
			Thread.sleep(1000);
			vault.clickOnCreateButton();
			Thread.sleep(1000);
			vault.clickOnContinueButton();
			Thread.sleep(1000);
			
			if(driver.findElements(By.xpath(PublicCollection)).size()>0)
				  Assert.assertTrue(true);
			else
				  Assert.assertTrue(false);
			
			//------------------------new collection---------------------------//
			Thread.sleep(1000);
			vault.clickOnCreateCollection2();
			vault.enterTitle("Collection123");
			vault.enterDescription("This is collection 123");
			util.scrollToEnd();
			Thread.sleep(2000);
			
			vault.clickOnPrivateCollection();
			vault.clickOnNextButton();
			vault.clickOnCreateButton();
			vault.clickOnContinueButton();
			Thread.sleep(1000);
			
			if(driver.findElements(By.xpath(PrivateCollection)).size()>0)
				  Assert.assertTrue(true);
			else
				  Assert.assertTrue(false);

			//------------------Code for CheckCollectionStatusPublic---------------------//
			
			Thread.sleep(1000);

		    vault.clickOnViewAll();
		    Thread.sleep(2000);
		    vault.clickOnFilterOption();
		    vault.clickOnClearAll();
		    vault.clickOnStatusDropdown();
		    vault.clickOnPublicStatus();
		    vault.clickOnShowResults();
					
			if(driver.findElements(By.xpath(CollectionElement)).size()>0)
			Assert.assertTrue(true);
			else
			Assert.assertTrue(false);
			
			vault.clickOnCollectionElement();
			Thread.sleep(1000);
			util.scrollToEnd();
			Thread.sleep(1000);
			if(driver.findElements(By.xpath(Public)).size()>0)
			Assert.assertTrue(true);
			else
			Assert.assertTrue(false);
			Thread.sleep(1000);
			vault.clickOnBackButton();

		    //--------------------Code for CheckCollectionStatusPrivate------------------------//
			
		    Thread.sleep(2000);
		    vault.clickOnFilterOption();
		    vault.clickOnClearAll();
		    vault.clickOnStatusDropdown();
		    vault.clickOnPrivateStatus();
		    vault.clickOnShowResults();
					
			if(driver.findElements(By.xpath(CollectionElement2)).size()>0)
			Assert.assertTrue(true);
			else
			Assert.assertTrue(false);
			
			vault.clickOnCollectionElement();
			Thread.sleep(1000);
			util.scrollToEnd();
			Thread.sleep(1000);
			if(driver.findElements(By.xpath(Private)).size()>0)
			Assert.assertTrue(true);
			else
			Assert.assertTrue(false);
			Thread.sleep(1000);
			vault.clickOnBackButton();
			
			//-------------------Code for Check collection with TitleName------------------//

		    Thread.sleep(2000);
		    vault.clickOnFilterOption();
		    vault.clickOnClearAll();
	        vault.enterTitle("Collection");
		    vault.clickOnShowResults();
			
			if(driver.findElements(By.xpath(CollectionElement)).size()>0)
			Assert.assertTrue(true);
			else
			Assert.assertTrue(false);
		    
			if(driver.findElements(By.xpath(CollectionElement2)).size()>0)
			Assert.assertTrue(true);
			else
			Assert.assertTrue(false);
			
			//---------------------Code for TitleName with Public status----------------------------//
			
			 Thread.sleep(2000);
			    vault.clickOnFilterOption();
			    vault.clickOnClearAll();
		        vault.enterTitle("Collection");
			    vault.clickOnStatusDropdown();
			    vault.clickOnPublicStatus();
			    vault.clickOnShowResults();
				
				if(driver.findElements(By.xpath(CollectionElement)).size()>0)
				Assert.assertTrue(true);
				else
				Assert.assertTrue(false);
				
			   //-------------------code for TitleName with Private status----------------------//
				
			    Thread.sleep(2000);
			    vault.clickOnFilterOption();
			    vault.clickOnClearAll();
		        vault.enterTitle("Collection");
			    vault.clickOnStatusDropdown();
			    vault.clickOnPrivateStatus();
			    vault.clickOnShowResults();
				
				if(driver.findElements(By.xpath(CollectionElement2)).size()>0)
				Assert.assertTrue(true);
				else
				Assert.assertTrue(false);
				
				 Thread.sleep(2000);
				vault.clickOnBackButton();
				
			    //---------------------code for Delete all Collection----------------------//
				
				Thread.sleep(1000);

				vault.clickOnCollectionElement();
				Thread.sleep(2000);
			
				util.clickOnElementUsingCoordinates(205, 1365);
				Thread.sleep(2000);
			 
				vault.clickOnDeleteYesButton();
			
				Thread.sleep(1000);
				if(driver.findElements(By.xpath(DeletedSuccessfully)).size()>0)
					  Assert.assertTrue(true);
				else
					  Assert.assertTrue(false);
				
				Thread.sleep(3000);
				
				vault.clickOnCollectionElement();
				Thread.sleep(2000);
			
				util.clickOnElementUsingCoordinates(205, 1365);
				Thread.sleep(3000);
			 
				vault.clickOnDeleteYesButton();
			
				Thread.sleep(1000);
				if(driver.findElements(By.xpath(DeletedSuccessfully)).size()>0)
					  Assert.assertTrue(true);
				else
					  Assert.assertTrue(false);
		}
		
		//@Test(priority=20)
		public void verifyVaultMyVaultHeaderFunctionality() throws InterruptedException
		{
			vault= new VaultPage(driver);
			util= new Utilities(driver);
			
			vault.clickOnVaultOption();
			util.explicitWait(MYVAULT);
			vault.clickOnMyVault();
			Thread.sleep(1000);
			
			if(driver.findElements(By.xpath(AddVaultItem)).size()>0)
				  Assert.assertTrue(true);
				else
				  Assert.assertTrue(false);

		}
		
		//@Test(priority=21)
		public void verifyVaultMyVaultAddItemWithoutImageFunctionality() throws InterruptedException
		{
			vault= new VaultPage(driver);
			util= new Utilities(driver);
			
			vault.clickOnVaultOption();
			util.explicitWait(MYVAULT);
			vault.clickOnMyVault();
			Thread.sleep(1000);
			
			
			if(driver.findElements(By.xpath(AddVaultItem)).size()>0)                 
				 Assert.assertTrue(true);                           
			else
				 Assert.assertTrue(false);
			
			Thread.sleep(3000);
			vault.clickOnAddVaultItem();
			
			vault.clickOnNextButton();
			
			if(driver.findElements(By.xpath(InvalidImage)).size()>0)
				  Assert.assertTrue(true);
				else
				  Assert.assertTrue(false);
			
			vault.clickOnBackButton();
			Thread.sleep(1000);
			vault.clickOnBackButton();

		}
		
		//@Test(priority=22)
		public void verifyVaultAddVaultItemWithoutTitleAndCategoryFunctionality() throws InterruptedException
		{
			vault= new VaultPage(driver);
			util= new Utilities(driver);
			
			vault.clickOnVaultOption();
			
			util.explicitWait(MYVAULT);
			vault.clickOnMyVault();
			Thread.sleep(3000);
			vault.clickOnAddVaultItem();
			vault.clickOnAddImage();
			vault.clickOnGallery();
			Thread.sleep(1000);
			vault.clickOnSelectImage1();
			vault.clickOnConfirmButton();
			Thread.sleep(1000);
			vault.clickOnNextButton();
			//--------------Move to next step without enter title------------//
			vault.clickOnNextButton();
			
			if(driver.findElements(By.xpath(EnterTitle)).size()>0)
				  Assert.assertTrue(true);
			else
				  Assert.assertTrue(false);

			WebElement element=driver.findElement(By.xpath(Description));
			
			util.scrollToNumberOfTimes(25, element);
		
			if(driver.findElements(By.xpath(SelectCategory)).size()>0)
				  Assert.assertTrue(true);
			else
				  Assert.assertTrue(false);
			Thread.sleep(1000);
			vault.clickOnBackButton();
			vault.clickOnBackButton();
			vault.clickOnBackButton();
			
		}
		
		//@Test(priority=23)
		public void verifyVaultAddVaultItemFunctionality() throws InterruptedException
		{
			vault= new VaultPage(driver);
			util= new Utilities(driver);
			
			vault.clickOnVaultOption();
			
			util.explicitWait(MYVAULT);
			vault.clickOnMyVault();
			Thread.sleep(3000);
			vault.clickOnAddVaultItem();
			vault.clickOnAddImage();
			vault.clickOnGallery();
			Thread.sleep(1000);
			vault.clickOnSelectImage1();
			vault.clickOnConfirmButton();
			Thread.sleep(1000);
			vault.clickOnNextButton();
			
			vault.enterTitle("ABCD");
			Thread.sleep(1000);

			WebElement element=driver.findElement(By.xpath(Description));
			util.scrollToNumberOfTimes(22, element);
		
			Thread.sleep(1000);
			vault.clickOnSelectCategories();
			Thread.sleep(1000);
			vault.clickOnAdvertising();
			Thread.sleep(1000);
			
			WebElement element2=driver.findElement(By.xpath(Categories));
			util.scrollToNumberOfTimes(22, element2);

			
			if(driver.findElements(By.xpath(AdditionalOptions)).size()>0)
				  Assert.assertTrue(true);
			else
				  Assert.assertTrue(false);
			
			WebElement element3=driver.findElement(By.xpath(Collection));
			util.scrollToNumberOfTimes(10, element3);
			Thread.sleep(1000);
			
			vault.clickOnSelectDate();
			vault.clickOnEditDate();
			vault.clickOnEnterDate("05/05/2023");
			Thread.sleep(1000);
			vault.clickOnOkButtun();
			vault.clickOnNextButton();
			vault.clickOnCreateButton();
			vault.clickOnContinueButton();
			Thread.sleep(1000);
			
			if(driver.findElements(By.xpath(VaultItem)).size()>0)
				  Assert.assertTrue(true);
			else
				  Assert.assertTrue(false);
		
		}
	
		//@Test(priority=24)
		public void verifyVaultEditVaultItemFunctionality() throws InterruptedException
		{
			vault= new VaultPage(driver);
			util= new Utilities(driver);
			
			vault.clickOnVaultOption();
			
			util.explicitWait(MYVAULT);
			vault.clickOnMyVault();
			Thread.sleep(2000);
			
			if(driver.findElements(By.xpath(VaultItem)).size()>0)
				  Assert.assertTrue(true);
			else
				  Assert.assertTrue(false);
			
			util.clickOnElementUsingCoordinates(280, 1257);
			Thread.sleep(2000);
			vault.clickOnEditImage();
			vault.clickOnGallery();
			vault.clickOnSelectImage2();
			vault.clickOnConfirmButton();
			vault.clickOnNextButton();
			vault.enterTitle("ABCD123");
			
			WebElement element=driver.findElement(By.xpath(Description));
			util.scrollToNumberOfTimes(22, element);
			vault.clickOnSelectCategories();
			Thread.sleep(1000);
			
			vault.clickOnAlcoholAndSmoking();
			Thread.sleep(1000);
			
			WebElement element2=driver.findElement(By.xpath(Categories));
			util.scrollToNumberOfTimes(22, element2);
			Thread.sleep(1000);
			
			if(driver.findElements(By.xpath(AdditionalOptions)).size()>0)
				  Assert.assertTrue(true);
			else
				  Assert.assertTrue(false);
			
			WebElement element3=driver.findElement(By.xpath(Collection));
			util.scrollToNumberOfTimes(15, element3);
			Thread.sleep(1000);
			
			vault.clickOnSelectDate();
			vault.clickOnEditDate();
			vault.clickOnEnterDate("05/06/2023");
			Thread.sleep(1000);
			vault.clickOnOkButtun();
			vault.clickOnNextButton();
			vault.clickOnUpdateButton();
			vault.clickOnContinueButton();
			
			Thread.sleep(1000);
			
			if(driver.findElements(By.xpath(VaultItem)).size()>0)
				  Assert.assertTrue(true);
			else
				  Assert.assertTrue(false);
			
		}
		
		//@Test(priority=25)
		public void verifyVaultDeleteVaultItemFunctionality() throws InterruptedException
		{
			vault= new VaultPage(driver);
			util= new Utilities(driver);
			
			vault.clickOnVaultOption();
			
			util.explicitWait(MYVAULT);
			vault.clickOnMyVault();
			Thread.sleep(2000);
			
			if(driver.findElements(By.xpath(VaultItem)).size()>0)
				  Assert.assertTrue(true);
			else
				  Assert.assertTrue(false);
			
			util.clickOnElementUsingCoordinates(368, 1257);
			Thread.sleep(1000);
			vault.clickOnDeleteYesButton();
			
			if(driver.findElements(By.xpath(DeletedSuccessfully)).size()>0)
				  Assert.assertTrue(true);
			else
				  Assert.assertTrue(false);	
		}
		
		@Test(priority=26)
		public void verifyVaultMyVaultModuleFunctionality() throws InterruptedException
		{
			vault= new VaultPage(driver);
			util= new Utilities(driver);
			
			vault.clickOnVaultOption();
			util.explicitWait(MYVAULT);
			vault.clickOnMyVault();
			Thread.sleep(1000);
			
			if(driver.findElements(By.xpath(AddVaultItem)).size()>0)
				  Assert.assertTrue(true);
				else
				  Assert.assertTrue(false);
			
			//---------------------Add Vault Item without adding Image--------------------//

			Thread.sleep(1000);
			vault.clickOnAddVaultItem();
			
			vault.clickOnNextButton();
			
			if(driver.findElements(By.xpath(InvalidImage)).size()>0)
				  Assert.assertTrue(true);
				else
				  Assert.assertTrue(false);
			Thread.sleep(3000);

			//----------------------Add Vault Item without adding Title Name and Categories----//
			
			vault.clickOnAddImage();
			vault.clickOnGallery();
			Thread.sleep(1000);
			vault.clickOnSelectImage1();
			vault.clickOnConfirmButton();
			Thread.sleep(1000);
			vault.clickOnNextButton();
			Thread.sleep(1000);
			vault.clickOnNextButton();
			if(driver.findElements(By.xpath(EnterTitle)).size()>0)
				  Assert.assertTrue(true);
			else
				  Assert.assertTrue(false);

			WebElement elementA=driver.findElement(By.xpath(Description));
			util.scrollToNumberOfTimes(25, elementA);
		
			if(driver.findElements(By.xpath(SelectCategory)).size()>0)
				  Assert.assertTrue(true);
			else
				  Assert.assertTrue(false);
			Thread.sleep(1000);
			util.scrollToBeginning();
			Thread.sleep(1000);
			
			//--------------------Add Vault Item With Title Name and Category-------------------//
			
			vault.enterTitle("ABCD");
			Thread.sleep(1000);

			WebElement element=driver.findElement(By.xpath(Description));
			util.scrollToNumberOfTimes(22, element);
		
			Thread.sleep(1000);
			vault.clickOnSelectCategories();
			Thread.sleep(1000);
			vault.clickOnAdvertising();
			Thread.sleep(1000);
			
			WebElement element2=driver.findElement(By.xpath(Categories));
			util.scrollToNumberOfTimes(22, element2);

			
			if(driver.findElements(By.xpath(AdditionalOptions)).size()>0)
				  Assert.assertTrue(true);
			else
				  Assert.assertTrue(false);
			
			WebElement element3=driver.findElement(By.xpath(Collection));
			util.scrollToNumberOfTimes(10, element3);
			Thread.sleep(1000);
			
			vault.clickOnSelectDate();
			vault.clickOnEditDate();
			vault.clickOnEnterDate("05/05/2023");
			Thread.sleep(1000);
			vault.clickOnOkButtun();
			vault.clickOnNextButton();
			vault.clickOnCreateButton();
			vault.clickOnContinueButton();
			Thread.sleep(1000);
			
			if(driver.findElements(By.xpath(VaultItem)).size()>0)
				  Assert.assertTrue(true);
			else
				  Assert.assertTrue(false);
			
			//--------------------------Edit Vault Item-------------------------//
			
			Thread.sleep(1000);
			if(driver.findElements(By.xpath(VaultItem)).size()>0)
				  Assert.assertTrue(true);
			else
				  Assert.assertTrue(false);
			
			util.clickOnElementUsingCoordinates(280, 1257);
			Thread.sleep(2000);
			vault.clickOnEditImage();
			vault.clickOnGallery();
			vault.clickOnSelectImage2();
			vault.clickOnConfirmButton();
			vault.clickOnNextButton();
			vault.enterTitle("ABCD123");
			
			WebElement element4=driver.findElement(By.xpath(Description));
			util.scrollToNumberOfTimes(22, element4);
			vault.clickOnSelectCategories();
			Thread.sleep(1000);
			
			vault.clickOnAlcoholAndSmoking();
			Thread.sleep(1000);
			
			WebElement element5=driver.findElement(By.xpath(Categories));
			util.scrollToNumberOfTimes(22, element5);
			Thread.sleep(1000);
			
			if(driver.findElements(By.xpath(AdditionalOptions)).size()>0)
				  Assert.assertTrue(true);
			else
				  Assert.assertTrue(false);
			
			WebElement element6=driver.findElement(By.xpath(Collection));
			util.scrollToNumberOfTimes(15, element6);
			Thread.sleep(1000);
			
			vault.clickOnSelectDate();
			vault.clickOnEditDate();
			vault.clickOnEnterDate("05/06/2023");
			Thread.sleep(1000);
			vault.clickOnOkButtun();
			vault.clickOnNextButton();
			vault.clickOnUpdateButton();
			vault.clickOnContinueButton();
			
			Thread.sleep(1000);
			
			if(driver.findElements(By.xpath(VaultItem)).size()>0)
				  Assert.assertTrue(true);
			else
				  Assert.assertTrue(false);
			
			//-------------------------Delete Vault Item---------------------------//
			
			if(driver.findElements(By.xpath(VaultItem)).size()>0)
				  Assert.assertTrue(true);
			else
				  Assert.assertTrue(false);
			
			util.clickOnElementUsingCoordinates(368, 1257);
			Thread.sleep(1000);
			vault.clickOnDeleteYesButton();
			
			if(driver.findElements(By.xpath(DeletedSuccessfully)).size()>0)
				  Assert.assertTrue(true);
			else
				  Assert.assertTrue(false);	
		}
		
		//@Test(priority=27)
		public void verifyVaultAddVaultItemWithInsuranceCompanyAndStorageFunctionality() throws InterruptedException
		{

			vault= new VaultPage(driver);
			util= new Utilities(driver);
			
			vault.clickOnVaultOption();
			
			util.explicitWait(MYVAULT);
			Thread.sleep(1000);
			vault.clickOnMyVault();
			Thread.sleep(3000);
			vault.clickOnAddVaultItem();
			vault.clickOnAddImage();
			vault.clickOnGallery();
			Thread.sleep(1000);
			vault.clickOnSelectImage1();
			vault.clickOnConfirmButton();
			Thread.sleep(1000);
			vault.clickOnNextButton();
			vault.enterTitle("ABCD");
			Thread.sleep(1000);
			WebElement element=driver.findElement(By.xpath(Description));
			util.scrollToNumberOfTimes(22, element);
			Thread.sleep(1000);
			vault.clickOnSelectCategories();
			Thread.sleep(1000);
			vault.clickOnAdvertising();
			Thread.sleep(1000);
			WebElement element2=driver.findElement(By.xpath(Categories));
			util.scrollToNumberOfTimes(22, element2);		
			if(driver.findElements(By.xpath(AdditionalOptions)).size()>0)
				  Assert.assertTrue(true);
			else
				  Assert.assertTrue(false);
			
			WebElement element3=driver.findElement(By.xpath(Collection));
			util.scrollToNumberOfTimes(10, element3);
			Thread.sleep(1000);
			vault.clickOnSelectDate();
			vault.clickOnEditDate();
			vault.clickOnEnterDate("05/07/2023");
			Thread.sleep(1000);
			vault.clickOnOkButtun();
			
			//----------------------Add Storage Location-----------------------//
			
			WebElement element4=driver.findElement(By.xpath(NumberOfYears));
			util.scrollToNumberOfTimes(15, element4);
			Thread.sleep(1000);
			util.clickOnElementUsingCoordinates(965, 1125);
				
			Thread.sleep(1000);
			vault.clickOnStorageLocation("Loaction1");	
			WebElement element5=driver.findElement(By.xpath(StorageLocation));
			util.scrollToNumberOfTimes(15, element5);
			Thread.sleep(1000);
			util.clickOnElementUsingCoordinates(965, 1125);	

			//-----------------------Add Insurance Company------------------------//
			
			WebElement element6=driver.findElement(By.xpath(PurchasePrice));
			util.scrollToNumberOfTimes(15, element6);
			Thread.sleep(1000);
			util.clickOnElementUsingCoordinates(1011, 1125);
			
			Thread.sleep(1000);
			util.clickOnElementUsingCoordinates(976, 1083);	
			vault.clickOnInsuranceCompany("Insurance1");
			vault.clickOnNextButton();
			if(driver.findElements(By.xpath(Success)).size()>0)
				  Assert.assertTrue(true);
			else
				  Assert.assertTrue(false);
			Thread.sleep(4000);
			vault.clickOnCreateButton();
			Thread.sleep(8000);
			vault.clickOnContinueButton();
			Thread.sleep(1000);
			if(driver.findElements(By.xpath(VaultItem)).size()>0)
				  Assert.assertTrue(true);
			else
				  Assert.assertTrue(false);
		
		}
		
		//@Test(priority=28)
		public void verifyVaultInsuranceCompanyEditFunctionality() throws InterruptedException
		{

			vault= new VaultPage(driver);
			util= new Utilities(driver);
			
			vault.clickOnVaultOption();
			
			util.explicitWait(MYVAULT);
			Thread.sleep(1000);
			WebElement element=driver.findElement(By.xpath(COLLECTIONTAG));
			util.scrollNTines(element, 1, "right");
			Thread.sleep(1000);
			vault.clickOnInsuranceCompanyTag();
			Thread.sleep(1000);
			
			if(driver.findElements(By.xpath(InsuranceCompany)).size()>0)
				  Assert.assertTrue(true);
			else
				  Assert.assertTrue(false);
			util.clickOnElementUsingCoordinates(875, 500);
			vault.clickOnUpdateInsuranceName("Insurance123");
			vault.clickOnSaveButton();
			if(driver.findElements(By.xpath(UpdatedInsurance)).size()>0)
				  Assert.assertTrue(true);
			else
				  Assert.assertTrue(false);
			if(driver.findElements(By.xpath(Success)).size()>0)
				  Assert.assertTrue(true);
			else
				  Assert.assertTrue(false);
		}
		
		//@Test(priority=29)
		public void verifyVaultInsuranceCompanyDeleteFunctionality() throws InterruptedException
		{

			vault= new VaultPage(driver);
			util= new Utilities(driver);
			
			vault.clickOnVaultOption();
			
			util.explicitWait(MYVAULT);
			Thread.sleep(1000);
			WebElement element=driver.findElement(By.xpath(COLLECTIONTAG));
			util.scrollNTines(element, 1, "right");
			Thread.sleep(1000);
			vault.clickOnInsuranceCompanyTag();
			Thread.sleep(1000);	
			util.clickOnElementUsingCoordinates(972, 500);
			vault.clickOnDeleteYesButton();
			if(driver.findElements(By.xpath(Success)).size()>0)
				  Assert.assertTrue(true);
			else
				  Assert.assertTrue(false);		

		}
		
		//@Test(priority=30)
		public void verifyVaultStorageLocationEditFunctionality() throws InterruptedException
		{

			vault= new VaultPage(driver);
			util= new Utilities(driver);
			
			vault.clickOnVaultOption();
			
			util.explicitWait(MYVAULT);
			Thread.sleep(1000);
			WebElement element=driver.findElement(By.xpath(COLLECTIONTAG));
			util.scrollNTines(element, 1, "right");
			Thread.sleep(1000);
			WebElement element2=driver.findElement(By.xpath(INSURANCETAG));
			util.scrollNTines(element2, 1, "right");
			Thread.sleep(1000);
			vault.clickOnStorageLocationTag();
			Thread.sleep(1000);
			util.clickOnElementUsingCoordinates(875, 497);
			
			vault.clickOnUpdateStorageName("Location123");
			vault.clickOnSaveButton();
			if(driver.findElements(By.xpath(UpdatedStorageLocation)).size()>0)
				  Assert.assertTrue(true);
			else
				  Assert.assertTrue(false);
			if(driver.findElements(By.xpath(Success)).size()>0)
				  Assert.assertTrue(true);
			else
				  Assert.assertTrue(false);
		}
		
		//@Test(priority=31)
		public void verifyVaultStorageLocationDeleteFunctionality() throws InterruptedException
		{

			vault= new VaultPage(driver);
			util= new Utilities(driver);
			
			vault.clickOnVaultOption();
			
			util.explicitWait(MYVAULT);
			Thread.sleep(1000);
			WebElement element=driver.findElement(By.xpath(COLLECTIONTAG));
			util.scrollNTines(element, 1, "right");
			Thread.sleep(1000);
			WebElement element2=driver.findElement(By.xpath(INSURANCETAG));
			util.scrollNTines(element2, 1, "right");
			Thread.sleep(1000);
			vault.clickOnStorageLocationTag();
			Thread.sleep(1000);
			util.clickOnElementUsingCoordinates(972, 500);
			vault.clickOnDeleteYesButton();
			if(driver.findElements(By.xpath(Success)).size()>0)
				  Assert.assertTrue(true);
			else
				  Assert.assertTrue(false);	
			
	     //----------------------Delete Vault Item---------------------//
			Thread.sleep(1000);
			WebElement element9=driver.findElement(By.xpath(INSURANCETAG));
			util.scrollNTines(element9, 1, "left");
			Thread.sleep(1000);
			WebElement element10=driver.findElement(By.xpath(COLLECTIONTAG));
			util.scrollNTines(element10, 1, "left");
			Thread.sleep(1000);
			vault.clickOnMyVault();
			Thread.sleep(2000);
			util.clickOnElementUsingCoordinates(367, 1257);
			vault.clickOnDeleteYesButton();
			logger.info("Removed/deleted vault item from My Vault module");
			Thread.sleep(1000);
			if(driver.findElements(By.xpath(DeletedSuccessfully)).size()>0)
				  Assert.assertTrue(true);
			else
				  Assert.assertTrue(false);	
		}
		
		@Test(priority=32)
		public void verifyVaultAddVaultItemWithInsuranceCompanyAndStorageLocationModuleFunctionality() throws InterruptedException
		{
			logger.info("Execution started for verifyVaultAddVaultItemWithInsuranceCompanyAndStorageLocationModuleFunctionality Test Case");
			vault= new VaultPage(driver);
			util= new Utilities(driver);
			
			vault.clickOnVaultOption();
			
			util.explicitWait(MYVAULT);
			Thread.sleep(1000);
			logger.info("Adding vault item in My Vault");
			vault.clickOnMyVault();
			Thread.sleep(3000);
			vault.clickOnAddVaultItem();
			vault.clickOnAddImage();
			vault.clickOnGallery();
			Thread.sleep(1000);
			vault.clickOnSelectImage1();
			logger.info("Selected image for vault item");
			vault.clickOnConfirmButton();
			Thread.sleep(1000);
			vault.clickOnNextButton();
			vault.enterTitle("ABCD");
			logger.info("Entered Title name for vault item");
			Thread.sleep(1000);
			WebElement element=driver.findElement(By.xpath(Description));
			util.scrollToNumberOfTimes(22, element);
			Thread.sleep(1000);
			vault.clickOnSelectCategories();
			logger.info("Selected Category for vault item");
			Thread.sleep(1000);
			vault.clickOnAdvertising();
			Thread.sleep(1000);
			WebElement element2=driver.findElement(By.xpath(Categories));
			util.scrollToNumberOfTimes(22, element2);
			if(driver.findElements(By.xpath(AdditionalOptions)).size()>0)
				  Assert.assertTrue(true);
			else
				  Assert.assertTrue(false);
			WebElement element3=driver.findElement(By.xpath(Collection));
			util.scrollToNumberOfTimes(10, element3);
			Thread.sleep(1000);
			vault.clickOnSelectDate();
			vault.clickOnEditDate();
			vault.clickOnEnterDate("05/07/2023");
			logger.info("Selected Date for vault item");
			Thread.sleep(1000);
			vault.clickOnOkButtun();
			
			//----------------------Add Storage Location-----------------------//
			logger.info("Adding storage location for vault item");
			WebElement element4=driver.findElement(By.xpath(NumberOfYears));
			util.scrollToNumberOfTimes(15, element4);
			Thread.sleep(1000);
			util.clickOnElementUsingCoordinates(965, 1125);
			Thread.sleep(1000);
			vault.clickOnStorageLocation("Location1");
			logger.info("Added storage location for vault item");
			WebElement element5=driver.findElement(By.xpath(StorageLocation));
			util.scrollToNumberOfTimes(15, element5);
			Thread.sleep(1000);
			util.clickOnElementUsingCoordinates(965, 1125);	

			//-----------------------Add Insurance Company------------------------//
			logger.info("Adding insurance company for vault item");
			WebElement element6=driver.findElement(By.xpath(PurchasePrice));
			util.scrollToNumberOfTimes(15, element6);
			Thread.sleep(1000);
			util.clickOnElementUsingCoordinates(1011, 1125);
			Thread.sleep(1000);
			util.clickOnElementUsingCoordinates(976, 1083);
			vault.clickOnInsuranceCompany("Insurance1");
			logger.info("Added insurance company for vault item");
			vault.clickOnNextButton();
			if(driver.findElements(By.xpath(Success)).size()>0)
				  Assert.assertTrue(true);
			else
				  Assert.assertTrue(false);
			Thread.sleep(4000);
			vault.clickOnCreateButton();
			Thread.sleep(9000);
			vault.clickOnContinueButton();
			Thread.sleep(1000);
			if(driver.findElements(By.xpath(VaultItem)).size()>0)
				  Assert.assertTrue(true);
			else
				  Assert.assertTrue(false);	
			Thread.sleep(4000);
			
			//-------------------Insurance Company Edit Functionality------------------------//
			logger.info("Edit insurance company name for vault item");
			WebElement element7=driver.findElement(By.xpath(COLLECTIONTAG));
			util.scrollNTines(element7, 1, "right");
			Thread.sleep(1000);
			vault.clickOnInsuranceCompanyTag();
			Thread.sleep(1000);
			if(driver.findElements(By.xpath(InsuranceCompany)).size()>0)
				  Assert.assertTrue(true);
			else
				  Assert.assertTrue(false);
			util.clickOnElementUsingCoordinates(875, 500);
			vault.clickOnUpdateInsuranceName("Insurance123");
			logger.info("Updated insurance company name for vault item");
			vault.clickOnSaveButton();
			if(driver.findElements(By.xpath(UpdatedInsurance)).size()>0)
				  Assert.assertTrue(true);
			else
				  Assert.assertTrue(false);
			if(driver.findElements(By.xpath(Success)).size()>0)
				  Assert.assertTrue(true);
			else
				  Assert.assertTrue(false);
			
			//-------------------Insurance Company Delete Functionality------------------------//
			logger.info("Start to delete insurance company for vault item");
			Thread.sleep(1000);	
			util.clickOnElementUsingCoordinates(972, 500);
			vault.clickOnDeleteYesButton();
			logger.info("removed/deleted insurance company for vault item");
			if(driver.findElements(By.xpath(Success)).size()>0)
				  Assert.assertTrue(true);
			else
				  Assert.assertTrue(false);	
			
			//-------------------Storage Location Edit Functionality------------------------//
			
			logger.info("Edit storage location name for vault item");
			Thread.sleep(2000);
			WebElement element8=driver.findElement(By.xpath(INSURANCETAG));
			util.scrollNTines(element8, 1, "right");
			Thread.sleep(1000);
			vault.clickOnStorageLocationTag();
			Thread.sleep(1000);
			util.clickOnElementUsingCoordinates(875, 500);
			vault.clickOnUpdateStorageName("Location123");
			logger.info("Updated storage location name for vault item");
			vault.clickOnSaveButton();
			if(driver.findElements(By.xpath(UpdatedStorageLocation)).size()>0)
				  Assert.assertTrue(true);
			else
				  Assert.assertTrue(false);
			if(driver.findElements(By.xpath(Success)).size()>0)
				  Assert.assertTrue(true);
			else
				  Assert.assertTrue(false);
			
			//-------------------Storage Location Delete Functionality------------------------//
			
			logger.info("Start to Delete storage location for vault item");
			Thread.sleep(1000);
			util.clickOnElementUsingCoordinates(972, 500);
			vault.clickOnDeleteYesButton();
			logger.info("Removed/Deleted storage location for vault item");
			if(driver.findElements(By.xpath(Success)).size()>0)
				  Assert.assertTrue(true);
			else
				  Assert.assertTrue(false);	
			Thread.sleep(2000);
			
			//-------------------Delete vault item------------------------//
				
			logger.info("start to delete  vault item from My Vault module");
			WebElement element9=driver.findElement(By.xpath(INSURANCETAG));
			util.scrollNTines(element9, 1, "left");
			Thread.sleep(1000);
			WebElement element10=driver.findElement(By.xpath(COLLECTIONTAG));
			util.scrollNTines(element10, 1, "left");
			Thread.sleep(1000);
			vault.clickOnMyVault();
			Thread.sleep(2000);
			util.clickOnElementUsingCoordinates(368, 1257);
			vault.clickOnDeleteYesButton();
			logger.info("Removed/deleted vault item from My Vault module");	
			Thread.sleep(1000);
			if(driver.findElements(By.xpath(DeletedSuccessfully)).size()>0)
				  Assert.assertTrue(true);
			else
				  Assert.assertTrue(false);	
		}

}
