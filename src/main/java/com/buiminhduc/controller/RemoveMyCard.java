package com.buiminhduc.controller;

import com.buiminhduc.repository.CardRepository;
import com.buiminhduc.repository.WishlistRepository;
import com.buiminhduc.repository.impl.CardRepositoryImpl;
import com.buiminhduc.repository.impl.WhistlistRepositoryImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/removecard")
public class RemoveMyCard extends HttpServlet {
    public RemoveMyCard() {
        super();
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            int maSP = Integer.parseInt(req.getParameter("maCard"));
            CardRepository cardRepository = new CardRepositoryImpl();
            cardRepository.delete(maSP);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        resp.sendRedirect("card.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
