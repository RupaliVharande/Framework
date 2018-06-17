package framework.automationframework;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;

import generic.Base;
import generic.SeleniumBase;
import junit.framework.Assert;

/**
 * Hello world!
 *
 */ 
public class App  
{
	SeleniumBase s1=new SeleniumBase();
    public static void main( String[] args )
    {
    	/*int i=10;
    	Student rupali=new Student();
    	Student viky=new Student(10);
    	Student amar=new Student(20,"Amar");
    	Student deepali=new Student("Dipali",30);
    	Student aditya=new Student();
        System.out.println( "Hello World!" );
        
        EnggStudent cal=new EnggStudent();
        cal.calmarks();
        Student r1=new EnggStudent();
        r1.calmarks();*/
    	
    	
        //App v1=new App();
      //  v1.verifyLinkCountOnPage();
       // v1.verifyFormAuntheticationIncorrectCredential();
       // v1.verifyFormAuntheticationCorrectCredential();
      
        //v1.dropdownVerified();
        //v1.multiplewindowVerified();
        //v1.FrameWorking();
        
        Base b1=new Base();
        //b1.writeExel();
        HashMap<String, String> hm = b1.readExel();
        hm.getOrDefault(hm, null);

        
        
        
    }
    
    
    
   public void verifyLinkCountOnPage()
    {
	  
	   s1.lanunchApplication("firefox","https://the-internet.herokuapp.com/");
       int expectedLinkCount=41;
       String expectedtitle="The Internet";
       String actualtitle=s1.getPageDetails("title");
       s1.verifyValues(actualtitle, expectedtitle);
       int actualLinkCount=s1.identifyElements("tagname","a").size();
       s1.verifyValues(actualLinkCount, expectedLinkCount);
       s1.closeApplication();
    	
    }
    
   
   
   
   public void verifyFormAuntheticationIncorrectCredential()
   {
	   String idErrorMessage="flash";
	   String expectedErrorMessage="Your username is invalid!";
	   String xpathLogin="//a[contains(text(),'Form Authentication')]";
	   String xpathLoginHeader="//h2[contains(text(),'Login Page')]";
	   String xpathLoginSubheader="//h4[@class='subheader']";
	   String xpathFirstLable="//label[contains(text(),'Username')]";
	   String xpathUserNameTextBox="//input[@name='username']";
	   String xpathSecondLable="//label[contains(text(),'password')]";
	   String xpathPasswordTextBox="//input[@name='password']";
	   String xpathLoginButton="//i[@class='fa fa-2x fa-sign-in']";
	   String expectedHeader="Login Page";
	   s1.lanunchApplication("firefox","https://the-internet.herokuapp.com/");
	   String expectedtitle="The Internet";
       String actualtitle=s1.getPageDetails("title");
       s1.verifyValues(actualtitle, expectedtitle);
       
     
       s1.performAction("click", null, s1.identifyElement("xpath",xpathLogin));
       
       String actualHeader=s1.performAction("gettext", null, s1.identifyElement("xpath",xpathLoginHeader));
       s1.verifyValues(actualHeader, expectedHeader);
       
       s1.performAction("settext","sdfsgv", s1.identifyElement("xpath",xpathUserNameTextBox));
       s1.performAction("settext", "efwef", s1.identifyElement("xpath",xpathPasswordTextBox));
       s1.performAction("click", null, s1.identifyElement("xpath",xpathLoginButton));
       
       String actualEroorMessage=s1.performAction("gettext", null, s1.identifyElement("id",idErrorMessage));
       
       
       s1.verifyValues(actualEroorMessage.trim().split("×")[0].trim(), expectedErrorMessage);
	   s1.closeApplication();
	   
   }
   
