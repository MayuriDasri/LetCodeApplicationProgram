package LetCodePrograming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ButtonClickAndHold {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/buttons");
		
		//(//button[contains(@class,'button is-primary')])[1]
		WebElement holdButton = driver.findElement(By.id("isDisabled"));
		Actions actions = new Actions(driver);
        
        // Click and hold on the button
        actions.clickAndHold(holdButton).perform();
        
        String buttonText = holdButton.getText();       
        System.out.println(buttonText);
        
        // Release the button (to complete the click and hold action)
        actions.release().perform();
        

	}

}
