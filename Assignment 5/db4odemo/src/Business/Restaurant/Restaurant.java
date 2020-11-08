/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.Menu.Menu;
import Business.Order.OrderDirectory;


/**
 *
 * @author harold
 */
public class Restaurant {
    private String name;
    private String location;
    private int id;
    private static int count =1;
    private Menu dishesCatalog;
    private String UserName;
    private String status = "open";
    private OrderDirectory workQueue;
    
    public Restaurant(){
        id =count;
        count++;
        dishesCatalog = new Menu();
        workQueue = new OrderDirectory();
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Menu getDishesCatalog() {
        return dishesCatalog;
    }

    public void setDishesCatalog(Menu dishesCatalog) {
        this.dishesCatalog = dishesCatalog;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public OrderDirectory getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(OrderDirectory workQueue) {
        this.workQueue = workQueue;
    }
    
    
    public String toString(){
        return name;
    }
}
