package com.designpatterns.behavioral.memento;

public class TextEditor {

    String content;
    HistoryManager historyManager;
    TextEditor(){
        this.content = "";
        this.historyManager = new HistoryManager();
    }

    public void write(String text) {
        this.content = text;
        TextMemento memento = new TextMemento(this.content);
        historyManager.saveHistory(memento);
    }

    public void undo() {
        TextMemento memento = historyManager.undo();
        if (memento != null) {
            this.content = memento.getContent();
        } else {
            System.out.println("No more history to undo.");
        }
    }

    public String getContent(){
        return this.content;
    }

}
