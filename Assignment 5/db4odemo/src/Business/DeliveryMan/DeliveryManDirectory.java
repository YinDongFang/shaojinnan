/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory {
    
    
    private List<DeliveryMan> deliveryMen;
    
    public DeliveryManDirectory() {
        this.deliveryMen = new ArrayList<DeliveryMan>();
    }

    /**
     * @return the deliveryMans
     */
    public List<DeliveryMan> getDeliveryMen() {
        return deliveryMen;
    }

    /**
     * @param deliveryMen the deliveryMans to set
     */
    public void setDeliveryMen(List<DeliveryMan> deliveryMen) {
        this.deliveryMen = deliveryMen;
    }
    
}
