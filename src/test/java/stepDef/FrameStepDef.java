package stepDef;

import cucumber.api.java.en.Given;
import generic.SeleniumBase;

public class FrameStepDef extends SeleniumBase
{
	

	

	@Given("^click on Frames$")
	public void click_on_Frames() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   String xpathFrame="//a[contains(text(),'Frames')]";
	   this.performAction("click",null,this.identifyElement("xpath", xpathFrame));
	}

	@Given("^Click on Nested Frames$")
	public void click_on_Nested_Frames() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String xpathNestedFrames="//a[contains(text(),'Nested Frames')]";
		this.performAction("click",null,this.identifyElement("xpath", xpathNestedFrames));
	    
	}

	@Given("^Verify text$")
	public void verify_text() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
		String xpathFrameBottom="//frame[@name='frame-bottom']";
		 this.performAction("switchframe", "child", this.identifyElement("xpath", xpathFrameBottom));
		String xpathBottomText="//body[contains(text(),'BOTTOM')]";
		String expectedBottomText="BOTTOM";
		
		String actualBottomText=this.performAction("gettext",null,this.identifyElement("xpath", xpathBottomText));
		this.verifyValues(actualBottomText,expectedBottomText);
	    
	}
	
	/*@Given("^Verify text as \"([^\"]*)\"$")
	public void verify_text_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String xpathFrameBottom="//frame[@name='frame-bottom']";
		 this.performAction("switchframe", "child", this.identifyElement("xpath", xpathFrameBottom));
		String xpathBottomText="//body[contains(text(),'BOTTOM')]";
		//String expectedBottomText="BOTTOM";
		
		String actualBottomText=this.performAction("getext",null,this.identifyElement("xpath", xpathBottomText));
		this.verifyValues(actualBottomText, arg1);*/
	    
	}

	

	


