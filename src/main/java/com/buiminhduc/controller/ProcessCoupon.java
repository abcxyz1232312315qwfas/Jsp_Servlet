package com.buiminhduc.controller;

import com.buiminhduc.model.entity.CouponEntity;
import com.buiminhduc.model.respond.UserResponse;
import com.buiminhduc.repository.CouponRepository;
import com.buiminhduc.repository.impl.CouponRepositoryImpl;
import com.buiminhduc.service.session.SessionUtil;
import com.buiminhduc.util.MySqlConnectionUtil;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/coupon")
public class ProcessCoupon extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            resp.setContentType("text/html;charset=UTF-8");
            PrintWriter out = resp.getWriter();
            ServletContext sc = getServletContext();
            String temp = req.getParameter("temp");
            int percen = 0;
            String content = null;
            UserResponse userResponse = (UserResponse) SessionUtil.getSession(req,"USER");
            MySqlConnectionUtil connectionUtil = new MySqlConnectionUtil();

            String resultCoupon = null;
            CouponRepository couponDao = new CouponRepositoryImpl();
            List<CouponEntity> entities = couponDao.findAll();
            entities.stream().forEach(System.out::println);
            for (CouponEntity couponEntity : entities) {
                if(couponEntity.getId().compareToIgnoreCase(temp) ==0){
                    percen = couponEntity.getSlGiam();
                    content = couponEntity.getNameCoupon();
                }
            }
            ResultSet resultCp = connectionUtil.chonDuLieuTuDTB("select ROUND(SUM(soLuongMua*giaBan)-SUM(soLuongMua*giaBan)*"+percen+"/100,-1) from MyCart, sanpham where MyCart.maSp = SanPham.maSp and id_user="+userResponse.getId()+";");
            while (resultCp.next()){
                resultCoupon = resultCp.getString(1);
            }
            System.out.println(resultCoupon);
            sc.setAttribute("percen", percen);
            sc.setAttribute("content", content);
        } catch (Exception e) {
            e.printStackTrace();
        }
        resp.sendRedirect("card.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
