package me.whiteship.demojpaspringdata2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@Import(KeesunRegistrar.class)
public class Demojpaspringdata2Application {

    public static void main(String[] args) {
        SpringApplication.run(Demojpaspringdata2Application.class, args);
    }

}
