package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriver1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Eclipse\\Software\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://mail.google.com");
		
		
		WebElement email = driver.findElement(By.xpath(".//*[@id='Email']"));
		email.clear();
		email.click();
		email.sendKeys("vishalgalave89@gmail.com");
		
		
		WebElement nextButton = driver.findElement(By.xpath(".//*[@id='next']"));
		nextButton.click();
		
		Thread.sleep(1000);
				
		WebElement passwd = driver.findElement(By.xpath(".//*[@id='Passwd']"));
		passwd.clear();
		passwd.click();
		passwd.sendKeys("mht26589");
		
		WebElement signIn = driver.findElement(By.xpath(".//*[@id='signIn']"));
		signIn.click();
		
		
		
		
		
	}

}
