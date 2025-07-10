# Spring Core - Load Country from XML Configuration

This project demonstrates how to load country data from Spring XML configuration files using Spring Core framework.

## Project Overview

An airlines website application that supports booking for four countries with a dropdown selection. The country data is stored in Spring XML configuration and loaded using Spring's IoC container.

### Supported Countries

| Code | Name          |
| ---- | ------------- |
| US   | United States |
| UK   | United Kingdom|
| IN   | India         |


## Features

- **Spring XML Configuration**: Country data configured using XML bean definitions
- **IoC Container**: Uses ApplicationContext to manage beans
- **Property Injection**: Setter-based dependency injection
- **Comprehensive Logging**: Debug logs for constructor and method invocations
- **Maven Build System**: Easy dependency management and build process

### SCREENSHOT OF THE OUTPUT

![alt text](<Screenshot 2025-07-10 213315.png>)


### What Happens During `context.getBean()`

1. Spring container checks if bean exists with given ID
2. If bean exists, Spring checks if it's already instantiated
3. If not instantiated, Spring creates new instance using default constructor
4. Spring injects configured properties using setter methods
5. Returns the fully configured bean instance
