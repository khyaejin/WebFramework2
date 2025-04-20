package kr.ac.hansung.cse.course.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class CreditSummaryDto {
    private int year;
    private int semester;
    private int totalCredit;
}
