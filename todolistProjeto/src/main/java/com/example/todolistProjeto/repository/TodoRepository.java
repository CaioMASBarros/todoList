package com.example.todolistProjeto.repository;

import com.example.todolistProjeto.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
