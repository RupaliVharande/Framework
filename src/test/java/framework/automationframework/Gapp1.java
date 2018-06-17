package framework.automationframework;

import org.openqa.selenium.WebDriver;

import generic.SeleniumBase;

public class Gapp1
{
	SeleniumBase s1=new SeleniumBase();
	public static void main(String args[])
	{
		
	}
	
	public void verifyLinkCountOnPage()
    {
	  
	   s1.lanunchApplication("firefox","https://www.facebook.com/");
         int expectedLinkCount=41;
        String expectedtitle="The Internet";
        String actualtitle=s1.getPageDetails("title");
        s1.verifyValues(actualtitle, expectedtitle);
       int actualLinkCount=s1.identifyElements("tagname","a").size();
       s1.verifyValues(actualLinkCount, expectedLinkCount);
        s1.closeApplication();
    	
    }
}
