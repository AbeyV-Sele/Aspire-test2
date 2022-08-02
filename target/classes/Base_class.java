package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_class {
	
	public static WebDriver driver;
	public static Properties prop;
	public static String userdir = System.getProperty("user.dir");

	public static WebDriver driver_Initilize() throws IOException {

		prop = new Properties();
		FileInputStream Input = new FileInputStream(userdir+"\\src\\main\\java\\resources\\data.properties");
		prop.load(Input);
		String Browser = prop.getProperty("browser");
		System.out.println(Browser);
		if(Browser.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver",userdir+"\\src\\main\\java\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();

		}
		else if(Browser.contains("firefox")) {
			System.setProperty("webdriver.gecko.driver",userdir+"\\src\\main\\java\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();

		}
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
	public static String getscreenshot(String Testcasename,WebDriver driver) throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		String destinationfile = System.getProperty(".\\reports\\"+Testcasename+".png");
		FileUtils.copyFile(source,new File(destinationfile));
		return destinationfile;

	}
}
