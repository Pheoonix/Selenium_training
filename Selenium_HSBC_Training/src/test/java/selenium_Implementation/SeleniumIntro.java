package selenium_Implementation;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				String url = "http://www.facebook.in/";
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();//webdriver object
				driver.manage().window().maximize();
				driver.get(url); //or driver.nevigate.to will take you to the site
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.manage().timeouts().setScriptTimeout(2, TimeUnit.MINUTES);
				driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

//				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//				driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
//				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
				driver.close();
	}

}
