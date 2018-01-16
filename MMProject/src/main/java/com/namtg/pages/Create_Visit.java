package com.namtg.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Create_Visit {
	
	WebDriver driver;

	public Create_Visit(WebDriver driver)
	{
	this. driver = driver;
	}
	
	public void clickOnTheCreatVist()
	{
		driver.findElement(By.xpath("//*[@id='container_body']/p[1]/a/input")).click();
	}
	public void clickOnTheBookAppointment()
	{
		driver.findElement(By.xpath("//*[@id='opener']")).click();
	}
	public void veriftyTheTitle()
	{
		String Actual = "Book Apointment";
		String expected = "Book Apointment";
		assertEquals(Actual, expected,"it does not match");
		System.out.println(expected);

	}
	public void selectDate()
	{
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("document.getElementById('id').value='1988-01-01'");	
	}
	
	
	public void selectTime()
	{
	
	Select SelectTime = new Select(driver.findElement(By.xpath("//*[@id='time']")));
	SelectTime.selectByVisibleText("10Am");
	}

}
