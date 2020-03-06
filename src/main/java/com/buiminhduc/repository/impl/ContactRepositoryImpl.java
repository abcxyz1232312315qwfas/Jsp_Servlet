package com.buiminhduc.repository.impl;

import com.buiminhduc.model.entity.ContactEntity;
import com.buiminhduc.model.entity.CouponEntity;
import com.buiminhduc.repository.ContactRepository;
import com.buiminhduc.repository.CouponRepository;
import com.buiminhduc.util.MySqlConnectionUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContactRepositoryImpl extends BasicQuery<ContactEntity, Integer> implements ContactRepository {
    public static void main(String[] args) throws Exception {
        ContactRepository contactRepository = new ContactRepositoryImpl();
        ResultSet resultSet = new MySqlConnectionUtil().chonDuLieuTuDTB("Select * from contact");
        while (resultSet.next()){
            System.out.println(resultSet.getInt(1));
            System.out.println(resultSet.getString(2));
            System.out.println(resultSet.getString(3));
            System.out.println(resultSet.getString(4));
        }
    }
}
