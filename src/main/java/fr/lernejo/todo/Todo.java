package fr.lernejo.todo;

public record Todo(String message, String author) {
    public Todo(String message, String author){
        this.message = message;
        this.author = author;
    }
}
