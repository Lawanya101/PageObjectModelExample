package com.pgl.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpdateProfilePage {

	/*
	 * public static WebElement myProfile(WebDriver driver) { return
	 * driver.findElement(By.xpath("//*[@id=\"navbarNav\"]/ul/li[3]/a")); } public
	 * static WebElement phoneNumber(WebDriver driver) { return
	 * driver.findElement(By.id("Phone")); } public static WebElement
	 * UpdateProfile(WebDriver driver) { return
	 * driver.findElement(By.xpath("//*[@type=\"submit\"]")); }
	 */
	
	@FindBy(xpath="//*[@id=\"navbarNav\"]/ul/li[3]/a/span")
	public static WebElement myProfile;
	@FindBy(id="Phone")
	public static WebElement phoneNumber;
	@FindBy(xpath="//*[@type=\"submit\"]")
	public static WebElement UpdateProfile;
	
}
