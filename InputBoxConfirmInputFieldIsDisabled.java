package LetCodePrograming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputBoxConfirmInputFieldIsDisabled {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/edit");
		
		WebElement noEdit = driver.findElement(By.id("noEdit"));
		
		boolean flag = noEdit.isEnabled();
		
		System.out.println(flag);
		
		if(flag == true)
		{
			System.out.println("Confirm Edit box is Enabled");
		}
		else
		{
			System.out.println("Confirm Edit box is Disables");
		}

	}

}
