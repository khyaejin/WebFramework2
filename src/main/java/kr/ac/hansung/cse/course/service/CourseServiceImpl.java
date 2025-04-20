package kr.ac.hansung.cse.course.service;

import kr.ac.hansung.cse.course.dto.CreditSummaryDtos;
import kr.ac.hansung.cse.model.Course;

import java.util.List;

public class CourseServiceImpl implements CourseService {
    private final CourseDao courseDao;

    // 학기별 이수 학점 요약 반환
    @Override
    public List<Object> getCreditSummary() {
        List<Course> allCourses = courseDao.findAll();

        List<CreditSummaryDtos> creditSummaryDtos;
        for(allCourses : corse){
            corse.get

            creditSummaryDtos.add(kr.ac.hansung.cse.course.dto.CreditSummaryDtos.CreditSummaryDto)

        }



    }

    //
    @Override
    public List<Course> getCoursesBySemester(int year, int semester) {
        return List.of();
    }
}
