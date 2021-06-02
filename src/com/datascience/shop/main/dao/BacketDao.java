package com.datascience.shop.main.dao;

import com.datascience.shop.main.entity.Basket;
import com.datascience.shop.main.entity.StatusBasket;
import com.datascience.shop.main.utils.PostgresUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BacketDao {
    private static final String SELECT_ALL = "select * from basket";

    public List<Basket> findAll() {
        List<Basket> baskets = new ArrayList<>();
        try (Connection connection = PostgresUtils.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(SELECT_ALL);) {
            while (resultSet.next()) {
                Basket basket = new Basket();
                //           System.out.println(resultSet.getString("client"));
                //basket.setIdBasket(resultSet.getLong("idBasket"));
                //basket.setDateCreateBasket(resultSet.getDate("dateCreateBasket"));
      //          basket.setTestpole(resultSet.getString("client"));
                //String s1=resultSet.getString("statusBasket");
                //StatusBasket ss =s1.valueof(s1);

                basket.setStatusBasket(StatusBasket.valueOf(resultSet.getString("statusBasket")));
                baskets.add(basket);

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return baskets;
    }
}
