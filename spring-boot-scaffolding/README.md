spring-boot-starter-web:支持全栈web开发，里面包括了Tomcat和Spring-webmvc。
spring-boot-starter-mail:提供对javax.mail的支持.
spring-boot-starter-ws: 提供对Spring Web Services的支持
spring-boot-starter-test:提供对常用测试框架的支持，包括JUnit，Hamcrest以及Mockito等。
spring-boot-starter-actuator:支持产品环境下的一些功能，比如指标度量及监控等。
spring-boot-starter-jetty:支持jetty容器。
spring-boot-starter-log4j:引入默认的log框架（logback）


# Run application #
## 19.2 Running as a packaged application ##
If you use the Spring Boot Maven or Gradle plugins to create an executable jar you can run your application using java -jar. For example:

$ java -jar target/myproject-0.0.1-SNAPSHOT.jar
It is also possible to run a packaged application with remote debugging support enabled. This allows you to attach a debugger to your packaged application:

$ java -Xdebug -Xrunjdwp:server=y,transport=dt_socket,address=8000,suspend=n \
       -jar target/myproject-0.0.1-SNAPSHOT.jar
## 19.3 Using the Maven plugin ##
The Spring Boot Maven plugin includes a run goal which can be used to quickly compile and run your application. Applications run in an exploded form just like in your IDE.

$ mvn spring-boot:run
You might also want to use the useful operating system environment variable:

$ export MAVEN_OPTS=-Xmx1024m

## 19.4 Using the Gradle plugin ##
The Spring Boot Gradle plugin also includes a bootRun task which can be used to run your application in an exploded form. The bootRun task is added whenever you apply the the org.springframework.boot and java plugins:

$ gradle bootRun
You might also want to use this useful operating system environment variable:

$ export JAVA_OPTS=-Xmx1024m