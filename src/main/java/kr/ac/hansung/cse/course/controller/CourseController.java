package kr.ac.hansung.cse.course.controller;

import jakarta.validation.Valid;
import kr.ac.hansung.cse.course.dto.CreditSummaryResult;
import kr.ac.hansung.cse.course.model.Course;
import kr.ac.hansung.cse.course.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/credits")
public class CourseController {

    private final CourseService courseService;



    // 1. 학년별 이수 학점 조회(전체 학기별 이수 학점 요약 조회)
    @GetMapping
    public String getAllCreditSummary(Model model) {
        // 학기별 총 학점 리스트 반환
        CreditSummaryResult summary = courseService.getCreditSummary();
        model.addAttribute("summary", summary);

        return "creditSummary"; //creditSummary.jsp
    }

    // 2. 특정 학기 수강 교과목 상세 조회
    @GetMapping("/{year}/{semester}")
    public String getCoursesDetail(@PathVariable("year") int year,
                                   @PathVariable("semester") int semester,
                                   Model model) {
        List<Course> courses = courseService.getCoursesBySemester(year, semester);

        model.addAttribute("courses", courses);
        model.addAttribute("year", year);
        model.addAttribute("semester", semester);

        return "creditDetail"; //creditDetail.jsp
    }


    // 3-1. 수강 신청 폼 보여주기
    @GetMapping("/register")
    public String showRegisterForm(Model model) {
        Course course = new Course();
        course.setYear(2025);
        course.setSemester(2);
        model.addAttribute("course", course);
        return "createcourse";  // 수강 신청 폼 jsp
    }

    // 3-2. 수강 신청 처리
    @PostMapping("/register")
    public String processRegisterForm(Model model, @Valid Course course, BindingResult result) {
        if (result.hasErrors()) {
            System.out.println("유효성 검사 실패!");
            return "createcourse";  // 다시 폼 보여줌
        }

        courseService.insertCourse(course);
        return "coursecreated";  // 성공 메시지 페이지
    }


}
