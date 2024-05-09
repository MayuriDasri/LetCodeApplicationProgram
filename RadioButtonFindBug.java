package LetCodePrograming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class RadioButtonFindBug {
	
	WebDriver driver;
	
	@AfterTest
	public void driverQuit() {
		driver.quit();
	}
	
	@Test
	public void findBug()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/radio");
		
		WebElement yesButton = driver.findElement(By.id("nobug"));
		WebElement noButton = driver.findElement(By.id("bug"));
		
		yesButton.click();
		boolean yes;
		
		if(yesButton.isSelected() && !noButton.isSelected()) {
			yes = true;
		}
		else
			yes = false;
	
		System.out.println("Confirm Yes : "+yes);
		
		
		noButton.click();
		boolean no;
		if(yesButton.isSelected() && noButton.isSelected()) {
			no = true;
		}
		else
			no = false;
		
		System.out.println("Confirm No : "+no);
		
		Assert.assertEquals(yes, no, "Bug :Two Radio Button Got Selected ata a time");
		//System.out.println("Only one Button is Selected");
		
	}

}

