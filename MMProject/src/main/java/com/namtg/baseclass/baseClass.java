package com.namtg.baseclass;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.namtg.pages.loginPage;
import com.namtg.pages.patientPage;

public class baseClass {
	
	protected WebDriver driver;
	 String url="http://96.84.175.78/MMP-Release2-Admin-Build.2.1.000/login.php";
	 
	// maria 
	@BeforeMethod
	public void login_Page() throws InterruptedException
	{
		
		System.setProperty("webdriver.gecko.driver","D:\\Users\\MIFTIKH\\OneDrive - EEOC\\_UPF\\Desktop\\geckodriver.exe");
		driver= new FirefoxDriver();
		
		loginPage login = new loginPage(driver);
		patientPage patient = new patientPage (driver);
		
		driver.get(url);
		// Enter the username 
		// Enter the Password 
		// Click on the Login Button
		login.Login("Roger@101", "Roger_101");
		
		// Click on the Patient tab 
		// Enter the patient name 
		// Click on the Search Button 
		// Click on the Patient Name 
		patient.patient_Tab();
		
}
	@AfterMethod
	public void Quite()
	{
		driver.quit();
	}



}



