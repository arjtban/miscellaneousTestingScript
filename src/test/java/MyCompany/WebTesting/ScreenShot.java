package MyCompany.WebTesting;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenShot {

	@Test
	public static void screenShot() throws IOException {
		System.setProperty("webdriver.chrome.driver", "/home/arijit/Documents/WebDrivers/chromedriver");
		DateFormat dateformat=new SimpleDateFormat("dd-mm-yyyy hh:mm:ss:SSS");
		Date date=new Date( );
		
		//Instant instant=Instant.now();
		//String output=instant.toString().replace('T', ' ').replace('Z', ' ');
		//System.out.println(output);
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("//home/arijit/Pictures/SeleniumOutputFiles/"+"screenshot"+dateformat.format(date)+".png"));
		
		//FileUtils.copyFile(src,new File("//home/arijit/Pictures/SeleniumOutputFiles/"+"screenshot"+output+".png"));
	
	}
}
