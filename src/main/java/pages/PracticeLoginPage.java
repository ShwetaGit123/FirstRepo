package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeLoginPage {

	WebDriver driver;
	
	public void openBrowser() {
	driver = new FirefoxDriver(); 
	}
	
	public void openLoginPage() {
		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=hp0q7SZil3U&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5IjoiaHAwcTdTWmlsM1UiLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTY5OTcyMDY4NywiaWF0IjoxNjk5NzE5NDg3LCJqdGkiOiI3MzIzOWU0My02MWU2LTQwYjQtYWZjOC05MmY3YTBlMDNkNzEiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.NhnyvpW7bDjRimIKBS0iUY6Xdczo5uRPsAm8ooTgQeqQb04P6pzM41udVRce6fGDc5vtzomoXB_jUv08ZaM6qxmhN3CKVBwFEn-4uINHPGbk59uO3S7tLXc6yHok-zDnZvqjtwOF0XjQS3nS6UUco7j_Ojbax2r9Q8Jsfb1gh7SRDDA87-ucSsP_Z9azezb33sfarCYOYBubjL2fync8X6jl7r5UYQaf6Jjohf8hPRaMCvbHKdpMvLVA7CMYS_6Dcme6lwmSQI36yRbOV_rQVo_NVn9yEeRES3PnamjXvWDwD0Cj4r40Zr9e8y66j2xKdO_nvFua5Di9W9B6s8IKGA&preferred_environment=");
	}
	
	public String readTitle () {	
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		return actualTitle;
		
	}
	
	public void enterEmailPassword(String a, String b) {
		driver.findElement(By.id("usernameInput-input")).sendKeys(a);
		driver.findElement(By.id("password-input")).sendKeys(b);		
	}
	
	public void clickOnLoginButton() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();",driver.findElement(By.id("signIn")));
	}
	
	public String readEmailErr() {
		String actualErr= driver.findElement(By.id("UsernameTextField__errors-usernameInput")).getText();
		System.out.println(actualErr);
		return actualErr;
	}

	public void closeBrowser() {
		driver.quit();	
	}
}
