package io.github.sarthaka24.reactiveneo4j.service;

import io.github.sarthaka24.reactiveneo4j.domain.Student;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface StudentService {
    Mono<Student> saveStudent(Student student);

    void deleteStudent(Student student);

    Mono<Student> updateStudent(Student student);

    Flux<Student> getAllStudents();

    Mono<Student> findById(Long id);

    Mono<Student> create(String name, String email);

    Mono<String> emailByName(String name);
}
