package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import generic.SeleniumBase;

public class DynamicControlsStepDef extends SeleniumBase
{
	
	@Given("^click on Dynamic Controls$")
	public void click_on_Dynamic_Controls() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
       String xpathDynamicControls="//a[contains(text(),'Dynamic Controls')]";
       this.performAction("click",null,this.identifyElement("xpath",xpathDynamicControls));
	}

	@Given("^Click on Remove Button$")
	public void click_on_Remove_Button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String xpathRemoveButton="//button[contains(text(),'Remove')]";
		
		this.performAction("click",null,this.identifyElement("xpath", xpathRemoveButton));
		By by = null;
		this.explicitWait(by);
		
		  
	}

	@Given("^Click on Add$")
	public void click_on_Add() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String xpathAddButton="//button[contains(text(),'Add')]";
		this.performAction("click",null,this.identifyElement("xpath", xpathAddButton));
		By by = null;
		this.explicitWait(by);
		
	    
	}


}
