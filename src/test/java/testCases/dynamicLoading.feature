   
   Feature: To verify Dynamic Loading Functionality
   
    @dl
    Scenario:To verify total no of links on home page
    Given Launch "chrome" brower and open "https://the-internet.herokuapp.com/" application
    And Verify home page by "current url" with "https://the-internet.herokuapp.com/"
    And Click on Dynamic Loading
    And Click on Example 1 Link
    And Click on Start 
    Then verify Hello World!  
     
   
    
