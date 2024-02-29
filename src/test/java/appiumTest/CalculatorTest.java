package appiumTest;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class CalculatorTest {

	
static //	WebDriver driver;
	AppiumDriver driver;
//	AndroidDriver driver;
	public static void main(String[] args) {
		try {
			openCalculator();
		} catch (MalformedURLException e) {
			
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
		} catch (URISyntaxException e) {
			
			e.printStackTrace();
		}

	}
	public static void openCalculator() throws MalformedURLException, URISyntaxException
	{
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability("deviceName", "realme GT NEO 3T");
		cap.setCapability("udid", "f8e0d4d4");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "14");
		
		
		cap.setCapability("appPackage", "com.coloros.calculators");
		cap.setCapability("appActivity", "com.android.calulator2.Calculator");
		
		URL url= new URI("http://127.0.0.1:4723/wd/hub").toURL();
		driver= new AppiumDriver(url, cap);
		System.out.println("Application Started");
	
	}

}
