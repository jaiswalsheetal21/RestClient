package com.sj.restclientsample.Services;

import com.sj.restclientsample.model.Todo;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class TodoService {

    private RestClient client;

    public TodoService(RestClient client){
        this.client = client;

    }

    public Todo getTodo (int id){
        return client.get()
                .uri("/todos/{id}", id)
                .retrieve()
                .body(Todo.class);

    }

    public Todo createTodo(Todo todo) {
        return null;
    }
}
