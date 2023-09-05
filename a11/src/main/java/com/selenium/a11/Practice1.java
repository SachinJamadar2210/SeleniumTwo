package com.selenium.a11;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice1 {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
        Thread.sleep(2000);
        driver.manage().window().maximize();
        WebElement element =driver.findElement(RelativeLocator.with(By.name("username")).below(By.xpath("//div[@class='oxd-sheet oxd-sheet--rounded oxd-sheet--gutters oxd-sheet--gray-lighten-2 orangehrm-demo-credentials']")));
        element.sendKeys("Admin");
        WebElement element1 = driver.findElement(RelativeLocator.with(By.name("password")).above(By.xpath("//button[@type='submit']")));
        element1.sendKeys("admin123");
      //  driver.findElement(By.)
    }
}
