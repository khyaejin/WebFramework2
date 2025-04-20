package kr.ac.hansung.cse.course.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class CreditSummaryResult {
    private List<CreditSummaryDto> summaries;
    private int totalCredit;
}