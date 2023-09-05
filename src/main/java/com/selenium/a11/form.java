package com.selenium.a11;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class form {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
        WebElement s1 =driver.findElement(By.xpath(" //select[@name=\"selenium_commands\"]"));
        Select s2 = new Select(s1);
        s2.selectByIndex(2);
        Thread.sleep(3000);
        s2.selectByIndex(3);
        List<WebElement> l1= new ArrayList<WebElement>();
        l1=s2.getAllSelectedOptions();
        for(WebElement element: l1 ) {
            System.out.println(element.getText());
        }
       s2.deselectAll();
      }
}
