package org.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseUtility {
WebDriver driver;
	public void WebDriver() {
	 String projectPath = System.getProperty("user.dir");
	 System.out.println("projectPath:"+projectPath);
	 
	 System.setProperty("webdriver.chrome.driver","E:\\Accelarations\\My_Programs\\Cucumber_Simple\\DriverFile\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.findElement(By.id("username")).sendKeys("admin");

 	driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");;
		
	driver.findElement(By.cssSelector("#loginButton>div")).click();
	
	 driver.manage().window().maximize();
	 driver.get("http://localhost:99/login.do");
}
}
