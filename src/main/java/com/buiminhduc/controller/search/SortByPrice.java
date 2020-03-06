package com.buiminhduc.controller.search;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/sort")
public class SortByPrice extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("sort");
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        ServletContext sc = getServletContext();
        if (action.equals("1")){
            sc.setAttribute("1","and idMenuCon=1;");
        }
        if (action.equals("2")){
            sc.setAttribute("2","and idMenuCon=2;");
        }
        if (action.equals("3")){
            sc.setAttribute("3"," and idMenuCon=3;");
        }
        System.out.println(action);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
