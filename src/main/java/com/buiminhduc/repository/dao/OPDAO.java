package com.buiminhduc.repository.dao;

import com.buiminhduc.model.entity.SanPhamEntity;
import com.buiminhduc.model.entity.UserEntity;

import java.util.ArrayList;
import java.util.Set;

public interface OPDAO {
    public ArrayList<SanPhamEntity> getDanhSach();
    public Set<String> getDanhSachTheoTenSP();
}
