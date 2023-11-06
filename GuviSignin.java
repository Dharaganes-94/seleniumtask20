package com.learning.seleniumtask20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuviSignin {
	
	static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver =new ChromeDriver();
		driver.navigate().to("https://www.guvi.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		/*driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("DharaniGanesan");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("dharani.gsd@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Dharaniganesan@994");
		driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("9710729257");
		driver.findElement(By.xpath("//a[text()='Sign Up']")).click();
		
		Thread.sleep(2000);*/
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("dharani.gsd@gmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Dharaniganesan@994");
        driver.findElement(By.xpath("//a[text()='Login']")).click();
        
        Thread.sleep(2000);
        
        WebElement text = driver.findElement(By.xpath("//h1[text()='Online Courses']"));
        System.out.println("The guvi page is loggined sucesfully and text on the page is "+text.getText());
	}

}
