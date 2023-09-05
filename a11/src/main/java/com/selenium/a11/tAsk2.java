package com.selenium.a11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tAsk2 {

	public static void main(String[] args){
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
		driver.get("https://j2store.net/free/");
		driver.manage().window().maximize();
		WebElement A =driver.findElement(By.className(" dropdown-toggle"));
		
		
		 List<WebElement> A1=driver.findElements(By.className("dropdown-toggle"));
	        for(WebElement i : A1) {
	                System.out.println(i);
	   }
	        
	}

}
