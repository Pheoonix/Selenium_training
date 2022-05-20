package selenium_Implementation;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alerts_Popups {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();//webdriver object
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		
		//Use of dynamic element
		
		//Clicking alert button for getting alert
		driver.findElement(By.id("alertButton")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Alert alert = driver.switchTo().alert();
	    alert.accept();
		
		//Clicking prompt button for getting alert
		driver.findElement(By.id("promtButton")).click();
		
		Alert promptAlert  = driver.switchTo().alert();
		String alertText = promptAlert.getText();
		System.out.println("Alert text is " + alertText);
		   
		Thread.sleep(2000);
		
		//Send some text to the alert 
		promptAlert.sendKeys("Anumeta");
		promptAlert.accept();
		
		driver.findElement(By.id("confirmButton")).click();
		//Cancel confirmation
		Alert confirm = driver.switchTo().alert();
	    confirm.dismiss();
	    
	    System.out.println("Successfully automated!!!");
	    Thread.sleep(3000);
	    driver.close();
	}

}
