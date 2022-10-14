package com.example.restservice;

public class StartPage {
    private final long id;
    private final String content;

    public StartPage(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
