package com.buiminhduc.repository;

import com.buiminhduc.model.entity.CardEntity;

public interface CardRepository extends JpaRepository<CardEntity, Integer> {
    boolean kiemTraSanPhamCoTrongCard(int maSanPham);
}
