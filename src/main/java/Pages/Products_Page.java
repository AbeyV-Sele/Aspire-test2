package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Products_Page {
	WebDriver driver;
	public Products_Page(WebDriver driver) {
		this.driver =driver;
	}


	By Create_button = By.xpath("//button[contains(text(),'Create')]");	
	By Searchbutton = By.xpath("//input[@role='searchbox']");
	By Productlist = By.xpath("//div[@class='oe_kanban_details']");
	public static By Productname = By.xpath("//strong[@class='o_kanban_record_title']");
	public WebElement create_button() {
		return driver.findElement(Create_button);
	}
	public WebElement Search_button() {
		return driver.findElement(Searchbutton);
	}

	public WebElement Productlist() {
		return driver.findElement(Productlist);
	}



}
