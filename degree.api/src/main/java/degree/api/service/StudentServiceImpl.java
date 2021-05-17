package degree.api.service;

import degree.api.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl {

    @Autowired
    private StudentRepository studentRepository;


}
