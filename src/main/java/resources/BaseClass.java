package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public WebDriver driver;

	public void browserInitalization() throws IOException {
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\PRIYANKA\\eclipse-workspace\\TestNGProject\\src\\main\\java\\resources\\data.properties");
		Properties pro = new Properties();
		pro.load(fis);
		String BrowserName = pro.getProperty("browser");
		if (BrowserName.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();

		} else if (BrowserName.equalsIgnoreCase("FireFox")) {
			driver = new ChromeDriver();
		}

		else {
			System.out.println("Enter the valid browser name");

		}
	}

}
