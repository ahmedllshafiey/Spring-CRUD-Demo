# Spring Boot CRUD Application

## Introduction

This project is a simple CRUD (Create, Read, Update, Delete) application built using Spring Boot. The application manages a list of staff members, allowing users to add new staff, view staff details, update staff information, and delete staff records.

## Features

- Add new staff members
- View details of all staff members
- Update existing staff member information
- Delete staff members
- Validation for staff name, position, and salary

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- Spring MVC
- H2 Database (for in-memory database)
- Thymeleaf (for front-end templates)
- JUnit 5 (for testing)

## Getting Started

### Prerequisites

- Java 11 or higher
- Maven or Gradle

### Installation

1. Clone the repository:

```bash
git clone https://github.com/your-username/spring-boot-crud.git
```

2. Navigate to the project directory:

```bash
cd spring-boot-crud
```

3. Build the project using Maven:

```bash
mvn clean install
```

4. Run the application:

```bash
mvn spring-boot:run
```

### Running Tests

To run the tests, use the following command:

```bash
mvn test
```

## Project Structure

- `com.app.springcrud`
    - `controller`
        - `StaffController.java`: Handles HTTP requests and returns views.
    - `interfaces`
        - `StaffRepository.java`: Spring Data JPA repository for `Staff` entity.
    - `repository`
        - `StaffCustomRepository.java`: Custom repository for managing staff list in memory.
    - `service`
        - `StaffService.java`: Contains business logic for managing staff.
    - `Staff.java`: Entity class representing a staff member.
    - `SpringCrudApplication.java`: Main application class.
    - `Constants.java`: Contains constant values used in the application.
    - `SpringCrudApplicationTests.java`: Contains tests for the application.

## Usage

### Adding a New Staff Member

1. Go to the home page (`/`).
2. Fill in the staff details (name, position, salary).
3. Submit the form to add the staff member.

### Viewing Staff Details

1. Navigate to the staff details page (`/staff`).
2. View the list of all staff members.

### Updating Staff Information

1. On the staff details page, click on the staff member you want to update.
2. Update the necessary details.
3. Submit the form to save the changes.

### Deleting a Staff Member

1. On the staff details page, click on the delete button next to the staff member you want to remove.

## Validations

- Staff name cannot be blank.
- Staff position cannot be blank.
- Staff salary must be greater than or equal to 1000.

## License

This project is licensed under the MIT License.

## Acknowledgements

- Spring Boot
- Spring Data JPA
- Thymeleaf
- H2 Database
- JUnit 5