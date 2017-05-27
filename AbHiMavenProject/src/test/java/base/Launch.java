package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Launch {
	WebDriver driver;
	
	@Test
	public void launch(){		
	System.out.println("Launch");
	//System.setProperty("webdriver.chrome.driver", "C:\\Automation Stuff\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.google.com");
}

}
