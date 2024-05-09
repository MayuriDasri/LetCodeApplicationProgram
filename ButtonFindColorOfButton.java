package LetCodePrograming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class ButtonFindColorOfButton {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/buttons");
		
		WebElement getcolor = driver.findElement(By.id("color"));
		String buttoncolor = getcolor.getCssValue("color");
		
	
		
		String hex = Color.fromString(buttoncolor).asHex();
	  //  java.awt.Color c = stringToColor(hex);
		
		System.out.println("Button of the color is : "+buttoncolor +" and color Name is :"+hex);

	}

}
