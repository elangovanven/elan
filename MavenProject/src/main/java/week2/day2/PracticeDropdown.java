package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeDropdown {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.telerik.com/contact");
		
		WebElement dropdown1 = driver.findElement(By.id("Dropdown-1"));
		WebElement dropdown2 = driver.findElement(By.id("Dropdown-2"));
		WebElement dropdown3 = driver.findElement(By.id("Country-1"));
		
		Select drop1 = new Select(dropdown1);
		Select drop2 = new Select(dropdown2);
		Select drop3 = new Select(dropdown3);
		
		drop1.selectByVisibleText("Invoicing/Billing");
		Thread.sleep(2000);
		drop2.selectByIndex(10);
		Thread.sleep(2000);
		drop3.selectByValue("Canada");
	}

}
