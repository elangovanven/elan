package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ButtonPractice {
	
	public static void main(String[] args) {
		
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.get("https://leafground.com/button.xhtml");
		
		WebElement clickAndConfirmButton = driver.findElement(By.xpath("//h5[text()='Click and Confirm title.']/following-sibling::button"));
		
		clickAndConfirmButton.click();
		
		System.out.println(driver.getTitle());
		driver.navigate().back();
		
		WebElement disabledButton = driver.findElement(By.xpath("//h5[contains(text(),'button is disabled')]/following-sibling::button"));
		boolean enabled = disabledButton.isEnabled();
		System.out.println("Is disabled button active : "+ enabled);
		
		WebElement positionButton = driver.findElement(By.xpath("//h5[contains(text(),'Find the position of the Submit button')]/following-sibling::button"));
		Point location = positionButton.getLocation();
		System.out.println(location.getX() + " and " + location.getY());
		
		WebElement colorButton = driver.findElement(By.xpath("//h5[contains(text(),'Find the Save button color')]/following-sibling::button"));
		
		System.out.println("Background color "+colorButton.getCssValue("background-color"));
		
		WebElement heightWidthButton = driver.findElement(By.xpath("//h5[contains(text(),'height and width')]/following-sibling::button"));
		String height = heightWidthButton.getCssValue("height");
		String width = heightWidthButton.getCssValue("width");
		System.out.println("height : " +height);
		System.out.println("width : "+ width);
		
		driver.close();
		
		
	}

}
