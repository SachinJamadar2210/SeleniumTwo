package com.selenium.a11;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
public class right {
	public static void main(String[] args) {
		  WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	    //    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	        Actions actions =new Actions(driver);
	        driver.get("https://www.google.com/");
	        driver.manage().window().maximize();
//	        WebElement src = driver.findElement(By.id("draggable"));
//	        WebElement drop = driver.findElement(By.id("droppable"));
	   //   actions.clickAndHold(src).release(drop).build().perform();
	  //    actions.dragAndDrop(src, drop).build().perform();
	      actions.keyDown(Keys.SHIFT);
	      actions.sendKeys("hello").build().perform();
	        
	      
//	        WebElement hoverElement= driver.findElement(By.linkText("pricing"));
//	        actions.doubleClick(hoverElement).perform();
	        
	        
//	        WebElement element = driver.findElement(RelativeLocator.with(By.xpath("//a[@class='social-button footer-social-item social-link-youtube']")).near(By.xpath("//a[@class='social-button footer-social-item social-link-linkedin']")));
//	        element.click();
//	        wait.until(ExpectedConditions.elementToBeClickable(RelativeLocator.with(By.xpath("//a[@class='social-button footer-social-item social-link-youtube']"))
//	        		.near(By.xpath("//a[@class='social-button footer-social-item social-link-linkedin']")))).click();
//	        driver.close();
	}
}