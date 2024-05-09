package LetCodePrograming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelectAppleFromDropDowm {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropdowns");

		WebElement dropDownList = driver.findElement(By.id("fruits"));
		Select select = new Select(dropDownList);
		select.selectByVisibleText("Apple");
		select.selectByVisibleText("Mango");
		select.selectByVisibleText("Pine Apple");

		Thread.sleep(1000);
			
		
	}

}
