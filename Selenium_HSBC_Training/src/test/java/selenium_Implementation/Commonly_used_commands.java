package selenium_Implementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Commonly_used_commands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();//webdriver object
		driver.manage().window().maximize();
		
		driver.get("https://google.com");
		
		//get title
		String Title = driver.getTitle(); 
		System.out.println(Title);
		
		//get url
		String CurrentUrl = driver.getCurrentUrl();   
		System.out.println(CurrentUrl);
		
		//get page source
		String PageSource = driver.getPageSource();
		//System.out.println(PageSource);
		
		boolean result = driver.getPageSource().contains("String to find");
		System.out.println(result);
		
		System.out.println("Successfully automated!!!");
		Thread.sleep(3000);
		driver.close();
	}

}
