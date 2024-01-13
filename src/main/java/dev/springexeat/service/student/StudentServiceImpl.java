package dev.springexeat.service.student;

import dev.springexeat.models.StudentModel;
import dev.springexeat.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository studentRepository;
    @Override
    public StudentModel saveApplication(StudentModel studentModel) {
        return studentRepository.save(studentModel);
    }

    @Override
    public StudentModel getApplicationById(long id) {
        Optional<StudentModel> studentModel = studentRepository.findById(id);

        StudentModel emptyApplication = null;
        if (studentModel.isPresent()){
            emptyApplication = studentModel.get();
            return emptyApplication;
        } else {
            throw new RuntimeException("Application does not exist!");
        }
    }

    @Override
    public List<StudentModel> findAllByMatNo(String matNo) {
        return studentRepository.findAllByMatNo(matNo);
    }


    @Override
    public StudentModel updateApplicationById(StudentModel studentModel) {
        return null;
    }

    @Override
    public void deleteApplicationById(long id) {

    }
}
