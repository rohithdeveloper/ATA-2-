package com.example.demo.apigateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.apigateway.filter.AuthenticationFilter;

@Configuration
public class GatewayCongfig {
	
	@Autowired
    private AuthenticationFilter authenticationFilter;

//	@Bean
//    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("Registration-Microservice", r -> r
//                        .path("/api/registration/**")
//                        .uri("http://localhost:8081")) 
//                .route("Vehicle-Microservice", r -> r
//                        .path("/api/vehicle/**")
//                        .uri("http://localhost:8082"))
//                .route("Booking-Microservices", r -> r
//                        .path("/api/booking/**")
//                        .uri("http://localhost:8083"))
//                .route("Driver-Microservices", r -> r
//                        .path("/api/driver/**")
//                        .uri("http://localhost:8084"))
//                .route("Route-Microservices", r -> r
//                        .path("/api/route/**")
//                        .uri("http://localhost:8085"))
//                .route("Identity-Microservice", r -> r
//                        .path("/api/user/**")
//                        .uri("http://localhost:8086"))
//                .build();
//}
//
//}
	@Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("Registration-Microservice", r -> r
                        .path("/api/registration/**")
                        .filters(f -> f.filter(authenticationFilter.apply(new AuthenticationFilter.Config())))
                        .uri("http://localhost:8081"))
                .route("Vehicle-Microservice", r -> r
                        .path("/api/vehicle/**")
                        .filters(f -> f.filter(authenticationFilter.apply(new AuthenticationFilter.Config())))
                        .uri("http://localhost:8082"))
                .route("Booking-Microservices", r -> r
                        .path("/api/booking/**")
                        .filters(f -> f.filter(authenticationFilter.apply(new AuthenticationFilter.Config())))
                        .uri("http://localhost:8083"))
                .route("Driver-Microservices", r -> r
                        .path("/api/driver/**")
                        .filters(f -> f.filter(authenticationFilter.apply(new AuthenticationFilter.Config())))
                        .uri("http://localhost:8084"))
                .route("Route-Microservices", r -> r
                        .path("/api/route/**")
                        .filters(f -> f.filter(authenticationFilter.apply(new AuthenticationFilter.Config())))
                        .uri("http://localhost:8085"))
                .route("Identity-Microservice", r -> r
                        .path("/api/user/**")
                        .filters(f -> f.filter(authenticationFilter.apply(new AuthenticationFilter.Config())))
                        .uri("http://localhost:8086"))
                .build();
    }

}