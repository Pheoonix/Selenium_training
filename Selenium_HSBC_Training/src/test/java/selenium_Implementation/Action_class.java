package selenium_Implementation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_class {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();//webdriver object
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.qafox.com/selenium/selenium-practice/");
		Actions action = new Actions(driver); 
		WebElement e = driver.findElement(By.xpath("//*[@id=\"custom_html-7\"]/div/ul/li[1]/a"));
		action.moveToElement(e).click().perform();

		
		WebElement f = driver.findElement(By.xpath("//*[@id=\"menu-item-1073\"]/a"));
		action.moveToElement(f).perform();
		
		
		driver.findElement(By.xpath("//*[@id=\"menu-item-2096\"]/a")).click();
		
		Thread.sleep(3000);
		driver.quit();
		}

}
