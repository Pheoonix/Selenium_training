package selenium_Implementation;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804791%7Ce%7Cfacebook%7C&placement=&creative=550525804791&keyword=facebook&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-1001394929%26loc_physical_ms%3D1007828%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIkcXJ7OHr9wIVwcmWCh0tfwKMEAAYASAAEgIuFvD_BwE");
		
		WebElement dateDrop = driver.findElement(By.id("day"));
		WebElement monthDrop = driver.findElement(By.id("month"));
		WebElement YearDrop = driver.findElement(By.id("year"));
		
		
		//object of select class
		Select dated = new Select(dateDrop);  
		Select monthd = new Select(monthDrop);
		Select yeard = new Select(YearDrop);
		
		
		//select date 29
		dated.selectByIndex(28);
		
		Thread.sleep(3000);
		
		//select month March
		monthd.selectByVisibleText("Mar");  //it is case sensitive
		
		WebElement selectedvl2 = monthd.getFirstSelectedOption();
		//return March
		System.out.println("Selected value "+selectedvl2.getText());
		
		//Assertion point
		String expected_title = "Mar";
		Assert.assertEquals(expected_title, selectedvl2.getText());
		
		Thread.sleep(3000);
		
		//select year 1999
		yeard.selectByValue("1999");
		
		
		//
		List<WebElement> monthlist = monthd.getOptions();
		int totlm = monthlist.size();
		System.out.println("Total months"+totlm);
		
		
		//fails if months not equal to 12
		Assert.assertEquals(totlm, 12);
		
		
		for(WebElement e : monthlist) {
			System.out.println(e.getText());
		}
		
		
		monthd.getAllSelectedOptions();
		
		
		Thread.sleep(3000);
		System.out.println("Automated successfully");
		driver.close();
		
	}

}
