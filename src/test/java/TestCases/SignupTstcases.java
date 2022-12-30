package TestCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LoginObjectTest;
import PageObjectModel.SignupObjectTest;
import resources.BaseClass;

public class SignupTstcases extends BaseClass {
	@Test
	public void Verifyfree() throws IOException, InterruptedException {

		browserInitalization();
		driver.get("https://login.salesforce.com/");

		LoginObjectTest log = new LoginObjectTest(driver);
		log.EnterTryFree().click();

		SignupObjectTest few = new SignupObjectTest(driver);
		Thread.sleep(5000);
		few.SignupDemo().sendKeys("Priyanka");
		few.EnterLastName().sendKeys("machale");
		few.JobEntitles().sendKeys("Associate");
		few.EnterRightemail().sendKeys("priyankabundelel@gmail.com");
		few.EnterphoneValid().sendKeys("7875745372");

		Select s= new Select(few.SignUti());
		s.selectByIndex(3);
		few.Companyfrmt().sendKeys("Accenture");

	}

}
