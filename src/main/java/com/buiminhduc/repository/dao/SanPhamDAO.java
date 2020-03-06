package com.buiminhduc.repository.dao;

import com.buiminhduc.model.entity.SanPhamEntity;
import com.buiminhduc.model.entity.UserEntity;
import com.buiminhduc.util.MySqlConnectionUtil;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class SanPhamDAO implements OPDAO {
    public static ArrayList<SanPhamEntity> dsSanPham = new ArrayList<>();
    public static Set<String > dsSanPhamAll = new TreeSet<>();
    public SanPhamDAO(){
        dsSanPham.removeAll(dsSanPham);
    }
    @Override
    public ArrayList<SanPhamEntity> getDanhSach() {
        ResultSet rs;
        try {
            rs = new MySqlConnectionUtil().chonDuLieuTuDTB("select * from sanpham");
            while(rs.next()){
                dsSanPham.add(new SanPhamEntity(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getInt(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getInt(10)));
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return dsSanPham;
    }

    @Override
    public Set<String> getDanhSachTheoTenSP() {
        ResultSet rs;
        try {
            rs = new MySqlConnectionUtil().chonDuLieuTuDTB("select * from sanpham limit 4");
            while(rs.next()){
                dsSanPhamAll.add(rs.getString(2));
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return dsSanPhamAll;
    }
    public ArrayList<SanPhamEntity> locDanhSach(String TenSp){
        ArrayList<SanPhamEntity> ds = new ArrayList<>();
        ResultSet rs;
        try {
            String sql = " select * from sanpham where ten like '%\"+TenSp+\"%' ";
            rs = new MySqlConnectionUtil().chonDuLieuTuDTB(sql);
            while(rs.next()){
                ds.add(new SanPhamEntity(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getInt(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getInt(10)));
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return ds;
    }
}
