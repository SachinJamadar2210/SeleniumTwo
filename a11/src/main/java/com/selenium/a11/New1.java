package com.selenium.a11;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class New1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sjamadar\\Downloads\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions A = new ChromeOptions();
       A.addArguments("disable-notifications");
       long starttime =System.currentTimeMillis();
       A.setBinary("C:\\Users\\sjamadar\\Downloads\\chromedriver-win64\\chrome-win64\\chrome.exe");
    WebDriver driver = new ChromeDriver(A);
    driver.get("http://omayo.blogspot.com/");
    driver.findElement(By.className("dropbtn")).click();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    long endtimes = System.currentTimeMillis();
    System.out.println(((endtimes-starttime)/1000.0)+"second");
    
    
    driver.get("https://www.facebook.com/");
    Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
      .withTimeout(Duration.ofSeconds(15))
      .pollingEvery(Duration.ofSeconds(3))
      .ignoring(NoSuchElementException.class);
    
    WebElement A1 = fluentWait.until (new Function<WebDriver, WebElement>(){
    	public WebElement apply (WebDriver AA) {
    		return AA.findElement(By.id("A1"));
    	}
    });
   
    

	}
}
