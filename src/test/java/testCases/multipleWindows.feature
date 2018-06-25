Feature: To verify Multiple Window Functionality
      
   
    @ff
    Scenario:To verify text on Multiple Window
    Given Launch "firefox" brower and open "https://the-internet.herokuapp.com/" application
  	And Verify home page by "current url" with "https://the-internet.herokuapp.com/"
    And Click on Multiple Window 
    And Click on Click Here Link
    And Verify page text
   
 