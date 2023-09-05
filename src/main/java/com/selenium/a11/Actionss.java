package com.selenium.a11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

//import org.openqa.selenium.support.locators.RelativeLocator;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Actionss {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
  //     Actions actions = new Actions(driver);
        driver.get("https://demo.opencart.com/index.php?route=product/category&language=en-gb&path=24");  
//       driver.switchTo().frame("frame1");
//       WebElement text = driver.findElement(By.xpath("//*[@id=\"sampleHeading\"]"));
//       System.out.println(text.getText());
        
        Select s =new Select(driver.findElement(By.xpath("//select[@id='input-sort']")));
       List<String> l2 = new ArrayList<>();
       List<WebElement> l1=s.getOptions();   
       for(int i = 0; i < l1.size(); i++) {
    	   l2.add(l1.get(i).getText());
     
        }
       s.selectByValue("https://demo.opencart.com/index.php?route=product/category&language=en-gb&path=24&sort=p.model&order=DESC");
       Collections.sort(l2);
       System.out.println("Sorted");
       
       
	}
}
