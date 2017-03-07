package selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	
	public static void main(String args[]){
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Eclipse\\Software\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.wikipedia.org/");
		System.out.println(driver.getTitle());
		
				
		WebElement dropdown = driver.findElement(By.xpath(".//*[@id='searchLanguage']"));
		Select select = new Select(dropdown);
		List<WebElement> option = select.getOptions();
		int size = option.size();
		System.out.println(size);
		
		for(int i=0; i<size;i++){
		
		String lang = option.get(i).getText();
		System.out.println(lang);
		
			
		}
		
	}

}
