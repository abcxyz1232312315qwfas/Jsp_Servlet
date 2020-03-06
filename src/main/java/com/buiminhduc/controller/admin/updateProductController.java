package com.buiminhduc.controller.admin;

import com.buiminhduc.model.entity.SanPhamEntity;
import com.buiminhduc.repository.SanPhamRepository;
import com.buiminhduc.repository.impl.SanPhamRepositoryImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/admin/updateProduct")
public class updateProductController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/view/admin/updateProduct.jsp");
        requestDispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id= req.getParameter("id");
        String name = req.getParameter("name");
        String image = "/templatesecond/img/AnhProjectNam/"+req.getParameter("image");
        String detail = req.getParameter("detail");
        int price = Integer.parseInt(req.getParameter("price"));
        int amount = Integer.parseInt(req.getParameter("amount"));
        String color = req.getParameter("color");
        String tag = req.getParameter("tag");
        String status = req.getParameter("status");
        int category = Integer.parseInt(req.getParameter("category"));
        int idSp = Integer.parseInt(id);
        SanPhamRepository sanPhamRepository = new SanPhamRepositoryImpl();
        SanPhamEntity sanPhamEntity = new SanPhamEntity(idSp,name,image,detail,price,amount,color,tag,status,category);
        try {
            sanPhamRepository.update(sanPhamEntity);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/view/admin/productAdmin.jsp");
        requestDispatcher.forward(req,resp);
    }
}
