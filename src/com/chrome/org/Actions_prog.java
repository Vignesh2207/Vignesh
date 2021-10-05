package com.chrome.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_prog {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Z003W5UK\\eclipse-workspace\\Selenium_New\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		// max
		driver.manage().window().maximize();

		// movetoelement

		Actions a = new Actions(driver);

		WebElement Men = driver.findElement(By.xpath("/html/body/div[1]/div/div/header/div[2]/nav/div/div[1]/div/a"));
		a.moveToElement(Men).build().perform();

		Thread.sleep(3000);
		// sport shoe

		WebElement jean = driver.findElement(
				By.xpath("/html/body/div[1]/div/div/header/div[2]/nav/div/div[1]/div/div/div/div/li[2]/ul/li[2]/a"));
		a.click(jean).build().perform();

		Thread.sleep(3000);
		driver.quit();

	}

}
