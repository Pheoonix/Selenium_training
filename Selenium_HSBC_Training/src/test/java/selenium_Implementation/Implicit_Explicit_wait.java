package selenium_Implementation;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Implicit_Explicit_wait {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//Implicit wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("txtUsername")).sendKeys("selenium");
		driver.findElement(By.id("txtPassword")).sendKeys("selenium");
		driver.findElement(By.id("Mukesh")).sendKeys("selenium"); //no such element: exception
		
		
		//Explicit wait
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.findElement(By.xpath("//button[text() = 'Click me to start timer']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 22);
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5)); //object of webdriverwait
		WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']"))); //using webdriver we used until method 
		
		//WebElement e = driver.findElement(By.xpath("//p[text()='WebDriver']"));
		boolean status = e.isDisplayed();
		if(status==true) {
			System.out.println("Element is displayed");
		}
		else {
			System.out.println("Element not displayed");
		}
		
	}

}
