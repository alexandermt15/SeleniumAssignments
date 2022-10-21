package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
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
		WebElement findleads = driver.findElement(By.linkText("Find Leads"));
		findleads.click();
		WebElement firstlead = driver
				.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		firstlead.click();

		String ActualTitle = driver.getTitle();

		System.out.println("The Title of the page is " + ActualTitle);

		String ExpectedTitle = "View Lead | opentaps CRM";

		if (ActualTitle.equals(ExpectedTitle)) {
			System.out.println("Page Title matches");
		} else
			System.out.println("Page Title not matches");

		WebElement editlead = driver.findElement(By.linkText("Edit"));
		editlead.click();

		WebElement updatecompany = driver.findElement(By.id("updateLeadForm_companyName"));
		updatecompany.clear();
		updatecompany.sendKeys("NewCompany");

		WebElement updatebutton = driver.findElement(By.name("submitButton"));
		updatebutton.click();

		Thread.sleep(5000);

		WebElement verifyupdatedname = driver.findElement(By.id("viewLead_companyName_sp"));
		verifyupdatedname.getText().equals("NewCompany");

	}
}