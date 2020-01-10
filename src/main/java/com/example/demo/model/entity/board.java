package com.example.demo.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class board {

    @Id
    private int id;
    private char title;
    private char writer;
    private char content;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getTitle() {
        return title;
    }

    public void setTitle(char title) {
        this.title = title;
    }

    public char getWriter() {
        return writer;
    }

    public void setWriter(char writer) {
        this.writer = writer;
    }

    public char getContent() {
        return content;
    }

    public void setContent(char content) {
        this.content = content;
    }
}
