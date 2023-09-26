package com.example.questone.controllers;

import com.example.questone.model.Data_base;
import com.example.questone.services.DataBaseManager;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "QuestionServlet", value = "/question")

public class QuestionServlet extends HttpServlet {
    static int counter = 0;

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(req.getParameter("radios") == null){
            DataBaseManager dbm = DataBaseManager.getDatabaseManager(counter, 0);
            req.setAttribute("question", dbm.question);
            req.setAttribute("anwser1", dbm.answer1);
            req.setAttribute("anwser2", dbm.answer2);
            counter++;
            req.getRequestDispatcher("/WEB-INF/questions.jsp").forward(req, resp);
        } else if(Integer.parseInt(req.getParameter("radios")) == 1 && counter < 3){
            DataBaseManager dbm = DataBaseManager.getDatabaseManager(counter, Integer.parseInt(req.getParameter("radios")));
            req.setAttribute("question", dbm.question);
            req.setAttribute("anwser1", dbm.answer1);
            req.setAttribute("anwser2", dbm.answer2);
            counter++;
            req.getRequestDispatcher("/WEB-INF/questions.jsp").forward(req, resp);
        } else if(Integer.parseInt(req.getParameter("radios")) == 2){
            DataBaseManager dbm = DataBaseManager.getDatabaseManager(counter, Integer.parseInt(req.getParameter("radios")));
            req.setAttribute("fail", dbm.fail);
            req.getRequestDispatcher("/WEB-INF/failure.jsp").forward(req, resp);
            counter = 0;
        } else if (req.getParameter("radios").equals("1") && counter == 3){
            req.getRequestDispatcher("/WEB-INF/win.jsp").forward(req, resp);
            counter = 0;
        }
    }

}
