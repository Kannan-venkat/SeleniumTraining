Feature: To validate the account creation of fb application

Scenario: To create new account
Given To launch the browser and maximise the window
When To launch url of fb application
And To click the create new account button
And To pass firstname in first text box
|Kannan|Dhevaki|Venkatachalam|Devi|
And To pass secondname in secondname text box
And To pass mobileno or email in secondname text box
|kannanvenkat589@gmail.com|Kannn@078612345|Kannanvenkat143@gmail.com|789456|
|abc@gmail.com|4589|def@gmail.com|974562|
|ghi@yahoo.com|78956|jklm@gmail.com|69546|
And To create new password using new password text box
Then To close the chrome browser