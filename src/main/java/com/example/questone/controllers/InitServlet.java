package com.example.questone.controllers;

import java.io.*;

import com.example.questone.entities.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "InitServlet", value = "/init")
public class InitServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("textinput");
         if(name.isEmpty()) {
            req.getRequestDispatcher("/index.jsp").forward(req, resp);
        }
        else
        {
            HttpSession session = req.getSession();
            User user = new User(name, 0);
            session.setAttribute("user", user);
            req.getRequestDispatcher("/question").forward(req, resp);
        }
    }
}

