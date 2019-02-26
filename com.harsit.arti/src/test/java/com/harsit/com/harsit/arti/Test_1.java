package com.harsit.com.harsit.arti;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test_1
{
	@Test
	public static void Arul()
	
	
	{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Arul\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("arul");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//driver.close();
				
		
	}
}
