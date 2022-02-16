package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ApplicationHeader {

	@FindBy (xpath ="//a[@class='item active']") 
	 WebElement timeTrackPage;
	
	@FindBy (xpath ="(//div[@class='label'])[2]") 
	 WebElement tasksPage;
	
	@FindBy (xpath ="(//div[@class='label'])[3]") 
	 WebElement reportPage;
	
	@FindBy (xpath ="(//div[@class='label'])[4]") 
	 WebElement userPage;
	
	@FindBy (xpath ="(//div[@class='label'])[5]") 
	 WebElement workSchedulePage;
	
	@FindBy (xpath ="//a[@id='logoutLink']") 
	 WebElement logoutPage;
	private WebDriver driver;
	private WebDriverWait wait;
	private Actions actions;
	
	public ApplicationHeader(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	   this.driver = driver;
	   actions = new Actions(driver);
	  // wait = new WebDriverWait(driver,20);
	}
	
	
	public void openTimeTrackPage() {
	    wait = new WebDriverWait(driver,20);
	    wait.until(ExpectedConditions.visibilityOf(timeTrackPage));
	    
		actions.moveToElement(timeTrackPage).click().build().perform();
	}
	
	public void openTasksPage() {
		 wait = new WebDriverWait(driver,21);
		 wait.until(ExpectedConditions.visibilityOf(tasksPage));
		
		actions.moveToElement(tasksPage).click().build().perform();
	}
	public void openReportPage() {
		 wait = new WebDriverWait(driver,25);
		 wait.until(ExpectedConditions.visibilityOf(reportPage));
		
		actions.moveToElement(reportPage).click().build().perform();
	}
	public void openUserPage() {
		wait = new WebDriverWait(driver,30);
	    wait.until(ExpectedConditions.visibilityOf(userPage));
		
		actions.moveToElement(userPage).click().build().perform();
	}
	public void openWorkSchedulePage() {
		wait = new WebDriverWait(driver,10);
	    wait.until(ExpectedConditions.visibilityOf(workSchedulePage));
		
		actions.moveToElement(workSchedulePage).click().build().perform();
	}
	
	public void clickOnLogOut() {
		actions.moveToElement(logoutPage).click().build().perform();
	}
	
}