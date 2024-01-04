package StepDefinitions;

import Base.BaseUtil;
import io.cucumber.java.en.Given;

public class Definitions1 extends BaseUtil {

	@Given("^User launches the application$")
	public void user_launches_the_application() throws Throwable {
		System.out.println("Test Passed");


	}
	
}
