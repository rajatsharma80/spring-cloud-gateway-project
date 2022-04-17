# spring-cloud-gateway-project
This project demonstrates implementation of Spring Cloud Gateway.

Clone the following are the 3 projects to local:
1. FirstService
2. SecondService
3. GatewayService

Run all of them using following command:
./mvnw spring-boot:run

Once executed the above command goto browser and hit the following endpoint:
First Request --> http://localhost:8082/firstService/firstMessage
or
Second Request --> http://localhost:8082/firstService/secondMessage
or
Third Request --> http://localhost:8082/secondService/thirdMessage

Note: The first 2 requests are mapped to first service running port 8080, check the application.yml:

        - id: firstServiceModule
          uri: http://localhost:8080/
          predicates:
            - Path=/firstService/**
           
and third request is mapped to service running on port 8081. 

        - id: secondServiceModule
          uri: http://localhost:8081/
          predicates:
            - Path=/secondService/**
            
Whereas Gateway service is running on 8082. This proves although above 3 endpoints are hitting Gateway service but they are redirected to either first or second services.

Please also checkout Spring cloud Gateway for more details:
https://spring.io/guides/gs/gateway/
