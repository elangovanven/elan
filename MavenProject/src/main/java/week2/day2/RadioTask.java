package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioTask {
	
public static void main(String[] args) {
		
		//Browser launching
		ChromeDriver driver =new ChromeDriver();
		
		//URl lunch
		driver.get("https://leafground.com/radio.xhtml");
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//implicity wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Select 'Your most favourite browser' from the radio buttons
		driver.findElement(By.xpath("//h5[text()='Your most favorite browser']/parent::div//label[text()='Chrome']/preceding-sibling::div/div[2]")).click();
		
		//- Click on a radio button, then click on the same radio button again to verify that 
		//it becomes ‘unselected’.
		WebElement Selected=driver.findElement(By.xpath("(//div[@class='ui-g-12 ui-md-4'])[2]//div[(@class='ui-radiobutton-box ui-widget ui-corner-all ui-state-default')]"));
		Selected.click();
		WebElement unSelect=driver.findElement(By.xpath("(//div[@class='ui-g-12 ui-md-4'])[2]//div[(@class='ui-radiobutton-box ui-widget ui-corner-all ui-state-default ui-state-active')]"));
		unSelect.click();		
		
		//- Identify the radio button that is initially selected by default.
		
	  WebElement defaultRadioButton=driver.findElement(By.xpath("(//div[@class='col-12'])[3]//td//div[@class='ui-radiobutton-box ui-widget ui-corner-all ui-state-default ui-state-active']"));
	 String browserDefaultValue=  driver.findElement(By.xpath("(//div[@class='col-12'])[3]//td//div[@class='ui-radiobutton-box ui-widget ui-corner-all ui-state-default ui-state-active']/parent::div/following-sibling::label")).getText();
		if(defaultRadioButton.isDisplayed())
		{
			System.out.println(browserDefaultValue+" : browser is selected by default");
		}
		
		
		//- Check and select the age group (21-40 Years) if not already selected.
		boolean b=driver.findElement(By.xpath("((//div[@class='ui-g'])[2]//div[@class='ui-g-12 ui-md-4'])[2]//div[@class='ui-radiobutton-box ui-widget ui-corner-all ui-state-default ui-state-active']")).isDisplayed();
		if(b==true)
		{
			System.out.println("21-40 age selected by default");
		}
		else
		{
			WebElement b1	=driver.findElement(By.xpath("((//div[@class='ui-g'])[2]//div[@class='ui-g-12 ui-md-4'])[2]//div[@class='ui-radiobutton-box ui-widget ui-corner-all ui-state-default']"));
			
			b1.click();
		}

	}


}
