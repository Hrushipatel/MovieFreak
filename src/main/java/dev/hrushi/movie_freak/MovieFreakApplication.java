package dev.hrushi.movie_freak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MovieFreakApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieFreakApplication.class, args);
    }
}
