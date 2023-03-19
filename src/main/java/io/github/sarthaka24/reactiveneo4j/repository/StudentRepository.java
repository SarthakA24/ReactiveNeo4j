package io.github.sarthaka24.reactiveneo4j.repository;

import io.github.sarthaka24.reactiveneo4j.domain.Student;
import org.neo4j.springframework.data.repository.ReactiveNeo4jRepository;

public interface StudentRepository extends ReactiveNeo4jRepository<Student, Long> {

}