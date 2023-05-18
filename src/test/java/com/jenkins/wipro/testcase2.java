package com.jenkins.wipro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testcase2 {
		@Test
		public void tc1() {
			WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://parabank.parasoft.com/parabank/index.htm");
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("acbcbc");
	driver.findElement(By.name("password")).sendKeys("sdsscfsf");
	driver.findElement(By.xpath("//input[@class='button']")).click();
	driver.findElement(By.xpath("(//div[@id='leftPanel']/ul/li)[3]")).click();

	}

}
