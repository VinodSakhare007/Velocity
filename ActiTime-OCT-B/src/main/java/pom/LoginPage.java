package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	@FindBy (xpath ="//input[@name='username']") 
	 WebElement userName;
	
	@FindBy (xpath ="//input[@name='pwd']") 
	 WebElement Password;
	
	@FindBy (xpath ="//a[@id='loginButton']") 
	 WebElement login;
	
	@FindBy (xpath ="//input[@type='checkbox']") 
	 WebElement keepMeLoginCheckbox;
	
	public LoginPage(WebDriver driver2)
	{
		
		PageFactory.initElements(driver2,this);
	}
	
	public void sendUserName(String userID) {
		userName.sendKeys("admin");
	}
	
	public void sendPassword(String pass) {
		Password.sendKeys("manager");
	}
	public String getTextofLoginButton() {
		String text = login .getText();
		return text;
	}
	public void clickOnLogin() {
		login.click();
	}
	public void selectKeepMeLogin() {
		keepMeLoginCheckbox.click();
	}
	
	public void loginToApplication() {
		userName.sendKeys("admin");
		Password.sendKeys("manager");
		login.click();
		keepMeLoginCheckbox.click();
		
	}
	
	
}
