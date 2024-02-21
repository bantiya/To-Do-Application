package com.bhavya.springboot.myfirstwebapp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();

    static {
        todos.add(new Todo(1, "Bhavya", "Learn AWS", LocalDate.now().plusYears(1),false));
        todos.add(new Todo(1, "Vishal", "Learn Java", LocalDate.now().plusYears(2),false));
        todos.add(new Todo(1, "Shiva", "Learn JS", LocalDate.now().plusYears(3),false));
        todos.add(new Todo(1, "Meet", "Learn Node Js", LocalDate.now().plusYears(4),false));
        todos.add(new Todo(1, "Juhi", "Learn React", LocalDate.now().plusYears(3),false));
    }

    public List<Todo> findByUserName(String userName) {
        return todos;
    }

}
