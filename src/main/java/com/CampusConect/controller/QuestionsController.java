package com.CampusConect.controller;

import com.CampusConect.dto.QuestionDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/questions")
public class QuestionsController {

    @PostMapping("/create")
    public ResponseEntity<String> createQuestion(QuestionDTO questionDTO){
          return ResponseEntity.ok("success");
    }
    @GetMapping("/all")
    public List<QuestionDTO> getallQuestions(){
        return new ArrayList<>();
    }
    @GetMapping("/{id}")
    public QuestionDTO getById(@PathVariable long id){
        return new QuestionDTO(1L,"abc","content","all");
    }

}
