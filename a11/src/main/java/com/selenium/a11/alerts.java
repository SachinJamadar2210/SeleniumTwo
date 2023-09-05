package com.selenium.a11;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class alerts {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/delete_customer.php");
        WebElement A = driver.findElement(By.xpath("//input[@name='cusid']"));
        A.sendKeys("101");
        driver.findElement(By.xpath("//input[@name='submit']")).click();
        Alert a1 =driver.switchTo().alert();
        a1.accept();
        Alert a2 =driver.switchTo().alert();
        String a2contentString = a2.getText();
        a2.accept();
        System.out.println(a2contentString);
	}
}