Feature: To verify Forgot Password Functionality
  
  		@ff
  		Scenario:To verify Forgot Password Message
  		Given Launch "firefox" brower and open "https://the-internet.herokuapp.com/" application
  		And Verify home page by "current url" with "https://the-internet.herokuapp.com/"
  		And click on Forgot Password
  		And Pass valid email
  		And click on Retrieve Password
  	