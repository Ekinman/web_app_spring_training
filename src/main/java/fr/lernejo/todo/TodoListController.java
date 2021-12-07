package fr.lernejo.todo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoListController {

    private static List<Todo> todos = new ArrayList<Todo>();

    @PostMapping(value = "/api/todo")
    public ResponseEntity<Todo> addTodo(Todo todo){
        todos.add(todo);
        return new ResponseEntity<Todo>(todo, HttpStatus.CREATED);
    }

    @GetMapping(value = "/api/todo")
    public ResponseEntity<List<Todo>> getTodos(){
        return new ResponseEntity<List<Todo>>(todos, HttpStatus.CREATED);
    }
}
