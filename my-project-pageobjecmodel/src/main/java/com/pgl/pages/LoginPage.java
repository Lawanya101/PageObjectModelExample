package com.pgl.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	/*
	 * public static WebElement userName(WebDriver driver) { return
	 * driver.findElement(By.name("email")); } public static WebElement
	 * passWord(WebDriver driver) { return driver.findElement(By.name("password"));
	 * }
	 * 
	 * public static WebElement login(WebDriver driver) { return
	 * driver.findElement(By.id("submitBTN")); }
	 */
	@FindBy(name="email")
	public static WebElement userName;
	@FindBy(how = How.NAME,using = "password")
	public static WebElement passWord;
	@FindBy(id="submitBTN")
	public static WebElement login;
	
}
