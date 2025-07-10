## REST - Country Web Service

A simple Spring Boot RESTful web service that returns country details (specifically India) in JSON format.

### 🧩 Features

- Exposes a single REST endpoint: /country

- Returns static country information for India

- Uses Spring Boot with Java-based configuration

- Lightweight and easy to understand for learning purposes

### 🌐 REST API Endpoint

    GET `/country`

    Example Request: `GET http://localhost:8083/country`

### Screenshot of the output in Browser

![alt text](<Screenshot 2025-07-10 193820.png>)

### Screenshot of the output in Postman

![alt text](<Screenshot 2025-07-10 193854.png>)

### 📚 SME Notes

- What happens in the controller method?

  The getCountryIndia() method is mapped to /country and returns a Country object. Spring automatically serializes it to JSON.

- How is the bean converted into JSON?

  Spring Boot uses the Jackson library to serialize Java objects to JSON automatically.
