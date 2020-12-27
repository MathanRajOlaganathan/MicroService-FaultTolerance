# **Fault Tolerance with Hystrix**
* The instances of microservices may go up and down frequently. As the number of interactions between microservices increases, the chances of failure of the microservice also increases in the system.

* The solution to this problem is to use a fallback in case of failure of a microservice. This aspect of a microservice is called _fault tolerance_.

* The circuit breaker pattern allows you to build a fault tolerant and resilient system that can survive gracefully when key services are either unavailable or have high latency.

> Fault tolerance can be achieved with the help of a circuit breaker. It is a pattern that wraps requests to external services and detects when they fail. If a failure is detected, the circuit breaker opens.

#### Hystrix
- Hystrix is a library that controls the interaction between microservices to provide latency and fault tolerance

* artifact :
    - _spring-cloud-starter-hystrix_
    - _spring-cloud-starter-hystrix-dashboard_
* Add @EnableCircuitBreaker annotation
* Add @EnableHystrixDashboard annotation
* Add annotation @HystrixCommand(fallbackMethod = "myFallbackMethod")-  fallback method  will be called if there is service
failure or  high latency
            