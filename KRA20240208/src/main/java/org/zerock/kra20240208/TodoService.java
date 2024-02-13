package org.zerock.kra20240208;


import org.modelmapper.ModelMapper;

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

        System.out.println("todoVO: " + todoVO);

        dao.insert(todoVO);


    }

}
