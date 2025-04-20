package kr.ac.hansung.cse.course.service;

import kr.ac.hansung.cse.course.dto.CreditSummaryDto;
import kr.ac.hansung.cse.course.dto.CreditSummaryResult;
import kr.ac.hansung.cse.course.model.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseServiceImpl implements CourseService {
    private final CourseDao courseDao;

    // 학기별 이수 학점 요약 반환
    @Override
    public CreditSummaryResult getCreditSummary() {
        List<Course> courses = courseDao.findAll();

        List<CreditSummaryDto> summaries = new ArrayList<>();
        int totalCredit = 0;

        // TODO: 이미 정렬되어 있다고 가정
        for (Course course : courses) {
            int year = course.getYear();
            int semester = course.getSemester();
            int credit = course.getCredit();

            // TODO: 같은 (year, semester) 단위로 묶여서 온다고 가정
            // 단순히 순서대로 더해서 하나씩 추가
            summaries.add(CreditSummaryDto.builder()
                    .year(year)
                    .semester(semester)
                    .credit(credit)
                    .build());

            totalCredit += credit;
        }

        return CreditSummaryResult.builder()
                .summaries(summaries)
                .totalCredit(totalCredit)
                .build();
    }

    //
    @Override
    public List<Course> getCoursesBySemester(int year, int semester) {
        return List.of();
    }
}
