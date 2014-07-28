package com.myappfactory.tesla.api.models;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

/**
 * http://docs.timdorr.apiary.io/#get-%2Fvehicles%2F%7Bid%7D%2Fcommand%2Fcharge_state
 {
 "charging_state": "Complete",  // "Charging", ??
 "charge_to_max_range": false,  // current std/max-range setting
 "max_range_charge_counter": 0,
 "fast_charger_present": false, // connected to Supercharger?
 "battery_range": 239.02,       // rated miles
 "est_battery_range": 155.79,   // range estimated from recent driving
 "ideal_battery_range": 275.09, // ideal miles
 "battery_level": 91,           // integer charge percentage
 "battery_current": -0.6,       // current flowing into battery
 "charge_starting_range": null,
 "charge_starting_soc": null,
 "charger_voltage": 0,          // only has value while charging
 "charger_pilot_current": 40,   // max current allowed by charger & adapter
 "charger_actual_current": 0,   // current actually being drawn
 "charger_power": 0,            // kW (rounded down) of charger
 "time_to_full_charge": null,   // valid only while charging
 "charge_rate": -1.0,           // float mi/hr charging or -1 if not charging
 "charge_port_door_open": true
 }
 */
public class ChargeState {
    @SerializedName("charging_state")
    private String chargingState;

    @SerializedName("charge_to_max_range")
    private Boolean chargeToMaxRange;

    @SerializedName("max_range_charge_counter")
    private Integer maxRangeChargeCounter;

    @SerializedName("fast_charger_present")
    private Boolean fast_charger_present;

    @SerializedName("battery_range")
    private Float batteryRange;

    @SerializedName("est_battery_range")
    private Float estimatedBatteryRange;

    @SerializedName("ideal_battery_range")
    private Float idealBatteryRange;

    @SerializedName("battery_level")
    private Integer batteryLevel;

    @SerializedName("battery_current")
    private Float batteryCurrent;

    @SerializedName("charge_starting_range")
    private Integer chargeStartingRange;

    @SerializedName("charge_starting_soc")
    private Integer chargeStartingSoC;

    @SerializedName("charger_voltage")
    private Integer chargerVoltage;

    @SerializedName("charger_pilot_current")
    private Integer chargerPilotCurrent;

    @SerializedName("charger_actual_current")
    private Integer chargerActualCurrent;

    @SerializedName("charger_power")
    private Integer chargerPower;

    @SerializedName("time_to_full_charge")
    private Date timeToFullCharge;

    @SerializedName("charge_rate")
    private Float chargeRate;

    @SerializedName("charge_port_door_open")
    private boolean chargePortDoorOpen;

    public String getChargingState() {
        return chargingState;
    }

    public void setChargingState(String chargingState) {
        this.chargingState = chargingState;
    }

    public Boolean getChargeToMaxRange() {
        return chargeToMaxRange;
    }

    public void setChargeToMaxRange(Boolean chargeToMaxRange) {
        this.chargeToMaxRange = chargeToMaxRange;
    }

    public Integer getMaxRangeChargeCounter() {
        return maxRangeChargeCounter;
    }

    public void setMaxRangeChargeCounter(Integer maxRangeChargeCounter) {
        this.maxRangeChargeCounter = maxRangeChargeCounter;
    }

    public Boolean getFast_charger_present() {
        return fast_charger_present;
    }

    public void setFast_charger_present(Boolean fast_charger_present) {
        this.fast_charger_present = fast_charger_present;
    }

    public Float getBatteryRange() {
        return batteryRange;
    }

    public void setBatteryRange(Float batteryRange) {
        this.batteryRange = batteryRange;
    }

    public Float getEstimatedBatteryRange() {
        return estimatedBatteryRange;
    }

    public void setEstimatedBatteryRange(Float estimatedBatteryRange) {
        this.estimatedBatteryRange = estimatedBatteryRange;
    }

    public Float getIdealBatteryRange() {
        return idealBatteryRange;
    }

    public void setIdealBatteryRange(Float idealBatteryRange) {
        this.idealBatteryRange = idealBatteryRange;
    }

    public Integer getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(Integer batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public Float getBatteryCurrent() {
        return batteryCurrent;
    }

    public void setBatteryCurrent(Float batteryCurrent) {
        this.batteryCurrent = batteryCurrent;
    }

    public Integer getChargeStartingRange() {
        return chargeStartingRange;
    }

    public void setChargeStartingRange(Integer chargeStartingRange) {
        this.chargeStartingRange = chargeStartingRange;
    }

    public Integer getChargeStartingSoC() {
        return chargeStartingSoC;
    }

    public void setChargeStartingSoC(Integer chargeStartingSoC) {
        this.chargeStartingSoC = chargeStartingSoC;
    }

    public Integer getChargerVoltage() {
        return chargerVoltage;
    }

    public void setChargerVoltage(Integer chargerVoltage) {
        this.chargerVoltage = chargerVoltage;
    }

    public Integer getChargerPilotCurrent() {
        return chargerPilotCurrent;
    }

    public void setChargerPilotCurrent(Integer chargerPilotCurrent) {
        this.chargerPilotCurrent = chargerPilotCurrent;
    }

    public Integer getChargerActualCurrent() {
        return chargerActualCurrent;
    }

    public void setChargerActualCurrent(Integer chargerActualCurrent) {
        this.chargerActualCurrent = chargerActualCurrent;
    }

    public Integer getChargerPower() {
        return chargerPower;
    }

    public void setChargerPower(Integer chargerPower) {
        this.chargerPower = chargerPower;
    }

    public Date getTimeToFullCharge() {
        return timeToFullCharge;
    }

    public void setTimeToFullCharge(Date timeToFullCharge) {
        this.timeToFullCharge = timeToFullCharge;
    }

    public Float getChargeRate() {
        return chargeRate;
    }

    public void setChargeRate(Float chargeRate) {
        this.chargeRate = chargeRate;
    }

    public boolean isChargePortDoorOpen() {
        return chargePortDoorOpen;
    }

    public void setChargePortDoorOpen(boolean chargePortDoorOpen) {
        this.chargePortDoorOpen = chargePortDoorOpen;
    }
}
