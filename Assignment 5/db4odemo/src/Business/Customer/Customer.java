/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Order.OrderDirectory;

/**
 *
 * @author harold
 */
public class Customer {
    private String name;
    private int id;
    private static int count = 1;
    private String userName;
    private OrderDirectory workQueue;
    
    public Customer() {
        id = count;
        count++;
        workQueue = new OrderDirectory();
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public OrderDirectory getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(OrderDirectory workQueue) {
        this.workQueue = workQueue;
    }
    
    
    @Override
    public String toString() {
        return name;
    }
    
    
}
