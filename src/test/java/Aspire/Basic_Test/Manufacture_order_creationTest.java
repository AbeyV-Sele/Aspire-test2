package Aspire.Basic_Test;

import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Manufacture_order_creationTest extends Base_class{

	static WebDriver  driver = null;
	static Login_Test login;
	static Inventory_Test Inventory;
	static Inventory_Menu inventory_menu;
	static Products products;
	



	@BeforeTest
	public static void driver_Intilize() {
		driver = driver_Initilize();
		login = new Login_Test(driver);
		Inventory = new Inventory_Test(driver);
		inventory_menu = new Inventory_Menu(driver);
		products = new Products(driver);
		

	}

	@Test	
	public static void order_creation(){

		login.loginn_Test();
		Inventory.Inventory_Click();
		inventory_menu.select_product();
		products.product_creation();
		products.price_updation();
		inventory_menu.selecting_main_menu();
		inventory_menu.selecting_manufacturing_menu();
		products.manufa_order_creation();
		products.verify_productname();



	}
	
	@AfterTest
	public static void driver_close() {
		driver.close();
	}

}
