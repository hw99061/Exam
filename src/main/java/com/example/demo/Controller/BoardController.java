package com.example.demo.Controller;

import com.example.demo.Service.boardService;
import com.example.demo.model.entity.board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BoardController {

    boardService boardService;

    @Autowired
    public BoardController(com.example.demo.Service.boardService boardService) {
        this.boardService = boardService;
    }

//    @GetMapping("/test")
//    public String test() {
//        return "Hello world!";
//    }

    @GetMapping("/insert")
    public board insert(){
        return boardService.insert();
    }
}
