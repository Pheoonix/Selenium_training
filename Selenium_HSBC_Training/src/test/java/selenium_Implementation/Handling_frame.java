package selenium_Implementation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_frame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();//webdriver object
		driver.manage().window().maximize();
		
		//Frame handling
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		
		List<WebElement> frameList=driver.findElements(By.tagName("iframe"));
		System.out.println(frameList.size());
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().frame(2);
		
		driver.findElement(By.xpath("//*[@id=\"portfolio_items\"]/div[1]")).click();
		
		System.out.println("Successfully automated!!!");
		Thread.sleep(3000);
		driver.close();
	}

}
