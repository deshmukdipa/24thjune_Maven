package libraryFile;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
     WebDriver driver;
     
     public void initializeBrowser()
     {
    	 driver=new ChromeDriver();
    	 driver.manage().window().maximize();
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	 driver.get("https://www.saucedemo.com");
     }
     
}
