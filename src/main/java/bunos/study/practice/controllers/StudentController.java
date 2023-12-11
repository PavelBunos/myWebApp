package bunos.study.practice.controllers;

import bunos.study.practice.model.Student;
import bunos.study.practice.service.StudentService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor // Можно использовать просто @AllArgsConstructor и убрать @NonNull
public class StudentController {
    @NonNull // Lombok замена @Autowired. Lombok сам создаёт конструктор, в котором автоматически подвязывается зависимость к сервису
    private final StudentService service;

    @GetMapping
    public List<Student> findAllStudents() {
        return service.findAllStudents();
    }

    @PostMapping("/new")
    public Student saveStudent(@RequestBody Student student)
    {
        //return "Student was added!";
        return service.saveStudent(student);
    }

    // т.к. название переменной и в фигурных скобках аннотации @GetMapping совпадают можно опустить в @PathVariable название переменной email
    @GetMapping("/{email}")
    public Student findByEmail(@PathVariable("email") String email) {
        return service.findByEmail(email);
    }

    @DeleteMapping("/delete/{email}")
    public void deleteStudent(@PathVariable String email) {
        service.deleteStudent(email);
    }

    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student) {
        return service.updateStudent(student);
    }

}
