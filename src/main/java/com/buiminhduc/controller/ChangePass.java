package com.buiminhduc.controller;
import com.buiminhduc.model.respond.UserResponse;
import com.buiminhduc.service.session.SessionUtil;
import com.buiminhduc.util.MySqlConnectionUtil;
import lombok.SneakyThrows;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;

@WebServlet("/change")
public class ChangePass extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String opass = req.getParameter("opass");
//        String npass = req.getParameter("npass");
//        UserResponse userResponse = (UserResponse) SessionUtil.getSession(req,"USER");
//        ResultSet resultSet = new MySqlConnectionUtil().chonDuLieuTuDTB("select password from user where id="+userResponse.getId()+"");
//        String check =null;
//        while (resultSet.next()){
//            check= resultSet.getString(1);
//        }
//        if (check.equals(opass)){
//            new MySqlConnectionUtil().thucThiCauLenhSQL("update user set password="+npass+" where id=7="+userResponse.getId()+"");
//        }
//        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/view/homepage/user.jsp");
//        requestDispatcher.forward(req,resp);

    }

    @SneakyThrows
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String opass = req.getParameter("opass");
        String npass = req.getParameter("npass");
        UserResponse userResponse = (UserResponse) SessionUtil.getSession(req,"USER");
        ResultSet resultSet = new MySqlConnectionUtil().chonDuLieuTuDTB("select password from user where id="+userResponse.getId()+"");
        String check =null;
        while (resultSet.next()){
            check= resultSet.getString(1);
        }
        if (check.equals(opass)){
            new MySqlConnectionUtil().thucThiCauLenhSQL("update user set password="+npass+" where id="+userResponse.getId()+"");
        }

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/view/homepage/user.jsp");
        requestDispatcher.forward(req,resp);
    }
}
