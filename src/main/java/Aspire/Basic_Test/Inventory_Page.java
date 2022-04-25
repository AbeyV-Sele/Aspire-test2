package Aspire.Basic_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Inventory_Page {
	WebDriver driver;
	public Inventory_Page(WebDriver driver) {
		this.driver =driver;
	}
	By Products = By.xpath("//span[contains(text(),'Products')]");
	By Product = By.xpath("//a[contains(text(),'Products')]");


	public WebElement products() {
		return driver.findElement(Products);
	}
	public  WebElement product() {
		return driver.findElement(Product);
	}
}
