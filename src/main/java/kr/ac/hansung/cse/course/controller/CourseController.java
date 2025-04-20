package kr.ac.hansung.cse.course.controller;

import kr.ac.hansung.cse.model.Course;
import kr.ac.hansung.cse.course.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/credits")
public class CourseController {

    private final CourseService courseService;

    // 전체 학기별 이수 학점 요약 조회
    @GetMapping
    public String getAllCreditSummary(Model model) {
        // 학기별 총 학점 리스트 반환
        List<Object> summary = courseService.getCreditSummary();
        model.addAttribute("summary", summary);
        return "creditSummary"; //jsp
    }

    // 특정 학기 수강 교과목 상세 조회
    @GetMapping("/{year}/{semester}")
    public String getCoursesBySemester(@PathVariable int year,
                                       @PathVariable int semester,
                                       Model model) {
        List<Course> courses = courseService.getCoursesBySemester(year, semester);
        model.addAttribute("courses", courses);
        model.addAttribute("year", year);
        model.addAttribute("semester", semester);
        return "creditSummary"; //jsp
    }
}
