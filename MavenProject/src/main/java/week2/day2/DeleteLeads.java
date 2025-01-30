package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLeads {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String name = "Elangovan";
		WebElement userName = driver.findElement(By.id("username"));
		WebElement passWord = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));

		userName.sendKeys("Demosalesmanager");
		passWord.sendKeys("crmsfa");
		loginButton.click();

		WebElement crmLink = driver.findElement(By.linkText("CRM/SFA"));
		crmLink.click();

		WebElement LeadsTab = driver.findElement(By.linkText("Leads"));
		LeadsTab.click();

		WebElement findLeads = driver.findElement(By.linkText("Find Leads"));
		findLeads.click();

		WebElement firstLead = driver
				.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		String firstLeadId = firstLead.getText();
		System.out.println(firstLeadId);
		firstLead.click();

		WebElement deleteLead = driver.findElement(By.linkText("Delete"));
		deleteLead.click();

		try {

			findLeads.click();

		} catch (StaleElementReferenceException e) {
			findLeads = driver.findElement(By.linkText("Find Leads"));
		}

		findLeads.click();

		WebElement leadBox = driver.findElement(By.xpath("//label[text()='Lead ID:']/parent::div/div/input"));
		leadBox.sendKeys(firstLeadId);
		WebElement findLeadButton = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		findLeadButton.click();

		WebElement noRecordsMessage = driver.findElement(By.xpath("//div[text()='No records to display']"));
		String recordstatus = noRecordsMessage.getText();

		if (recordstatus.equals("No records to display")) {
			System.out.println("Lead is deleted successfully");
		}
	}

}
