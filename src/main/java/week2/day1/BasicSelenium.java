package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicSelenium {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// WebDriverManager.firefoxdriver().setup();
		// FirefoxDriver driver = new FirefoxDriver();

		// WebDriverManager.safaridriver().setup();
		// SafariDriver driver = new SafariDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();

		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Demosalesmanager");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		WebElement submit = driver.findElement(By.className("decorativeSubmit"));
		submit.click();
		WebElement link = driver.findElement(By.linkText("CRM/SFA"));
		link.click();
		WebElement leadlink = driver.findElement(By.linkText("Leads"));
		leadlink.click();
		WebElement createleadlink = driver.findElement(By.linkText("Create Lead"));
		createleadlink.click();

		WebElement companyname = driver.findElement(By.id("createLeadForm_companyName"));
		companyname.sendKeys("MIT");

		WebElement firstname = driver.findElement(By.id("createLeadForm_firstName"));
		firstname.sendKeys("Alexander");

		WebElement lastname = driver.findElement(By.id("createLeadForm_lastName"));
		lastname.sendKeys("K");

		WebElement createleadbutton = driver.findElement(By.name("submitButton"));
		createleadbutton.click();

		// driver.close();
	}
}
