import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Appiumtests {
	
	
	static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			openAppiumtests();
		}catch(Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}				
	}
	
	public static void openAppiumtests() throws Exception {
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "Maianhtest");
		cap.setCapability("udid", "emulator-5554");
		cap.setCapability("platformName", "Android");		
		cap.setCapability("platformVersion", "11");
		cap.setCapability("fullReset", "true");
		cap.setCapability("noReset", "false");
		cap.setCapability("appPackage", "com.blue.hoantran.itro_host");
		cap.setCapability("appActivity", "com.blue.hoantran.itro_host.ui_v2.login.SplashActivity");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url , cap);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		System.out.println("Application Started");				
	}

}
