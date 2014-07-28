package com.myappfactory.tesla.api.models;

import com.google.gson.annotations.SerializedName;

/**
 * http://docs.timdorr.apiary.io/#get-%2Fvehicles%2F%7Bid%7D%2Fcommand%2Fdrive_state
 {
 "shift_state": null,          //
 "speed": null,                //
 "latitude": 33.794839,        // degrees N of equator
 "longitude": -84.401593,      // degrees W of the prime meridian
 "heading": 4,                 // integer compass heading, 0-359
 "gps_as_of": 1359863204       // Unix timestamp of GPS fix
 }
 */
public class DriveState {
    @SerializedName("shift_state")
    private Integer shiftState;

    private Integer speed;

    private Double latitude;

    private Double longitude;

    private Integer heading;

    @SerializedName("gps_as_of")
    private Long gpsAsOfMillis;

    public Integer getShiftState() {
        return shiftState;
    }

    public void setShiftState(Integer shiftState) {
        this.shiftState = shiftState;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Integer getHeading() {
        return heading;
    }

    public void setHeading(Integer heading) {
        this.heading = heading;
    }

    public Long getGpsAsOfMillis() {
        return gpsAsOfMillis;
    }

    public void setGpsAsOfMillis(Long gpsAsOfMillis) {
        this.gpsAsOfMillis = gpsAsOfMillis;
    }
}
