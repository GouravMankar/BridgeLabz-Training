package com.linkedlist.doublylinkedlist.texteditorundoredo;

public class TextEditorUndoRedo {

    public static void main(String[] args) {

        TextEditorHistory history = new TextEditorHistory(10);

        history.addState("Namaste, Bharat");
        history.addState("Namaste, Bharat!\nTyping in Hindi-English mix.");
        history.addState("Line 3: Mumbai rains today.");

        System.out.println("Current Text:\n" + history.getCurrentState());

        history.undo();
        System.out.println("\nAfter Undo:\n" + history.getCurrentState());

        history.undo();
        System.out.println("\nAfter Undo Again:\n" + history.getCurrentState());

        history.redo();
        System.out.println("\nAfter Redo:\n" + history.getCurrentState());

        // New edit clears redo history
        history.addState("New line after undo. Diwali prep notes.");
        System.out.println("\nCurrent Text:\n" + history.getCurrentState());
    }
}
