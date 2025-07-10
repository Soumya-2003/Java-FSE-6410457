# 🔐 Spring Boot JWT Authentication Service

This Spring Boot application provides a JWT authentication service that accepts Basic Authentication credentials and returns a JWT token.

## Features

- **Authentication Controller**: Handles `/authenticate` endpoint
- **JWT Token Generation**: Creates JWT tokens with HS256 algorithm
- **Basic Authentication**: Reads and decodes Authorization header
- **Security Configuration**: Configured to allow unauthenticated access to authenticate endpoint

## API Endpoint

### POST /authenticate

Accepts Basic Authentication credentials and returns a JWT token.

**Request:**

```bash
curl -s -u user:pwd http://localhost:8090/authenticate
```

**Response:**

```json
{
  "token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1c2VyIiwiaWF0IjoxNTcwMzc5NDc0LCJleHAiOjE1NzAzODA2NzR9.t3LRvlCV-hwKfoqZYlaVQqEUiBloWcWn0ft3tgv0dL0"
}
```

SCREENSHOT OF THE OUTPUT IN POSTMAN

![alt text](<Screenshot 2025-07-10 212604.png>)


## Implementation Details

### Step 1: Authentication Controller and Security Configuration

- `AuthenticationController` handles the `/authenticate` endpoint
- `SecurityConfig` configures Spring Security to allow unauthenticated access to the endpoint

### Step 2: Authorization Header Processing

- Reads the `Authorization` header from the request
- Decodes the Base64 encoded credentials
- Extracts username and password from the decoded string

### Step 3: JWT Token Generation

- Validates the user credentials (currently accepts any username with password "pwd")
- Generates a JWT token using the `JwtUtil` class
- Returns the token in JSON format

## Security Notes

- The current implementation uses a simple credential validation (password must be "pwd")
- In production, you should integrate with a proper user database
- The JWT secret key should be externalized and secured
- Consider adding proper error handling and logging

