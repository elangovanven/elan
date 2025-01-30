package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxPractice {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement basicCheckbox = driver
				.findElement(By.xpath("//input[@aria-label='Basic']/parent::div/following-sibling::div"));
		WebElement ajaxCheckbox = driver.findElement(By.xpath("(//span[text()='Ajax']/preceding-sibling::div)[2]"));
		WebElement javaCheckbox = driver
				.findElement(By.xpath("(//label[text()='Java']/preceding-sibling::div/div)[2]"));
		WebElement pythonCheckbox = driver
				.findElement(By.xpath("(//label[text()='Python']/preceding-sibling::div/div)[2]"));
		WebElement triStateCheckbox = driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']"));
		WebElement toggleCheckbox = driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']"));
		WebElement disabCheckbox = driver.findElement(By.xpath("(//span[text()='Disabled']/preceding-sibling::div)[2]"));
		WebElement comboBox = driver.findElement(By.xpath("//div[@role='combobox']"));

		basicCheckbox.click();
		ajaxCheckbox.click();
		Thread.sleep(3000);
		ajaxCheckbox.click();
		Thread.sleep(3000);
		WebElement checkboxNotificationMessage = driver.findElement(By.xpath("//span[@class='ui-growl-title']"));
		System.out.println(checkboxNotificationMessage.getText());

		// System.out.println(checkboxNotificationMessage.getText());
		if (checkboxNotificationMessage.getText().equalsIgnoreCase("Checked")) {
			System.out.println("Notification message is checked properly");
		} else if (checkboxNotificationMessage.getText().equalsIgnoreCase("Unchecked")) {

			System.out.println("Notification message is not checked properly");

		} else {
			System.out.println("Pop up not appeared");
		}
		javaCheckbox.click();
		pythonCheckbox.click();
		Thread.sleep(3000);
		System.out.println(basicCheckbox.isEnabled());

		triStateCheckbox.click();
		Thread.sleep(3000);

		WebElement stateInfo = driver.findElement(By.xpath("//span[@class='ui-growl-title']/following-sibling::p"));
		System.out.println(stateInfo.getText());
		System.out.println(triStateCheckbox.isEnabled());
		toggleCheckbox.click();
		Thread.sleep(3000);
		System.out.println("Disabled checkbox state : "+disabCheckbox.isEnabled());
		comboBox.click();

	}

}
