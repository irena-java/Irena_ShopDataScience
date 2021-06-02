package com.datascience.shop.main.entity;

import com.datascience.shop.main.dao.BacketDao;
import com.datascience.shop.main.service.BasketService;
import com.datascience.shop.main.utils.PostgresUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final String SELECT_ALL = "select * from basket";

    public static void main(String[] args) {

        BasketService service=new BasketService();

        List<Basket> allBasket=service.findAll();
for(Basket basket:allBasket){
    System.out.println(basket);
}

        /*System.out.println(allBasket);

        System.out.println("hi");



            List<Basket> baskets = new ArrayList<>();
            try (Connection connection = PostgresUtils.getConnection();
                 Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(SELECT_ALL);) {
                while (resultSet.next()) {
                    Basket basket=new Basket();
                    System.out.println(resultSet.getString("client"));
                    basket.setIdBasket(resultSet.getLong("idBasket"));
                    //basket.setDateCreateBasket(resultSet.getDate("dateCreateBasket"));
                    //basket.setClient(resultSet.getString("client"));
                    //basket.setStatusBasket(resultSet.getString("statusBasket"));
                    //baskets.add(basket);

                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            //return null;*/
        }
    }


