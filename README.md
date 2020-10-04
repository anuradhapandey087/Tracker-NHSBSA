#Step 1:

1) Set default browser from App.properties
Eg: browser=chrome  // For Chrome Browser Execution
    browser=firefox  // For Firefox Browser Execution
    
#Step 2:   
Select "TestRunner" and run 

Note: Driver Compatible with Browser Version 
Chrome_mac Version_77
Chrome_win Version_85
Firefox_win Version_81

#Command for Execution of TestRunner using Mac Terminal

mvn clean install test -Dtest=TestRunner

