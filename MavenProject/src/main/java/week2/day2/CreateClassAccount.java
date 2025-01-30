package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateClassAccount {

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

		WebElement accountsTab = driver.findElement(By.linkText("Accounts"));
		accountsTab.click();
		WebElement createAccount = driver.findElement(By.linkText("Create Account"));
		createAccount.click();

		WebElement accountName = driver.findElement(By.xpath("//input[@id='accountName']"));
		WebElement description = driver.findElement(By.name("description"));
		WebElement industryDropdown = driver.findElement(By.xpath("//select[@id='currencyUomId']"));
		Select industry = new Select(industryDropdown);
		WebElement ownership = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select owner = new Select(ownership);
		WebElement source = driver.findElement(By.xpath("//select[@id='dataSourceId']"));
		Select sourc = new Select(source);
		WebElement marketing = driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
		Select marketingCampaign = new Select(marketing);
		WebElement state = driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']"));
		Select stateProvince = new Select(state);
		WebElement createAccountButton = driver.findElement(By.className("smallSubmit"));

		accountName.sendKeys(name);
		description.sendKeys("Selenium Automation Tester");
		industry.selectByIndex(3);
		owner.selectByVisibleText("S-Corporation");
		sourc.selectByValue("LEAD_EMPLOYEE");
		marketingCampaign.selectByIndex(6);
		stateProvince.selectByValue("TX");
		createAccountButton.click();

		WebElement accountNameFetched = driver.findElement(
				By.xpath("//span[text()='Account Name']/parent::td/following-sibling::td/span[@class='tabletext']"));
		String nameFetched = accountNameFetched.getText().split(" ")[0];
		System.out.println(nameFetched);
		if (nameFetched.equals(name)) {
			System.out.println("Name is correct");
		} else {
			System.out.println("Name is incorrect");
		}

		driver.close();
	}
}
