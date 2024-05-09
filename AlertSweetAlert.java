package LetCodePrograming;

import java.time.Duration;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertSweetAlert {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/alert");
		
		WebElement modernAlert = driver.findElement(By.id("modern"));
		modernAlert.click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println(alertText);
		
		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(50));
		wait1.until(ExpectedConditions.alertIsPresent());
		
		WebElement closeAlert = driver.findElement(By.xpath("//button[@class='modal-close is-large']"));
		closeAlert.click();
		
		//driver.switchTo().defaultContent();
		
		alert.dismiss();
		
	}

}
