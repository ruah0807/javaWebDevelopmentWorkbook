package org.zerock.TestDAO;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.zerock.test0807.dao.TodoDAO;
import org.zerock.test0807.domain.TodoVO;

import java.util.List;

public class TodoDAOTests {

    private TodoDAO todoDAO;

    @BeforeEach
    public void ready(){
        todoDAO = new TodoDAO();
    }

//    @Test
//    public void testList() throws Exception {
//
//        List<TodoVO> list = todoDAO.selectAll();
//        list.forEach(vo -> System.out.println(vo));
//    }

    @Test
    public void testInsert() throws Exception{

        TodoVO todoVO = TodoVO.builder()
                .name("ruah")
                .id("looa0807")
                .password("Fntjddkdn07")
                .age(34)
                .gender(false)
                .hobbies(new String[]{"술먹기"})
                .travel(new String[]{"괌"})
                .content("hi")
                .build();

        todoDAO.insert(todoVO);
    }
}
