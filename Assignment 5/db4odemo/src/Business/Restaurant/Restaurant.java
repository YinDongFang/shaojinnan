/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.Menu.Dish;
import Business.Menu.Menu;
import Business.Order.Order;
import Business.Order.OrderDirectory;
import Business.User.User;
import Business.Util;

/**
 *
 * @author harold
 */
public class Restaurant extends User {

    private String location;
    private Menu menu;
    private boolean opened = true;
    private OrderDirectory orderList;

    public Restaurant() {
        super();
        menu = new Menu();
        orderList = new OrderDirectory();
    }

    public void addDish(Dish dish) {
        menu.getDishesCatalog().add(dish);
    }

    public void removeDish(Dish dish) {
        menu.getDishesCatalog().remove(dish);
    }

    public void addOrder(Order order) {
        this.orderList.getOrderList().add(order);
    }

    public boolean isOpened() {
        return opened;
    }

    public void setOpened(boolean opened) {
        this.opened = opened;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
