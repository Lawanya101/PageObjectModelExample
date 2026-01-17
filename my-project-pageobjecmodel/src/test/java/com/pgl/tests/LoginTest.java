package com.pgl.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pgl.pages.LoginPage;

public class LoginTest {

	//user@phptravels.com
	//demouser
	@Test
	public void login() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.phptravels.net/login");
		//LoginPage login=new LoginPage();
		PageFactory.initElements(driver, LoginPage.class);
		LoginPage.userName.sendKeys("user@phptravels.com");
		LoginPage.passWord.sendKeys("demouser");
		LoginPage.login.click();
			}
	}
