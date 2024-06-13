package basicselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Browser {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();    //Upcasting
		
		driver.get("https://www.amazon.in");
		
	}

}
