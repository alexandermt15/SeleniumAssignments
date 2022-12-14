package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

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

		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));

		Select sourcedd = new Select(source);

		sourcedd.selectByVisibleText("Employee");

		WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));

		Select industrydd = new Select(industry);

		industrydd.selectByValue("IND_FINANCE");

		WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));

		Select ownershipdd = new Select(ownership);

		ownershipdd.selectByIndex(5);

		// driver.close();
	}
}
