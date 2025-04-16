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

Scenario:  View Article
Given User should be on Global feed page 
When User selects an article "Article title"
Then Article details page will be displayed

Scenario: Edit Article
Given Article detail page must be displayed 
When User update article detail
Then Article detail will be updated


Scenario:  Delete Article
Given Article details page will be displayed
When User delete article
Then article will be deleted
