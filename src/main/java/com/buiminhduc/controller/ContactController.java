package com.buiminhduc.controller;

import com.buiminhduc.model.entity.ContactEntity;
import com.buiminhduc.repository.ContactRepository;
import com.buiminhduc.repository.impl.ContactRepositoryImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/contact")
public class ContactController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String yourName= req.getParameter("yourName");
        String email= req.getParameter("email");
        String subject= req.getParameter("subject");
        String company= req.getParameter("company");
        String message= req.getParameter("message");
        ContactEntity contactEntity = new ContactEntity(yourName,email,subject,company,message);
        ContactRepository contactRepository = new ContactRepositoryImpl();
        try {
            contactRepository.insert(contactEntity);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        resp.sendRedirect("/index");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
