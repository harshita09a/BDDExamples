package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestClass {
	@Given("^I have two numbers$")
	public void i_have_two_numbers() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("I have two numbers");
	}

	@When("^I add \"([^\"]*)\" the numbers$")
	public void i_add_the_numbers(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("I add "+arg1+" the numbers");
	}

	@Then("^numbers should be added$")
	public void numbers_should_be_added() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		System.out.println("The numbers should be added");
	}

	@Given("^There is third number$")
	public void there_is_third_number() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("There is a third number");
	}

	@Then("^Check the result$")
	public void check_the_result() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Check the Result");
	}


}
