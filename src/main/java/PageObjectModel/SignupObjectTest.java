package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupObjectTest {

	public WebDriver driver;

	private By Enterfirstnme = By.xpath("//input[@name='UserFirstName']");

	private By Lastname = By.xpath("//input[@name='UserLastName']");
	private By JObTitles = By.xpath("//input[@name='UserTitle']");
	private By Enteremail = By.xpath("//input[@name='UserEmail']");
	private By PhoneTry = By.xpath("//input[@name='UserPhone']");
	private By employeeCode = By.xpath("//select[@name='CompanyEmployees']");
	private By CompanySheet = By.xpath("//input[@name='CompanyName']");
	private By Checkbox = By.xpath("//div[@class='checkbox-ui']");

	public SignupObjectTest(WebDriver driver2) {
		this.driver = driver2;
	}

	public WebElement SignupDemo() {

		return driver.findElement(Enterfirstnme);

	}

	public WebElement EnterLastName() {

		return driver.findElement(Lastname);

	}

	public WebElement JobEntitles() {

		return driver.findElement(JObTitles);

	}

	public WebElement EnterRightemail() {

		return driver.findElement(Enteremail);

	}

	public WebElement EnterphoneValid() {

		return driver.findElement(PhoneTry);

	}

	public WebElement SignUti() {

		return driver.findElement(employeeCode);

	}

	public WebElement Companyfrmt() {

		return driver.findElement(CompanySheet);

	}

	public WebElement checkselection() {

		return driver.findElement(Checkbox);

	}

}