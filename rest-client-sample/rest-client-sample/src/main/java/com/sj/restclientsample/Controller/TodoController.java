package com.sj.restclientsample.Controller;

import com.sj.restclientsample.Services.TodoService;
import com.sj.restclientsample.model.Todo;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/todos")
public class TodoController {

    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/{id}")
    public Todo getSingleTodo(@PathVariable int id){
        return this.todoService.getTodo(id);
    }

    @PostMapping
    public Todo createTodo(@RequestBody Todo todo) {
        return todoService.createTodo(todo);
    }
}
