package test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.internal.EventFiringMouse;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class EventFiring {
	
	
	@Test
	public void eventTest() throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Eclipse\\Software\\geckodriver.exe");
		DesiredCapabilities capabilities=DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		WebDriver webdriver = new FirefoxDriver(capabilities);
		webdriver.manage().window().maximize();
	
	EventFiringWebDriver driver = new EventFiringWebDriver(webdriver);
	Event event =  new Event();
	
	driver.register(event);
	
	driver.get("https://www.google.com");
	
	WebElement advertise = driver.findElement(By.xpath(".//*[@id='fsl']/a[1]"));
	
	advertise.click();
	
	/*WebDriverWait wait = new WebDriverWait(driver, 5L);
	wait.until(ExpectedConditions.presenceOfElementLocated(locator)
	*/
	//driver.manage().timeouts().pageLoadTimeout(5L, TimeUnit.SECONDS);
	
	Thread.sleep(5000);
	driver.navigate().back();
	Thread.sleep(5000);
	
	EventFiringMouse mouse = new EventFiringMouse(driver, event);
	
	Locatable elementToHover = (Locatable) driver.findElement(By.xpath("//*[@id='_eEe']/a[4]"));
	Thread.sleep(2000);
	Coordinates elementToHoverCord = elementToHover.getCoordinates();
	try{
		
		//System.out.println("hello shubhangi"+elementToHoverCord);
		
	mouse.mouseMove(elementToHoverCord);
	}catch (Throwable t){
		
		t.printStackTrace();
	}
	
	
	System.out.println("hoverComplete");
	
	
	
	}

}
