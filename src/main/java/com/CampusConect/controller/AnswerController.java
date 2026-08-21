package com.CampusConect.controller;

import com.CampusConect.dto.AnswerDTO;
import com.CampusConect.entity.Question;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/answers")
@RequiredArgsConstructor
public class AnswerController {

    @PostMapping("/create")
    public ResponseEntity<String> createAnswer(AnswerDTO answerdto){
         return ResponseEntity.ok("Success");
    }

    @GetMapping("/getall")
    public List<AnswerDTO> getAllAnswers(){
        return new ArrayList<>();
    }

    @GetMapping("/{id}")
    public AnswerDTO getById(@PathVariable long id){
        return new AnswerDTO(1L,new Question(),"content","all");
    }
}
