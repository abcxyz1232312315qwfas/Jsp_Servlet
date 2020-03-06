package com.buiminhduc.controller.admin;

import com.buiminhduc.paging.PageRequest;
import com.buiminhduc.repository.SanPhamRepository;
import com.buiminhduc.repository.impl.SanPhamRepositoryImpl;
import com.buiminhduc.util.FormUtil;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/admin/managerProduct")
public class ProductController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/view/admin/productAdmin.jsp");
        requestDispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PageRequest pageRequest = FormUtil.toModel(PageRequest.class,req);
        int id = Integer.parseInt(req.getParameter("id"));
        SanPhamRepository sanPhamRepository = new SanPhamRepositoryImpl();
        try {
            sanPhamRepository.delete(id);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/view/admin/productAdmin.jsp");
        requestDispatcher.forward(req,resp);
    }
}
