package com.selenium.a11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AJIO {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sjamadar\\Downloads\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions A = new ChromeOptions();
       A.addArguments("disable-notifications");
        A.setBinary("C:\\Users\\sjamadar\\Downloads\\chromedriver-win64\\chrome-win64\\chrome.exe");
    WebDriver driver = new ChromeDriver(A);
   
    driver.manage().window().maximize();  
    driver.get("https://www.oyorooms.com/");  
    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div/div[9]/a")).click();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	// driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[3]/div/div[1]/div/div[2]/div/div/span[1]")).click();
	driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[2]/aside/div[2]/div[2]/div/div/label[1]/div")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[1]/div/div[2]/div[1]/div[1]/div/div/form/div/div/span[1]/svg")).click();
	
	driver.close();
	}

}
