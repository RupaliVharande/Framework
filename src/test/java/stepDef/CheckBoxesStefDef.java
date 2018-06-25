package stepDef;

import cucumber.api.java.en.Given;
import generic.SeleniumBase;

public class CheckBoxesStefDef extends SeleniumBase
{
	@Given("^click on CheckBox$")
	public void click_on_CheckBox() throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
		String xpathCheckbox="//a[contains(text(),'Checkboxes')]";
		this.performAction("click",null,this.identifyElement("xpath", xpathCheckbox));
		
	    
	}

	@Given("^Check checkbox$")
	public void check_checkbox() throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
		String xpathCheckBox1="//input[1]";
		this.performAction("click",null,this.identifyElement("xpath",xpathCheckBox1));
		
	    
	}

}
