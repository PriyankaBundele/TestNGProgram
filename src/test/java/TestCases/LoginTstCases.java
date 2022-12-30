package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PageObjectModel.LoginObjectTest;
import resources.BaseClass;

public class LoginTstCases extends BaseClass {

	@Test
	public void Login() throws IOException, InterruptedException {
		browserInitalization();
		driver.get("https://login.salesforce.com/");

		//driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Priyanka");

		LoginObjectTest log = new LoginObjectTest(driver);
		
		log.username1().sendKeys("Priyanka");
		log.password2().sendKeys("123");
		log.login3().click();
		log.EnterError().getText();
		
		

	}
}
