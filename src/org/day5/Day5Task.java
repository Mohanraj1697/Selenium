package org.day5;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day5Task {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
//		URL : https://www.homedepot.com/
//		NOTE: Alldepartment  is first mouseover
//			      Heating and cooling  is second  mouseover
//			      Air conditioners is third mouseover 
//			      Click portable air conditioners.
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);    //old version
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));  //new Version
		driver.manage().window().maximize();
		
		driver.get("https://www.homedepot.com/");
		
		Actions a=new Actions(driver);
		
		WebElement movemouse1 = driver.findElement(By.xpath("(// a[@data-id='departmentsFlyout'])[1]"));
		a.moveToElement(movemouse1).perform();
		
		Thread.sleep(4000);
		WebElement movemouse2 = driver.findElement(By.xpath("(// a[@data-cta='Shop Now'])[9]"));
		a.moveToElement(movemouse2).perform();
		
		Thread.sleep(4000);
		WebElement movemouse3 = driver.findElement(By.xpath("// a[@title='Air Conditioners']"));
		a.moveToElement(movemouse3).perform();
		
		
		
	}
	
}
