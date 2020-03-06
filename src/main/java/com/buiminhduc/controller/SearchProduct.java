package com.buiminhduc.controller;

import com.buiminhduc.model.entity.SanPhamEntity;
import com.buiminhduc.model.entity.UserEntity;
import com.buiminhduc.repository.dao.SanPhamDAO;
import com.buiminhduc.repository.dao.ThanhVienDAO;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.text.html.HTML;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet("/searchproduct")
public class SearchProduct extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("namep");
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        ServletContext sc = getServletContext();
        sc.setAttribute("search"," and ten like '%"+name+"%' ");

        resp.sendRedirect("listproduct.jsp");

//        if(name.equals("")||name==null){
//            ArrayList<SanPhamEntity> dsLoc = new SanPhamDAO().getDanhSach();
//            session.setAttribute("dsLoc", dsLoc);
//            resp.sendRedirect("listproduct.jsp");
//        }else{
//           ArrayList<SanPhamEntity> dsLoc = new SanPhamDAO().locDanhSach(name);
//            session.setAttribute("dsLoc", dsLoc);
//            resp.sendRedirect("listproduct.jsp");
//        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
