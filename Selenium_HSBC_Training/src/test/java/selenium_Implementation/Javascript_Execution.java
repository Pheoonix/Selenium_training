package selenium_Implementation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_Execution {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();//webdriver object
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("alert('welcome')");
		
		Thread.sleep(5000);
		js.executeScript("prompt('Enter your name')");
		
		Thread.sleep(30000);
		js.executeScript("confirm('Are you sure?')");
		
		Thread.sleep(5000);
		driver.close();
	}

}
