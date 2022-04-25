package Aspire.Basic_Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_class {
	public static WebDriver driver;

	@SuppressWarnings("deprecation")
	public static WebDriver driver_Initilize() {

		String path =System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"\\src\\main\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

	}
	public void explicit_wait(By ab,String Name) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.textToBe(ab,Name));
	}
	
	public void explicit_wait_element(By ab) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(ab));
	}

	public void Doubleclick(WebElement ele ) {
		Actions act = new Actions(driver);

		//Double click on element
		ele = driver.findElement(By.xpath("XPath of the element")); 
		act.doubleClick(ele).perform();
	}
}
