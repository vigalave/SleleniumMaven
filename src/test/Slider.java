package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Slider {
	
	@Test
	public void sliderTest() throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Eclipse\\Software\\geckodriver.exe");
		DesiredCapabilities capabilities=DesiredCapabilities.firefox();
		FirefoxProfile profile = new FirefoxProfile();
		capabilities.setCapability(FirefoxDriver.PROFILE, profile);
		capabilities.setCapability("marionette", true);
		WebDriver driver = new FirefoxDriver(capabilities);
		driver.manage().window().maximize();
		
		
		driver.get("https://www.flipkart.com");
		
		
		//Thread.sleep(5000);
		//driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		WebElement mainMenuEle = driver.findElement(By.xpath(".//*[@id='container']//span[text()='Electronics']"));
		mainMenuEle.click();
		
		Thread.sleep(2000);
		
		WebElement subMenuMouse = driver.findElement(By.xpath(".//*[@id='container']/div/header/div[2]/div/ul/li[1]/ul/li/ul/li[3]/ul/li[6]/a/span"	));
		subMenuMouse.click();
		
		Thread.sleep(3000);
		try{
		WebElement slider = driver.findElement(By.xpath(".//*[@id='container']/div/div[2]/div[2]/div/div[1]/div/div/div[2]/section/div[3]/div[1]/div[1]/div"));
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		//action.clickAndHold(slider).moveByOffset(50, 0).release().build().perform();
		
		action.dragAndDropBy(slider,100,0).build().perform();
		}catch(Throwable t){
			System.out.println("Error");
			t.printStackTrace();
		}
		
		
		
	}
	
	
	

}

