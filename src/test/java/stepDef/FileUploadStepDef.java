package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import generic.SeleniumBase;

public class FileUploadStepDef extends SeleniumBase
{
	@Given("^click on File Upload$")
	public void click_on_File_Upload() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    String xpathFileUpload="//a[contains(text(),'File Upload')]";
	    this.performAction("click",null,this.identifyElement("xpath", xpathFileUpload));
	}

	@Given("^Click on Choose file$")
	public void click_on_Choose_file() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String xpathChoosefile="//input[@id='file-upload']";
		this.performAction("click",null,this.identifyElement("xpath", xpathChoosefile));
	
        
	    
	}

	
	@Given("^Click on Upload$")
	public void click_on_Upload() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String xpathUpload="//input[@id='file-submit']";
		this.performAction("click",null,this.identifyElement("xpath", xpathUpload));
		
	    
	}

	@Given("^Verify text as \"([^\"]*)\"$")
	public void verify_text_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String xpathactualText="File Uploaded!\r\n";
		String actualTextAfterUpload=this.performAction("gettext",null,this.identifyElement("xpath", xpathactualText));
	    
	}

}
