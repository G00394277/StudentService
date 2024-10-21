package ie.atu.studentapp;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface StudentRepository extends MongoRepository <Student, String>{
    List<Student>findById(String id);
}
