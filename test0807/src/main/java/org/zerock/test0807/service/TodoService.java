package org.zerock.test0807.service;


import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.zerock.test0807.dao.TodoDAO;
import org.zerock.test0807.domain.TodoVO;
import org.zerock.test0807.dto.TodoDTO;
import org.zerock.test0807.util.MapperUtil;


@Log4j2
public enum TodoService {

    INSTANCE;


    private TodoDAO dao;
    private ModelMapper modelMapper;

    TodoService(){
        dao = new TodoDAO();
        modelMapper = MapperUtil.INSTANCE.get();;
    }



    public void register(TodoDTO todoDTO) throws Exception {

        TodoVO todoVO = modelMapper.map(todoDTO, TodoVO.class);

        log.info("Debug........" + todoDTO);

        dao.insert(todoVO);
    }



}
