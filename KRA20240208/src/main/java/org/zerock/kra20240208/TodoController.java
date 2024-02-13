package org.zerock.kra20240208;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "TodoController", urlPatterns = "/")
public class TodoController extends HttpServlet {

    private TodoService todoService = TodoService.INSTANCE;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        req.setCharacterEncoding("utf-8");

        TodoDTO todoDTO = TodoDTO.builder()
                .name(req.getParameter("name"))
                .id(req.getParameter("id"))
                .password(req.getParameter("password"))
                .age(Integer.parseInt(req.getParameter("age")))
                .gender(req.getParameter("gender"))
                .hobbies(req.getParameterValues("hobbies"))
                .travel(req.getParameterValues("travel"))
                .content(req.getParameter("content"))
                .build();


        try{
            todoService.register(todoDTO);
        } catch (Exception e) {
            e.printStackTrace();
        }

        req.setAttribute("dto", todoDTO);



        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/list.jsp");
        dispatcher.forward(req, resp);
    }
}
