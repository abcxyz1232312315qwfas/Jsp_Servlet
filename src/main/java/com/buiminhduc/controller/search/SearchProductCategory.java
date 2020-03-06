package com.buiminhduc.controller.search;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/category")
public class SearchProductCategory extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        resp.setContentType("text/html;charset=UTF-8");
        ServletContext sc = getServletContext();
        if(action.equals("0")){
            sc.setAttribute("ahihi"," ");
        }
        if (action.equals("1")){
            sc.setAttribute("ahihi"," and idMenuCon=1 ");
        }
        if (action.equals("2")){
            sc.setAttribute("ahihi"," and idMenuCon=2 ");
        }
        if (action.equals("3")){
            sc.setAttribute("ahihi"," and idMenuCon=3 ");
        }
        if (action.equals("4")){
            sc.setAttribute("ahihi"," and idMenuCon=4 ");
        }
        if (action.equals("5")){
            sc.setAttribute("ahihi"," and idMenuCon=5 ");
        }
        resp.sendRedirect("listproduct.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
