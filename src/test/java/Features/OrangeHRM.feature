Feature: OrangeHRM Login

  Scenario: Logo presence on OrangeHRM LoginPage
    Given I launch Chrome browser
    When I open orange hrm homepage
    Then I verify that the logo present on page
    And close browser

  Scenario Outline: Login OrangeHRM
    Given I launch Chrome browser
    When I open orange hrm homepage
    Then I enter "<Username>" and "<Password>"
    Then I should enter successfully
    And close browser
    Examples:
    |Username|Password|
    |Admin   |admin123|
    |admin   |admin12 |