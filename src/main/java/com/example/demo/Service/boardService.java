package com.example.demo.Service;

import com.example.demo.Repository.boardRepository;
import com.example.demo.model.entity.board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class boardService {

    private boardRepository boardRep;

    @Autowired
    public boardService(boardRepository boardRep) {
        this.boardRep = boardRep;
    }

    public board insert(){
        Scanner sc = new Scanner(System.in);
        board B = new board();
        System.out.print("id : ");
        B.setId(sc.nextInt());
        sc.nextLine();
        System.out.print("Title : ");
        B.setTitle(sc.nextLine().charAt(0));
        System.out.print("Writer : ");
        B.setWriter(sc.nextLine().charAt(0));
        System.out.print("Content : ");
        B.setContent(sc.nextLine().charAt(0));
        return boardRep.save(B);
    }
}
