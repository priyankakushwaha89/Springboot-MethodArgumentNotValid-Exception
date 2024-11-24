# SpringBoot-MethodArguementNotValidException

This Spring Boot project demonstrates how to handle `MethodArgumentNotValidException`, which is commonly thrown when validation on an argument annotated with `@Valid fails. The project is built using Maven and integrates with a relational database to provide a practical example of validating request data and managing validation errors.

## Features
- `Spring Boot`: A framework to build stand-alone, production-grade Spring-based applications.
- `Maven`: Dependency management and build automation.
- `JPA`: Java Persistence API for database operations.
- `MariaDB`: Relational database management system used for storing application data.
- `Custom Exception Handling`: Custom exception handling for DataIntegrityViolationException.
- `Validation`: Input validation to prevent data integrity violations.
- `Swagger`: API documentation and testing.

## Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MariaDB (can be replaced with any other database)
- Swagger

## Getting Started

### Prerequisites

- Java 8 or higher
- Maven 3.6 or higher

### Installation

1. Clone the repository:
   ```sh
   git clone https://github.com/priyankakushwaha89/Springboot-MethodArgumentNotValid-Exception.git
   cd Springboot-MethodArgumentNotValid-Exception

2. Configure the database:

    Update the src/main/resources/application.properties file with your database connection details:
     ```sh
   spring.datasource.url=jdbc:mariadb://localhost:3306/DATABASE_NAME
   spring.datasource.username=USERNAME
   spring.datasource.password=YOUR_PASSWORD
   spring.datasource.driver-class-name=org.mariadb.jdbc.Driver
   spring.jpa.hibernate.ddl-auto=create-drop
   
3. Build the project:
   ```sh
     mvn clean install
4. Run the application:
   ```sh
     mvn spring-boot:run
The application will start on http://localhost:8080.

### Endpoints

1. Test Endpoint
- URL: `/test`
- Method: GET
- Description: Test the API to ensure it's running
- Response: "This is Method Arguement Not Valid Exception Test"

2. Save Data
- URL: `/save`
- Method: POST
- Description: Add new Employee details.
- Request Body: json in postman
  
  ```sh
  {
        "id": 1,
        "name": "priyanka",
        "address": "Ramgarh",
        "age": 21
    }

3. Get All Users Data
- URL: `/show`
- Method: GET
- Description: Returns a list of all Employees details.
  
  ```sh
 [
    {
        "id": 1,
        "name": "priyanka",
        "address": "Ramgarh",
        "age": 21
    },
    {
        "id": 2,
        "name": "Lucky",
        "address": "Dhanbad",
        "age": 31
    }
]


4. Validation
- Name: It should not be empty.
- Address: Please enter valid address
- Age: It should be not empty and the age should be between 18 to 50.



## Exception Handling
The application includes a global exception handler that captures `MethodArguementNotValidException` and returns a meaningful error response.
```sh
{
  
   "name": "Name can not be null",
  "address": "Please enter valid address",
  "age": "Age should be 18"
}
```

## Project Structure

- Employee: Entity class representing a Employee profile.
- EmployeeRepository: Repository interface for CRUD operations on Employee profiles.
- EmployeeController: REST controller for handling Employee-related requests.
- GlobalExceptionHandler: Global exception handler for validation errors.


