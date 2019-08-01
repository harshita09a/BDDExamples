package stepDefinition;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestClass {
	@Given("^I am not logged in as an administrator$")
	public void i_am_not_logged_in_as_an_administrator() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Not logged in as admin");
	}

	@When("^I go to the administrator$")
	public void i_go_to_the_administrator() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		System.out.println("Go to Admin"); 
	
	}

	@When("^I fill in the fields$")
	public void i_fill_in_the_fields(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    //throw new PendingException();
		System.out.println(arg1.raw());
	}

	@When("^I press \"([^\"]*)\"$")
	public void i_press(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Press the buttons");
	}

	@Then("^I should be on the administrative page$")
	public void i_should_be_on_the_administrative_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		System.out.println("Be on the Administration page");
	}

	@Then("^I should see \"Log out$")
	public void i_should_see_Log_out() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("LogOut");
	}


}
