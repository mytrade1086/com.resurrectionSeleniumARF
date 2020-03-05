package com.resurrectionSeleniumARF;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Allconcepts {

	@Test
public void dummy() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	  driver.get("http://demo.automationtesting.in");
	    driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	
	WebElement btnskipSignin=driver.findElement(By.xpath("//button[text()='Skip Sign In']"));
	WebElement btnSignin=driver.findElement(By.xpath("//button[text()='Sign In']"));
   // WebElement lnkRegsiter=driver.findElement(By.xpath("//li/a[text()='Register']"));    
  
	btnskipSignin.click();
	
	WebElement txtFirstname=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	WebElement txtLastname=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	WebElement txtAddress=driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
	WebElement txtemailAddress=driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
	
	WebElement txtPhone=driver.findElement(By.xpath("//input[@ng-model='Phone']"));
	WebElement rdMale=driver.findElement(By.xpath("//input[@value='Male']"));
	WebElement rdfemale=driver.findElement(By.xpath("//input[@value='FeMale']"));
	WebElement chkCricket=driver.findElement(By.xpath("//input[@id='checkbox1']"));
    rdfemale=driver.findElement(By.xpath("//input[@value='FeMale']"));
	 WebElement Languages=driver.findElement(By.xpath("//div[@id='msdd']"));
	List<WebElement> languages=driver.findElements(By.xpath("//ul/li[@class='ng-scope']"));
	WebElement slctSkills=driver.findElement(By.xpath("//select[@id='Skills']"));
	Select skills=new Select(slctSkills);	
	WebElement slctcountry=driver.findElement(By.xpath("//select[@id='countries']"));
	Select country=new Select(slctcountry);
	
	
	txtFirstname.sendKeys("sumit");
	txtLastname.sendKeys("raut");
	txtAddress.sendKeys("address");
	txtemailAddress.sendKeys("s@s.com");
	txtPhone.sendKeys("9766");
	rdMale.click();
	chkCricket.click();
	
	Languages.click();
	
	WebDriverWait wait=new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.visibilityOfAllElements(languages));
	
	for(WebElement lang:languages) {
		
		if(lang.getText().contains("Czech")     || lang.getText().contains("Arabic") ) {
			lang.click();		
		}
	}
	
	
	
	
	skills.selectByVisibleText("CSS");
	
	country.selectByVisibleText("Aruba");
	

	

}
}