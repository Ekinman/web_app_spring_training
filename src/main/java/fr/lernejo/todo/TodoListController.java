package fr.lernejo.todo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoListController {
    private final static List<Todo> todos = new ArrayList<Todo>();

    @GetMapping("/api/todo")
    public ResponseEntity<List<Todo>> getTodos() {
        return new ResponseEntity<List<Todo>>(todos, HttpStatus.OK);
    }
    @PostMapping(value = "/api/todo", consumes = {"application/json"})
    public ResponseEntity<Todo> addTodo(@RequestBody Todo todo) {
        todos.add(todo);
        return new ResponseEntity<Todo>(todo, HttpStatus.CREATED);
    }


}
