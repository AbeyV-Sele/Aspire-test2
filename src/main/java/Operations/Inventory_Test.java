package Operations;

import org.openqa.selenium.WebDriver;

import Pages.Menu_Page;

public class Inventory_Test {
	WebDriver driver ;

	public Inventory_Test(WebDriver driver) {		
		this.driver =driver;
	}
	
	public void Inventory_Click() {
		Menu_Page menupage = new Menu_Page(driver);
		menupage.Inventory_Click().click();
				
	}
}
