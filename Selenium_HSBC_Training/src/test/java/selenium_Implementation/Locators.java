package selenium_Implementation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver =  new ChromeDriver();
			driver.manage().window().maximize();

			driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804791%7Ce%7Cfacebook%7C&placement=&creative=550525804791&keyword=facebook&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-1001394929%26loc_physical_ms%3D1007828%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIkcXJ7OHr9wIVwcmWCh0tfwKMEAAYASAAEgIuFvD_BwE");
			
			driver.findElement(By.name("firstname")).sendKeys("Abcd"); 
			driver.findElement(By.name("lastname")).sendKeys("Wxyz");
			driver.findElement(By.name("reg_email__")).sendKeys("abcd@gmail.com");
			driver.findElement(By.name("reg_email_confirmation__")).sendKeys("abcd@gmail.com");
			
			
			driver.findElement(By.id("password_step_input")).sendKeys("12345");
			driver.findElement(By.xpath("//*[@id=\"day\"]/option[29]")).click();
			driver.findElement(By.xpath("//*[@id=\"month\"]/option[3]")).click();
			driver.findElement(By.xpath("//*[@id=\"year\"]/option[24]")).click();
			
			Thread.sleep(1000);
			driver.findElement(By.name("sex")).click();
			driver.findElement(By.tagName("button")).click();
			
			
			driver.navigate().to("https://trytestingthis.netlify.app/");
			
			
			driver.findElement(By.cssSelector("#fname")).sendKeys("Abcd");
			driver.findElement(By.cssSelector("#lname")).sendKeys("Wxyz");
			
			System.out.println("Successfully automated!!!");
			Thread.sleep(1000);
			driver.close();
			
			
		}
}
