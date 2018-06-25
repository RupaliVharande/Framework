  
  
  Feature: To verify Frames Functionality
  
  		@ff
  		Scenario:To verify text on Bottom Frame
  		Given Launch "firefox" brower and open "https://the-internet.herokuapp.com/" application
  		And Verify home page by "current url" with "https://the-internet.herokuapp.com/"
  		And click on Frames
  		And Click on Nested Frames
  		And Verify text 