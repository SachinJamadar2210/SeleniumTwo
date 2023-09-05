package com.selenium.a11;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;
public class HOSPITAL {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.smart-hospital.in/site/login");
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/div[2]/a[2]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/form/button")).click();
        driver.findElement(By.xpath("//*[@id=\"sibe-box\"]/ul[2]/li[8]/a")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div[1]/div/a[1]")).click();
        driver.findElement(By.xpath("//input[@id='title']")).sendKeys("ABC");
         WebElement webelement =  driver.findElement(By.xpath("/html/body"));
         Actions action = new Actions(driver);   
         action.moveToElement(webelement).click().perform();
         action.sendKeys("Entering data").perform();
         Thread.sleep(3000);
         driver.findElement(By.xpath("//input[@id='date']")).sendKeys("04/11/2023");
         driver.findElement(By.xpath("//input[@id='publish_date']")).sendKeys("10/11/2023");
         
         //TO SELECT DATE FROM JAVASCRIPT
//        WebElement d1 = driver.findElement(By.xpath("//input[@id=\"date\"]"));
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].setAttribute('value','06/03/2022')", d1);
//        Thread.sleep(3000);
//        WebElement d2 = driver.findElement(By.xpath("//*[@id=\"publish_date\"]"));
//        Thread.sleep(3000);
//        js.executeScript("arguments[0].setAttribute('value','09/22/2022')", d2);
        
        
        driver.findElement(By.xpath("//*[@id=\"form1\"]/div/div[3]/div/button")).click();
        WebElement successfull_msg = driver.findElement(By.xpath("//*[@id=\"form1\"]/div/div[2]/div/div[1]"));
        String msg = successfull_msg.getText();
        System.out.println(msg);
    }
}

