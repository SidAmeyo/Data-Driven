package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Login {
	
	private WebDriver driver;
	
	
	@CacheLookup
	@FindBy(id = "email")
	WebElement email;
	
	@CacheLookup
	@FindBy(id = "pass")
	WebElement passwd;
	
	@CacheLookup
	@FindBy(tagName = "button")
	WebElement loginBtn;
	
	@CacheLookup
	@FindBy(partialLinkText = "Forgotten password?")
	WebElement forgotPasswordLink;
	
	
	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void loginWithCredentials(String username, String password) {
		
		Reporter.log("username = " + username);
		Reporter.log("password = " + password);
		
		email.clear();		
		email.sendKeys(username);
		
		passwd.clear();
		passwd.sendKeys(password);
		
//		loginBtn.click();
	}
	
	public void forgotPassword(String username) {
		forgotPasswordLink.click();
		//enter the username code goes here
	}

}
