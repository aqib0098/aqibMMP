package com.namtg.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class create_Fee {
	

	WebDriver driver;

	public create_Fee(WebDriver driver)
	{
	this. driver = driver;
	}

	By createVisit=By.xpath("//*[@id='container_body']/p[3]/a/input");
	By Submit=By.xpath("html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/form/input");
	
	public void clickOnTheCreateFeeTab() 
	
	{
		driver.findElement(createVisit).click();
	}
	public void verifyTheTitle() 
			
	{
	String Actual = "Fee Details";
	String expected = "Fee Details";
	assertEquals(Actual, expected,"it does not match");
	System.out.println(expected);

	}
	public void submit()
	{
		driver.findElement(Submit).click();
	}
	}