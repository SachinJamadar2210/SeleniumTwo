package com.selenium.a11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestPractic06 {
	WebDriver driver;

	
	
  @Test(groups = "G1")
  public void f() {
	   driver = new ChromeDriver();
	   driver.get("https://www.google.com/");
  }
  @Test(groups = "G2",dependsOnGroups = "G1")
  public void f1() throws Exception {
	  driver.findElement(By.name("q")).sendKeys("Sachin T",Keys.ENTER);
	  Thread.sleep(3000);
  }
  @Test(groups = "G2",dependsOnGroups = "G1")
  public void f2() {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	  driver.navigate().back();
	  driver.close();
  }
  }
