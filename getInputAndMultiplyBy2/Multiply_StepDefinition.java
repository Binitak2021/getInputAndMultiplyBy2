package getInputAndMultiplyBy2;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
public class Multiply_StepDefinition 
{
	int number;
	@Given("^The user enters the \"([^\"]*)\"$")
	public void the_user_enters_the(String arg1) throws Throwable 
	{
		number=Integer.parseInt(arg1);
		
	}

	@When("^The user multiplies the number by two$")
	public void the_user_multiplies_the_number_by_two() throws Throwable
	{
		number*=2;
	    
	}


	@Then("^\"([^\"]*)\" should be displayed$")
	public void should_be_displayed(String arg1) throws Throwable 
	{
		Assert.assertEquals(number,Integer.parseInt(arg1));
	   	}



}
