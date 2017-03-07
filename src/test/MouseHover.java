package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.internal.EventFiringMouse;

public class MouseHover {

	@Test
	public void mouseHoverTest() throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Eclipse\\Software\\geckodriver.exe");
		DesiredCapabilities capabilities=DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		WebDriver webdriver = new FirefoxDriver(capabilities);
		webdriver.manage().window().maximize();
	
		EventFiringWebDriver driver = new EventFiringWebDriver(webdriver);
		Event event =  new Event();
	
		driver.register(event);
	
	//driver.get("https://www.google.com");
	
	
		EventFiringMouse mouse = new EventFiringMouse(driver, event);
		driver.get("https://www.google.com");
		Locatable elementToHover = (Locatable) driver.findElement(By.xpath(".//*[@id='_eEe']/a[4]"));
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
