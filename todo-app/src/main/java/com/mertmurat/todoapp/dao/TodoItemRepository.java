package com.mertmurat.todoapp.dao;

import com.mertmurat.todoapp.models.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;



public interface TodoItemRepository extends JpaRepository<TodoItem, Long> {
}
