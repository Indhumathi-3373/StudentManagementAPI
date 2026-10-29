package controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import services.StudentMessage;

@RestController
public class StudentAPI {
    private final StudentMessage Student_Message;
    public StudentAPI(StudentMessage Student_Message, StudentMessage studentMessage){
        this.Student_Message = Student_Message;
    }
    @GetMapping("/students/message")
    public String GetMessage(){
        return Student_Message.GetMessage();
    }
}
