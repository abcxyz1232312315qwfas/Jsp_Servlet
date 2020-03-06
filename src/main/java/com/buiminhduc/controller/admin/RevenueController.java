package com.buiminhduc.controller.admin;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/admin/managerRevenue")
public class RevenueController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/view/admin/revenueAdmin.jsp");
        requestDispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String month = req.getParameter("month");
        String year = req.getParameter("year");
        String sql=null;
        if (month.equals("0") || year.equals("0")){
            sql="";
        }
        else {
            sql = "where MONTH(modefied_date)="+month+" and YEAR(modefied_date)="+year+"";
        }
        ServletContext sc = getServletContext();
        sc.setAttribute("sql",sql);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/view/admin/revenueAdmin.jsp");
        requestDispatcher.forward(req,resp);
    }
}
