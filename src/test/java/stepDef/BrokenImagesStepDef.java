package stepDef;

import java.util.List;

import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import generic.SeleniumBase;

public class BrokenImagesStepDef extends SeleniumBase
{
	String xpathBrokenImageLink="//a[contains(text(),'Broken Images')]";
	String tagNameImages="img";
	@Given("^click on Broken Images$")
	public void click_on_Broken_Images() throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
		
		 this.performAction("click",null, this.identifyElement("xpath", xpathBrokenImageLink));
		
	    
	}
	
	
	@Given("^Verify number broken images is (\\d+)$")
	public void verify_number_broken_images_is(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		this.identifyElements("tagname", tagNameImages);
		int actualCount=this.getCountofBrokenImages(this.identifyElements("tagname", tagNameImages));
		this.verifyValues(actualCount,arg1);
		
	}


	

	
}
