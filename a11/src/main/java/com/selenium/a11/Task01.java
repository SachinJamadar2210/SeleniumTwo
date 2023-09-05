package com.selenium.a11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task01 {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String s = "https://demo.smart-hospital.in/admin/admin/search";
        driver.get("https://demo.smart-hospital.in/site/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/div[2]/a[2]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/form/button")).click();
        driver.findElement(By.xpath("//*[@id=\"sibe-box\"]/ul[2]/li[8]/a")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div[1]/div/a[1]")).click();
        driver.findElement(By.id("title")).sendKeys("Hello");
        driver.findElement(By.xpath("//input[@id='date']")).sendKeys("04/10/2023",Keys.TAB);
        driver.findElement(By.xpath("//input[@id='publish_date']")).sendKeys("10/10/2023",Keys.TAB);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        System.out.println(driver.getCurrentUrl().equals(s)?"“Record Saved Successfully”\r\n"
        		+ "":"Record Not Saved Successfully\r\n"
        				+ "");
        
	}

}
