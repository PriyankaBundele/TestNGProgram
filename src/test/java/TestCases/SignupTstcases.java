package TestCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LoginObjectTest;
import PageObjectModel.SignupObjectTest;
import resources.AllText;
import resources.BaseClass;

public class SignupTstcases extends BaseClass {
	@Test
	public void Verifyfree() throws IOException, InterruptedException {

		LoginObjectTest log = new LoginObjectTest(driver);
		log.EnterTryFree().click();

		SignupObjectTest few = new SignupObjectTest(driver);
		Thread.sleep(5000);
		few.SignupDemo().sendKeys(AllText.Firstname2);
		few.EnterLastName().sendKeys(AllText.LastNm);
		few.JobEntitles().sendKeys(AllText.jobEntitle);
		few.EnterRightemail().sendKeys(AllText.rightemail);
		few.EnterphoneValid().sendKeys(AllText.phone);
		few.Companyfrmt().sendKeys(AllText.Company);


		Select s = new Select(few.SignUti());
		s.selectByIndex(3);
		few.checkselection().click();
		few.checkselection();

	}

}
