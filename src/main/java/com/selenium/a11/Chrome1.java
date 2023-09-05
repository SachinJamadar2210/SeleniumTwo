package com.selenium.a11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chrome1 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sjamadar\\Downloads\\chromedriver-win64\\chromedriver.exe");
	ChromeOptions A= new ChromeOptions();
	A.setBinary("C:\\Users\\sjamadar\\Downloads\\chromedriver-win64\\chrome-win64\\chrome.exe");
	WebDriver driver = new ChromeDriver(A);
	driver.get("https://www.google.co.in/");
	
	
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("APjFqb"));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.className("_3704LK")).sendKeys("Mobile",Keys.ENTER);
		WebElement Asa = driver.findElement(By.className("_3879cV"));
		
	//	WebElement gmailbtn = driver.findElement(By.partialLinkText("G"));
	//	gmailbtn.click();
	//	boolean isgmailbtn = gmailbtn.isEnabled();
	//	System.out.println(isgmailbtn);
		
	//	searchbox.sendKeys("Sachin",Keys.ENTER);
		WebElement searchbox = driver.findElement(By.xpath("//textarea[starts-with(@id,'A')]"));
		
	String valueofsrboxid = searchbox.getAttribute("id");
	System.out.println(valueofsrboxid);
		

	}

}
