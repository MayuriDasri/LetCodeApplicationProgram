package LetCodePrograming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputBoxGetText {

	public static void main(String[] args) {
		
	//	getMe
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/edit");
		
		WebElement getTextFromInput = driver.findElement(By.id("getMe"));
		String inputBoxText = getTextFromInput.getAttribute("value");
		
		System.out.println(inputBoxText);

	}

}
