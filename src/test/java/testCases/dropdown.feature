 Feature: To verify Drop Down Functionality
   
    @ff
    Scenario:To Select One Item From Drop Down
    Given Launch "firefox" brower and open "https://the-internet.herokuapp.com/" application
    And Verify home page by "current url" with "https://the-internet.herokuapp.com/"
    And Click on DropDown
    And Select as "Option 1"
    