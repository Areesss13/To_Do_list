package com.example.demo.controller;

import com.example.demo.model.Todo;
import com.example.demo.repository.TodoRepository;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TodoController {

    private final TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping("/todos")
    public List<Todo> getTodos() {
        return todoRepository.findAll();
    }
    @PostMapping("/todos")
public Todo createTodo(@RequestBody Todo todo) {
    return todoRepository.save(todo);
}

@PutMapping("/todos/{id}")
public ResponseEntity<Todo> markTodoAsDone(@PathVariable Long id) {
    Todo todo = todoRepository.findById(id).orElseThrow(() -> new RuntimeException("Task not found"));
    todo.setCompleted(true);  // Mettre à jour l'état de la tâche
    todoRepository.save(todo);
    return ResponseEntity.ok(todo);
}

@DeleteMapping("/todos/{id}")
public ResponseEntity<Void> deleteTodo(@PathVariable Long id) {
    Todo todo = todoRepository.findById(id).orElseThrow(() -> new RuntimeException("Task not found"));
    todoRepository.delete(todo);
    return ResponseEntity.noContent().build();
}

}
