package stepDef;

import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import generic.SeleniumBase;

public class ExitIntentStefDef extends SeleniumBase
{
	@Given("^click on Exit Intent$")
	public void click_on_Exit_Intent() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		String xpathExitIntent="//a[contains(text(),'Exit Intent')]";
		this.performAction("click",null,this.identifyElement("xpath", xpathExitIntent));
		
		String xpathModel="//div[@class='modal']";
		//this.explicitWait(By.xpath(xpathModel));
		this.moveMouse(this.getWindowWidthHeight("height"));
		System.out.println(this.getWindowWidthHeight("height"));
			    
		
	}
	@Given("^verify title as \"([^\"]*)\"$")
	public void verify_title_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String xpathModalTitle="//h3[contains(text(),'This is a modal window')]";
		
		String actualtitle=this.getPageDetails(arg1);
        this.verifyValues(actualtitle, xpathModalTitle);
      
	    
	}
	

	@Given("^Click on close$")
	public void click_on_close() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
	     String xpathclose="//p[contains(text(),'Close')]";
	     this.performAction("click",null, this.identifyElement("xpath", xpathclose));
	      
	}
	
	@Given("^verify text as \"([^\"]*)\"$")
	public void verify_text_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    String xpathTextAfterClose="//p[contains(text(),'Mouse out of the viewport pane and see a modal window appear.')]";
	    this.performAction("gettext",null, this.identifyElement("xpath", xpathTextAfterClose));
	    this.verifyValues(arg1, xpathTextAfterClose);
	    
	}

	


}
