package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Base.BaseUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class Hook extends BaseUtil{
	@Before
	public void initializeTest(Scenario scenario) {
		System.out.println("I'm in line 19");
		WebDriverManager.chromedriver().setup();
		System.out.println("I'm in line 21");
		TCHdriver = new ChromeDriver();
		/*
		 * WebDriver driver = new ChromeDriver(); driver.manage().window().maximize();
		 */
		TCHdriver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		System.out.println("opened driver");
		openUrl();
	}
	
	@After
	public void teardown() {
		TCHdriver.quit();
	}


}
