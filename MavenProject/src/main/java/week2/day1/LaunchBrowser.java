package week2.day1;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(4000);
		
		driver.close();
		
		
	}

}
