package org.example;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.example")
@PropertySources({
        @PropertySource("classpath:application.properties")
})
public class AppConfig {
}
