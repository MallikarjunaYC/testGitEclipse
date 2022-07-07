package HW;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;



public class TestHelloWorld {
	
	
	@Test
	public void testHelloWorld() {
		
		System.out.println("........Hello World...............");
		
		System.setProperty("webdriver.chrome.driver", "D:\\mallikarjuna\\java-sel\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.microsoft.com");
	}

}
