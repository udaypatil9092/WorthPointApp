package baseLayer;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.google.common.util.concurrent.Uninterruptibles;
import com.worthPoint.pagelayer.LoginPage;
import com.worthPoint.pagelayer.MarksCategoriesPage;
import com.worthPoint.pagelayer.MarksPopularMarksPage;
import com.worthPoint.pagelayer.PriceGuideCategoriesPage;
import com.worthPoint.pagelayer.PriceGuidePopularItemsPage;
import com.worthPoint.pagelayer.SearchPreferencesPage;
import com.worthPoint.pagelayer.VaultPage;
import com.worthPoint.pagelayer.VisualSearchPage;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import utilities.ConfigPropHandler;
import utilities.Utilities;

public class TestBase {
	
	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	ConfigPropHandler ConfProp = new ConfigPropHandler();
	public static Logger logger;
	
	public Utilities util;
	public LoginPage loginPage;
	public PriceGuidePopularItemsPage priceguide;
	public PriceGuideCategoriesPage pgcategories;
	public MarksPopularMarksPage marks;
	public MarksCategoriesPage mcategories;
	public VisualSearchPage visualsearch;
	public SearchPreferencesPage searchp;
	public VaultPage vault;
	
	@BeforeClass (alwaysRun = true)
	public void setup()
	{
			//Logger setup
		
				logger =Logger.getLogger("Logger for appium Framework");
				PropertyConfigurator.configure(System.getProperty("user.dir")+ File.separator + "Resources" + File.separator + "log4j.properties");
				logger.info("Execution of test started");
		
			//appium server setup
		
				service = new AppiumServiceBuilder()
						//.withAppiumJS(new File(ConfProp.propReader("AppiumJSFile")))
						.withAppiumJS(new File("C:\\Users\\other\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
						.withTimeout(Duration.ofSeconds(300))
						.withIPAddress(ConfProp.propReader("AppiumURL")).usingPort(Integer.valueOf(ConfProp.propReader("AppiumPort")))
						.build();
				
				service.start();
				
				//setting up android driver
				
				UiAutomator2Options options = new UiAutomator2Options();	
				
				options.setCapability("deviceName", ConfProp.propReader("deviceName"));
//				options.setCapability("app",ConfProp.propReader("appPath"));
				options.setCapability("unicodeKeyboard", "true");
				options.setCapability("autoGrantPermissions", "true");
				
				options.setCapability("appPackage", "com.worthpoint.priceguide.dev");
				options.setCapability("appActivity", "com.worthpoint.priceguide.MainActivity");
				
				
				try 
				{
					driver = new AndroidDriver(new URL("http://" + ConfProp.propReader("AppiumURL") + ":" + ConfProp.propReader("AppiumPort")),options);
				}
				catch (MalformedURLException e) 
				{
					System.out.println("URL not Found/Unreachable.");
					e.printStackTrace();
				}
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));			
	}
	@BeforeMethod (alwaysRun = true)
	public void login()
	{
		driver.terminateApp("com.worthpoint.priceguide.dev");
		driver.activateApp("com.worthpoint.priceguide.dev");

		loginPage = new LoginPage(driver); //(if you want run login test class then keep only login object and remain comment out)//
		
//		loginPage.clickOnNext();
//		loginPage.clickOnGetStarted();
		
		Uninterruptibles.sleepUninterruptibly(Duration.ofMillis(1000));
		
		loginPage.enterEmail("udaypatil44@gmail.com");
		loginPage.enterPassword("Uday123");
		loginPage.clickOnLogin();
		
		Uninterruptibles.sleepUninterruptibly(Duration.ofMillis(2000));
		
		List<WebElement> skip_button = driver.findElements(AppiumBy.accessibilityId("Skip"));
		if(skip_button.size()>0)
		{
			driver.findElement(AppiumBy.accessibilityId("Skip")).click();
		}
	}
	
	
	@AfterClass (alwaysRun = true)
	public void teardown()
	{
		driver.quit();
		service.stop();
		logger.info("Execution of test ended");
	}
}