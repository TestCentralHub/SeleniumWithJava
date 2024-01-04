package Base;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;


public class BaseUtil {

	public static WebDriver TCHdriver;
	// provide your web application url below
	static String applicationURL = "";

	
	public void openUrl() {
		System.out.println("Launching app");
		TCHdriver.get(applicationURL);
	}

	@AfterSuite
	public void TeardownTest() {
		System.out.println("Tear down Test");
		BaseUtil.TCHdriver.quit();
	}
	

}

