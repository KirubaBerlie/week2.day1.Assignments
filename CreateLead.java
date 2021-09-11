package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


/*
1. Launch URL "http://leaftaps.com/opentaps/control/login"
2. Enter UserName and Password  
3. Click on Login Button 
4. Click on CRM/SFA Link
5. Click on Leads Button
6. Click on create Lead Button 
7. Enter all the text fields in CreateLead page
     **Note
          1. Donot work on Parent Account Field
          2.Enter the Birthdate using SendKeys
8. Enter all the text fields in contact information 
9. Enter all the text fields in primary address
10. Get the Firstname and print it 
11. Click on create Lead Button 
12. Get and Verify the Title of the resulting Page(View Lead)
*/

public class CreateLead {
	
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();

		//To get Title and display in console
		driver.get("http://leaftaps.com/opentaps/control/main");
		String title = driver.getTitle();
		System.out.println("title " + title);
		//User Name
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("demosalesmanager");
		
		
		//Password
		WebElement passWord = driver.findElement(By.id("password"));
		passWord.sendKeys("crmsfa");
		
		//Click on Submit button
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		 
		
		// Personal Information		
		// Company Name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
		
		//first Name and Last name  - Mandatory
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		firstName.sendKeys("Kiruba");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Berlie");
		
		//first Name and Last name Local
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Kiruba");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Berlie");
				
		//Birth date
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("11/09/2021");
		
		//Title
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Test Lead");
		
		//Salutation
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mrs");
		
		// department
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		
		//annual revenue
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("30000");
		
		//number of employees
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("10");
		
		//SIC code
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("2070");
		
		//Ticker Symbol
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("yes");
		
		//Description
		driver.findElement(By.id("createLeadForm_description")).sendKeys("test program");
		
		//Important Notice
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("selenium-java");
		
				
		//Contact Information 
		//CountryCode
		WebElement countryCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		countryCode.clear();
		countryCode.sendKeys("4");
		
		//Area Code
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("044");
		
		//Phone Number 
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("457896");
		
		//Extension
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("111");
		
		//Person to ask for
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("xxxx");
		
		//E-mail address
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("testabc@gmail.com");
		
		// webURL
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.abc.com");
		
		
		
		//Primary Address
		//To Name
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("XYZ");
		
		//Attention name
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Atttn Name");
		
		//Address Line 1
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Add1");
		
		//AddressLine 2
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Address 2");
		
		
		//City
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("City 2");
		
		//State
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("Texas");
		
		//Postal code 
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("12345");		
	
		//Zip/postal code extension
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("888");
		
			
		
		//Get the First NAme and Print it
		System.out.println("First Name: "+ firstName.getAttribute("value"));
		
		//Click on Create Lead Button
		driver.findElement(By.className("smallSubmit")).click();

				
		String title2 = driver.getTitle();
		if (title2.equals("View Lead | opentaps CRM"))
				System.out.println("Title of the page is Verified"+ title2);
		else
				System.out.println("Unexpected page loaded" + title2 );
		
		driver.close();

	}

}