  // public void verifyFormAuntheticationCorrectCredential()
   {
	   
	
	   
	   String idCorrectMessage="flash";
	   String expectedCorrectMessage="You logged into a secure area!";
	   String expectedCorrectMessageAfterLogout="You logged out of the secure area";
	   
	   String xpathLogin="//a[contains(text(),'Form Authentication')]";
	   String xpathLoginHeader="//h2[contains(text(),'Login Page')]";
	   String xpathLoginSubheader="//h4[@class='subheader']";
	   String xpathFirstLable="//label[contains(text(),'Username')]";
	   String xpathUserNameTextBox="//input[@name='username']";
	   String xpathSecondLable="//label[contains(text(),'password')]";
	   String xpathPasswordTextBox="//input[@name='password']";
	   String xpathLoginButton="//i[@class='fa fa-2x fa-sign-in']";
	   String xpathLogoutButton="//a[@class='button secondary radius']";
	 // String xpathGoBackToMainPage="//a[&href='<a href='https://github.com/tourdedave/the-internet']";
	   String expectedHeader="Login Page";
	   s1.lanunchApplication("firefox","https://the-internet.herokuapp.com/");
	   String expectedtitle="The Internet";
       String actualtitle=s1.getPageDetails("title");
       s1.verifyValues(actualtitle, expectedtitle);
     
       s1.performAction("click", null, s1.identifyElement("xpath",xpathLogin));
       
       String actualHeader=s1.performAction("gettext", null, s1.identifyElement("xpath",xpathLoginHeader));
       s1.verifyValues(actualHeader, expectedHeader);
       
       s1.performAction("settext","tomsmith", s1.identifyElement("xpath",xpathUserNameTextBox));
       s1.performAction("settext", "SuperSecretPassword!", s1.identifyElement("xpath",xpathPasswordTextBox));
       s1.performAction("click", null, s1.identifyElement("xpath",xpathLoginButton));
       
       String actualCorrectMessage=s1.performAction("gettext", null, s1.identifyElement("id",idCorrectMessage));
       
       
       s1.verifyValues(actualCorrectMessage.trim().split("×")[0].trim(), expectedCorrectMessage);
       
       s1.performAction("click", null, s1.identifyElement("xpath",xpathLogoutButton));
       String actualCorrectMessageAfterLogout=s1.performAction("gettext", null, s1.identifyElement("id",idCorrectMessage));
       
       s1.verifyValues(actualCorrectMessageAfterLogout.trim().split("!")[0].trim(), expectedCorrectMessageAfterLogout);      
     
       s1.performAction("navigate","https://the-internet.herokuapp.com/",null);
       s1.closeApplication();
           
    
  
	  
	   
   }
   
   public void dropdownVerified()
   {
	   
	   String xpathDropdown="//a[contains(text(),'Dropdown')]";
	   String xpathDropdownHeader="//h3[contains(text(),'Dropdown List')]";
	   String idDropdown="dropdown";
	   
	   String expectedHeader="Dropdown List";
	   s1.lanunchApplication("firefox","https://the-internet.herokuapp.com/");
	   
	   String expectedtitle="The Internet";
       String actualtitle=s1.getPageDetails("title");
       s1.verifyValues(actualtitle, expectedtitle);
       
       s1.performAction("click", null, s1.identifyElement("xpath",xpathDropdown));
       
       String actualHeader=s1.performAction("gettext", null, s1.identifyElement("xpath",xpathDropdownHeader));
       s1.verifyValues(actualHeader, expectedHeader);
        
       

  
       s1.performAction("selectByIndex","2", s1.identifyElement("id",idDropdown));
       s1.performAction("selectByValue","1", s1.identifyElement("id", idDropdown));
       s1.performAction("selectByVisibleText","Option 1",s1.identifyElement("id",idDropdown));
       
      
     s1.closeApplication();
	 
   }
   
