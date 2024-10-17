package com.OnlineCoursePlatform.repository;

import com.OnlineCoursePlatform.model.Enrollment;
import com.OnlineCoursePlatform.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {
   List <Enrollment> findByStudent(Student student);
//    @Query("SELECT e FROM Enrollment e WHERE e.student = :student")
//    List<Enrollment> findByStudent(@Param("student") Student student);
Optional<Enrollment> findByCourseIdAndStudentId(Long courseId, Long studentId);
}
