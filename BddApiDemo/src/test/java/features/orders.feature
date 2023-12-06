Feature: weather api

  Scenario: verify create order
    Given  I hit url of  weather  get api endpoint
    When  I pass the url of weather in the request
    Then I recevie the response code as 200


