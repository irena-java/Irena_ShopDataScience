package com.datascience.shop.main.service;

import com.datascience.shop.main.dao.BacketDao;
import com.datascience.shop.main.entity.Basket;

import java.util.List;

public class BasketService {
    private BacketDao backetDao;

    public BasketService() {
        this.backetDao = new BacketDao();
    }

    public List<Basket> findAll() {
        System.out.println("зашла в backetservice");
        List<Basket> baskets = backetDao.findAll();
        if (baskets.isEmpty()) {
            System.out.println("список корзин пуст");
        }
        return baskets;
    }
}
