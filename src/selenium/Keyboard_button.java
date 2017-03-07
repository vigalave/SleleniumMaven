package selenium;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Keyboard_button {
	
	
	@Test
	public void enterScrollUpDown() throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Eclipse\\Software\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/?gfe_rd=cr&ei=lza5WKfsEM_y8AfCprzABw");
		
		WebElement textbox = driver.findElement(By.id("gs_htif0"));
		textbox.sendKeys("hcnbnsgsh");
		textbox.sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
		
		WebElement page = driver.findElement(By.xpath(".//*[@id='hdtb-tls']"));
		page.sendKeys(Keys.ARROW_DOWN);
		page.sendKeys(Keys.ARROW_DOWN);
	
		
		Thread.sleep(5000);
		
		page.sendKeys(Keys.ARROW_UP);
		
	}
		
		@Test
		public void substring(){
		String name = "VishalGalave";
		
		String word1 = name.substring(0, 6);
		String word2 = name.substring(6, 12);
		
		System.out.println(word1+" "+ word2);
		
		
		
		}
		
	
	

}
