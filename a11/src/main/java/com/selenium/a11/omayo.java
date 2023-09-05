package com.selenium.a11;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class omayo {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");
        WebElement A =driver.findElement(By.xpath("//table[@id='table1']"));
        System.out.println(A.getText());
        Thread.sleep(3000);
        driver.quit();
        }
	}