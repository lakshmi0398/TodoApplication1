// Write your code here
package com.example.todo;

import com.example.todo.*;
import java.util.*;

public interface TodoRepository {
    ArrayList<Todo> getTodos();

    Todo addTodo(Todo todo);

    Todo getTodoById(int id);
    Todo updateTodo(Todo todo, int id);

    void deleteTodo(int id);
    
}