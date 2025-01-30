package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement userName = driver.findElement(By.id("email"));
		WebElement passWord = driver.findElement(By.id("pass"));
		WebElement LoginButton = driver.findElement(By.name("login"));
		userName.sendKeys(" testleaf.2023@gmail.com");
		passWord.sendKeys("Tuna@321");
		LoginButton.click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
	}

}
