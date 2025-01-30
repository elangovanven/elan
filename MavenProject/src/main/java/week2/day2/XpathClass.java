package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathClass {
	
	public static void main(String[] args) {
		
		/*Load Url :https://login.salesforce.com/?locale=in
Enter username:dilip@testleaf.com
Enter password:Test@2025
Click on Login
*/
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		
		WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
		WebElement password = driver.findElement(By.xpath("//input[contains(@id,'pass')]"));
		WebElement loginButton = driver.findElement(By.xpath("//input[contains(@class,'wide primary')]"));
		
		userName.sendKeys("dilip@testleaf.com");
		password.sendKeys("Test@2025");
		loginButton.click();
	}

}
