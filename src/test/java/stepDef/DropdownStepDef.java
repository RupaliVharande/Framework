package stepDef;

import cucumber.api.java.en.Given;
import generic.SeleniumBase;

public class DropdownStepDef extends SeleniumBase
{

	@Given("^Click on DropDown$")
	public void click_on_DropDown() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    String xpathDropDown="//a[contains(text(),'Dropdown')]";
	    this.performAction("click",null,this.identifyElement("xpath", xpathDropDown));
	}

	 @Given("^Select as \"([^\"]*)\"$")
	 public void select_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 String idDropdown="dropdown";
		 this.performAction("selectByVisibleText","Option 1",this.identifyElement("id",idDropdown));
	}
    
	}
    
	
	
	

