package stepDef;

import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.*;
import generic.SeleniumBase;


public class HomeStepDef extends SeleniumBase
{

		@Given("^Launch \"([^\"]*)\" brower and open \"([^\"]*)\" application$")
		public void launch_brower_and_open_application(String arg1, String arg2) throws Throwable
		{
		     this.lanunchApplication(arg1,arg2);    
		}
		
		@Given("^Verify home page by \"([^\"]*)\" with \"([^\"]*)\"$")
		public void verify_home_page_by_with(String arg1, String arg2) throws Throwable 
		{
			String expectedtitle=arg2;
	        String actualtitle=this.getPageDetails(arg1);
	        this.verifyValues(actualtitle, expectedtitle);
	      
		}
		
		
		@Given("^Verify link count is (\\d+)$")
		public void verify_link_count_is(int arg1) throws Throwable
		{
			 int expectedLinkCount=arg1;
			 int actualLinkCount=this.identifyElements("tagname","a").size();
		      this.verifyValues(actualLinkCount, expectedLinkCount);
		     
		}
		
		
		@After
		
	
		public void close_browser(Scenario scene) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			this.captureScreenShot(scene.getName());
		    this.closeApplication();
		}


}
