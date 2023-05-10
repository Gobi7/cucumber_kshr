#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template


Feature: Flipkart purchase

  #Scenario: Flipkart SAMSUNG Mobile purchase
    #Given user launch the brower
    #And user login with credentials
    #When search for samsung ultra mobile
    #And validate the mobile
    #And take screenshot of the chosen product
    #But close the browser

  #Scenario: Flipkart SAMSUNG Mobile purchase
    #Given user launch the brower
    #And user login with credentials
    #When search for samsung ultra mobile using one dim
      #| samsung s20 ultra | samsung s21 ultra | samsung s22 ultra |
    #And validate the mobile
    #And take screenshot of the chosen product
    #But close the browser

  #Scenario: Flipkart SAMSUNG Mobile purchase
    #Given user launch the brower
    #And user login with credentials
    #When search for samsung ultra mobile using one dim map
      #| samsung | samsung s21 ultra |
      #| realme  | realme narzo 50   |
      #| redmi   | redmi note 10 pro |
    #And validate the mobile
    #And take screenshot of the chosen product
    #But close the browser

    Scenario Outline:
    Given user launch the brower
    And user login with credentials
    When search for samsung ultra mobile"<mobiles>"
    And validate the mobile
    And take screenshot of the chosen product
    But close the browser
    
    Examples:
    |mobiles|
    |iphone|
    |vivo|
    |one plus|
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    