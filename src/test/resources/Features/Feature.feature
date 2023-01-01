Feature: feature to test add user and delete user

Scenario: check login feature

Given user is on login page
When user clicks login button
And user adds customer
|Christopher |Connely |L789C349 |
|Frank	|Christopher	|A897N450 |
|Christopher	|Minka	|M098Q585 |
|Connely	|Jackson	|L789C349 |
|Jackson	|Frank	|L789C349 |
|Minka	|Jackson	|A897N450 |
|Jackson	|Connely	|L789C349 |
|Lawrence	|Zimmerman	|L789C349 |
|Mariotte	|Tova	|L789C349 |
And user checks if the user is added successfully
|Christopher |Connely |L789C349 |
|Frank	|Christopher	|A897N450 |
|Christopher	|Minka	|M098Q585 |
|Connely	|Jackson	|L789C349 |
|Jackson	|Frank	|L789C349 |
|Minka	|Jackson	|A897N450 |
|Jackson	|Connely	|L789C349 |
|Lawrence	|Zimmerman	|L789C349 |
|Mariotte	|Tova	|L789C349 |
Then user deletes specific customers
 |Jackson	|Frank	|L789C349 |
 |Christopher |Connely |L789C349 |

