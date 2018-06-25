Feature: To verify Basic Authentication Functionality
  
  		@ff
  		Scenario:To verify username & password
  		Given Launch "firefox" brower and open "https://the-internet.herokuapp.com/" application
  		And Verify home page by "current url" with "https://the-internet.herokuapp.com/"
  		And click on Basic Auth
  		And pass username password
  		And click on Sign in
  		And Click on Cancel
  		And verify text as "Not authorized"