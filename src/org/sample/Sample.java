package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Sample {
	
	public static void main(String[] args) {
		
//		System.setProperty("webdriver.edge.driver",
//				"C:\\Users\\LENOVO\\eclipse-workspace\\SELENIUM_PROGRAMM\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.eclipse.org/downloads/packages/release/oxygen/3a");
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		
	}
}
