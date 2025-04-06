package com.example.demo.model;

import org.springframework.context.annotation.Description;

import jakarta.persistence.*;

@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    private boolean done;

    public Todo() {}

    public Todo(String description, boolean done) {
        this.description = description;
        this.done = done;
    }

    // Getters et Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setTitle(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setCompleted(boolean done) {
        this.done = done;
    }
}
