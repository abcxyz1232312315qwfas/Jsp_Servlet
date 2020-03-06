package com.buiminhduc.controller;

import com.buiminhduc.model.respond.UserResponse;
import com.buiminhduc.service.session.SessionUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/card")
public class ProcessMyCard extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        int maSP  = Integer.parseInt(req.getParameter("maSanPham"));
        UserResponse userResponse = (UserResponse) SessionUtil.getSession(req,"USER");
        if (userResponse != null){
            resp.sendRedirect("/wishlist.jsp");
        }else {
            resp.sendRedirect("/login");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
