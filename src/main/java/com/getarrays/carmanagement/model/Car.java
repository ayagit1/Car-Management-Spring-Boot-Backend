package com.getarrays.carmanagement.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Car implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;

    private String city;

    private String state;

    @Column(name = "Model_Year")
    private int modelYear;

    @Column(name = "Vehicule_Location")
    private String vehicleLocation;

    @Column(name = "Electric_Vehicule_Type")
    private String electricVehicleType;

    @Column(name = "Electric_Utility")
    private String electricUtility;

    @Column(name = "imageURL")
    private String imageUrl;

    @Column(nullable = false, updatable = false)
    private String ownerCode;

    public Car() {}

    public Car( String city, String state, int modelYear, String vehicleLocation,
               String electricVehicleType, String electricUtility, String imageUrl, String ownerCode) {
        this.city = city;
        this.state = state;
        this.modelYear = modelYear;
        this.vehicleLocation = vehicleLocation;
        this.electricVehicleType = electricVehicleType;
        this.electricUtility = electricUtility;
        this.imageUrl = imageUrl;
        this.ownerCode = ownerCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public String getVehicleLocation() {
        return vehicleLocation;
    }

    public void setVehicleLocation(String vehicleLocation) {
        this.vehicleLocation = vehicleLocation;
    }

    public String getElectricVehicleType() {
        return electricVehicleType;
    }

    public void setElectricVehicleType(String electricVehicleType) {
        this.electricVehicleType = electricVehicleType;
    }

    public String getElectricUtility() {
        return electricUtility;
    }

    public void setElectricUtility(String electricUtility) {
        this.electricUtility = electricUtility;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getOwnerCode() {
        return ownerCode;
    }

    public void setOwnerCode(String ownerCode) {
        this.ownerCode = ownerCode;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", modelYear=" + modelYear +
                ", vehicleLocation='" + vehicleLocation + '\'' +
                ", electricVehicleType='" + electricVehicleType + '\'' +
                ", electricUtility='" + electricUtility + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", ownerCode='" + ownerCode + '\'' +
                '}';
    }
}