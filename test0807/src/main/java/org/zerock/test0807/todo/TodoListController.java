package org.zerock.test0807.todo;



import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.zerock.test0807.dto.TodoDTO;
import org.zerock.test0807.service.TodoService;
import sun.nio.cs.UTF_8;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "todoListController", urlPatterns = "/")
public class TodoListController extends HttpServlet {

    private TodoService todoService = TodoService.INSTANCE;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("utf-8");

        TodoDTO todoDTO = TodoDTO.builder()
                .name(req.getParameter("name"))
                .id(req.getParameter("id"))
                .password(req.getParameter("password"))
                .age(Integer.parseInt(req.getParameter("age")))
                .gender(Boolean.parseBoolean(req.getParameter("gender")))
                .hobbies(req.getParameterValues("hobbies"))
                .travel(req.getParameterValues("travel"))
                .content(req.getParameter("content"))
                .build();

        try{
            todoService.register(todoDTO);
            req.setAttribute("dto", todoDTO);
        }catch (Exception e) {
            e.getStackTrace();
        }



        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/todo/list.jsp");
        dispatcher.forward(req, resp);

    }
}
