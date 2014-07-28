package com.myappfactory.tesla.api.models;

import com.google.gson.annotations.SerializedName;

/**
 * http://docs.timdorr.apiary.io/#get-%2Fvehicles%2F%7Bid%7D%2Fcommand%2Fclimate_state
 {
 "inside_temp": 17.0,          // degC inside car
 "outside_temp": 9.5,          // degC outside car or null
 "driver_temp_setting": 22.6,  // degC of driver temperature setpoint
 "passenger_temp_setting": 22.6, // degC of passenger temperature setpoint
 "is_auto_conditioning_on": false, // apparently even if on
 "is_front_defroster_on": null, // null or boolean as integer?
 "is_rear_defroster_on": false,
 "fan_status": 0               // fan speed 0-6 or null
 }
 */
public class ClimateState {
    @SerializedName("inside_temp")
    private Float insideTemp;

    @SerializedName("outside_temp")
    private Float outsideTemp;

    @SerializedName("driver_temp_setting")
    private Float driverTempSetting;

    @SerializedName("passenger_temp_setting")
    private Float passengerTempSetting;

    @SerializedName("is_auto_conditioning_on")
    private Boolean autoConditioningOn;

    @SerializedName("is_front_defroster_on")
    private Boolean frontDefrosterOn;

    @SerializedName("is_rear_defroster_on")
    private Boolean rearDefrosterOn;

    @SerializedName("fan_status")
    private Integer fanStatus;

    public Float getInsideTemp() {
        return insideTemp;
    }

    public void setInsideTemp(Float insideTemp) {
        this.insideTemp = insideTemp;
    }

    public Float getOutsideTemp() {
        return outsideTemp;
    }

    public void setOutsideTemp(Float outsideTemp) {
        this.outsideTemp = outsideTemp;
    }

    public Float getDriverTempSetting() {
        return driverTempSetting;
    }

    public void setDriverTempSetting(Float driverTempSetting) {
        this.driverTempSetting = driverTempSetting;
    }

    public Float getPassengerTempSetting() {
        return passengerTempSetting;
    }

    public void setPassengerTempSetting(Float passengerTempSetting) {
        this.passengerTempSetting = passengerTempSetting;
    }

    public Boolean getAutoConditioningOn() {
        return autoConditioningOn;
    }

    public void setAutoConditioningOn(Boolean autoConditioningOn) {
        this.autoConditioningOn = autoConditioningOn;
    }

    public Boolean getFrontDefrosterOn() {
        return frontDefrosterOn;
    }

    public void setFrontDefrosterOn(Boolean frontDefrosterOn) {
        this.frontDefrosterOn = frontDefrosterOn;
    }

    public Boolean getRearDefrosterOn() {
        return rearDefrosterOn;
    }

    public void setRearDefrosterOn(Boolean rearDefrosterOn) {
        this.rearDefrosterOn = rearDefrosterOn;
    }

    public Integer getFanStatus() {
        return fanStatus;
    }

    public void setFanStatus(Integer fanStatus) {
        this.fanStatus = fanStatus;
    }
}
