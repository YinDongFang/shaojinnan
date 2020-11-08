/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.Menu.Dish;
import Business.Restaurant.Restaurant;
import Business.Util;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author raunak
 */
public class Order {

    public enum Status {
        Unconfirmed, Pending, Refused, Cancelled, InDelivery, Completed
    }

    private String orderId;
    private Customer customer;
    private Restaurant restaurant;
    private List<Dish> dishes;
    private Status status;
    private Comment comment;
    private DeliveryMan deliveryMan;
    private Date createDate;
    private List<StateTransition> stateTransitions;

    public Order(Customer customer, Restaurant restaurant, List<Dish> dishes) {
        this.customer = customer;
        this.restaurant = restaurant;
        this.createDate = new Date();
        this.dishes = dishes;
        this.stateTransitions = new ArrayList<StateTransition>();
        this.status = Status.Unconfirmed;
        this.stateTransitions.add(new StateTransition(null, this.status, customer.getId()));
        this.orderId = Util.generateId();

    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public void setDeliveryMan(DeliveryMan deliveryMan) {
        this.deliveryMan = deliveryMan;
        this.stateTransitions.add(new StateTransition(this.status, Status.InDelivery, deliveryMan.getId()));
        this.status = status.InDelivery;
    }

    public void confirm() {
        this.stateTransitions.add(new StateTransition(this.status, Status.Pending, restaurant.getId()));
        this.status = status.Pending;
    }

    public void refuse() {
        this.stateTransitions.add(new StateTransition(this.status, Status.Refused, restaurant.getId()));
        this.status = status.Refused;
    }

    public void complete() {
        this.stateTransitions.add(new StateTransition(this.status, Status.Completed, deliveryMan.getId()));
        this.status = status.Completed;
    }

    public void cancel() {
        this.stateTransitions.add(new StateTransition(this.status, Status.Cancelled, customer.getId()));
        this.status = status.Cancelled;
    }

    public String getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public Status getStatus() {
        return status;
    }

    public Comment getComment() {
        return comment;
    }

    public DeliveryMan getDeliveryMan() {
        return deliveryMan;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public List<StateTransition> getStateTransitions() {
        return stateTransitions;
    }

}
