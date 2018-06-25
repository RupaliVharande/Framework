


Feature: To verify A/B Testing Functionality
  
  		@ff
  		Scenario:To verify substring in paragraph
  		Given Launch "firefox" brower and open "https://the-internet.herokuapp.com/" application
  		And Verify home page by "current url" with "https://the-internet.herokuapp.com/"
  		And click on A/B Testing
  		And verify text 