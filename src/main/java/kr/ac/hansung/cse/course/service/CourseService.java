package kr.ac.hansung.cse.course.service;

import kr.ac.hansung.cse.course.dto.CreditSummaryResult;
import kr.ac.hansung.cse.course.model.Course;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CourseService {

    // 전체 학기별 이수 학점 요약 조회 메서드
    CreditSummaryResult getCreditSummary();

    // 특정 학기 수강 교과목 상세 조회 메서드
    List<Course> getCoursesBySemester(int year, int semester);

    // 수강 신청 메서드
    void registerCourse(Course course);

}
