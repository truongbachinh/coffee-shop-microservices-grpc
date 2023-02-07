## Introduction

This is a sample spring boot microservices project with gRPC.

## Technologies Used

* Spring Boot
* PostGreSQL
* Hibernate
* gRPC

## IDE used

* IntelliJ IDEA

## API Signatures

Here I have run this application in localhost and 8899 port. You can change the port as you wish.

### http://localhost:8899/create-user
### http://localhost:8899/create-list-user (create list users)

This API will save a user in users database. (a record will insert to users table).

### http://localhost:8899/users

This API will give details of all the users as a List.

### http://localhost:8899/user/{userId}

This API will give details of the user, that we send the user id in the url.

### http://localhost:8899/delete-user/{userId}
### http://localhost:8899/delete-list-users (delete list users)
This API will give delete the users, that we send the user id in the url or list user id as payload .(delete the record of that user from
users table)

### http://localhost:8899/update-user

This API will update the details of a user. (update the user table)

### Import project to IDE

First you must clone the project from the GitHub repository and then open the project using IntelliJ as below.

* File -> Open -> select your project

### Create the Database

Create a database as _**101_digital_the_coffee_shop**_ in your PostGreSQL tool. You can create your own database. In my
case I used the database as _**101_digital_the_coffee_shop**_.

## Let’s test the API in Postman folder
