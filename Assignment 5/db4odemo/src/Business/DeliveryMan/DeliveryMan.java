/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Order.Order;
import Business.Order.OrderDirectory;
import Business.Util;

/**
 *
 * @author harold
 */
public class DeliveryMan {

    private String name;
    private String id;
    private OrderDirectory orderList;

    public DeliveryMan() {
        id = Util.generateId();
        orderList = new OrderDirectory();
    }

    public void addOrder(Order order) {
        this.orderList.getOrderList().add(order);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public OrderDirectory getOrderList() {
        return orderList;
    }

    @Override
    public String toString() {
        return name;
    }

}
