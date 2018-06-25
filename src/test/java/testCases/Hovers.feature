Feature: To verify Hovers Functionality
  
  		@ff
  		Scenario:To verify Hovers Actions
  		Given Launch "firefox" brower and open "https://the-internet.herokuapp.com/" application
  		And Verify home page by "current url" with "https://the-internet.herokuapp.com/"
  		And click on Hovers
  		And Hover mouse on image1
  		
  	