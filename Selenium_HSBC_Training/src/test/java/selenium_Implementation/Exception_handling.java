package selenium_Implementation;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exception_handling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();//webdriver object
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		
		try
		{
		driver.get("https://www.google.com/");	
		System.out.println("Entered to the Page");

		}catch(Exception e)
		{
			System.out.println("Page Not Found");
			Assert.fail();
		}
		
		
		try
		{
		String expectedTitle="Google";
		String actualTitle=driver.getTitle();
		
		
		Assert.assertEquals(expectedTitle,actualTitle);
		System.out.println("Actual Page Title: "+actualTitle);
		}catch(Exception e)
		{
			System.out.println("Different Page Title");
			Assert.fail();
		}
		
		try 
		{
			WebElement s = driver.findElement(By.name("q"));
					s.sendKeys("Flowers", Keys.ENTER);
		}catch(Exception e) {
			System.out.println("Time Out!!!");
			Assert.fail();
		}
		
		System.out.println("Successfully automated!!!");
		
		Thread.sleep(3000);
		driver.close();
	}

}
