
package LetCodePrograming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemoTwo {
	
		public static void main(String args[])
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://jqueryui.com/draggable/");
			
			Actions actions = new Actions(driver);
			
			
			WebElement dropOption = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
			int height = dropOption.getSize().getHeight();
			int width = dropOption.getSize().getWidth();
			System.out.println("height :" + height +" Widht : "+width); 
			driver.switchTo().frame(0);
			
			
			WebElement dragOption = driver.findElement(By.xpath("//div[@id='draggable']"));
			
			actions.pause(1000).dragAndDropBy(dragOption, height-10, width-10).perform();
			
			
			  
			
			
		}
		

	}
