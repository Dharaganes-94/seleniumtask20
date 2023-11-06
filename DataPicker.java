package com.learning.seleniumtask20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataPicker {
	
	static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver =new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/datepicker/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='22']")).click();		
		
         Thread.sleep(2000);
                 
    WebElement date = driver.findElement(By.xpath("//p[text()='Date: ']"));
    System.out.println("The selected date on the console:"+date.getText());
    
    Thread.sleep(2000);
    
    driver.close();
    
    Thread.sleep(2000);
    
    driver.quit();
    
    

     }

}
