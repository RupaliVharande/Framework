package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import generic.SeleniumBase;

public class DragandDropStefDef extends SeleniumBase 
{
	@Given("^click on Drag and Drop$")
	public void click_on_Drag_and_Drop() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String xpathDragandDrop="//a[contains(text(),'Drag and Drop')]"; 
		this.performAction("click",null, this.identifyElement("xpath",xpathDragandDrop));
	    
	}

	@Given("^Drag and Drop Images$")
	public void drag_and_Drop_Images() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	
    // Write code here that turns the phrase above into concrete actions
	    
		/*String xpathimage1="//*[@id=\"content\"]/div/div[1]/img";
		String xpathImageText="//h5[contains(text(),'name: user1')]";
		
		String actualImageText=this.mouseHoverOperation(this.identifyElement("xpath", xpathimage1),this.identifyElement("xpath", xpathImageText));
		String expectedImageText="name: user1";
		this.verifyValues(actualImageText, expectedImageText);*/
		String xpathFrom="//div[@id='column-a']";
		String xpathTo="//div[@id='column-b']";
		this.dragandDrop(this.identifyElement("xpath", xpathFrom),this.identifyElement("xpath", xpathTo));
		
		

		
		
		
	}


}
