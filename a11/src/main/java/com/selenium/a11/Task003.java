package com.selenium.a11;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Task003 {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement element =driver.findElement(RelativeLocator.with(By.name("username")).below(By.xpath("//div[@class='oxd-sheet oxd-sheet--rounded oxd-sheet--gutters oxd-sheet--gray-lighten-2 orangehrm-demo-credentials']")));
      element.sendKeys("Admin");
      WebElement element1 = driver.findElement(RelativeLocator.with(By.name("password")).above(By.xpath("//button[@type='submit']")));
      element1.sendKeys("admin123");
      driver.findElement(By.xpath("//button[@type='submit']")).click();
      Thread.sleep(3000);
      driver.findElement(By.className("oxd-userdropdown-tab")).click();
      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
      String s = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

      System.out.println(driver.getCurrentUrl().equals(s)?"Pass":"Fail");
	}

}
