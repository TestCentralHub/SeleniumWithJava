package RunnerFiles;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


import com.github.mkolisnyk.cucumber.reporting.CucumberResultsOverview;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/resources",glue="StepDefinitions",
				  plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
							"json:target/cucumber-reports/cucumber.json"},
				  			monochrome = true
				)
public class TestRunner extends AbstractTestNGCucumberTests{
	
	@BeforeSuite
	public void setup() {
		
	}

	@AfterSuite(alwaysRun = true)
	public void setupp() {

		
		  CucumberResultsOverview results = new CucumberResultsOverview();
		  results.setOutputDirectory("test-output/Reports");
		  results.setOutputName("SeleniumWithJavaReport");
		  results.setSourceFile("target/cucumber-reports/cucumber.json"); 
		  try {
		  results.execute(); 
		  } 
		  catch (Exception e) 
		  { 
			  e.printStackTrace(); 
		  }
		 
		  

	}
}

