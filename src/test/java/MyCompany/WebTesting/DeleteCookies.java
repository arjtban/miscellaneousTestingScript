package MyCompany.WebTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DeleteCookies {
	@Test
	public static void DeleteCookieMethod(){
		
		System.setProperty("webdriver.chrome.driver", "/home/arijit/Documents/WebDrivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		
//		driver.manage().deleteCookieNamed("name_of_the cookie");
		
	}

}
