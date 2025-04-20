package kr.ac.hansung.cse.course.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import kr.ac.hansung.cse.course.model.Course;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class CourseDao {

    @PersistenceContext
    private EntityManager entityManager;

    // 전체 수강 과목 조회
    public List<Course> findAll() {
        return entityManager.createQuery("SELECT c FROM Course c", Course.class)
                .getResultList();
    }

    // 특정 연도/학기 수강 과목 조회
    public List<Course> findBySemester(int year, int semester) {
        return entityManager.createQuery("SELECT c FROM Course c WHERE c.year = :year AND c.semester = :semester", Course.class)
                .setParameter("year", year)
                .setParameter("semester", semester)
                .getResultList();
    }

    // 새 수강 과목 추가
    public void insert(Course course) {
        entityManager.persist(course);
    }
}