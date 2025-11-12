# 💳 Digital Bank Backend API

This project is a backend API for a small digital bank. It provides core banking functionalities such as customer management, account operations, transaction processing, and card handling.

The current structure includes only a **Controller** and a **Service** layer.

---

### 🚀 Project Goals

### 1. Data Model & Persistence Layer
- Design and implement the database schema.
- Create Transaction table and entity.
- Improve existing entities and define relationships:
    - **One-to-Many**
    - **Many-to-One**
    - **Many-to-Many**
- Ensure real data can be stored and retrieved from the database.

### 2. Create an endpoint that returns all transactions during a period of time belonging to a specific card of a customer, identified by their customerId.

### 3. Error Handling
- Implement custom exception classes.
- Provide meaningful error messages and appropriate HTTP status codes.

### 4. Authorization
- Implement a login system with roles.
- Secure the API using **JWT** or another suitable authorization method.

### 5. Unit Testing
- Create a unit test class for `AccountService`.
- Use mocking frameworks to isolate dependencies and validate business logic.

### 6. Bug Fixing & Refactoring
- Identify and fix any existing bugs.
- Improve code readability, maintainability, and performance.


Swagger:
http://localhost:8080/swagger-ui/index.html

Database:
http://localhost:8080/h2-console