# xbs-springboot-dubbo
SpringBoot整合Dubbo最佳实践

(1)dubbo-spring-boot-api 是接口工程，dubbo服务的提供者和消费者都会依赖此工程；

(2)dubbo-spring-boot-client 是 dubbo 服务的消费者，它会从 dubbo-spring-boot-server 工程消费服务；

(3)dubbo-spring-boot-server 是 dubbo 服务的提供者，它会将服务注册到 zookeeper 中，供消费者消费；
