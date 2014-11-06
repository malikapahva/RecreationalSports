RecreationalSports
==================
- setup to use spring mvc is done, here is some of the details, we can discuss about it on Saturday.

1. domain - Entity class map to table in the database. 
2. dao - Data Access Object, this should be responsible to query/update data from db, please note right now, 
   I have hard coded some values for example but later we need to do setup to connect to db and get data from db.
3. controller - it handles any request from  the view (jsp) and interact with DB to query/update data (Dao)

- under resources directory I have created spring context file "servletContext.xml" under spring package.
This context actually tells spring framework where to look for controllers, views and any other bean and that is defined 
in web.xml (please see under webapps directory) file and tomcat loads it when we deploy the app.

- under webapps directory, we have:
1. resources - all .js, .css and any logo, images that will be used by jsp will go here.
2. WEB-INF/views - all jsp pages will go here.

Using Maven tool for dependency - please see pom.xml file.

When we start working toward building the recsport web app, we really need to do following (I have taken an example):
- create jsp page under views (showteams.jsp) and required .js and .css
- create entity if needed under domain (Team.java) and create table for team in database.
- create dao (TeamDao) to access data from team table
- create or update controller (TeamController) to handle request from the client (jsp): add logic 
to use dao/service to query/update db. 
