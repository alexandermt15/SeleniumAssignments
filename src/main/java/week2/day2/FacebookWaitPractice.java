package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookWaitPractice {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// WebDriverManager.firefoxdriver().setup();
		// FirefoxDriver driver = new FirefoxDriver();

		// WebDriverManager.safaridriver().setup();
		// SafariDriver driver = new SafariDriver();

		driver.get("https://www.facebook.com");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement createaccount = driver.findElement(By.linkText("Create New Account"));
		createaccount.click();

		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Alexander");

		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("K");
		;

		// driver.close();
	}
}
