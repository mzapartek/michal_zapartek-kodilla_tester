Feature: FizzBuzz

  Scenario Outline: Check number

    Given number is <number>
    When I check the number
    Then I should get "<result>"

    Examples:
      | number | result   |
      | 3      | Fizz     |
      | 5      | Buzz     |
      | 15     | FizzBuzz |
      | 7      | None     |