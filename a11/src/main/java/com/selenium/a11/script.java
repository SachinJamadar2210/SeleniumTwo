package com.selenium.a11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class script {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.abhibus.com/");
        WebElement src =driver.findElement(By.id("source"));
        src.sendKeys("Coimbatore");
        WebElement dst =driver.findElement(By.id("destination"));
        dst.sendKeys("Chennai");
        WebElement d =driver.findElement(By.xpath("//*input[class='form-control border-0 mb-0 hasDatepicker']"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].setAttribute('value','04/10/2023')",d);
       }
}
