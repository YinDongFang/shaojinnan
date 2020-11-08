/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrderDirectory {
    
    private ArrayList<Order> workRequestList;

    public OrderDirectory() {
        workRequestList = new ArrayList();
    }

    public ArrayList<Order> getWorkRequestList() {
        return workRequestList;
    }
}