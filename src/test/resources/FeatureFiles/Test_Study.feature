Feature: Test Case Study


  Scenario: Validate Register And Payment
    Given Navigate to "https://connect-th.beinsports.com/en" of CarsGuide Website
    When Click Subscribe button
    And Choose One Month Package
    And Choose Monthly Pass with One Week Free Trial Package Price
    And Write Name As "Baris"
    And Write Surname As "Göksu"
    And Write Email As randomly
    And Write Password As "Hg2686457"
    And Click Create Account Button
    Then Should see Email Info Pop-up
    And Click Ignore email verification alert
    When Click Agreed to the Terms And Conditions Checkbox
    And Click Pay Now Button
    Then Expect for a total charge of "1.00" since this is a free trial package
    When Write CarD Name as "Test Test"
    And Write CarD Number as "5526080000000006"
    And Select Card ExpDate Month as "01"
    And Select Card ExpDate Year as "2022"
    And Write Card Verification code as "123"
    Then Click Confirm My Payment
    Then Should See Error Text as "The transaction has been denied"







    