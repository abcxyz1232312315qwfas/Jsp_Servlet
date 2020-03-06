package com.buiminhduc.controller.search;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/filterPrice")
public class SearchProductPrice extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        ServletContext sc = getServletContext();
        String olePrice = req.getParameter("olePrice");
        String newPrice = req.getParameter("newPrice");
        sc.setAttribute("ahihi", " and giaBan BETWEEN "+olePrice+" and "+newPrice+" ");
        resp.sendRedirect("listproduct.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
