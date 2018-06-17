package stepDef;

import org.openqa.selenium.By;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import generic.SeleniumBase;

public class DynamicLoadingStepDef extends SeleniumBase 
{
	
	String xpathDynamicLoading="//a[contains(text(),'Dynamic Loading')]";
    String xpathExample1Link="//a[contains(text(),'Example 1: Element on page that is hidden')]";
    String xpathStartButton="//button[contains(text(),'Start')]";
    String xpathVerifyText="//h4[contains(text(),'Hello World!')]";
    
    
    
@Given("^Click on Dynamic Loading$")
public void click_on_Dynamic_Loading() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
    this.performAction("click",null,this.identifyElement("xpath",xpathDynamicLoading));
}

@Given("^Click on Example (\\d+) Link$")
public void click_on_Example_Link(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    this.performAction("click",null,this.identifyElement("xpath",xpathExample1Link ));
}

@Given("^Click on Start$")
public void click_on_Start() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    this.performAction("click",null,this.identifyElement("xpath",xpathStartButton ));
}

@Then("^verify Hello World!$")
public void verify_Hello_World() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	this.explicitWait(By.xpath(xpathVerifyText));
    String expectedText="Hello World!";
    String actualText=this.performAction("gettext",null,this.identifyElement("xpath",xpathVerifyText));
    this.verifyValues(actualText, expectedText);
    		
}


  
}
