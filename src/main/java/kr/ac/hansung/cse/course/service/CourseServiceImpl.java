package kr.ac.hansung.cse.course.service;

import kr.ac.hansung.cse.course.dao.CourseDao;
import kr.ac.hansung.cse.course.dto.CreditSummaryDto;
import kr.ac.hansung.cse.course.dto.CreditSummaryResult;
import kr.ac.hansung.cse.course.model.Course;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
@AllArgsConstructor
public class CourseServiceImpl implements CourseService {
    private final CourseDao courseDao;

    // 학기별 이수 학점 요약 반환
    @Override
    public CreditSummaryResult getCreditSummary() {
        List<Course> courses = courseDao.findAll();

        // (year, semester)를 key로 묶어서 학점을 합산
        Map<String, Integer> creditMap = new LinkedHashMap<>();
        int totalCredit = 0;

        for (Course course : courses) {
            String key = course.getYear() + "-" + course.getSemester(); // 예: 2024-2
            int credit = course.getCredit();

            creditMap.put(key, creditMap.getOrDefault(key, 0) + credit);
            totalCredit += credit;
        }

        // DTO로 변환
        List<CreditSummaryDto> summaries = new ArrayList<>();
        for (String key : creditMap.keySet()) {
            String[] parts = key.split("-");
            int year = Integer.parseInt(parts[0]);
            int semester = Integer.parseInt(parts[1]);
            int credit = creditMap.get(key);

            summaries.add(CreditSummaryDto.builder()
                    .year(year)
                    .semester(semester)
                    .credit(credit)
                    .build());
        }

        return CreditSummaryResult.builder()
                .summaries(summaries)
                .totalCredit(totalCredit)
                .build();
    }

    // 특정 학기 수강 교과목 상세 조회 메서드
    @Override
    public List<Course> getCoursesBySemester(int year, int semester) {
        return courseDao.findBySemester(year, semester);
    }

    // 수강 신청 메서드
    @Override
    public void registerCourse(Course course) {
        courseDao.insert(course);
    }

}
