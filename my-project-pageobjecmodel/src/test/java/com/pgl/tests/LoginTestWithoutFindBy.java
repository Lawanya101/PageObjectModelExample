package com.pgl.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginTestWithoutFindBy {
	public static WebElement email;
	public static WebElement password;
	public static WebElement submitBTN;
	
	@Test
	public void login() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.phptravels.net/login");
		//LoginPage login=new LoginPage();
		PageFactory.initElements(driver, LoginTestWithoutFindBy.class);
		email.sendKeys("user@phptravels.com");
		password.sendKeys("demouser");
		submitBTN.click();
	}

}
