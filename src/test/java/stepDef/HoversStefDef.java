package stepDef;

import cucumber.api.java.en.Given;
import generic.SeleniumBase;

public class HoversStefDef extends SeleniumBase
{
	@Given("^click on Hovers$")
	public void click_on_Hovers() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    String xpathHover="Hovers";
	    this.performAction("click",null,this.identifyElement("linktext", xpathHover));
	}

	@Given("^Hover mouse on image(\\d+)$")
	public void hover_mouse_on_image(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String xpathimage1="//*[@id=\"content\"]/div/div[1]/img";
		String xpathImageText="//h5[contains(text(),'name: user1')]";
		
		String actualImageText=this.mouseHoverOperation(this.identifyElement("xpath", xpathimage1),this.identifyElement("xpath", xpathImageText));
		String expectedImageText="name: user1";
		this.verifyValues(actualImageText, expectedImageText);
		
	    
	}

}
