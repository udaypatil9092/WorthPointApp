package utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Arrays;
import java.util.Date;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.PointerInput.MouseButton;
import org.openqa.selenium.interactions.PointerInput.Origin;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.ImmutableMap;

import baseLayer.TestBase;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Utilities extends TestBase {

    AndroidDriver driver;
	PointerInput finger;
	Sequence sequence;
		
	public Utilities(AndroidDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public void sendTextToElement(String text)
	{
		new Actions(driver).sendKeys(text).perform();
	}
	
	public void scrollTillText(String text) {
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).index(0))"
				+ ".scrollIntoView(new UiSelector().text(\"" + text + "\"))"));
		}

	public void swipeAction(WebElement element, String direction)
	{
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap
				.of("left", 100, "top", 100, "width", 200, "height", 200, "direction", direction, "percent", 0.75));
	}
	
	public void clickOnElementUsingCoordinates(int x, int y) {
		
		finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		sequence = new Sequence(finger,1);
		sequence.addAction(finger.createPointerMove(Duration.ZERO, Origin.viewport(), x, y))
				.addAction(finger.createPointerDown(MouseButton.LEFT.asArg()))
				.addAction(finger.createPointerUp(MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(sequence));
	}
	
	public void scrollNTines(WebElement element,int n,String direction)				//direction - up/down/left/right
	{
		for(int i=0;i<=n;i++)
		{
			boolean canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: flingGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId(),
			    "direction", direction,
			    "speed", 1000 ));
		}
	}
	
	public  void scrollToNumberOfTimes(int N, WebElement element)
	{
		for(int i=0; i<=N; i++)
		{
		  boolean canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: flingGesture", ImmutableMap.of(
				    "elementId", ((RemoteWebElement) element).getId(),
				    "direction", "down",
				    "speed", 1000
				));
		}
	}
	public void scrollTillEnd(String direction) 						//direction - up/down/left/right
	{
		boolean scrollable;

		do {
			scrollable = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap
					.of("left", 100, "top", 100, "width", 200, "height", 200, "direction", direction, "percent", 3.0));
		} while (scrollable);
	}
	
	
	public  void scrollToEnd()
	{
		driver.findElement(MobileBy.AndroidUIAutomator( "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(100000)"));
	}
	
	public  void scrollToBeginning()
	{
		driver.findElement(MobileBy.AndroidUIAutomator( "new UiScrollable(new UiSelector().scrollable(true)).scrollToBeginning(100000)"));
	}

	public void longPressOnElement(WebElement element) {
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) element).getId()));
	}

	public void dragAndDrop(WebElement element, int x, int y) {
		((JavascriptExecutor) driver).executeScript("mobile: dragGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) element).getId(), "endX", x, "endY", y));
	}

	public void switchToWebview() {
		Set<String> all_contexts = driver.getContextHandles();

		for (String contextName : all_contexts) {
			if (contextName.toLowerCase().contains("webview")) {
				driver.context(contextName);
			}
		}
	}

	public void switchToNativeApp() {
		Set<String> all_context = driver.getContextHandles();

		for (String contextName : all_context) {
			if (contextName.toLowerCase().contains("native")) {
				driver.context(contextName);
			}
		}
	}
	
	public void explicitWait(String path)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(path)));
	}
	
	public WebElement waitUntilClickable(By by) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.elementToBeClickable(by));
	}
	
	
	public void ExplisitWaitElementClickable(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public void ExplisitWaitElementWithAttributeAndValue(WebElement element,String attribute,String value)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.attributeToBe(element, attribute, value));
	}
	
	public String getScreenshot(AndroidDriver driver,String screenshotName)
	{
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		String destination = System.getProperty("user.dir") + "/Screenshots/"+screenshotName+dateName+".png";
		
		File finalDestination = new File(destination);
		
		try {
			FileHandler.copy(source, finalDestination);
		} catch (IOException e) {
			e.printStackTrace();
		}
																
		return destination;								//Returns the captured file path
	}
}