package LetCodePrograming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonNavigation {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/buttons");
		
		WebElement gotoHomeButton = driver.findElement(By.id("home"));
		gotoHomeButton.click();
		//1st Method 
		Thread.sleep(1000);
		driver.navigate().back();
		driver.navigate().refresh();
		
		
		/* //2nd Method: 
		WebElement workSpaceLink = driver.findElement(By.linkText("Work-Space"));
		workSpaceLink.click();
		Thread.sleep(1000);
		
		WebElement buttonClick = driver.findElement(By.linkText("Click"));
		buttonClick.click(); */
		
		
		
		

	}

}
