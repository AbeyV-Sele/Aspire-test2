package Aspire.Basic_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Product_Creation_Page {
	WebDriver driver;
	public Product_Creation_Page(WebDriver driver) {
		this.driver =driver;
	}

	By Productname  =  By.xpath("//input[@name='name']");	
	By Savebutton = By.xpath("//button[contains(text(),'Save')]");
	By Createbutton = By.xpath("//button[contains(text(),'Create')]");
	By updatequantity = By.xpath("//button[@name='action_update_quantity_on_hand']");
	By Createquantity = By.xpath("//button[@data-original-title='Create record']");
	By Countedquantity = By.xpath("//input[@name='inventory_quantity']");
	public WebElement productname() {
		return driver.findElement(Productname);
	}
	public WebElement Savebutton() {
		return driver.findElement(Savebutton);
	}
	public WebElement createbutton() {
		return driver.findElement(Createbutton);
	}
	public WebElement updatequantity() {
		return driver.findElement(updatequantity);
	}
	public WebElement Createquantity() {
		return driver.findElement(Createquantity);
	}
	public WebElement Countedquantity() {
		return driver.findElement(Countedquantity);
	}


}
