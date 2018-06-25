   
   Feature: To verify Login Page Functionality
   
   Background:
    Given Launch "firefox" brower and open "https://the-internet.herokuapp.com/" application
    And Verify home page by "current url" with "https://the-internet.herokuapp.com/"
    And Click on FormAuthentication
   
   
    @ff
    Scenario:To verify form authentication with correct credentials
    And pass username as "tomsmith" & Password as "SuperSecretPassword!"
    And Click on Login 
    And Verify Message as "You logged into a secure area"
    And Click on Logout
    And Verify Message as "You logged out of the secure area"
 
 
    Scenario:To verify form authentication with incorrect credentials
    And pass username as "tomsmith" & Password as "SuperSecretPassword!"
    And Click on Login 
    And Verify Message as "You logged into a secure area"
 
    
