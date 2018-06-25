Feature: To verify Drag & Drop Functionality
  
  		@ff
  		Scenario:To Drag & Drop 
  		Given Launch "firefox" brower and open "https://the-internet.herokuapp.com/" application
  		And Verify home page by "current url" with "https://the-internet.herokuapp.com/"
  		And click on Drag and Drop
  		And Drag and Drop Images  
  	