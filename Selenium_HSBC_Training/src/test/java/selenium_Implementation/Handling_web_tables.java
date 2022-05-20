package selenium_Implementation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_web_tables {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();//webdriver object
		driver.manage().window().maximize();
		
		//Webtables handling
		driver.get("https://www.ncertbooks.guru/scientific-name-of-flowers/");
		for(int numberOfRows=1; numberOfRows<=12; numberOfRows++)
		{
		for(int numberOfCol=1; numberOfCol <=3; numberOfCol++)
		{
		System.out.println(driver.findElement(By.xpath("//*[@id=\"post-36862\"]/div/div[2]/table/tbody/tr["+numberOfRows+"]/td["+numberOfCol+"]")).getText());
		
		}
		}	
		
		System.out.println("Successfully automated!!!");
		Thread.sleep(3000);
		driver.close();
	}

}
