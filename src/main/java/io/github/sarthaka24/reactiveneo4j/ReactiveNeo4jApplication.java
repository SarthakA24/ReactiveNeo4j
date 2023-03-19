package io.github.sarthaka24.reactiveneo4j;

import org.neo4j.springframework.data.config.EnableNeo4jAuditing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableNeo4jAuditing
public class ReactiveNeo4jApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReactiveNeo4jApplication.class, args);
    }

}
