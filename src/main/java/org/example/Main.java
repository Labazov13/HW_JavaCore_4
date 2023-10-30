package org.example;

import java.util.ArrayList;
import java.util.List;

import static org.example.CheckData.checkData;
import static org.example.Order.buy;

public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException, NotFoundBuyerException, NotFoundProductException {
        /*String login = "login";
        String password = "pass";
        String confirmPassword = "pass";
        try{
            boolean result = checkData(login, password, confirmPassword);
            System.out.println(result);
        }
        catch (WrongLoginException | WrongPasswordException e){
            System.out.println(e.getMessage());
        }*/

        List <Buyer> buyerList = new ArrayList<>();
        Buyer b1 = new Buyer("Petr");
        Buyer b2 = new Buyer("Ivan");
        Buyer b3 = new Buyer("Andrey");
        Buyer b4 = new Buyer("Michail");
        buyerList.add(b1);
        buyerList.add(b2);
        buyerList.add(b3);
        buyerList.add(b4);
        List <Product> productList = new ArrayList<>();
        productList.add(new Product("VitaminC"));
        productList.add(new Product("Iphone"));
        productList.add(new Product("ComputerMouse"));
        productList.add(new Product("SiliconCase"));
        List <Order> orderList = new ArrayList<>();
        orderList.add(buy(b1, "VitaminC", buyerList, productList));

        System.out.println(orderList);
    }
}