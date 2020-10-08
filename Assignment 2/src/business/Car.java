/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.Date;

/**
 *
 * @author shaojinnan
 */
public class Car {
    private boolean available;
    private Manufacturer manufacturer;
    private int manufacturingTime;
    private int seats;
    private String serialNumber;
    private String modelNumber;
    private Date lastUpdateTime;
    private String city;
    private Date expired;
    
    public Car() {
        manufacturingTime = 2020;
        seats = 4;
        expired = new Date();
        lastUpdateTime = new Date();
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getManufacturingTime() {
        return manufacturingTime;
    }

    public void setManufacturingTime(int manufacturingTime) {
        this.manufacturingTime = manufacturingTime;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Date getExpired() {
        return expired;
    }

    public void setExpired(Date expired) {
        this.expired = expired;
    }
    
    public boolean isExpired(){
        return new Date().after(expired);
    }
    
    
}
