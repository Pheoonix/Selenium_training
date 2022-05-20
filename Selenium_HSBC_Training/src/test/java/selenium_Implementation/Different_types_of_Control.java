package selenium_Implementation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Different_types_of_Control {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();//webdriver object
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		driver.manage().window().maximize();
		
		List<WebElement> in = driver.findElements(By.xpath("//input[@name='lang' and @type='radio']"));
		
		for(int i = 0; i<in.size();i++) {
			WebElement lo = in.get(i);
			String so = lo.getAttribute("value");
			System.out.println("Values from radio buttons are "+so);
			
			if(so.equalsIgnoreCase("PYTHON")) {
				lo.click();
			}
		}
		
		List<WebElement> chkb = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(int i = 0; i<chkb.size();i++) {
			WebElement el = chkb.get(i);
			String id = el.getAttribute("id");
			
			Thread.sleep(3000);
			
			if(id.equalsIgnoreCase("code")) {
				el.click();
				break;
			}
		}
	}

}
