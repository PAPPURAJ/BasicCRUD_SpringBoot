package com.github.pappuraj.eCoaching.controller.restcontroller;

import com.github.pappuraj.eCoaching.db.Repo.StudentRepo;
import com.github.pappuraj.eCoaching.db.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MyRestController {

    @Autowired
    StudentRepo studentRepo;

    @GetMapping("/")
    public ResponseEntity getHome(){
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("Welcome to our application!");
    }

    @GetMapping("/student")
    public ResponseEntity getAllStudent(){
        try{
            List<Student> list= (List<Student>) studentRepo.findAll();
            return ResponseEntity.status(HttpStatus.FOUND).body(list);

        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Data not found!");
        }

    }

    @PostMapping("/student")
    public ResponseEntity addStudent(@RequestBody Student student){
        try{
            studentRepo.save(student);
            return ResponseEntity.status(HttpStatus.CREATED).body(student);

        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body("Data not added!");
        }
    }

    @GetMapping("/student/{id}")
    public ResponseEntity getStudent(@PathVariable("id") int id){
        Optional<Student> student=studentRepo.findById(id);
        if(student.isEmpty()) return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Data not found!");
        return ResponseEntity.status(HttpStatus.FOUND).body(student);
    }


    @DeleteMapping("/student/{id}")
    public ResponseEntity deleteStudent(@PathVariable("id") int id){
        studentRepo.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body("Data deleted!");
    }


    @PutMapping("/student")
    public ResponseEntity putStudent(@RequestBody Student student){
        try{
            studentRepo.save(student);
            return ResponseEntity.status(HttpStatus.CREATED).body(student);

        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body("Data not edited");
        }
    }




}
