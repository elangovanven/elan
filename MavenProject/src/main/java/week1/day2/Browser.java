package week1.day2;

public class Browser {
	
public String launchBrowser(String browserName)
{
	System.out.println("Browser "+ browserName + " launched successfully");
	return browserName;
}

public void  loadUrl()
{
	System.out.println("Application url loaded successfully");
}

	public static void main(String[] args) {
	
		
		Browser b = new Browser();
		//b.launchBrowser("Firefox");
		System.out.println(b.launchBrowser("Firefox"));
		b.loadUrl();

	}

}
