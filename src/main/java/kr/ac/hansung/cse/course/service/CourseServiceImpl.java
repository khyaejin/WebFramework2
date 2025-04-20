package kr.ac.hansung.cse.course.service;

import kr.ac.hansung.cse.model.Course;

import java.util.List;

public class CourseServiceImpl implements CourseService {
    // 학기별 이수 학점 요약 반환
    @Override
    public List<Object> getCreditSummary() {
        return List.of();
    }

    //
    @Override
    public List<Course> getCoursesBySemester(int year, int semester) {
        return List.of();
    }
}
