Feature: Conduit CRUD feature 
Scenario: Login into App
Given User is on login Page 
When User provide "deepthiraoappana@gmail.com" and "Conduit123"
Then User display home page

Scenario: Create new Article
Given User should be on New Article page 
When User enters  Article details
| title | Desc | content | tag |
Then Article will be created

