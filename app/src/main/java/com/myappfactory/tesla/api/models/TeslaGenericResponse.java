package com.myappfactory.tesla.api.models;

/**
 * http://docs.timdorr.apiary.io/#get-%2Fvehicles%2F%7Bid%7D%2Fmobile_enabled
 {
 "reason":"",
 "result":true
 }
 */
public class TeslaGenericResponse {
    private String reason;
    private Boolean result;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }
}
