package org.example.w2.todo.service;

import org.example.w2.todo.dto.TodoDTO;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public enum TodoService {

    INSTANCE;

    public void register(TodoDTO todoDTO){
        System.out.println("Debug................" + todoDTO);
    }

    public List<TodoDTO> getList(){

        List<TodoDTO> todoDTOS = IntStream.range(0,10).mapToObj(i ->{
            TodoDTO dto = new TodoDTO();
            dto.setTno((long)i);
            dto.setTitle("Todo.."+i);
            dto.setDueDate(LocalDate.now());

            return dto;

        }).collect(Collectors.toList());

        return todoDTOS;
    }
    public TodoDTO get(Long tno){

        TodoDTO dto = new TodoDTO();
        dto.setTno(tno);
        dto.setTitle("Sample Todo");
        dto.setDueDate(LocalDate.now());
        dto.setFinished(true);

        return dto;

    }

}
