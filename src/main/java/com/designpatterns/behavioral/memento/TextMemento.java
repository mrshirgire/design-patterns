package com.designpatterns.behavioral.memento;

public class TextMemento {

    private String content;

    public TextMemento(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
