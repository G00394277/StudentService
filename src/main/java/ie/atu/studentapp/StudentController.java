package ie.atu.studentapp;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable String id){
        Optional<Student> Student = StudentRepository.findById(id);
        if(Student.isPresent()){
            return ResponseEntity.ok(Student.get());
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Student> CreateStudent(@Valid @RequestBody Student student){
        Student savedStudent = StudentRepository.Save(student);
        return ResponseEntity.ok (savedStudent);
    }
}
