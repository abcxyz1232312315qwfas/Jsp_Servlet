package com.buiminhduc.repository.impl;

import com.buiminhduc.model.entity.CardEntity;
import com.buiminhduc.repository.CardRepository;

import java.util.List;

public class CardRepositoryImpl extends BasicQuery<CardEntity, Integer> implements CardRepository {

    @Override
    public boolean kiemTraSanPhamCoTrongCard(int maSanPham) {
        CardRepository cardRepository = new CardRepositoryImpl();
        List<CardEntity> entities = cardRepository.findAll();
        for (CardEntity cardEntity : entities) {
            if (cardEntity.getMaSp() == maSanPham){
                return true;
            }
        }
        return false;
    }
}
