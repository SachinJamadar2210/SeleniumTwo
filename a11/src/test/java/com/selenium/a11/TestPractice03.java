package com.selenium.a11;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestPractice03 {
	WebDriver driver;
  @Test
  public void A() throws Exception {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.google.co.in/");
	  driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Sachin",Keys.ENTER);
	  Thread.sleep(3000);
	
  }
  @Test(priority=2)
  public void A1() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.wikipedia.org/");
	  
	 
  }
  @BeforeMethod
  public void B() {
	  System.out.println("METHOD");
	  
  }

  @BeforeClass
  public void D() {
	  System.out.println("CLASS");
	  
  }
  @BeforeTest
  public void C() {
	  System.out.println("TEST");
	  
  }
  @AfterClass
  public void E() {
	  System.out.println("CLASS");
	  
  } 
  
  @AfterMethod
  public void F() {
	  System.out.println("METHOD");
	  driver.close();
  }
  @AfterTest
  public void G() {
	  System.out.println("TEST");
	  
  }
}
