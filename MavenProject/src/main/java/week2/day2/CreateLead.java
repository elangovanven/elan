package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

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

		WebElement createLead = driver.findElement(By.linkText("Create Lead"));
		createLead.click();
		WebElement companyName = driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']"));
		WebElement firstName = driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']"));
		WebElement lastName = driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']"));
		WebElement firstNameLocal = driver.findElement(By.xpath("//input[@name='firstNameLocal']"));
		WebElement department = driver.findElement(By.id("createLeadForm_departmentName"));
		WebElement description = driver.findElement(By.xpath("//textarea[@name='description']"));
		WebElement importantNote = driver.findElement(By.xpath("//textarea[@name='importantNote']"));
		WebElement Email = driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']"));
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stateProvince = new Select(state);
		WebElement createLeadSubmitButton = driver.findElement(By.xpath("//input[@value='Create Lead']"));

		companyName.sendKeys("ASPIRESYSTEMS");
		firstName.sendKeys("ELANGOVAN");
		lastName.sendKeys("VENGATESAN");
		firstNameLocal.sendKeys("ELAN");
		department.sendKeys("TESTING");
		description.sendKeys("I LOVE ALL");
		Email.sendKeys("elangoodboy@gmail.com");
		stateProvince.selectByVisibleText("New York");
		createLeadSubmitButton.click();
		WebElement edit = driver.findElement(By.xpath("//a[text()='Edit']"));
		edit.click();

		try {

			description.clear();

		} catch (StaleElementReferenceException e) {

			description = driver.findElement(By.xpath("//textarea[@name='description']"));
		}

		description.clear();

		try {

			importantNote.sendKeys("SPREAD LOVE");

		} catch (StaleElementReferenceException e) {

			importantNote = driver.findElement(By.xpath("//textarea[@name='importantNote']"));

		}

		importantNote.sendKeys("SPREAD LOVE");
		WebElement updateButton = driver.findElement(By.xpath("//input[@value='Update']"));
		updateButton.click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();

	}

}
