package stepDef;

import cucumber.api.java.en.Given;
import generic.SeleniumBase;

public class ABTestingStefDef extends SeleniumBase 
{
	@Given("^click on A/B Testing$")
	public void click_on_A_B_Testing() throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
		String xpathABTesting="//a[contains(text(),'A/B Testing')]";
		this.performAction("click",null,this.identifyElement("xpath", xpathABTesting));
	    
	}

	@Given("^verify text$")
	public void verify_text() throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
		String xpathactualText="//h3[contains(text(),'A/B Test Control')]";
		String expectedText="A/B Test Control";
		String actualText=this.performAction("gettext",null,this.identifyElement("xpath", xpathactualText));
		this.verifyValues(actualText, expectedText);
	}


}
