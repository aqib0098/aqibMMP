package com.namtg.pages;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class add_Prescription {
WebDriver driver;
	
	public add_Prescription(WebDriver driver)
	{
		this. driver = driver;
		
	}
	//WebDriverWait wait = new WebDriverWait(driver, 60);
	By addPrescriptionlnk=By.xpath("//*[@id='container_body']/p[2]/a/input");
	By prescriptionName =By.id("exampleInputcardnumber1");
	By prescriptionDescription=By.xpath("html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/form/div[4]/textarea");
	By submit=By.xpath("html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/form/input");
	
	public void clickAddPrescriptionTab()
	
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(addPrescriptionlnk)).click();
		//driver.findElement(addPrescriptionlnk).click();
		
	}
	public void verifyTheTitle()
	
	{
		String Actual = "Prescriptions Details";
		String expected = "Prescriptions Details";
		assertEquals(Actual, expected,"it does not match");
		System.out.println(expected);
		
	}
	public void prescriptionName()
	
	{
		 driver.findElement(prescriptionName).sendKeys("Test");
		
	}
	public void prescriptionDescription()
	
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(prescriptionDescription)); 
		driver.findElement(prescriptionDescription).sendKeys("123 test");
	}
	public void submit()
	
	{
		 driver.findElement(submit).click();
		
	}
	
	}
