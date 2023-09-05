package com.selenium.a11;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestPractic05 {
	WebDriver driver;
  @Test
  public void f() {
	  //WebDriverManager.chromedriver().setup();
	  WebDriver  driver = new ChromeDriver();
	  driver.get("https://www.google.com/");
  }
  
  @Test(dependsOnMethods = "f")
 public void f1() {
	  driver.findElement(By.name("q")).sendKeys("Sachin",Keys.ENTER);
	  System.out.println("A");
  }
  
  
  @Test(dependsOnMethods = {"f","f1"})
  public void f2() {
	  driver.close();
	  System.out.println("Done");
  }
  @Test(dependsOnMethods = {"f","f2"})
  public void f3() {
	  System.out.println("All is done");
  }
}
