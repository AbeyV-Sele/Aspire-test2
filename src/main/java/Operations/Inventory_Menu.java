package Operations;

import org.openqa.selenium.WebDriver;

import Pages.Inventory_Page;
import Pages.Menu_Page;

public class Inventory_Menu {
	WebDriver driver ;

	public Inventory_Menu(WebDriver driver) {		
		this.driver =driver;
	}

	public void select_product(){
		Inventory_Page inventorypage = new Inventory_Page(driver);
		inventorypage.products().click();
		inventorypage.product().click();


	}
	
	public void selecting_main_menu() {
		Menu_Page menupage = new Menu_Page(driver);
		menupage.Mainmenu().click();
	}
	
	public void selecting_manufacturing_menu() {
		Menu_Page menupage1 = new Menu_Page(driver);
		menupage1.Manufacturing_click().click();
	}
}
