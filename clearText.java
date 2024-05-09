package LetCodePrograming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clearText {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/edit");

		WebElement clearTextBox = driver.findElement(By.id("clearMe"));
		clearTextBox.clear();
		
		Thread.sleep(1000);
		driver.close();
	}

}
