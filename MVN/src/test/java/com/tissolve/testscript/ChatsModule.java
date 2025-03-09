package com.tissolve.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ChatsModule {
@Test
	public void testing() {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.facebook.com/");
	 System.out.println(driver.getTitle());
	 Reporter.log("Testingng",true);
		
		
		
		
	}
	
	
		
	}


