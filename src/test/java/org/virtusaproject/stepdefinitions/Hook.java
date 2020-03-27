package org.virtusaproject.stepdefinitions;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.virtusaproject.utils.BaseClass;

import cucumber.api.java.*;

public class Hook extends BaseClass {

	@Before
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\VirtusaProject\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@After
	public void TearDown() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.quit();
	}
}
