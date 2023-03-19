package io.github.sarthaka24.reactiveneo4j.service;

import io.github.sarthaka24.reactiveneo4j.domain.Student;
import io.github.sarthaka24.reactiveneo4j.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService{
    private final StudentRepository studentRepository;
    @Override
    public Mono<Student> saveStudent(Student student) {
        return this.studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Student student) {
        this.studentRepository.deleteById(student.getId()).block();
    }

    @Override
    public Mono<Student> updateStudent(Student student) {
        return this.studentRepository.save(student);
    }

    @Override
    public Flux<Student> getAllStudents() {
        return this.studentRepository.findAll();
    }
}
