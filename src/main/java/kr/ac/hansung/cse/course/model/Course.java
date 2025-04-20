package kr.ac.hansung.cse.course.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "courses")
@NoArgsConstructor
@Getter
@Setter
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Min(value = 1973, message = "년도는 1973년 이상이어야 합니다.")
    private int year;

    @Min(value = 1, message = "학기는 1 또는 2이어야 합니다.")
    @Max(value = 2, message = "학기는 1 또는 2이어야 합니다.")
    private int semester;

    @NotEmpty(message = "교과목 코드는 필수입니다.")
    private String code;

    @NotEmpty(message = "교과목명은 필수입니다.")
    private String name;

    @Enumerated(EnumType.STRING)
    @NotNull(message = "교과구분을 선택해주세요.")
    private CourseType type;

    @NotEmpty(message = "담당 교수명을 입력해주세요.")
    private String instructor;

    @Min(value = 1, message = "학점은 1 이상이어야 합니다.")
    @Max(value = 3, message = "학점은 3 이하여야 합니다.")
    private int credit;
}
