package com.myappfactory.tesla.api.models;

import com.google.gson.annotations.SerializedName;

/**
 * http://docs.timdorr.apiary.io/#get-%2Fvehicles
 [{
 "color": null,
 "display_name": null,
 "id": 321,
 "option_codes": "MS01,RENA,TM00,DRLH,PF00,BT85,PBCW,RFPO,WT19,IBMB,IDPB,TR00,SU01,SC01,TP01,AU01,CH00,HP00,PA00,PS00,AD02,X020,X025,X001,X003,X007,X011,X013",
 "user_id": 123,
 "vehicle_id": 1234567890,
 "vin": "5YJSA1CN5CFP01657",
 "tokens": ["x", "x"],
 "state": "online"
 }]
 */
public class TeslaVehicle {
    private Integer id;

    private String color;

    @SerializedName("display_name")
    private String displayName;

    @SerializedName("option_codes")
    private String[] optionCodes;

    @SerializedName("user_id")
    private Integer userId;

    @SerializedName("vehicle_id")
    private String vehicleId;

    private String vin;

    private String[] tokens;

    private String state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String[] getOptionCodes() {
        return optionCodes;
    }

    public void setOptionCodes(String[] optionCodes) {
        this.optionCodes = optionCodes;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String[] getTokens() {
        return tokens;
    }

    public void setTokens(String[] tokens) {
        this.tokens = tokens;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
