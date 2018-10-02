package com.naukri;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DailyResumeupdate {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.gecko.driver", "C:\\Mobily Project\\Mobily Project data\\Hard Disk transfer\\Softwares\\Selenium\\geckodriver-v0.15.0-win64\\geckodriver.exe");
	  WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new HtmlUnitDriver();
		driver.get("https://www.naukri.com/");
		//System.out.println("Tile of the page:"+driver.getTitle());
		driver.findElement(By.xpath(".//*[@id='login_Layer']/div")).click();
		driver.findElement(By.name("email")).sendKeys("");
		driver.findElement(By.name("PASSWORD")).sendKeys("");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		//System.out.println("Tile of the page:"+driver.getTitle());
		Thread.sleep(5000);
		driver.findElement(By.linkText("UPDATE PROFILE")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(".//*[@id='root']/div/div/span/div/div/div/div/div[2]/div[2]/div/div/ul/li[12]/a"));
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='attachCV']"));
  }
}
