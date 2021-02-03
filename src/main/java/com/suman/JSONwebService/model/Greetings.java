package com.suman.JSONwebService.model;

public class Greetings {

    private Long id;
    private String content;

    public Greetings(Long id, String content) {
        this.id = id;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

}
