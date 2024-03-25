# Sample Java Application

## Overview

This is a sample Java application that demonstrates a basic setup using Spring and Artemis. It includes instructions on how to start the application, connect to the AMQ broker instance, and instantiate a listener for the  "Insert.Addr" and "Insert.Card" queue.
## Getting Started

To run the application, use the following command:

```bash
java -jar spring-artemis-comsumer-0.0.1-SNAPSHOT.jar
```

## Queue Listener

After starting the application, it will instantiate a listener for the  "Insert.Addr" and "Insert.Card" queue.

## [Properties Configuration](https://github.com/oliveira-shiai/spring-artemis-consumer-v2/blob/master/src/main/resources/application.properties)

```properties
server.port=8081
spring.artemis.broker-url=tcp://broker-artemis-0-svc.message.svc.cluster.local:61616
spring.artemis.user=app-consumer
spring.artemis.password=app
```

Feel free to explore and modify the application as needed for your use case.

Happy coding!