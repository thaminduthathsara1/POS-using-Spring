package lk.ijse.gdse.aad.possystemusingspring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("lk.ijse.gdse.aad.possystemusingspring")
@EnableWebMvc
@EnableJpaRepositories("lk.ijse.gdse.aad.possystemusingspring")
@EnableTransactionManagement
public class WebAppConfig {
}
