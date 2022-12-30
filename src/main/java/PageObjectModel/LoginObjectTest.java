package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginObjectTest {

	public WebDriver driver;

	private By username = By.xpath("//input[@id='username']");
	private By password = By.xpath("//input[@id='password']");
	private By login = By.xpath("//input[@id='Login']");
	private By ErrorMessage = By.xpath("//div[@id='error']");
	private By TryForFree= By.xpath("//a[@id='signup_link']");

	public LoginObjectTest(WebDriver driver2) {
		this.driver = driver2;
	}

	public WebElement username1() {
		return driver.findElement(username);

	}

	public WebElement password2() {
		return driver.findElement(password);

	}

	public WebElement login3() {
		return driver.findElement(login);

	}

	public WebElement EnterError() {
		return driver.findElement(ErrorMessage);

	}
	public WebElement EnterTryFree() {
		return driver.findElement(TryForFree);

	}

}
