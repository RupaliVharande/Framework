


Feature: To verify Exit Intent Functionality
  
  		@ff
  		Scenario:To Handle New Pop-Up Madal
  		Given Launch "firefox" brower and open "https://the-internet.herokuapp.com/" application
  		And Verify home page by "current url" with "https://the-internet.herokuapp.com/"
  		And click on Exit Intent 
  		And verify title as "THIS IS A MODAL WINDOW"
  		And Click on close
  		And verify text as "Mouse out of the viewport pane and see a modal window appear."