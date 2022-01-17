Feature: Creating a resource

  Scenario Outline: Create a resource successfully
    Given a valid data '<title>' '<body>' <userId>
    When do post in the endpoint
    Then is returned status code <status>
    And the data '<title>' '<body>' '<userId>'

    Examples:
      | title | body | userId | status |
      | foo   | bar  | 1      | 201    |