package com.selenium.a11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sjamadar\\Downloads\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions A = new ChromeOptions();
     //   A.addArguments("--disable-notifications");
        A.setBinary("C:\\Users\\sjamadar\\Downloads\\chromedriver-win64\\chrome-win64\\chrome.exe");
    WebDriver driver = new ChromeDriver(A);
    driver.get("https://www.cricbuzz.com/");
    driver.manage().window().maximize();
    Thread.sleep(3000);
    driver.findElement(By.xpath("/html/body/header/div/nav/div[5]/a")).click();
    Thread.sleep(3000);
    driver.findElement(By.id("batsmen-t20s-tab")).click();

	}

}
