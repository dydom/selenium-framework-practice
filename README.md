# 1. Required Tools
- Java (jdk 1.8 or higher)
- Maven (version 3.6.0)

# 2. Used Technologies and Design patterns
##### Technologies:
------------
- Java
- Maven
- Selenium WebDriver
- TestNG
- JavaFaker
##### Design patterns:
--------------
- Page Object Pattern
- Page Factory

# 3. Installation
Use the following command:
```sh
git clone https://github.com/dydom/selenium-framework-practice.git
```

# 4. Configuration
Configuration file is available in project directory:
> \src\main\java\configuration\Configuration.properties

Used parameters:
- applicationAddress - URL address of tested application
- browser - Browser type chosen for testing. Supported browsers: CHROME, FIREFOX

# 5. How to run tests
Use the following commands to run all tests:
```sh
cd <project_directory_path>
mvn test
```