package Aspire.Basic_Test;

import org.openqa.selenium.WebDriver;

public class Login_Test extends Base_class{

	WebDriver driver ;

	public Login_Test(WebDriver driver) {		
		this.driver =driver;
	}



	public void loginn_Test() {
		Login_Page loginpage = new Login_Page(driver);
		driver.get("https://aspireapp.odoo.com");
		loginpage.username().sendKeys("user@aspireapp.com");
		loginpage.password().sendKeys("@sp1r3app");
		loginpage.submit().click();

	}






}
