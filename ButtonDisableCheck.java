package LetCodePrograming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonDisableCheck {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/buttons");
		
		WebElement buttonProperty = driver.findElement(By.id("isDisabled"));	
		
		
		
		if(!buttonProperty.isEnabled())
		{
			System.out.println("Button is Disabled");
		}
		else
		{
			System.out.println("Button is Enabled");
		}
	}

}
