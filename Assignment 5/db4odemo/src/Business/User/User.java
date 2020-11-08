/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.User;

/**
 *
 * @author raunak
 */
public class User {
    
    protected String name;
    protected int id;
    private static int count = 1;

    public User() {
        id = count;
        count++;
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

    @Override
    public String toString() {
        return name;
    }
    
    
}
