package com.selenium.a11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestPractice01 {
  WebDriver driver;
  
 
  @Test
  public void f() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com/");
	  driver.close();
  }
  @Test
	  public void f1() {
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  driver.get("https://www.Bing.com/");
		  driver.close();
  }
  
}
