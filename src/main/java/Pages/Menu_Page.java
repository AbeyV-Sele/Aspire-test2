package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Menu_Page {
	WebDriver driver;
	public Menu_Page(WebDriver driver) {
		this.driver =driver;
	}

	By Inventory_Click = By.xpath("//a[@role='option'][2]/div");
	By Mainmenu = By.xpath("//a[@aria-label='Home menu']");
	By Manufacturing_Click = By.xpath("//a[@role='option'][3]/div");

	public WebElement Inventory_Click() {
		return driver.findElement(Inventory_Click);
	}
	public WebElement Mainmenu() {
		return driver.findElement(Mainmenu);
	}
	public WebElement Manufacturing_click() {
		return driver.findElement(Manufacturing_Click);
	}
}
