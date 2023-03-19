package io.github.sarthaka24.reactiveneo4j.controller;

import io.github.sarthaka24.reactiveneo4j.domain.Student;
import io.github.sarthaka24.reactiveneo4j.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/student/")
public class StudentController {
    private final StudentService studentService;

    @GetMapping("/all-students")
    public Flux<Student> getAllStudents() {
        return this.studentService.getAllStudents();
    }

    @PostMapping("/save-student")
    public Mono<Student> saveStudent(@RequestBody Student student) {
        return this.studentService.saveStudent(student);
    }

    @PutMapping("/update-student")
    public Mono<Student> updateStudent(@RequestBody Student student) {
        return this.studentService.updateStudent(student);
    }

    @DeleteMapping("/delete-student")
    public void deleteStudent(@RequestBody Student student) {
        this.studentService.deleteStudent(student);
    }

    @GetMapping("/find-student/{id}")
    public Mono<Student> findStudentById(@PathVariable Long id) {
        return this.studentService.findById(id);
    }
}
