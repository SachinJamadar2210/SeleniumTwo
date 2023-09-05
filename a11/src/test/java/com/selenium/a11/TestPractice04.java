package com.selenium.a11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.Assert;

public class TestPractice04 {
	WebDriver driver;
  @Test
  public void f() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.google.co.in/");
	  driver.findElement(By.name("q")).sendKeys("Hello",Keys.ENTER);
	  Assert.assertEquals(driver.getTitle(), "Hello - Google Search");
	  driver.close();
  }
}
