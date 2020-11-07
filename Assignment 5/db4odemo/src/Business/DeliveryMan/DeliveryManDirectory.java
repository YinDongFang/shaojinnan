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
    
    
    private List<DeliveryMan> deliveryMans;
    
    public DeliveryManDirectory() {
        this.deliveryMans = new ArrayList<DeliveryMan>();
    }

    /**
     * @return the deliveryMans
     */
    public List<DeliveryMan> getDeliveryMans() {
        return deliveryMans;
    }

    /**
     * @param deliveryMans the deliveryMans to set
     */
    public void setDeliveryMans(List<DeliveryMan> deliveryMans) {
        this.deliveryMans = deliveryMans;
    }
    
}
