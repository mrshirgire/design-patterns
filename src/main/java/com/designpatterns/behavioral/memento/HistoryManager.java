package com.designpatterns.behavioral.memento;

import java.util.Stack;

public class HistoryManager {

    Stack<TextMemento> history;
    HistoryManager(){
        history = new Stack<>();
    }

    public void saveHistory(TextMemento textMemento){
        history.push(textMemento);
    }

    public TextMemento undo(){
        if(!history.isEmpty()){
            return history.pop();
        }
        return null;
    }
}
