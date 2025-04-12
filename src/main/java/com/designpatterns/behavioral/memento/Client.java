package com.designpatterns.behavioral.memento;

public class Client {

    public static void main(String[] args) {

        TextEditor textEditor = new TextEditor();
        textEditor.write("Hello, World!");
        System.out.println("Current Content: " + textEditor.getContent());
        // Save the current state
        textEditor.save();

        // Modify the content
        textEditor.write("Hello, Memento Pattern!");
        System.out.println("Modified Content: " + textEditor.getContent());
        // Save the current state again
        textEditor.save();

        // Restore to the saved state
        textEditor.undo();
        System.out.println("Restored Content: " + textEditor.getContent());
        textEditor.undo();
        System.out.println("Restored Content: " + textEditor.getContent());
    }
}
