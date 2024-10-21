package ie.atu.studentapp;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Documented;

@Data
@Document (Collection = Student);
public class Student {
    private String studentId;
    private String firstName;
    private String lastName;
    private String email;
    private String dateOfBirth;
}
