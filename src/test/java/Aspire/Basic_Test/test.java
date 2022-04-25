package Aspire.Basic_Test;

import org.openqa.selenium.WebDriver;

import net.bytebuddy.implementation.bind.annotation.Super;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = null;

		Login_Test ab = new Login_Test(driver);
		ab.login_Test();
	}

}
