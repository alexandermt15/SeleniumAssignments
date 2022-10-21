package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// WebDriverManager.firefoxdriver().setup();
		// FirefoxDriver driver = new FirefoxDriver();

		// WebDriverManager.safaridriver().setup();
		// SafariDriver driver = new SafariDriver();

		driver.get("https://en-gb.facebook.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement createaccount = driver.findElement(By.linkText("Create New Account"));
		createaccount.click();

		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Alexander");

		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("K");

		WebElement mobilenumber = driver.findElement(By.name("reg_email__"));
		mobilenumber.sendKeys("9876543210");

		WebElement password = driver.findElement(By.name("reg_passwd__"));
		password.sendKeys("passtest");

		Select date = new Select(driver.findElement(By.name("birthday_day")));
		date.selectByValue("28");

		Select month = new Select(driver.findElement(By.name("birthday_month")));
		month.selectByVisibleText("Oct");

		Select year = new Select(driver.findElement(By.name("birthday_year")));
		year.selectByVisibleText("2000");

		WebElement gender = driver.findElement(By.xpath("//label[contains(text(),'Female')]"));
		gender.click();

		// driver.close();
	}

}
