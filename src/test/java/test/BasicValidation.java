package test;

import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class BasicValidation extends BaseTest{
	
	@Test
	public void urlValidation() {
		String expectedUrl = "https://www.facebook.com/";
		String actualUrl = driver.getCurrentUrl();
		
		Reporter.log("expected URL = " + expectedUrl);
		Reporter.log("actual URL = " + actualUrl);
		
		assertTrue(actualUrl.equals(expectedUrl), "Mismatch in the URL,");
	}
	
	@Test
	public void pageTitleValidation() {
		String expectedTitle = "Facebook – log in or sign up";
		String actualTitle = driver.getTitle();
		
		Reporter.log("expected title = " + expectedTitle);
		Reporter.log("actual title = " + actualTitle);
		
		assertTrue(actualTitle.equals(expectedTitle), "Mismatch in the page title,");
	}

}
