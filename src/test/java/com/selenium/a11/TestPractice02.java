package com.selenium.a11;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestPractice02 {
	WebDriver driver;
  @Test
  public void A() {
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com");
	  
  }
  @Test
  public void B() {
	  driver = new ChromeDriver();
	  driver.get("https://www.bing.com");
  }
  @BeforeMethod
  public void Beforeethod() {
	  WebDriverManager.chromedriver().setup();
	  System.out.println("Welcome");
  }
  @AfterMethod
  public void Return() {
	//  System.out.println("Hello");
	  driver.close();
  }
}
