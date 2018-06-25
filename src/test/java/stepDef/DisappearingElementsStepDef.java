package stepDef;

import cucumber.api.java.en.Given;
import generic.SeleniumBase;

public class DisappearingElementsStepDef extends SeleniumBase 
{
	
	@Given("^click on Disappearing Elements$")
	public void click_on_Disappearing_Elements() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String xpathDisappearingElements="//a[contains(text(),'Disappearing Elements')]";
		this.performAction("click",null,this.identifyElement("xpath", xpathDisappearingElements));
	  
	    
	}

	@Given("^click on Home$")
	public void click_on_Home() throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
		String xpathHome="//a[contains(text(),'Home')]";
		this.performAction("click",null,this.identifyElement("xpath", xpathHome));
	  
	}
	@Given("^click on About and verify text as \"([^\"]*)\"$")
	public void click_on_About_and_verify_text_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String xpathAbout="//a[contains(text(),'About')]";
		this.performAction("clcik",null,this.identifyElement("xpath", xpathAbout));
		String xpathAboutText="//h1[contains(text(),'Not Found')]";
		String actualAboutText=this.performAction("gettext",null,this.identifyElement("xpath", xpathAboutText));
		this.verifyValues(actualAboutText, arg1);
	    
	}

	@Given("^Click on Contact Us and verify text as \"([^\"]*)\"$")
	public void click_on_Contact_Us_and_verify_text_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		String xpathContactUs="//a[contains(text(),'Contact Us')]";
		this.performAction("click", null, this.identifyElement("xpath", xpathContactUs));
		String xpathContactUsText="//h1[contains(text(),'Not Found')]";
		String actualContactUsText=this.performAction("gettext",null, this.identifyElement("xpath", xpathContactUsText));
		this.verifyValues(actualContactUsText, arg1);
		
	    
	}

	@Given("^Click on portfolio and verify text as \"([^\"]*)\"$")
	public void click_on_portfolio_and_verify_text_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    String xpathPortfolio="Portfolio";
	    this.performAction("click",null,this.identifyElement("xpath", xpathPortfolio));
	    String xpathportfolioText="//h1[contains(text(),'Not Found')]";
	    String actualPortfolioText=this.performAction("gettext",null,this.identifyElement("xpath", xpathportfolioText));
	    this.verifyValues(actualPortfolioText, arg1);
	}


}
