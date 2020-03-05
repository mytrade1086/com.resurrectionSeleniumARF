package com.resurrectionSeleniumARF;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sel3_DatePicker {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "H://chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Datepicker.html");
		driver.findElement(By.xpath("//div/img[@class='imgdp']")).click();
		WebElement cal = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']"));

		WaitforvisibilityOf(driver, cal);

		String curMonth = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		while (!curMonth.contains("December")) {
			driver.findElement(By.xpath("//a[@data-handler='next']")).click();
			curMonth = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		}
		
		
		//
		
		
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//tbody/tr/td/a[text()='12']")).click();
		
		
		
		
		
		

		List<WebElement> dates = driver.findElements(By.xpath("//td/a[contains(@class,'ui-state')]"));
		Actions act = new Actions(driver);
		for (WebElement date : dates) {
			String dated = date.getText();
			System.out.println(dated + date.getAttribute("href"));
			if (dated.contains("25")) {
				
				date.sendKeys(Keys.ENTER);
				
				//date.click();
				//act.moveToElement(date).pause(Duration.ofSeconds(2)).click().build().perform();
				break;
			}
		}
	}

//	 }

//System.out.println("Text is "+driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText()); //March 2020

	public static void WaitforvisibilityOf(WebDriver driver, WebElement ele) {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(ele));

	}
}