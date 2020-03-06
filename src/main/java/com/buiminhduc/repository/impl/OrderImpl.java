package com.buiminhduc.repository.impl;


import com.buiminhduc.model.entity.OrderEntity;
import com.buiminhduc.repository.OrderRepository;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class OrderImpl extends BasicQuery<OrderEntity, Integer> implements OrderRepository {
    public static void main(String[] args) {
//        OrderEntity orderEntity= new OrderEntity();
////        orderEntity.setModefied_date(new Date());
////        System.out.println(orderEntity.getModefied_date());

        LocalDate currentDate = LocalDate.now();
        DayOfWeek dow = currentDate.getDayOfWeek();
        int dom = currentDate.getDayOfMonth();
        int doy = currentDate.getDayOfYear();
        Month m = currentDate.getMonth();
        int y = currentDate.getYear();
        System.out.println("current local date : " + currentDate);
        System.out.println("dayOfWeek from a date in Java 8 : " + dow);
        System.out.println("dayOfMonth from date in JDK 8: " + dom);
        System.out.println("dayOfYear from a date in Java SE 8 : " + doy);
        System.out.println("month from a date in Java 1.8 : " + m);
        System.out.println("year from date in JDK 1.8 : " + y);
    }
}