   public void multiplewindowVerified()
   {
	   
	   String xpathMulipleWindow="//a[contains(text(),'Multiple Windows')]";
	   String xpathClickhere="//a[contains(text(),'Click Here')]";
	   
       s1.lanunchApplication("firefox","https://the-internet.herokuapp.com/");
	   
	   String expectedtitle="The Internet";
       String actualtitle=s1.getPageDetails("title");
       s1.verifyValues(actualtitle, expectedtitle);
       
       s1.performAction("click",null,s1.identifyElement("xpath",xpathMulipleWindow));
       s1.performAction("click",null,s1.identifyElement("xpath",xpathClickhere));
       
       String parenthandle=s1.getPageDetails("handle");
       s1.performAction("switchwindows", parenthandle,null);
       
       String xpathTextVerify="//h3[contains(text(),'New Window')]";
       String expectedText="New Window";
       try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       String actualText=s1.performAction("gettext", null, s1.identifyElement("xpath",xpathTextVerify));
       s1.verifyValues(actualText, expectedText);
       s1.closeApplication();
       
	   
   }
   
   
   public void FrameWorking()
   {
	   
	   String xpathFrames="//a[contains(text(),'Frames')]";
	   String xpathClicOnNestedFrames="//a[contains(text(),'Nested Frames')]";
	   String xpathFrameBotton = "//frame[@name='frame-bottom']";
	   String xpathFrameTop="//frame[@name='frame-top']";
	   String xpathFrameLeft="//frame[@name='frame-left']";
	   String xpathFrameMiddle="//frame[@name='frame-middle']";
	   String xpathFrameRight="//frame[@name='frame-right']";
       s1.lanunchApplication("firefox","https://the-internet.herokuapp.com/");
	   
	   String expectedtitle="The Internet";
       String actualtitle=s1.getPageDetails("title");
       s1.verifyValues(actualtitle, expectedtitle);
       
       s1.performAction("click",null,s1.identifyElement("xpath",xpathFrames));
       s1.performAction("click",null,s1.identifyElement("xpath",xpathClicOnNestedFrames));
       
       
       
       s1.performAction("switchframe", "child", s1.identifyElement("xpath", xpathFrameBotton));
       
       String xpathTextVerify="//body[contains(text(),'BOTTOM')]";
       String expectedText="BOTTOM";
       String actualText=s1.performAction("gettext", null, s1.identifyElement("xpath",xpathTextVerify));
       s1.verifyValues(actualText, expectedText);
       
       
       /*s1.performAction("switchframe", "parent",null);
       s1.performAction("switchframe", "child",s1.identifyElement("xpath", xpathFrameTop));
       s1.performAction("switchframe", "child",s1.identifyElement("xpath", xpathFrameLeft));
       
       
       String xpathTextLeft="//body[contains(text(),'LEFT')]";
       String expectedTextLeft="LEFT";
       String actualTextLeft=s1.performAction("gettext", null, s1.identifyElement("xpath",xpathTextLeft));
       s1.verifyValues(actualTextLeft, expectedTextLeft);*/
       
       /*s1.performAction("switchframe", "parent",null);
       s1.performAction("switchframe", "child",s1.identifyElement("xpath", xpathFrameTop));
       s1.performAction("switchframe","child",s1.identifyElement("xpath",xpathFrameMiddle));
       
       String xpathTextMiddle="//div[contains(text(),'MIDDLE')]";
       String expectedTextMiddle="MIDDLE";
       String actualTextMiddle=s1.performAction("gettext", null, s1.identifyElement("xpath",xpathTextMiddle));
       s1.verifyValues(actualTextMiddle, expectedTextMiddle);*/
       
       
      
       s1.performAction("switchframe", "parent",null);
       s1.performAction("switchframe", "child",s1.identifyElement("xpath", xpathFrameTop));
       s1.performAction("switchframe","child",s1.identifyElement("xpath",xpathFrameRight));
       
       String xpathTextRight="//body[contains(text(),'RIGHT')]";
       String expectedTextRight="RIGHT";
       String actualTextRight=s1.performAction("gettext", null, s1.identifyElement("xpath",xpathTextRight));
       s1.verifyValues(actualTextRight, expectedTextRight);
       
     
       
       s1.closeApplication();
       
	   
   }
   
   public void brokenImages()
   {
	   String xpathBrokenImages="//a[contains(text(),'Broken Images')]";
	   
	   
	   
       s1.lanunchApplication("firefox","https://the-internet.herokuapp.com/");
	   
	   String expectedtitle="The Internet";
       String actualtitle=s1.getPageDetails("title");
       s1.verifyValues(actualtitle, expectedtitle);
       
       s1.performAction("click",null,s1.identifyElement("xpath",xpathBrokenImages));
       
       
	   s1.closeApplication();
   }
  

}
