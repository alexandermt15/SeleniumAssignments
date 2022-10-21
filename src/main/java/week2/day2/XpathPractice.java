package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathPractice {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// WebDriverManager.firefoxdriver().setup();
		// FirefoxDriver driver = new FirefoxDriver();

		// WebDriverManager.safaridriver().setup();
		// SafariDriver driver = new SafariDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();

		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("Demosalesmanager");
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("crmsfa");
		WebElement submit = driver.findElement(By.xpath("//input[@class='decorativeSubmit']"));
		submit.click();
		WebElement link = driver.findElement(By.xpath("//a[contains(text(),CRM/SFA)]"));
		link.click();

		// driver.close();
	}
}
