Feature: To verify Broken Image Functionality
  
  		@ff
  		Scenario:To count number of broken images
  		Given Launch "firefox" brower and open "https://the-internet.herokuapp.com/" application
  		And Verify home page by "current url" with "https://the-internet.herokuapp.com/"
  		And click on Broken Images
  		And Verify number broken images is 2  
  	