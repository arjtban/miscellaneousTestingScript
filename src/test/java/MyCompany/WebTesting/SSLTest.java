package MyCompany.WebTesting;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.annotations.Test;

public class SSLTest 
{
	@Test
	public static void sslCertControl() {
			
		ChromeDriverService service = new ChromeDriverService.Builder()
		        .usingDriverExecutable(new File("/home/arijit/Documents/WebDrivers/chromedriver"))
		        .usingAnyFreePort()
		        .build();
		
		ChromeOptions options = new ChromeOptions();
		options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		WebDriver driver=new ChromeDriver(service,options);
		
		driver.get("https://expired.badssl.com/");
		
		 
    
	}
}