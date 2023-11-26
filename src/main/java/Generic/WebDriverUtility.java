package Generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverUtility {
	WebDriver driver;
	public WebDriver Applaunch(String browser,String url,long time) {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Set Chrome\\chromedriver.exe");
		switch(browser) {
		case "chrome":driver=new ChromeDriver();
		break;
		case "edge":driver=new EdgeDriver();
		break;
		case "firefox":driver=new FirefoxDriver();
		break;
		default: System.out.println("Select any One Chrome, Firefox, Edge");
		break;
		
		}
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	return driver;
	}
	
}
