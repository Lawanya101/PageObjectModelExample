package com.pgl.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pgl.pages.LoginPage;
import com.pgl.pages.UpdateProfilePage;

public class UpdateProfile {
	
	@Test
	public void updateProf() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.phptravels.net/login");
		//LoginPage login=new LoginPage();
		PageFactory.initElements(driver, LoginPage.class);
		LoginPage.userName.sendKeys("user@phptravels.com");
		LoginPage.passWord.sendKeys("demouser");
		LoginPage.login.click();
		Thread.sleep(3000);
		PageFactory.initElements(driver, UpdateProfilePage.class);
		UpdateProfilePage.myProfile.click();
		UpdateProfilePage.phoneNumber.sendKeys("123654");
		UpdateProfilePage.UpdateProfile.click();
	}
}
