package pt.example.banking.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration class for OpenAPI.
 */
@Configuration
public class OpenAPIConfig {

    @Value("${openapi.title}")
    private String title;

    @Value("${openapi.version}")
    private String version;

    @Value("${openapi.description}")
    private String description;

    /**
     * Creates the OpenAPI bean with configured title, version, and description.
     *
     * @return An instance of {@link OpenAPI}.
     */
    @Bean
    public OpenAPI createOpenAPI() {
        Info info = new Info()
                .title(title)
                .description(description)
                .version(version);

        return new OpenAPI().info(info);
    }
}