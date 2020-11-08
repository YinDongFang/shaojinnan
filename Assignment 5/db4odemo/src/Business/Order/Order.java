/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.Menu.Dish;
import Business.Restaurant.Restaurant;
import java.util.Date;
import java.util.List;



/**
 *
 * @author raunak
 */
public class Order {
    
    public enum Status {
        Unconfirmed,Pending,Refused,Cancelled,InDelivery,Completed
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
    
} 
