package stepDef;

import cucumber.api.java.en.Given;
import generic.SeleniumBase;

public class BasicAuthStefDef extends SeleniumBase
{

	@Given("^click on Basic Auth$")
	public void click_on_Basic_Auth() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String xpathBasicAuth="//a[contains(text(),'Basic Auth')]";
		this.performAction("click",null,this.identifyElement("xpath", xpathBasicAuth));
	    
	}

	@Given("^pass username password$")
	public void pass_username_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String xpathUsernameTextbox="";
		String xpathPasswordTextBox="";
	    
	}

	@Given("^click on Sign in$")
	public void click_on_Sign_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Given("^Click on Cancel$")
	public void click_on_Cancel() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}


}
