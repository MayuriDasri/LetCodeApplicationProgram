package LetCodePrograming;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputBoxSendkeys2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/edit");
		
		WebElement getTextInput = driver.findElement(By.id("join"));
		
		//1st Way to append string in inputBox 
		getTextInput.sendKeys("Mayuir Katkam");
		getTextInput.sendKeys(Keys.TAB);
		
		
		//2nd Way to append string in inputBox
		/*String InputBoxText = getTextInput.getText();
		String AppendString = InputBoxText+" This is new append String";
		getTextInput.sendKeys(AppendString);
		getTextInput.sendKeys(Keys.TAB);
		 */
		

	}

}
