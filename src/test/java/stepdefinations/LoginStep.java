package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginStep {
		
	@Given("user is on login page")
	public void user_is_on_login_page() {
	  System.out.println("Inside Step - user is on login page");
	}

	@When("user enters username and passwaord")
	public void user_enters_username_and_passwaord() {
		 System.out.println("Inside Step - user enters username and password");
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		 System.out.println("Inside Step - clicks on login button");
	}

	@And("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
