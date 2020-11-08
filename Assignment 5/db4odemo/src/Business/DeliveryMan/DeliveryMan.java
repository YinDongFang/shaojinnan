/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Order.OrderDirectory;

/**
 *
 * @author harold
 */
public class DeliveryMan {
    
    private String name;
    private int id;
    private static int count = 1;
    private String UserName;
    private OrderDirectory workQueue;
    
    public DeliveryMan() {
        id = count;
        count++;
        workQueue = new OrderDirectory();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    
    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
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
