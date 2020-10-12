Feature: Get Request Testing

Scenario:
  Given url 'https://gorest.co.in/public-api/users'
  When method GET
  Then status 200