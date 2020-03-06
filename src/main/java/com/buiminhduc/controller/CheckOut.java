package com.buiminhduc.controller;

import com.buiminhduc.model.entity.OrderEntity;
import com.buiminhduc.model.respond.UserResponse;
import com.buiminhduc.repository.OrderRepository;
import com.buiminhduc.repository.impl.OrderImpl;
import com.buiminhduc.service.session.SessionUtil;
import com.buiminhduc.util.MySqlConnectionUtil;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/finish")
public class CheckOut extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = getServletConfig().getServletContext();
        String result = String.valueOf(context.getAttribute("result"));
        UserResponse userResponse = (UserResponse) SessionUtil.getSession(req,"USER");
        String fistName = req.getParameter("FirstName");
        String lastName = req.getParameter("LastName");
        String companyName = req.getParameter("Companyname");
        String email = req.getParameter("EmailAddress");
        String phone = req.getParameter("Phone");
        String address = req.getParameter("country");
        String Apartment = req.getParameter("Apartment");
        String Commune = req.getParameter("Commune");
        String District = req.getParameter("District");
        String Postcode = req.getParameter("post");
        String SpecialNotes = req.getParameter("SpecialNotes");
        String method = req.getParameter("optionsRadios");
        String name ="";
        // get list sanpham
        ResultSet resultSet = null;
        try {
            resultSet = new MySqlConnectionUtil().chonDuLieuTuDTB("select ten, SUM(MyCart.soLuongMua) from  mycart, sanpham where MyCart.maSp= SanPham.maSp and MyCart.id_user = "+userResponse.getId()+" group by MyCart.maSp; ");
            while (resultSet.next()){
                name = name+"~"+resultSet.getString(1)+"&"+resultSet.getString(2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        int tongtien= Integer.parseInt(result);
        int idUser= userResponse.getId();
        LocalDate currentDate = LocalDate.now();
        OrderEntity orderEntity = new OrderEntity(fistName,lastName,companyName,email,phone,address,District,Apartment,Commune,Postcode,SpecialNotes,currentDate,tongtien,method,idUser,name);
        OrderRepository orderRepository = new OrderImpl();
        try {
            orderRepository.insert(orderEntity);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        resp.sendRedirect("/home");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
