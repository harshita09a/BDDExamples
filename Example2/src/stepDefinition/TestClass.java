package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestClass {
	@Given("^I launch \"([^\"]*)\"$")
	public void i_launch(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("I launch "+arg1 );
	}

	@When("^I fill in \"([^\"]*)\" with \"([^\"]*)\"$")
	public void i_fill_in_with(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		System.out.println("I fill in "+arg1+ " as "+arg2);
	}

	@When("^I click on \"([^\"]*)\" button$")
	public void i_click_on_button(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("I click on "+arg1);
	}

	@Then("^I am on the \"([^\"]*)\" page$")
	public void i_am_on_the_page(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		System.out.println("I am on the "+arg1+" page");
	}


}
