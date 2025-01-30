package week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {

		EdgeDriver driver = new EdgeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.get("https://www.leafground.com/radio.xhtml");

		WebElement favouriteChrome = driver.findElement(By.xpath("(//label[text()='Chrome'])[1]"));
		// favouriteChrome.click();
		Thread.sleep(3000);
		System.out.println(favouriteChrome.isEnabled());

		favouriteChrome.click();
		System.out.println(favouriteChrome.isEnabled());

		// To find the default selected radio button
		WebElement selectedRadioButton = driver.findElement(By.xpath(
				"//h5[contains(text(),'default select')]/following::tbody/descendant::td/descendant::div[contains(@class,'ui-state-active')]/parent::div/following-sibling::label"));
		System.out.println(selectedRadioButton.getText());

		//// h5[contains(text(),'Select the age
		//// group')]/following::label[contains(text(),'Years')]/preceding-sibling::div/div[contains(@class,'ui-state-active')]

		WebElement rad = driver.findElement(By.xpath(
				"//h5[contains(text(),'Select the age group')]/following::label[contains(text(),'Years')]/preceding-sibling::div/div[contains(@class,'ui-radiobutton-box')]"));
		List<WebElement> radd = driver.findElements(By.xpath(
				"//h5[contains(text(),'Select the age group')]/following::label[contains(text(),'Years')]/preceding-sibling::div/div[contains(@class,'ui-radiobutton-box')]"));
		for (WebElement web : radd) {

			boolean sel = web.isSelected();
			System.out.println(sel);
			if (sel == true) {
				System.out.println("YESS");
				break;
			}

		}
//		System.out.println("AGE");
//		System.out.println(rad.isEnabled());
//		System.out.println(rad.isSelected());
//		System.out.println(rad.isDisplayed());

		driver.close();

	}
}
