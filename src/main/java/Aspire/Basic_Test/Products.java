package Aspire.Basic_Test;

import org.checkerframework.checker.nullness.qual.AssertNonNullIfNonNull;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class Products extends Base_class {

	WebDriver driver ;

	public Products(WebDriver driver) {		
		this.driver =driver;
	}

	public void  product_creation() {
		Products_Page productpage = new Products_Page(driver);
		Product_Creation_Page productcreation = new Product_Creation_Page(driver);
		productpage.create_button().click();
		productcreation.productname().sendKeys("Test112");
		productcreation.Savebutton().click();
		productpage.create_button().click();
	}

	public void price_updation() {
		Inventory_Page inventorypage = new Inventory_Page(driver);
		Products_Page productspage = new Products_Page(driver);
		Product_Creation_Page productcreation1 = new Product_Creation_Page(driver);

		inventorypage.products().click();
		inventorypage.product().click();
		productspage.Search_button().click();
		productspage.Search_button().sendKeys("Test112");
		productspage.Search_button().sendKeys(Keys.ENTER);
		explicit_wait(Products_Page.Productname,"Test112");
		productspage.Productlist().click();
		productcreation1.updatequantity().click();
		productcreation1.Createquantity().click();
		productcreation1.Countedquantity().click();
		productcreation1.Countedquantity().sendKeys("12");
		productcreation1.Savebutton().click();
	}

	public void manufa_order_creation() {
		Manufacturing_order_page manfac = new Manufacturing_order_page(driver);
		manfac.createbutton().click();
		

		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		manfac.Product_name().click();
		
		manfac.Product_name().sendKeys("Test112");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		manfac.Select_product().click();
		manfac.confirm().click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		manfac.done().click();
		manfac.confirm_alert().click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		manfac.Apply().sendKeys(Keys.ENTER);
		

	}	
	
	public void verify_productname() {
		Manufacturing_order_page manfac1 = new Manufacturing_order_page(driver);
		String actual = manfac1.verify().getText();
		
		Assert.assertEquals(actual ,"Test112");
		
	}
}

