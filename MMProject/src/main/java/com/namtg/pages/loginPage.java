package com.namtg.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
WebDriver driver;
	
	public loginPage(WebDriver driver)
	{
		this. driver = driver;
		
	}
	
	
	By userName=By.id("username");
	By passWord=By.id("password");
	By SignIn=By.xpath("//*[@id='login1']/p[6]/input");

	public void Login (String username, String password)
	
	{
		 driver.findElement(userName).sendKeys(username);
		 driver.findElement(passWord).sendKeys(password);
		 driver.findElement(SignIn).click();
		 driver.findElement(SignIn).click();
	}


	
}
