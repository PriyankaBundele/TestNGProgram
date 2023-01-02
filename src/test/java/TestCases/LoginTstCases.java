package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginObjectTest;
import resources.AllText;
import resources.BaseClass;

public class LoginTstCases extends BaseClass {

	@Test
	public void Login() throws IOException, InterruptedException {
		

// driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Priyanka");

		LoginObjectTest log = new LoginObjectTest(driver);

		log.username1().sendKeys(AllText.username5);
		log.password2().sendKeys(AllText.password3);
		log.login3().click();
		

        SoftAssert assertion=new SoftAssert();
        String actual=log.EnterError().getText();
        String Expected=AllText.TextAppeard;

         assertion.assertEquals(actual,Expected );
         assertion.assertAll();
		
	}
}
