package org.example;

import java.util.List;

public class Order {
    int ID;
    Buyer buyer;
    Product product;

    public Order(Buyer buyer, Product product) {
        this.buyer = buyer;
        this.product = product;
        this.ID = ID + 1;
    }

    public static Order buy(Buyer buyer, String product, List<Buyer> buyerList, List<Product> productList) throws NotFoundBuyerException, NotFoundProductException {
        for(int i = 0; i < buyerList.size(); i++){
            if(buyer.name.equals(buyerList.get(i).name)){
                System.out.println("Пользователь найден!");
                break;
            }
            if(i == buyerList.size() - 1 && !buyer.name.equals(buyerList.get(i).name)){
                throw new NotFoundBuyerException("Пользователь не найден");
            }
        }
        Product searchProduct = null;
        for(int j = 0; j < productList.size(); j++){
            if(product.equals(productList.get(j).product)){
                System.out.println("Продукт найден!");
                searchProduct = productList.get(j);
                break;
            }
            if(j == productList.size() - 1 && !product.equals(productList.get(j).product)){
                throw new NotFoundProductException("Продукт не найден");
            }
        }

        System.out.println("Заказ успешно сформирован!");
        return new Order(buyer, searchProduct);
    }

    @Override
    public String toString() {
        return "Номер заказа=" + ID +
                ", Покупатель=" + buyer +
                ", Продукт=" + product;
    }
}
