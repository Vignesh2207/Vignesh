package com.chrome.org;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.Point;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Test_3{
		
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Z003W5UK\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			WebDriver der = new ChromeDriver();
		
				der.get("https://www.facebook.com/");
				
				//max
				der.manage().window().maximize();
				
				Thread.sleep(3000);
				//set dimension
			//	Dimension size = new Dimension(300,400);
				
				//to set position
				
				//Thread.sleep(3000);
				
			//Point position = new Point(300,300);
		
			//der.manage().window().setPosition(position);
			//Thread.sleep(3000);
			
			WebElement username = der.findElement(By.id("email"));
			username.sendKeys("Vignesh");
			WebElement password = der.findElement(By.name("pass"));
			password.sendKeys("Vignesh123");
			WebElement login = der.findElement(By.name("login"));
			login.click();
		}

	}



