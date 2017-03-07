package test;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import selenium.Constant;


	@RunWith(Parameterized.class)
	public class Parameter_testcase {
	
		String a;
		String b;
		String c;
		String d;
	
	
		public Parameter_testcase(String a, String b, String c, String d){
	
			this.a=a;
			this.b=b;
			this.c=c;
			this.d=d;
		}


		@Parameters
		public static Collection<Object[]> getData(){
	
			Object[][] data = new Object[2][4];
	
			data[0][0]="vishalgalave89@gmail.com";
			data[0][1]= "mht26589";
			data[0][2]= "logged in with user smart Vishal";
			data[0][3]= ".//*[@id='gb']//*[contains(@Title,'(vishalgalave89@gmail.com)')]";
			
			
			data[1][0]= "kalel.shubhangi@gmail.com";
			data[1][1]= "$hubhk.31_3,89";
			data[1][2]= "logged in with user gorgeous Shubhangi";
	        data[1][3]= ".//*[@id='gb']//*[contains(@Title,'(kalel.shubhangi@gmail.com)')]";
	        
			return Arrays.asList(data);
	
		}
		
		@Test
		public void doLogin() throws InterruptedException{
			
			WebDriver driver = null;
			String browserName = Constant.browser.toLowerCase();
			 switch(browserName) {
			        case "chrome":
			            driver = new ChromeDriver();
			            break;

			        case "firefox" :
			        	System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Eclipse\\Software\\geckodriver.exe");
			            driver = new FirefoxDriver();
			            break;

			        case "ie":
			            driver = new InternetExplorerDriver();
			            break;

			        case "edge":
			            driver = new EdgeDriver();
			            break;

			        case "opera":
			            driver = new OperaDriver();
			            break;
			    }

			    
			
			
			 
			 
			//WebDriver driver =new FirefoxDriver();
			driver.get("https://mail.google.com");
			
			
			WebElement email = driver.findElement(By.xpath(".//*[@id='Email']"));
			email.click();
			email.clear();
			email.sendKeys(a);
			
			
			WebElement nextButton = driver.findElement(By.xpath(".//*[@id='next']"));
			nextButton.click();
			
			Thread.sleep(1000);
					
			WebElement passwd = driver.findElement(By.xpath(".//*[@id='Passwd']"));
			passwd.click();
			passwd.clear();
			passwd.sendKeys(b);
			
			WebElement signIn = driver.findElement(By.xpath(".//*[@id='signIn']"));
			signIn.click();
			
			System.out.println(c);
			
			Thread.sleep(7000);
			WebElement signoutMenu = driver.findElement(By.xpath(d));
			signoutMenu.click();
			
			Thread.sleep(2000);
			
			WebElement signoutButton = driver.findElement(By.xpath(".//*[@id='gb_71']"));
			signoutButton.click();
			
			System.out.println("logged out");
		}

	

}
