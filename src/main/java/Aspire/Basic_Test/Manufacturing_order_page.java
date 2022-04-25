package Aspire.Basic_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Manufacturing_order_page {

	WebDriver driver;
	public Manufacturing_order_page(WebDriver driver) {
		this.driver =driver;
	}
	By create_Button = By.xpath("//button[contains(text(),'Create')]");
	By Product_name = By.xpath("(//input[@type='text'])[1]");
	By Productlist= By.xpath("//input[@title='Search for records']");
	By Select_product = By.xpath("//li[@class='ui-menu-item']/a");
	By Start_typing = By.xpath("//a[contains(text(),'Start_typing']");
	By drop_down = By.xpath("(//a[@class='o_dropdown_button'])[1]");
	By confirm = By.xpath("//button[@name='action_confirm']/span");
	By done = By.xpath("(//button[@name='button_mark_done'])[4]");
	By confirm_alert = By.xpath("//footer[@class='modal-footer']/button[1]");
	By Apply = By.xpath("//footer/button[1]");
	By verify_name = By.xpath("//a[@name='product_id']/span");



	public WebElement createbutton() {
		return driver.findElement(create_Button);
	}
	public WebElement Product_name() {
		return driver.findElement(Product_name);
	}
	public WebElement Select_product() {
		return driver.findElement(Select_product);
	}
	public WebElement Product_list() {
		return driver.findElement(Productlist);
	}
	public WebElement Start_typing() {
		return driver.findElement(Start_typing);
	}
	public WebElement drop_down() {
		return driver.findElement(drop_down);
	}
	public WebElement confirm() {
		return driver.findElement(confirm);
	}
	public WebElement done() {
		return driver.findElement(done);
	}
	public WebElement confirm_alert() {
		return driver.findElement(confirm_alert);
	}
	public WebElement Apply() {
		return driver.findElement(Apply);
	}
	public WebElement verify() {
		return driver.findElement(verify_name);
	}
}