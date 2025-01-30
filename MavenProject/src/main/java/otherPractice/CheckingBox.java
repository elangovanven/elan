package otherPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckingBox {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://leafground.com/checkbox.xhtml");
		WebElement disabledCheckbox = driver.findElement(By.xpath("(//span[text()='Disabled']/preceding-sibling::div)[2]"));
		
		System.out.println(disabledCheckbox.isEnabled());
	}

}
