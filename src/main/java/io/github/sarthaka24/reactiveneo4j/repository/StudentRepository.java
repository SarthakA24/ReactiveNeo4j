package io.github.sarthaka24.reactiveneo4j.repository;

import io.github.sarthaka24.reactiveneo4j.domain.Student;
import org.springframework.data.neo4j.repository.ReactiveNeo4jRepository;
import reactor.core.publisher.Mono;

public interface StudentRepository extends ReactiveNeo4jRepository<Student, Long> {
    Mono<Student> findById(Long id);
}
