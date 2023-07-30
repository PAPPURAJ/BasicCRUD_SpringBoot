package com.github.pappuraj.eCoaching.db.Repo;

import com.github.pappuraj.eCoaching.db.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends CrudRepository<Student,Integer> {
}
