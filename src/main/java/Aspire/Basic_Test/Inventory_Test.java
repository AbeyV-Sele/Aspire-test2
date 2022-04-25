package Aspire.Basic_Test;

import org.openqa.selenium.WebDriver;

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
