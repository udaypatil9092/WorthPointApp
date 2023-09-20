package com.worthPoint.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import baseLayer.TestBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class VaultPage extends TestBase{  
	
	    AndroidDriver driver;

		public VaultPage(AndroidDriver driver)
		{
			
			this.driver=driver;
			PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}

		// Obj repository
		
		@AndroidFindBy(xpath="//android.widget.ImageView[@content-desc=\"Vault\"]")
		private WebElement vault;
		
		@AndroidFindBy(xpath="//android.widget.ImageView[@content-desc=\"My Tags\"]")
		private WebElement mytags;
		
		@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Add new tag\"]")
		private WebElement addnewtag;
		
		
		@AndroidFindBy(xpath="(//android.widget.EditText[contains(@text,'Enter a tag name')])[1]")
		private WebElement enterName;
		
		@AndroidFindBy(xpath="(//android.view.View)[23]")
		private WebElement selectColor;
		
		@AndroidFindBy(xpath="(//android.view.View)[24]")
		private WebElement selectColor2;
		
		@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Continue\"]")
		private WebElement continueButton;
		
		@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Update\"]")
		private WebElement updateButton;
	
		@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Yes\"]")
		private WebElement delateYesBtn;
		
		@AndroidFindBy(xpath="(//android.widget.Button)[1]")
		private WebElement BackButton1;
		
		@AndroidFindBy(xpath="//android.widget.ImageView[@content-desc=\"Collections\"]")
		private WebElement collectionTab;
		
		@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Create collection\"]")
		private WebElement createCollection;
		
		@AndroidFindBy(xpath="//android.widget.EditText[contains(@text,'Enter Title')]")
		private WebElement enterTitle;
		
		@AndroidFindBy(xpath="//android.widget.EditText[contains(@text,'Describe your collection')]")
		private WebElement discription;
		
		@AndroidFindBy(xpath="//android.view.View[contains(@content-desc,\"Public Collection\")]")
		private WebElement publicCollection;
		
		@AndroidFindBy(xpath="//android.view.View[contains(@content-desc,\"Private Collection\")]")
		private WebElement privateCollection;
		
		@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Next\"]")
		private WebElement nextButton;
		
		@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Create\"]")
		private WebElement createButton;
		
		@AndroidFindBy(xpath="//android.view.View[contains(@content-desc,\"Collection1\")]")
		private WebElement collectionElement;
		
		@AndroidFindBy(xpath="(//android.view.View)[19]")
		private WebElement shareButton;
		
		@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"View All\"]")
		private WebElement viewAll;
		
		@AndroidFindBy(xpath="(//android.widget.ImageView)[1]")
		private WebElement filter;
		
		@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Clear All\"]")
		private WebElement clearAll;
		
		@AndroidFindBy(xpath="(//android.view.View[@content-desc=\"Select Or Enter\"])[2]")
		private WebElement statusDropdown;
		
		@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Public\"]")
		private WebElement publicStatus;
		
		@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Private\"]")
		private WebElement privateStatus;
		
		@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Show Results\"]")
		private WebElement showResults;
		
		@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Create Collection\"]")
		private WebElement createcollection2;
		
		@AndroidFindBy(xpath="(//android.widget.Button)[1]")
		private WebElement backButton;
	
		@AndroidFindBy(xpath="//android.widget.ImageView[@content-desc=\"My Vault\"]")
		private WebElement myVault;
		
		@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Add vault item\"]")
		private WebElement addvaultItem;
		
		@AndroidFindBy(xpath="(//android.view.View[@content-desc=\"Add Image\"])[1]")
		private WebElement addImageTab;
		
		@AndroidFindBy(xpath="(//android.widget.ImageView)[2]")
		private WebElement gallery;
		
		@AndroidFindBy(xpath="(//android.widget.ImageView)[1]")
		private WebElement selectImage1;
		
		@AndroidFindBy(xpath="(//android.widget.ImageView)[2]")
		private WebElement selectImage2;
		
		@AndroidFindBy(xpath="//android.widget.Button[contains(@content-desc,\"Confirm\")]")
		private WebElement confirm;
		
		@AndroidFindBy(xpath="(//android.view.View[contains(@content-desc,\"Select Or Enter\")])[1]")
		private WebElement selectCategories;
		
		@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Advertising\"]")
		private WebElement advertising;
		
		@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Alcohol & Smoking\"]")
		private WebElement alcoholAndSmoking;
		
		@AndroidFindBy(xpath="(//android.widget.ImageView)[1]")
		private WebElement selectDate;
		
		@AndroidFindBy(xpath="(//android.widget.Button)[1]")
		private WebElement editDate;
		
		@AndroidFindBy(xpath="(//android.widget.EditText)[1]")
		private WebElement enterDate;
		
		
		
		
		@AndroidFindBy(xpath="//android.view.View[@content-desc=\"6, Thursday, July 6, 2023\"]")
		private WebElement date1;
		
		@AndroidFindBy(xpath="//android.view.View[@content-desc=\"5, Wednesday, July 5, 2023\"]")
		private WebElement date2;
		
		@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"OK\"]")
		private WebElement ok;
		
		@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Edit\"]")
		private WebElement editImage;
		
		@AndroidFindBy(xpath="//android.widget.EditText[contains(@text,\"Storage Location\")]")
		private WebElement storageLocation;
		
		@AndroidFindBy(xpath="//android.widget.EditText[contains(@text,\"Insurance Company\")]")
		private WebElement insuranceCompany;
		
		@AndroidFindBy(xpath="//android.widget.ImageView[@content-desc=\"Insurance Companies\"]")
		private WebElement insuranceCompanyTag;
		
		@AndroidFindBy(xpath="//android.widget.EditText[contains(@text,'Enter Name')]")
		private WebElement updateInsurance;
		
		@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Save\"]")
		private WebElement saveButton;
		
		@AndroidFindBy(xpath="//android.widget.ImageView[@content-desc=\"Storage Locations\"]")
		private WebElement storageLocationTag;
		
		@AndroidFindBy(xpath="//android.widget.EditText[contains(@text,'Enter Name')]")
		private WebElement updateStorageName;
		
		@AndroidFindBy(xpath="//android.widget.ImageView[contains(@content-desc,\"ABCD\")]")
		private WebElement vaultitem;
		
		//ActionMethods
		public void clickOnVaultOption()
		{
			vault.click();
			//driver.hideKeyboard();
		}
		public void clickOnMyTags()
		{
			mytags.click();
		}
		
		public void clickOnAddNewTags()
		{
			addnewtag.click();
		}
		public void EnterTagName(String name)
		{
			enterName.click();
			enterName.sendKeys(name);
		}
		public void ClickOnColorTab()
		{
			selectColor.click();
		}
		
		public void ClickOnColorTab2()
		{
			selectColor2.click();
		}
		
		public void clickOnContinueButton()
		{
			continueButton.click();
		}
		public void clickOnUpdateButton()
		{
			updateButton.click();
		}
		public void clickOnDeleteYesButton()
		{
			delateYesBtn.click();
		}
		public void clickOnBackButton1()
		{
			BackButton1.click();
		}
		
		public void clickOnCollectionsOption()
		{
			collectionTab.click();
		}
		public void clickOnCreateCollection()
		{
			createCollection.click();
		}
		public void enterTitle(String name)
		{
			enterTitle.click();
			enterTitle.sendKeys(name);
		}
		public void enterDescription(String Discription)
		{
			discription.click();
			discription.sendKeys(Discription);
		}
		
		public void clickOnPublicCollection()
		{
			publicCollection.click();
		}
		public void clickOnPrivateCollection()
		{
			privateCollection.click();
		}
		public void clickOnNextButton()
		{
			nextButton.click();
		}
		public void clickOnCreateButton()
		{
			createButton.click();
		}
		public void clickOnCollectionElement()
		{
			collectionElement.click();
		}
		public void clickOnShareButton()
		{
			shareButton.click();
		}
		public void clickOnViewAll()
		{
			viewAll.click();
		}
		public void clickOnFilterOption()
		{
			filter.click();
		}
		public void clickOnClearAll()
		{
			clearAll.click();
		}
		public void clickOnStatusDropdown()
		{
			statusDropdown.click();
		}
		public void clickOnPublicStatus()
		{
			publicStatus.click();
		}
		public void clickOnPrivateStatus()
		{
		    privateStatus.click();
		}
		public void clickOnShowResults()
		{
			showResults.click();
		}
		public void clickOnCreateCollection2()
		{
			createcollection2.click();
		}
		public void clickOnBackButton()
		{
			backButton.click();
		}
		public void clickOnMyVault()
		{
			myVault.click();
		}
		public void clickOnAddVaultItem()
		{
			addvaultItem.click();
		}
		public void clickOnAddImage()
		{
			addImageTab.click();
		}
		public void clickOnGallery()
		{
			gallery.click();
		}
		public void clickOnSelectImage1()
		{
			selectImage1.click();
		}
		public void clickOnSelectImage2()
		{
			selectImage2.click();
		}
		public void clickOnConfirmButton()
		{
			confirm.click();
		}
		public void clickOnSelectCategories()
		{
			selectCategories.click();
		}
		public void clickOnAdvertising()
		{
			advertising.click();
		}
		public void clickOnAlcoholAndSmoking()
		{
			alcoholAndSmoking.click();
		}
		public void clickOnSelectDate()
		{
			selectDate.click();
		}
		public void clickOnEditDate()
		{
			editDate.click();
		}
		public void clickOnEnterDate(String Date)
		{
			enterDate.click();
			enterDate.clear();
			
			enterDate.sendKeys(Date);
		}
		public void clickOnDate1()
		{
			date1.click();
		}
		public void clickOnDate2()
		{
			date2.click();
		}
		public void clickOnOkButtun()
		{
			ok.click();
		}
		public void clickOnEditImage()
		{
			editImage.click();
		}
		public void clickOnStorageLocation(String Location)
		{
			storageLocation.click();
			storageLocation.clear();
			
			storageLocation.sendKeys(Location);
		}
		public void clickOnInsuranceCompany(String CompanyName)
		{
			insuranceCompany.click();
			insuranceCompany.clear();
			
			insuranceCompany.sendKeys(CompanyName);
		}
		public void clickOnInsuranceCompanyTag()
		{
			insuranceCompanyTag.click();
		}
		public void clickOnUpdateInsuranceName(String InsuranceName)
		{
			updateInsurance.click();
			
			updateInsurance.sendKeys(InsuranceName);
		}
		public void clickOnSaveButton()
		{
			saveButton.click();
		}
		public void clickOnStorageLocationTag()
		{
			storageLocationTag.click();
		}
		public void clickOnUpdateStorageName(String StorageName)
		{
			updateStorageName.click();
			updateStorageName.clear();
			
			updateStorageName.sendKeys(StorageName);
		}
		public void clickOnVaultItem()
		{
			vaultitem.click();
		}

		
}
