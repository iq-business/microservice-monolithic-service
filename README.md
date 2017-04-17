----------------------------
# Beverage Maker Monolith

A monolithic beverage vending application in the Death Star Canteen.
The application currently serves the following beverages:

- Tea
- Coffee

----------------------------
## Pre-requisites to build the application from source:
- Java Jdk 1.8
- Maven 3.3 or greater

----------------------------
## Instructions to build the application from source:

```
   > mvn clean install
```

----------------------------
## Instructions to run application

From project root folder (N.B. Use OS appropriate file paths):
```
    > java -jar .\target\dependency\jetty-runner.jar --port 8080 .\target\beverage-maker-monolith.war
```
