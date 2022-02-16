package tests;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import base.Browser;
import pom.ApplicationHeader;
import pom.LoginPage;
import utils.Utility;

public class VerifyHeaderOfApplication extends Browser {

	private WebDriver driver;
	private ApplicationHeader applicationHeader;
	private LoginPage loginPage;
	private int testID;
	static ExtentTest test;
	static ExtentHtmlReporter reporter;
	
	@BeforeTest
	@Parameters("browser")
	public void launchBrowser(String browser) throws Exception {
		reporter = new ExtentHtmlReporter("test-output"+File.separator+"ExtendReport"+File.separator+"extendReport.html");
		ExtentReports extend = new ExtentReports();
		extend.attachReporter(reporter);
		   
		System.out.println("Befor Test");
		
		if(browser.equalsIgnoreCase("Chrome")) 
		{
			
			driver= launchChromeBrowser();
		}
	/*	
		if(browser.equalsIgnoreCase("Firefox")) {
			
			driver=launchFirefoxBrowser();
		}
		
		if(browser.equalsIgnoreCase("Opera")) {
		
			driver=launchOpewraBrowser();
			
		}
	*/			
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 
	}
    @BeforeClass
    public void createPOMobject() {
    	 loginPage = new  LoginPage(driver);
         applicationHeader = new ApplicationHeader(driver);

    }
	@BeforeMethod
	     public void loginToApplication() throws EncryptedDocumentException, IOException {
         System.out.println("loginToApplication");	
         driver.get("http://localhost/login.do");
    
         
         String useName = Utility.getDataFromExcel("vinod" ,1 , 1);
         loginPage.sendUserName(useName);
         
         String password = Utility.getDataFromExcel("vinod" ,1 , 1);
         loginPage.sendPassword(password);
         loginPage.clickOnLogin();
    
	}
	
	@Test
	public void toVerifyTaskButton() throws IOException {
    testID = 101 ;
		System.out.println("To Verify Task button");
    
    applicationHeader.openTasksPage();
    String url = driver.getCurrentUrl();
    String title = driver.getTitle();
   
    boolean result = url.equals("http://localhost/tasks/otasklist.do");
    Assert.assertTrue(result);
    
    Utility.getScrrenShot(driver, testID);
	}
	
	@Test
	public void verifyUserTab() {
	testID = 102 ;

		System.out.println("To verify user Tab");	
	applicationHeader.openUserPage();
	}
	
	
	@AfterMethod
	public void logoutFromApplication(ITestResult result) throws IOException {
    
		if(ITestResult.FAILURE == result .getStatus() )
		{
			Utility.getScrrenShot(driver, testID);
		}
		
		
		System.out.println("logout");
    applicationHeader.clickOnLogOut();
	}
	
	@AfterClass
	public void clearPOMObject() {
    loginPage = null ;	
    applicationHeader = null;
    
	}
	@AfterTest
	public void closeBrowser() {
		driver.quit();
		driver= null;
		System.gc();

	}
	
	 // expected is equals to actual the test PASS
    //expected is not equals to actual the test FALL
//    Assert.assertEquals(url,"http://localhost/tasks/otasklist.do ","url of task is not found" );
   
//    Assert.assertEquals(title,"actiTIME -  Open Tasks","title of task is not found " );

    // expected is not equals to actual the test FAIL
    //expected is not equals to actual the test pass
//    Assert.assertNotSame(url,"http://localhost/tasks/otasklist.do");
    
    
 //   boolean result = url.equals("http://localhost/tasks/otasklist.do");
    
    //result == true  ==> Test PASS
    //result == false ==> Test FAIL
    
//    Assert.assertTrue(result);
    
    //result == true ==> Test FAIL
    //result == false ==> Test PASS

//        Assert.assertFalse(result);
    
    
//    Assert.fail(); //forcefully FAIL test method
}
