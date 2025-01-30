

```markdown
# Learn Spring Boot Basics

We'll start by setting up a simple Spring Boot application.

## Step 1: Setting Up Your Development Environment

### 1. Install Java (JDK 17 or later)
Spring Boot requires Java. You can check if Java is installed by running:
```sh
java -version
```
If it's not installed, download and install JDK 17 or later from:
- [Oracle JDK](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)
- [OpenJDK](https://jdk.java.net/17/)

### 2. Install Maven (Recommended)
Maven is a dependency management tool that makes handling libraries easier. To check if Maven is installed:
```sh or go to Comand Promt
mvn -version
```
If not installed, download from: [Maven Download](https://maven.apache.org/download.cgi)

### 3. Install an IDE (Recommended: IntelliJ IDEA)
You need an IDE for writing code. The best options are:
- [IntelliJ IDEA (Recommended)](https://www.jetbrains.com/idea/download/)
- [Eclipse](https://www.eclipse.org/downloads/)
- [VS Code (With Java Extensions)](https://code.visualstudio.com/)

### 4. Install Spring Boot (Optional)
Spring Boot CLI (Command Line Interface) allows quick project setup. You can install it using SDKMAN:
```sh
curl -s "https://get.sdkman.io" | bash
sdk install springboot
```
Verify installation:
```sh
spring --version
```

## Step 2: Creating Your First Spring Boot Project

### 1. Using Spring Initializr (Easiest Method)
Go to [Spring Initializr](https://start.spring.io/) and configure:
- Project: Maven
- Language: Java
- Spring Boot Version: Latest stable version (e.g., 3.x.x)
- Dependencies: Spring Web

Click Generate, download the ZIP, extract it, and open it in your IDE.

### 2. Manual Creation (Using Maven)
If you want to create it manually using Maven, run:
```sh
mvn archetype:generate -DgroupId=com.example -DartifactId=spring-boot-demo -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```
Then, navigate into the project folder:
```sh
cd spring-boot-demo
```
And add the Spring Boot dependencies in 

pom.xml

:
```xml
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>3.2.2</version> <!-- Use the latest version -->
</parent>

<dependencies>
    <!-- Spring Boot Web (For REST APIs) -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>

    <!-- Spring Boot Test -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>
</dependencies>
```
Then, build and run the project:
```sh
mvn spring-boot:run
```

## Step 3: Writing Your First Spring Boot Application
Inside `src/main/java/com/example/springbootdemo/`, create a class `SpringBootDemoApplication.java`:
```java
package com.example.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }
}
```
This is the entry point of your Spring Boot application.

## Step 4: Creating Your First REST API
Now, let's create a simple REST API endpoint.

Inside `src/main/java/com/example/springbootdemo/`, create a new file 

HelloController.java

:
```java
package com.example.springbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, Spring Boot!";
    }
}
```
This does the following:
- `@RestController`: Marks this class as a REST API controller
- `@RequestMapping("/api")`: Sets the base URL path
- `@GetMapping("/hello")`: Maps the GET `/api/hello` request to this method

## Step 5: Running Your Application
Now, run your Spring Boot application:
```sh
mvn spring-boot:run
```
Or if using an IDE:
- Open `SpringBootDemoApplication.java`
- Click Run

Now, open your browser and visit: [http://localhost:8080/api/hello](http://localhost:8080/api/hello)

You should see:
```sh
Hello, Spring Boot!
```
```

This README provides clear instructions and ensures that the code blocks are properly formatted for GitHub.
This README provides clear instructions and ensures that the code blocks are properly formatted for GitHub.

Similar code found with 3 license types
