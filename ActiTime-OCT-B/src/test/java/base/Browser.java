package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static WebDriver launchChromeBrowser() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    return driver;
	}
	
 //   public static WebDriver launchFirefoxBrowser() {
		
	//	System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	  //  WebDriver driver = new ChromeDriver();
	    //return driver;
	//}
	
    //public static WebDriver launchOpewraBrowser() {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	    //WebDriver driver = new ChromeDriver();
	    //return driver;
	//}
}
