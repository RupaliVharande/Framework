package framework.automationframework;
import generic.FaceApp;
import generic.SeleniumBase;



public class AppTest1 
{
   SeleniumBase s2=new SeleniumBase();
   public static void main(String[] args)
   {
	   AppTest1 a1=new AppTest1();
	   
	   //a1.verifyFacebookPage();
	   a1.VerifyIncorrectCredentials();
   }
   
   
   /*public void verifyFacebookPage()
   {
	   s2.lanunchApplication("chrome","https://www.facebook.com/");
	   
      String expectedtitle="Facebook – log in or sign up";
      String actualtitle=s2.getPageDetails("title");
      s2.verifyValues(actualtitle, expectedtitle);
      s2.closeApplication();
  	
   }
   
 //public void VerifyHeaderText()
   {   
	   
	   String xpathexpectedLabelText="//label[contains(text(),'Email or Phone')]";
	   //String actualFirstLabel="Email or Phone";
	  // s2.verifyValues(actualFirstLabel, expectedLabelText);
	   String xpathactualFirstLabel=s2.performAction("gettext",null,s2.identifyElement("xpath",xpathexpectedLabelText));
	   String expectedSecondLabel="//label[contains(text(),'Password')]";
	   //String actualSecondLabel="Password";
	  // s2.verifyValues(actualSecondLabel, expectedSecondLabel);
	   String xpathactualSecondLabel=s2.performAction("gettext",null,s2.identifyElement("xpath",expectedSecondLabel));
	   
   }*/
   
   public void VerifyIncorrectCredentials()
   {
	   String xpathUserNameTextBox="//input[@name='email']";
	   String xpathPasswordTextBox="//input[@name='pass']";
	   String xpathLoginButton="//input[@value='Log In']";
	   String xpathactualErrorMessage1="//*[@id=\"globalContainer\"]/div[3]/div/div/div";
	   
	   String xpathactualErrorMessage2="//a[contains(text,'Sign up for an account.')]";
	   s2.lanunchApplication("chrome","https://www.facebook.com/");
	   String expectedtitle="Facebook – log in or sign up";
	      String actualtitle=s2.getPageDetails("title");
	      s2.verifyValues(actualtitle, expectedtitle);
     
     
       
      // String actualHeader=s1.performAction("gettext", null, s1.identifyElement("xpath",expectedtitle));
       //s2.verifyValues(actualHeader, expectedHeader);
       
       s2.performAction("settext","sdfsgv", s2.identifyElement("xpath",xpathUserNameTextBox));
       s2.performAction("settext", "efwef", s2.identifyElement("xpath",xpathPasswordTextBox));
       s2.performAction("click", null, s2.identifyElement("xpath",xpathLoginButton));
       
       String expectedErrorMessage1="The email address or phone number that you've entered doesn't match any account. Sign up for an account.";
       String actualEroorMessage1=s2.performAction("gettext", null, s2.identifyElement("xpath",xpathactualErrorMessage1));
       
       s2.verifyValues(actualEroorMessage1,expectedErrorMessage1);
       
       /*String expectedErrorMessage2="Sign up for an account.";
       String actualEroorMessage2=s2.performAction("gettext", null, s2.identifyElement("xpath",xpathactualErrorMessage2));
       
       s2.verifyValues(actualEroorMessage2,expectedErrorMessage2);
       */
       
	   s2.closeApplication();
	 
   }
   
}
