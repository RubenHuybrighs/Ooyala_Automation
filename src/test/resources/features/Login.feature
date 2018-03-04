Feature: To test the login feature of the internet app
	As a user  of the internet app
	I want to be able to login on the internet app
	So that I can reach the secure area
	 
	# ACCEPTANCE CRITERIA:
	# Tested in scenario 1:
	# I can enter my username and password and submit it for authentication
	# Upon successful login, I am re-directed to the secure area
	# I should have the option to log out
	# After logging out I should reach the login page again	
	

	#Scenario 1
	Scenario: log in with valid username and password
	Given I am on the internet website
	When I enter a valid username
	And I enter a valid password
	And I click the login button
	Then I check I am in the secure area
	Then I should be able to log out	