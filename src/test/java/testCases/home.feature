Feature: To verify home page functionality



#  Scenario:To verify total no of links on home page
 #   Given Launch "firefox" brower and open "https://the-internet.herokuapp.com/" application
  #  And Verify home page by "current url" with "https://the-internet.herokuapp.com/"
   
   # And Verify link count is 41
    #And close browser
    
    @smoke
   Scenario Outline:To verify total no of links on home page
    Given Launch "<browser>" brower and open "https://the-internet.herokuapp.com/" application
    And Verify home page by "current url" with "https://the-internet.herokuapp.com/"
    And Verify link count is 41
    And close browser
  
    Examples: 
      | browser  |
      | firefox | 
      | chrome |  
  
  