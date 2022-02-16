package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.ApplicationHeader;
import pom.LoginPage;

public class TestClass1 {
public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("http://localhost/login.do");

    LoginPage  loginPage = new  LoginPage(driver);
    
    String loginText = loginPage.getTextofLoginButton();
    if(loginText.equals("Login"))
    {
    	System.out.println("PASS");
    }
    else {
    	System.out.println("FALI");
    }
    loginPage.sendUserName("admin");
    loginPage.sendPassword("manager");
    loginPage.clickOnLogin();
   
    ApplicationHeader Header = new ApplicationHeader(driver);
    Header.openTimeTrackPage();
   
    ApplicationHeader applicationHeaderTasksPage = new ApplicationHeader(driver);
    applicationHeaderTasksPage.openTasksPage();
    
    
    ApplicationHeader applicationHeaderReportPage = new ApplicationHeader(driver);
    applicationHeaderReportPage.openReportPage();

    
    ApplicationHeader applicationHeaderUserPage = new ApplicationHeader(driver);
    applicationHeaderUserPage.openUserPage();
    
    
    ApplicationHeader applicationHeaderWorkSchedulePage = new ApplicationHeader(driver);
    applicationHeaderWorkSchedulePage.openWorkSchedulePage();
    
    
    ApplicationHeader applicationHeaderLogoutFromApplication = new ApplicationHeader(driver);
    applicationHeaderLogoutFromApplication.clickOnLogOut();
   
}
}
