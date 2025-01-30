package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {

		EdgeDriver driver = new EdgeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");

		WebElement createNewAccount = driver.findElement(By.linkText("Create new account"));
		createNewAccount.click();

		WebElement firstName = driver.findElement(By.name("firstname"));
		WebElement lastName = driver.findElement(By.name("lastname"));
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select birthMonth = new Select(month);
		Select birthDay = new Select(day);
		Select birthYear = new Select(year);

		WebElement genderMale = driver.findElement(By.xpath("//label[text()='Male']/input"));
		WebElement mobileNumber = driver.findElement(By.xpath("//input[@aria-label='Mobile number or email']"));
		WebElement password = driver.findElement(By.id("password_step_input"));
		WebElement signUpButton = driver.findElement(By.xpath("//button[@name='websubmit']"));

		firstName.sendKeys("Elangovan");
		lastName.sendKeys("Vengatesan");
		birthMonth.selectByIndex(11);
		birthDay.selectByVisibleText("15");
		birthYear.selectByValue("1994");
		genderMale.click();
		mobileNumber.sendKeys("elangoodboy@gmail.com");
		password.sendKeys("Elangovan@123");
		signUpButton.click();
	}

}
