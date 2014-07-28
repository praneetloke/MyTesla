package com.myappfactory.tesla.api.models;

import com.google.gson.annotations.SerializedName;

/**
 * http://docs.timdorr.apiary.io/#get-%2Fvehicles%2F%7Bid%7D%2Fcommand%2Fgui_settings
 {
 "gui_distance_units": "mi/hr",
 "gui_temperature_units": "F",
 "gui_charge_rate_units": "mi/hr",
 "gui_24_hour_time": false,
 "gui_range_display": "Rated"
 }
 */
public class GuiSettings {
    @SerializedName("gui_distance_units")
    private String guiDistanceUnits;

    @SerializedName("gui_temperature_units")
    private String guiTemperatureUnits;

    @SerializedName("gui_charge_rate_units")
    private String guiChargeRateUnits;

    @SerializedName("gui_24_hour_time")
    private Boolean gui24HourTime;

    @SerializedName("gui_range_display")
    private String guiRangeDisplay;

    public String getGuiDistanceUnits() {
        return guiDistanceUnits;
    }

    public void setGuiDistanceUnits(String guiDistanceUnits) {
        this.guiDistanceUnits = guiDistanceUnits;
    }

    public String getGuiTemperatureUnits() {
        return guiTemperatureUnits;
    }

    public void setGuiTemperatureUnits(String guiTemperatureUnits) {
        this.guiTemperatureUnits = guiTemperatureUnits;
    }

    public String getGuiChargeRateUnits() {
        return guiChargeRateUnits;
    }

    public void setGuiChargeRateUnits(String guiChargeRateUnits) {
        this.guiChargeRateUnits = guiChargeRateUnits;
    }

    public Boolean getGui24HourTime() {
        return gui24HourTime;
    }

    public void setGui24HourTime(Boolean gui24HourTime) {
        this.gui24HourTime = gui24HourTime;
    }

    public String getGuiRangeDisplay() {
        return guiRangeDisplay;
    }

    public void setGuiRangeDisplay(String guiRangeDisplay) {
        this.guiRangeDisplay = guiRangeDisplay;
    }
}
