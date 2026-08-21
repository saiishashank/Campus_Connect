package com.CampusConect.dto;

import com.CampusConect.entity.Question;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AnswerDTO {
    private Long id;
    private Question question;
    private String content;
    private String visibility;
}
