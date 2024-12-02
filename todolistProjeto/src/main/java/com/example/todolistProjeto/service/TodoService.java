package com.example.todolistProjeto.service;

import com.example.todolistProjeto.entity.Todo;
import com.example.todolistProjeto.repository.TodoRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    private TodoRepository todoRepository;


    //Injeção do Construtor
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }


    //Funções
    public List<Todo> create(Todo todo){
        todoRepository.save(todo);
        return list();
    }

    public List<Todo> list(){
        Sort sort = Sort.by("prioridade").descending().and(Sort.by("nome").ascending());
        return todoRepository.findAll(sort);
    }

    public List<Todo> update(Todo todo){
        todoRepository.save(todo);
        return list();
    }

    //passamos identificadores para remover
    public List<Todo> delete(Long id){
        todoRepository.deleteById(id);
        return list();

    }

}
