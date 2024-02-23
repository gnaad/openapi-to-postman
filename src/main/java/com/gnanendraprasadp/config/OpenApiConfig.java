package com.gnanendraprasadp.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Product API")
                        .description("A list of ProductAPI")
                        .termsOfService("https://www.vmware.com/help/legal.html")
                        .contact(new Contact().name("API Developer").url("https://dev.io").email("dev@dev.io"))
                        .license(new License().name("Apache 2.0").url("http://springdoc.org"))
                        .version("1.0.0")
                        .summary("A Cool API for developer"));
    }
}
