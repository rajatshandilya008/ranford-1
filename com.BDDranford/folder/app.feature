Feature: Admin

Scenario:   login Feature Test
 Given launch the browser

 Then  enter the valid credintial and login 
 When  check the title with "RANFORD BANK" data
 And   close the browser
 
 
 
 Scenario:   Branch Creation Test 
 Given Launch the browser
 Then  enter the valid credintial and login 
 Then  click on Branches Link and Click on  new Branch link
 Then  create branches 
 When  check branch creatiion successfull or not 
 And   Close the browser