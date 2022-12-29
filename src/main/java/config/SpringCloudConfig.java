package config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudConfig {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/films/**")
                        .uri("https://servicefilmschallenge7-production.up.railway.app/"))
                .route(r -> r.path("/users/**")
                        .uri("https://serviceuserschallenge7-production.up.railway.app/"))
                .route(r -> r.path("/api/auth/**")
                        .uri("https://serviceuserschallenge7-production.up.railway.app/"))
                .route(r -> r.path("/invoice/**")
                        .uri("https://serviceinvoicechallenge7-production.up.railway.app/"))
                .build();
    }
}