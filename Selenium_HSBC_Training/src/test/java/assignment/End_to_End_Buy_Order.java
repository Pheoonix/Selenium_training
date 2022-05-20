package assignment;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class End_to_End_Buy_Order {

	public static void main(String[] args) {
		
		//Initialization
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		Actions action = new Actions(driver);
		
		
		//Opening Website
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize(); //Maximizing the window
		System.out.println("Window Maximized");
      
		
		//Signing in to the site
		WebElement hoverm = driver.findElement(By.className("login"));
		action.moveToElement(hoverm).click().perform(); //click to the sign in button
		System.out.println("Signed in to the site");
		
		
		//signin credentials
		driver.findElement(By.id("email")).sendKeys("2parimeta@gmail.com");
		WebElement keyid = driver.findElement(By.id("passwd"));
		keyid.sendKeys("12345", Keys.ENTER);
		System.out.println("Credential Entered");
		
		
		//Hover cursor over Women's link 
		WebElement menu= driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
		action.moveToElement(menu).perform();
		System.out.println("Moved to womens section");
		
		
		//Click Tshirt under women's link
		driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]/a")).click();
		System.out.println("Clicked Tshirt under Women's link");
		
		
		//Hover Mouse on the second product displayed.
		WebElement tsh = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]"));
		action.moveToElement(tsh).perform();
		System.out.println("Moved to Second Product");
		
		
		//Clicking on 'More' button under product
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[2]/span")).click();
		System.out.println("Clicked more under product");
		
		
		//Increase quantity to 2.
		driver.findElement(By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]/span/i")).click();
		System.out.println("Increased quantity to 2");
		
		
		//Select size 'L'
		WebElement drop = driver.findElement(By.id("group_1"));
		Select size = new Select(drop); 
		size.selectByVisibleText("L");
		System.out.println("Selected L");
		

		
		//Select color
		driver.findElement(By.id("color_14")).click();
		System.out.println("Color selected");
		

		//Click 'Add to Cart' button
		driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button")).click();
		System.out.println("Item added to cart");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// implicit wait
		
		//Click 'Proceed to checkout' button
		driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")).click();	
		System.out.println("Proceeded to checked out");
		
		System.out.println("Website Successfully Automated!!!");
		
		
		//Close and end the session
		driver.close();
		driver.quit();
	}

}