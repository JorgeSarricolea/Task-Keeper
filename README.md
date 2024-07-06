## Table of Contents

1. [Introduction](#introduction)

2. [Getting Started](#getting-started)
   - 2.1 [Prerequisites](#prerequisites)
   - 2.2 [Instructions](#instructions)
   
3. [Database Schema](#database-schema)
   - 4.1 [Table: `Tasks`](#table-tasks)
   
4. [Project Features](#project-features)
   - 4.1 [Front-End](#front-end)
   - 4.2 [Back-End](#back-end)
   
5. [Usage](#usage)

# Introduction

The application is a task management system built using Java 8 and Spring Boot MVC. It leverages Maven for project management and Bootstrap for responsive design. Mybatis is employed for ORM, facilitating seamless interaction with any database through a modularized data connection dependency. The project consists of three main screens: a welcoming home screen featuring a task registration button, a task creation screen capturing task details like name, description, and start date, and a listing screen displaying all registered tasks. 
# Getting started

## Prerequisites
- Java 8
- Maven
- MySQL

> [!IMPORTANT]
Before you begin, make sure you have all these development tools installed

## Instructions

1. Clone the repository:

```
git clone https://github.com/JorgeSarricolea/Task-Keeper/
cd Task-Keeper
```

2. Install dependencies using Maven:

```
mvn clean install
```

3. Set up MySQL:

> [!IMPORTANT]
> Ensure MySQL is installed and running on your local machine.

Create a new MySQL database:

```
CREATE DATABASE rc_todo_db;
```

4. Run the application:

```
mvn spring-boot:run
```

## Database Schema:

1. Configure database connection:

```
spring.datasource.url=jdbc:mysql://localhost:3306/rc_todo_db
spring.datasource.username=your_database_username
spring.datasource.password=your_database_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
```

### Table: `Tasks`

| Column       | Type         | Constraints        | Description                                   |
|--------------|--------------|--------------------|-----------------------------------------------|
| `id`         | bigint       | PRIMARY KEY        | Unique identifier, auto-incremented            |
| `name`       | varchar(255) | NOT NULL           | Name of the task                              |
| `description`| text         |                    | Description of the task                       |
| `startDate`  | date         |                    | Start date of the task                        |

**- Task Table:** Stores information about tasks, including their unique identifier (`id`), name (`name`), optional description (`description`), and start date (`startDate`). Each task can have its details managed within the system.

```
CREATE TABLE tasks (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description TEXT,
    startDate DATE
);
```

> [!TIP]
> You can use this query to create the table directly in terminal or the DB editor you are using.

# Project Features

## Front-End

### Task Management
- Displays a list of all tasks with options to view, edit, and delete each task.
- Implements pagination for managing large datasets effectively.

### Creating and Editing Tasks
- Provides a form to create a new task with fields for name, description, and start date.
- Validates input fields to prevent submission of empty data.
- Allows users to modify existing tasks with updated details.
- Ensures data integrity through input validation before saving changes.

### Task Deletion
- Requires user confirmation before permanently deleting a task to prevent accidental deletions.

### User Interface
- Enhances user experience by providing consistent navigation across different pages.
- Includes links for easy access to various sections of the application.
  
## Back-End

### CRUD Operations
- Supports CRUD operations (Create, Read, Update, Delete) for tasks.
- Ensures data validation and integrity checks during all operations.

### User Input Validation
- Validates user input on both front-end and back-end to prevent submission of empty or invalid data.
- Provides feedback to users on validation errors to improve data entry accuracy.

## User Experience
- Implements a confirmation dialog for deleting tasks to confirm user intent and prevent accidental deletions.

# Usage

- Home: http://localhost:8080/
- Tasks list: http://localhost:8080/tasks
- Create new task: http://localhost:8080/add-task
