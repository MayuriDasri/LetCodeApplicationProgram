package LetCodePrograming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class RadioButtonSelectAnyOne {
	
	WebDriver driver=null;
	
	@AfterTest
	public void driverQuit()
	{
		driver.quit();
	}
	@Test	
	public void selectAnyOne()  {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/radio");
		
		
		WebElement yesButton = driver.findElement(By.id("yes"));
		WebElement noButton	= driver.findElement(By.id("no"));
		
		yesButton.click();
		
		if(yesButton.isSelected()==true && noButton.isSelected()!=true)
		{
			Assert.assertTrue(true, "Only Yes Button is Selected");
		}
		else
		{
			noButton.click();
		}

	}

}
