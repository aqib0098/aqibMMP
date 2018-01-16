package com.namtg.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class reports {
	WebDriver driver;

	public reports(WebDriver driver)
	{
	this. driver = driver;
	}

	public void clickOnTheReportsTab ()
	{
		driver.findElement(By.xpath("//*[@id='container_body']/p[4]/a/input")).click();
	}

	public void verifyTheTitle ()
	{
		String Actual = "Reports Details";
		String expected = "Reports Details";
		assertEquals(Actual, expected,"it does not match");
		System.out.println(expected);
	}
	public void selectAppointments ()
	{
		Select Date = new Select(driver.findElement(By.tagName("select")));
		Date.selectByVisibleText("12/28/2017");
	}
	public void reportName (String reportName)
	{
		driver.findElement(By.id("exampleInputcardnumber1")).sendKeys(reportName);
	}
	public void WriteReportDescription (String WriteReportDescription )
	{
	driver.findElement(By.id("html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/form/div[5]/textarea")).sendKeys(WriteReportDescription);
	}
	public void submit ()
	{
	driver.findElement(By.id("html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/form/input[2]")).click();
}
}