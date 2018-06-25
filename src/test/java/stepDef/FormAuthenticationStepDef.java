package stepDef;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import generic.SeleniumBase;


public class FormAuthenticationStepDef extends SeleniumBase
{
	
	@Given("^Click on FormAuthentication$")
	public void click_on_FormAuthentication() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String xpathFormAuthentication="//a[contains(text(),'Form Authentication')]";
		this.performAction("click",null,this.identifyElement("xpath",xpathFormAuthentication));
	    
	}
	
	@Given("^pass username as \"([^\"]*)\" & Password as \"([^\"]*)\"$")
	public void pass_username_as_Password_as(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 // Write code here that turns the phrase above into concrete actions
	    
		   // Write code here that turns the phrase above into concrete actions
				String xpathUsernameTextBox="//input[@name='username']";
				String xpathPasswordTextBox="//input[@name='password']";
			    	
				
				this.performAction("settext",arg1, this.identifyElement("xpath",xpathUsernameTextBox));
			    this.performAction("settext", arg2, this.identifyElement("xpath",xpathPasswordTextBox));
	}
	
	

	@Given("^Click on Login$")
	public void click_on_Login() throws Throwable {
		  // Write code here that turns the phrase above into concrete actions
				String xpathLoginButton="//i[@class='fa fa-2x fa-sign-in']";
				this.performAction("click",null,this.identifyElement("xpath", xpathLoginButton));
	}

	@Given("^Verify Successful Message$")
	public void verify_Successful_Message_as(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
				String idSuccessfulMessage="flash";
				
				String actualSuccessfulMessage=this.performAction("gettext", null, this.identifyElement("id",idSuccessfulMessage));
				this.verifyValues(actualSuccessfulMessage.trim().split("×")[0].trim(),arg1);
	}

	@Given("^Click on Logout$")
	public void click_on_Logout() throws Throwable {
		 // Write code here that turns the phrase above into concrete actions
		String xpathLogoutButton="//a[@class='button secondary radius']";
		this.performAction("click",null,this.identifyElement("xpath", xpathLogoutButton));
	}

	@Given("^Verify LogoutSuccessful Messages$")
	public void verify_LogoutSuccessful_as(String arg1) throws Throwable {
		 // Write code here that turns the phrase above into concrete actions
		String idSucessfulLogoutMessage="flash";
		
		
		String actualSuccessfultMessageAfterLogout=this.performAction("gettext", null, this.identifyElement("id",idSucessfulLogoutMessage));
		this.verifyValues(actualSuccessfultMessageAfterLogout.trim().split("!")[0].trim(), arg1);      
	}

	@Given("^Verify Message as \"([^\"]*)\"$")
	public void verify_Message_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String idSucessfulLogoutMessage="flash";
	
		
		
		String actualSuccessfultMessageAfterLogout=this.performAction("gettext", null, this.identifyElement("id",idSucessfulLogoutMessage));
		this.verifyValues(actualSuccessfultMessageAfterLogout.trim().split("!")[0].trim(), arg1);      

	    
	}



}



