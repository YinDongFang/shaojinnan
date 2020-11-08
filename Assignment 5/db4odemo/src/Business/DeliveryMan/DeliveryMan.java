/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Order.Order;
import Business.Order.OrderDirectory;
import Business.User.User;
import Business.Util;

/**
 *
 * @author harold
 */
public class DeliveryMan extends User {

    private OrderDirectory orderList;

    public DeliveryMan() {
        super();
        orderList = new OrderDirectory();
    }

    public void addOrder(Order order) {
        this.orderList.getOrderList().add(order);
    }

    public OrderDirectory getOrderList() {
        return orderList;
    }

}
