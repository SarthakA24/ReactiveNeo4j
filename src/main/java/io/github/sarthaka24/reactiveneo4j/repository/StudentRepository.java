package io.github.sarthaka24.reactiveneo4j.repository;

import io.github.sarthaka24.reactiveneo4j.domain.Student;
import org.springframework.data.neo4j.repository.ReactiveNeo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface StudentRepository extends ReactiveNeo4jRepository<Student, Long> {
    Mono<Student> findById(Long id);

    @Query("CREATE (n:Student {name: $name, email: $email}) RETURN n")
    Mono<Student> saveStudent1(String name, String email);

    @Query("MATCH (n:Student) WHERE n.name = $name RETURN n.email")
    Mono<String> emailByName(String name);

    @Query("MATCH (n:Student) RETURN n")
    Flux<Student> findAllStudents();
}
