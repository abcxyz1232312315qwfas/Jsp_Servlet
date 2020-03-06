package com.buiminhduc.controller.admin;

import com.buiminhduc.paging.PageRequest;
import com.buiminhduc.util.FormUtil;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/admin/managerOrder")
public class OrderController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/view/admin/orderAdmin.jsp");
        requestDispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PageRequest pageRequest = FormUtil.toModel(PageRequest.class,req);
        String date = req.getParameter("date");
        String month = req.getParameter("month");
        String year = req.getParameter("year");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/view/admin/orderAdmin.jsp");
        ServletContext sc = getServletContext();
        sc.setAttribute("sql","select * from DonHang where DAY(modefied_date) = "+date+" and MONTH(modefied_date) = "+month+" and YEAR(modefied_date) = "+year+"");
        requestDispatcher.forward(req,resp);
    }
}
