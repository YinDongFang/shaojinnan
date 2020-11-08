/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Order.Order.Status;
import java.util.Date;

/**
 *
 * @author shaojinnan
 */
public class StateTransition {

    private Status from;
    private Status to;
    private Date time;
    private String operatorId;

    public StateTransition(Status from, Status to, String operatorId) {
        this.from = from;
        this.to = to;
        this.operatorId = operatorId;
        this.time = new Date();
        
    }

    public Status getFrom() {
        return from;
    }

    public void setFrom(Status from) {
        this.from = from;
    }

    public Status getTo() {
        return to;
    }

    public void setTo(Status to) {
        this.to = to;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }
}
