# Serenity BDD with Cucumber
This is sample automated test project using [SerenityBDD](http://www.serenity-bdd.info/) with [Cucumber](https://cucumber.io/). In this project, I demonstrated that [BDD](https://en.wikipedia.org/wiki/Behavior-driven_development) can be combined and used within the automated test script.

## Configuration
You need following installed for running the test
1. [Java 8](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) (openjdk)
2. [Maven](https://maven.apache.org/)
3. [Browser Webdriver](https://selenium.dev/downloads/) (chromedriver, geckodriver, etc)

## Serenity BDD
Serenity is Java framework that can be used for building automated test. It also combined Behaviour Driver Development (BDD)
and automated test script to create a scalable and maintainable automated test in addition with rich and informative generated report.

When using Serenity, it is encouraged to use [Page Object](https://martinfowler.com/bliki/PageObject.html) pattern 
for more readable and mantainable test code. Also, Serenity can be used either with plain Junit, or with popular BDD framework such as [Jbehave](https://jbehave.org/) and [Cucumber](https://cucumber.io/).

Not only for automate UI test, Serenity can be combined with another tools for API testing [RestAssured](http://rest-assured.io/).
Serenity itself wrapping the RestAssured java class and modified so that it can shared RestAssured state between Serenity `Step`.
You should import dependency `serenity-rest-assured` if you are going to use this.

In API response validation, we can use RestAssured JSON Schema Validation based on known [Json schema](http://json-schema.org/). 
We only need to define the specification in json file and use it as validation for api json response. 
It also very reusable as it can validate schema based from another schema reference using key `$ref`.

## Highlight
1. Automated test this project run is composed of UI based test and API Test
2. In this project, there is various action used in interacting with browser such as:
   - Clicking Button
   - Input text in field
   - Asynchronous wait (built in Serenity)
   - Switch tab
   - Alert interaction, etc
3. Validation for api json response using [Json schema](http://json-schema.org/)
3. Configured for running Serenity with essential features. Of course you can configured based what you need.
   Feature enabled such as: 
   - Taking a screenshot
   - Ignore fail on scenario 
   - Browser restart frequency
   - Implicity timeout, etc
4. Parallel execution. Many people often confused hwo to do parallel execution in Serenity, but in this 
   project I configure it by default to run testsuite with 2 parallel (thread) at the same time.
5. Fully compability for running in selenium grid. Required properties configured in file `serenity.properties`.
   You only need to change parameter `webdriver.remote.url` to you selenium grid host.
6. Custom capabilities. Because Serenity wrapped the Selenium java, 
   it is often confusing how to use its certain behaviour such as adding custom capabilies. 
   I already including extension class for adding custom capabilities in Serenity. Detail can be seen in [Serenity BDD Book](https://serenity-bdd.github.io/theserenitybook/latest/index.html)
7. Cucumber Hooks class available with either step hooks (AfterStep & BeforeStep) and scenario hooks (After & Before).
   You can do some action before or after test step or scenario like example, 
   - Reset data in database before every scenario 
   - Call backend API for setting configuration
   - Sending test result to external service, etc

