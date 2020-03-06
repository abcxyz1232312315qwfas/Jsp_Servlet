package com.buiminhduc.controller;

import com.buiminhduc.model.entity.CardEntity;
import com.buiminhduc.model.respond.UserResponse;
import com.buiminhduc.repository.CardRepository;
import com.buiminhduc.repository.impl.CardRepositoryImpl;
import com.buiminhduc.service.session.SessionUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/addtocard")
public class AddToCard extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int maSP  = Integer.parseInt(req.getParameter("maSanPham"));
        UserResponse userResponse = (UserResponse) SessionUtil.getSession(req,"USER");
        CardRepository cardRepository = new CardRepositoryImpl();
        CardEntity cardEntity = new CardEntity(maSP,1,userResponse.getId());
        if(!cardRepository.kiemTraSanPhamCoTrongCard(maSP)){
            try {
                cardRepository.insert(cardEntity);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        resp.sendRedirect("/card.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
