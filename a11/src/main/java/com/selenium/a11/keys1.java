package com.selenium.a11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keys1 {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	        Actions actions =new Actions(driver);
	        driver.get("https://www.google.com/");
	        driver.manage().window().maximize();
	        driver.findElement(By.className("//textarea[@class='gLFyf']")).sendKeys("hello",Keys.ENTER);
	        //driver.KeysUp();

	}

}
