package kr.ac.hansung.cse.model;

import jakarta.persistence.*;
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

    private int year;
    private int semester;
    private String code;
    private String name;

    @Enumerated(EnumType.STRING)
    private CourseType type;

    private String instructor;
    private int credit;
}
