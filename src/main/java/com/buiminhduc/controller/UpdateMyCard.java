package com.buiminhduc.controller;

import com.buiminhduc.model.entity.CardEntity;
import com.buiminhduc.model.respond.UserResponse;
import com.buiminhduc.repository.CardRepository;
import com.buiminhduc.repository.impl.CardRepositoryImpl;
import com.buiminhduc.service.session.SessionUtil;
import com.buiminhduc.util.MySqlConnectionUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/updatecard")
public class UpdateMyCard extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp){
        try {
            CardRepository cardRepository = new CardRepositoryImpl();
            UserResponse userResponse = (UserResponse) SessionUtil.getSession(req,"USER");
            int result=1;
            List<CardEntity> cardEntities = cardRepository.findAllById(userResponse.getId());
            int test = cardEntities.size();
            for (int i = 0; i < cardEntities.size() ; i++) {
                String index2 = req.getParameter("index"+result+"");
                int id = userResponse.getId();
                req.setAttribute("MODEL",((UserResponse) SessionUtil.getSession(req,"USER")));
                String sql = "update MyCart set soLuongMua = "+index2+" where id_user="+userResponse.getId()+" and MyCart.maSp="+cardEntities.get(i).getMaSp()+"";
                new MySqlConnectionUtil().thucThiCauLenhSQL(sql);
                result++;
            }
            resp.sendRedirect("card.jsp");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
