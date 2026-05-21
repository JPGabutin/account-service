# Account Service API

Service with account creation and retrieval functionality.

## Tech Stack

- Java 8
- Spring Boot 2.6
- Spring Web
- Spring Data JPA
- Hibernate
- H2 Database
- JUnit 5
- Mockito

---

## Prerequisites

Ensure the following are installed:

- Java 8
- Maven

Verify:

```bash
java -version
mvn -version
```

---

## Setup & Run

Clone the repository:

```bash
git clone git@github.com:JPGabutin/account-service.git
cd account-service
```

Run the application:

```bash
mvn spring-boot:run
```

Application runs on:

```txt
http://localhost:8080
```

---

## H2 Database

H2 console:

```txt
http://localhost:8080/h2-console
```

Connection settings:

```txt
JDBC URL: jdbc:h2:mem:testdb
Username: sa
Password:
```

---

## API Endpoints

### Create Account

**POST** `/accounts`

Example request:

```json
{
	"customerName": "Test",
	"customerMobile": "09081234567",
	"customerEmail": "test@gmail.com",
	"address1": "test",
	"accountType": "S"
}
```

Success Response — HTTP 201

```json
{
	"customerNumber": 1,
	"transactionStatusCode": 201,
	"transactionStatusDescription": "Customer account created"
}
```

Validation Failure — HTTP 400

```json
{
	"transactionStatusCode": 400,
	"transactionStatusDescription": "Email is required field"
}
```

---

### Get Account

**GET** `/accounts/{id}`

Example:

```txt
GET /accounts/1
```

Success Response — HTTP 302

```json
{
	"customerNumber": 1,
	"customerName": "Test",
	"customerMobile": "09081234567",
	"customerEmail": "test@gmail.com",
	"address1": "test",
	"savings": [],
	"transactionStatusCode": 302,
	"transactionStatusDescription": "Customer Account found"
}
```

Failure Response — HTTP 401

```json
{
	"transactionStatusCode": 401,
	"transactionStatusDescription": "Customer not found"
}
```

---

## Running Tests

Run all tests:

```bash
mvn test
```

---

## Project Structure

```txt
api/
 ├── controllers/
 ├── dto/
 └── exception/

component/account/
 ├── domain/
 └── service/

infrastructure/
 └── persistence/
```
