package com.namtg.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class patientPage {
WebDriver driver;
	
	public patientPage(WebDriver driver)
	{
		this. driver = driver;
		
	}
	
	By patient=By.xpath("html/body/div[1]/div/div[1]/div/ul/li[5]/a");
	By search_Field=By.id("search");
	By search_Button=By.xpath("//*[@id='tfheader']/input[2]");
	By patient_Link=By.xpath("//*[@id='show']/table/tbody/tr/td[1]/a");

	
	public void patient_Tab() throws InterruptedException
	
	{
	Thread.sleep(3000);
	 driver.findElement(patient).click();
	 Thread.sleep(2000);
	 driver.findElement(search_Field).sendKeys("Mike");
	 driver.findElement(search_Button).click();
	 Thread.sleep(2000);
	 driver.findElement(patient_Link).click();
		
	}
	
}
	