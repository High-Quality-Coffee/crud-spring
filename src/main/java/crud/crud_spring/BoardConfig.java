package crud.crud_spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class BoardConfig {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
