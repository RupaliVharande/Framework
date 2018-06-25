package stepDef;

import cucumber.api.java.en.Given;
import generic.SeleniumBase;

public class ForgotPasswordStepDef extends SeleniumBase
{
	@Given("^click on Forgot Password$")
	public void click_on_Forgot_Password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String xpathForgotPassword="//a[contains(text(),'Forgot Password')]";
		this.performAction("click",null,this.identifyElement("xpath",xpathForgotPassword));
	    
	}

	@Given("^Pass valid email$")
	public void pass_valid_email() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String xpathEmailTextBox="//input[@id='email']";
		this.performAction("settext","abc",this.identifyElement("xpath", xpathEmailTextBox));
		
	    
	}

	@Given("^click on Retrieve Password$")
	public void click_on_Retrieve_Password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String xpathRetriveButton="//button[@id='form_submit']";
		this.performAction("click",null,this.identifyElement("xpath", xpathRetriveButton));
		
	    
	}

}
