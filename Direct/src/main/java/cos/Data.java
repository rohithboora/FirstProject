package cos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized;

import java.io.IOException;
import java.util.*;
import java.io.*;

//import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
@RunWith(value = Parameterized.class)

public class Data {
	
	private static WebDriver driver;	
	private String Email;
	private String Password;

	
	@Parameters
public static Collection testData() throws IOException {

	 return getTestData("C:\\Desktop\\data.csv");

	}
	
	public static Collection<String[]> getTestData(String fileName) throws IOException {
		List<String[]> records = new ArrayList<String[]>();
		String record;
		BufferedReader file = new BufferedReader(new FileReader(fileName));
			 while ((record=file.readLine())!=null) 
			 {
			 String fields[] = record.split(",");
			 records.add(fields);
			 }
			 file.close();
			 return records;
			}
	


public Data(String Email, String Password)
			{
			 this.Email = Email;
			 this.Password = Password;
			}
@Test
	public void testBMICalculator() throws Exception {
	 //Get the Height element and set the value using parameterised 
	 //height variable
	 WebElement Username = driver.findElement(By.id("signin-email"));
	 Username.clear();
	 Username.sendKeys(Email);
	 //Get the Weight element and set the value using parameterised 
	 //Weight variable
	 WebElement Pass = driver.findElement(By.id("signin-password"));
	 Pass.clear();
	 Pass.sendKeys(Password);
	 //Click on Calculate Button
	 WebElement siginButton = driver.findElement(By.id("signin-button"));
	 siginButton.click();
	/* try {
	 //Get the Bmi element and verify its value using parameterised 
	 //bmi variable
	 WebElement bmiLabel = driver.findElement(By.name("bmi"));
	 assertEquals(bmi, bmiLabel.getAttribute("value"));
	 //Get the Bmi Category element and verify its value using 
	 //parameterised bmiCategory variable
	 WebElement bmiCategoryLabel = driver.findElement(By.name("bmi_category"));
	 assertEquals(bmiCategory,bmiCategoryLabel.
	 getAttribute("value"));
	 } catch (Error e) {
	 //Capture and append Exceptions/Errors
	 verificationErrors.append(e.toString());
	 System.err.println("Assertion Fail "+ verificationErrors.toString());
	 }*/

	}
}
