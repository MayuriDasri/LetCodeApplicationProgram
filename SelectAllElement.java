package LetCodePrograming;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectAllElement {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/selectable");
		
		List<WebElement> options = driver.findElements(By.id("clour"));
		
		Actions action = new Actions(driver);
		/*JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0,100);");*/

		for(WebElement option : options)
		{
			action.keyDown(Keys.CONTROL).click(option).keyUp(Keys.CONTROL)
			.build().perform();
			
		}
	
	}
	

}
