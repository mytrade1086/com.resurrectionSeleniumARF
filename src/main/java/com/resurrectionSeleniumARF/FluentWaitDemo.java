import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Functions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitDemo  {
	
	
	
	
	public static void main(String[] args) {
		
		//Code is Buggy and inprocess
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.rediff.com");
		
		Wait wait = new FluentWait(driver)    
			    .withTimeout(Duration.ofSeconds(20))    
			    .pollingEvery(Duration.ofMillis(500))   
			    .ignoring(NoSuchElementException.class);

			WebElement foo = wait.until(new Functions() {    
			    public WebElement apply(WebDriver driver) {    
			        return driver.findElement(By.id("foo"));    
			    }
			});
			
			
			
	}
}