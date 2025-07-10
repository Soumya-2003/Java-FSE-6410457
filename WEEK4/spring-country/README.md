# Spring Core - Load Country from XML Configuration

This project demonstrates how to load country data from Spring XML configuration files using Spring Core framework.

## Project Overview

An airlines website application that supports booking for four countries with a dropdown selection. The country data is stored in Spring XML configuration and loaded using Spring's IoC container.

### Supported Countries

| Code | Name          |
| ---- | ------------- |
| US   | United States |
| DE   | Germany       |
| IN   | India         |
| JP   | Japan         |

## Features

- **Spring XML Configuration**: Country data configured using XML bean definitions
- **IoC Container**: Uses ApplicationContext to manage beans
- **Property Injection**: Setter-based dependency injection
- **Comprehensive Logging**: Debug logs for constructor and method invocations
- **Maven Build System**: Easy dependency management and build process

## Project Structure

```
src/
├── main/
│   ├── java/com/cognizant/springlearn/
│   │   ├── Country.java              # Country POJO with logging
│   │   └── SpringLearnApplication.java # Main application class
│   └── resources/
│       ├── country.xml               # Spring XML configuration
│       └── logback.xml              # Logging configuration
└── test/
    └── java/                        # Test classes
```

## Implementation Details

### Country Class

- Instance variables: `code` and `name`
- Default constructor with debug logging
- Getter/setter methods with debug logging
- Overridden `toString()` method

### Spring Configuration (country.xml)

```xml
<bean id="country" class="com.cognizant.springlearn.Country">
    <property name="code" value="IN" />
    <property name="name" value="India" />
</bean>
```

### Main Application

The `SpringLearnApplication` class contains:

- `displayCountry()` method that loads XML configuration and displays country details
- Main method that invokes `displayCountry()`

## Running the Application

### Prerequisites

- Java 11 or higher
- Maven 3.6 or higher

### Build and Run

```bash
# Compile the project
mvn compile

# Run the application
mvn exec:java -Dexec.mainClass="com.cognizant.springlearn.SpringLearnApplication"

# Or run with Maven exec plugin
mvn exec:java
```

### Expected Output

The application will display debug logs showing:

1. Country constructor invocation
2. Setter method calls for code and name properties
3. Getter method calls
4. Final country details

## Key Learning Concepts

### Spring XML Configuration Elements

- **`<bean>`**: Defines a Spring bean
- **`id` attribute**: Unique identifier for the bean
- **`class` attribute**: Fully qualified class name
- **`<property>`**: Configures bean properties
- **`name` attribute**: Property name to set
- **`value` attribute**: Value to inject

### Spring Core Concepts

- **ApplicationContext**: Spring IoC container interface
- **ClassPathXmlApplicationContext**: Implementation that loads XML from classpath
- **`getBean()`**: Retrieves configured bean instance from container

### What Happens During `context.getBean()`

1. Spring container checks if bean exists with given ID
2. If bean exists, Spring checks if it's already instantiated
3. If not instantiated, Spring creates new instance using default constructor
4. Spring injects configured properties using setter methods
5. Returns the fully configured bean instance

## Dependencies

- **Spring Context 5.3.21**: Core Spring IoC container
- **SLF4J 1.7.36**: Logging facade
- **Logback 1.2.11**: Logging implementation
- **JUnit 4.13.2**: Testing framework

## Logging Configuration

The application uses Logback with:

- Console and file appenders
- Debug level logging for application packages
- Timestamped log format with thread and level information
- Log file: `logs/spring-country-app.log`
