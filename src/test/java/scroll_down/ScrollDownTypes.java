package scroll_down;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base_class.DriverSetup;

public class ScrollDownTypes extends DriverSetup {

	// public static String baseUrl = "https://code.visualstudio.com/";
	public static String baseUrl = "https://www.youtube.com/";

	@Test
	public void ScrollDown() throws InterruptedException {
		driver.get(baseUrl);

		// Navigate to the website
		// Scroll to a specific location given by (x,y) coordinates
		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		jse.executeScript("window.scrollTo(0,3000)");
//		Thread.sleep(2000);

		// Scroll up to an element
//		WebElement startedNow = driver.findElement(By.id("home-get-started-now-link"));
//		jse.executeScript("arguments[0].scrollIntoView(true)",startedNow);
//		Thread.sleep(2000);

		// Scroll Down until the bottom of the page
//		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//		Thread.sleep(2000);

		// Horizontal Scrolling
//		jse.executeScript("window.scrollTo(1500,0)");
//		Thread.sleep(2000);		

		// Scroll-bar Horizontal
//		WebElement scrollBar= driver.findElement(By.xpath(""));
//		scrollBar.sendKeys(Keys.END);
//		Thread.sleep(2000);

		// Scroll Dynamically for Loading Page //Example: youtube
		long initialHeight = (long) (jse.executeScript("return document.body.scrollHeight"));
		Thread.sleep(2000);
		while (true) {
			jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			Thread.sleep(2000);
			long currentHeight = (long) (jse.executeScript("return document.body.scrollHeight"));
			Thread.sleep(3000);

			if (initialHeight == currentHeight) {
				break;
			}
			initialHeight = currentHeight;
		}

	}

}
