package za.co.entelect.bootcamp.securityexcercises;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SecurityExcercisesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityExcercisesApplication.class, args);
    }

}
