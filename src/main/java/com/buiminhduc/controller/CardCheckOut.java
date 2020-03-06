package com.buiminhduc.controller;

import com.buiminhduc.model.entity.CardEntity;
import com.buiminhduc.repository.CardRepository;
import com.buiminhduc.repository.impl.CardRepositoryImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.smartcardio.Card;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/cardcheckout")
public class CardCheckOut extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = getServletConfig().getServletContext();
        String tongtien = (String) context.getAttribute("tongtien");
        String tongtien1 = (String) context.getAttribute("tongtien1");
        context.setAttribute("resultTT", tongtien);
        context.setAttribute("resultCP", tongtien1);
        resp.sendRedirect("checkout.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
