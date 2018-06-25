package stepDef;

import cucumber.api.java.en.Given;
import generic.SeleniumBase;

public class MultipleWindowsStefDef extends SeleniumBase
{
	
		@Given("^Click on Multiple Window$")
		public void click_on_Multiple_Window() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		String xpathMultipleWindow="//a[contains(text(),'Multiple Windows')]";
	    this.performAction("click",null,this.identifyElement("xpath",xpathMultipleWindow));

	}
	
		@Given("^Click on Click Here Link$")
		public void click_on_Click_Here_Link() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		String xpathClickHereLink="//a[contains(text(),'Click Here')]";
	    this.performAction("click",null,this.identifyElement("xpath",xpathClickHereLink));

	}

		
	
		@Given("^Verify page text$")
		public void verify_page_text() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
		String parenthandle=this.getPageDetails("handle");
		this.performAction("switchwindows", parenthandle,null);
		    
		String xpathTextVerifyOnWindow="//h3[contains(text(),'New Window')]";
	    String expectedTextOnWindow="New Window";
	    String actualTextOnWindow=this.performAction("gettext",null,this.identifyElement("xpath", xpathTextVerifyOnWindow));
	   //this.verifyValues(actualTextOnWindow, expectedTextOnWindow);
	   this.verifyValues(actualTextOnWindow, expectedTextOnWindow);
	    
	}
	
}


    