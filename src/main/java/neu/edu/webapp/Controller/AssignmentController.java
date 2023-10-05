package neu.edu.webapp.Controller;

import neu.edu.webapp.Model.Assignment;
import neu.edu.webapp.Service.AssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AssignmentController {

    @Autowired
    AssignmentService assignmentService;

//    @GetMapping("/v1/assignments")
//    public ResponseEntity<List<Assignment>> getAllAssignmentsByID()

}
