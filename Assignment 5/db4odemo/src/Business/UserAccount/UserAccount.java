/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.User.User;
import Business.Role.Role;
import Business.Order.OrderDirectory;

/**
 *
 * @author raunak
 */
public class UserAccount {
    
    private String username;
    private String password;
    private User employee;
    private Role role;
    private OrderDirectory workQueue;

    public UserAccount() {
        workQueue = new OrderDirectory();
    }
    
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployee(User employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public User getEmployee() {
        return employee;
    }

    public OrderDirectory getWorkQueue() {
        return workQueue;
    }

    
    
    @Override
    public String toString() {
        return username;
    }
    
    
    
}