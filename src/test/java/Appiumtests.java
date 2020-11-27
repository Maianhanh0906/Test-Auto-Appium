import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Appiumtests {
	
	
	static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void openAppiumtests() {
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "Maianhtest");
		cap.setCapability("udid", "emulator-5554");
		cap.setCapability("platformName", "Android");		
		cap.setCapability("platformVersion", "11");
		cap.setCapability("appPackage", "com.blue.hoantran.itro_host");
		cap.setCapability("appActivity", "com.blue.hoantran.itro_host.ui_v2.login.SelectPurposeActivity");
		
		driver = new AppiumDriver<MobileElement>(cap);
		
		
	}

}
