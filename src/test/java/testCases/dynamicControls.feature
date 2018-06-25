Feature: To verify Dynamic Controls Functionality
  
  		@ff
  		Scenario:To verify dynamic controls
  		Given Launch "firefox" brower and open "https://the-internet.herokuapp.com/" application
  		And Verify home page by "current url" with "https://the-internet.herokuapp.com/"
  		And click on Dynamic Controls
  		And Click on Remove Button
  		And Click on Add 