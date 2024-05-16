package LetCodePrograming;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SliderDemo {
	@Test
	public void countTexAndNumber() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://letcode.in/slider");
		
		WebElement slider = driver.findElement(By.xpath("//input[@id ='generate']"));
		Actions actions = new Actions(driver);
		
		actions.dragAndDropBy(slider, 100, 0).perform();
		Thread.sleep(3000);
		
		
		WebElement countryButton = driver.findElement(By.xpath("//button[normalize-space()='Get Countries']"));
		countryButton.click();
		
		WebElement wordLimitElement = driver.findElement(By.xpath("//div[@class='has-text-centered']/h1"));
		String wordLimitText = wordLimitElement.getText();
		String wordLimitNumber = wordLimitText.substring(13).trim();
		int wordLimitCount = Integer.parseInt(wordLimitNumber);
		System.out.println("Word Limit Number : "+ wordLimitCount );
		
		WebElement countryNames = driver.findElement(By.xpath("//p[@class='has-text-primary-light']"));
		String names = countryNames.getText();
		System.out.println("Country Name: "+ names);
		
		String[] strArray = names.split("-");
		int countryCount = strArray.length;
		System.out.println("Country Count : "+ countryCount);
		
		Assert.assertEquals(wordLimitCount, countryCount,"Test Passessss");
		
		driver.quit();
	}
}
