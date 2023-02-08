package co.simplon.matchmydev.profiles.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Value("${profiles-api.cors.allowedOrigins}")
    private String myAllowedApi;

    @Override
    public void addCorsMappings(CorsRegistry registry) {

	registry.addMapping("/**").allowedOrigins(myAllowedApi)
		.allowedMethods("GET", "POST", "PUT", "DELETE", "PATCH");

    }
}
