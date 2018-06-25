Feature: To verify Disappearing Elements Functionality
  
  		@ff
  		Scenario:To verify all disappearing elements
  		Given Launch "firefox" brower and open "https://the-internet.herokuapp.com/" application
  		And Verify home page by "current url" with "https://the-internet.herokuapp.com/"
  		And click on Disappearing Elements
  		And click on Home 
  		And click on About and verify text as "Not Found"
  		And Click on Contact Us and verify text as "Not Found"
  		And Click on portfolio and verify text as "Not Found"