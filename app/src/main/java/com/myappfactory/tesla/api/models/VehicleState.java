package com.myappfactory.tesla.api.models;

import com.google.gson.annotations.SerializedName;

/**
 * http://docs.timdorr.apiary.io/#get-%2Fvehicles%2F%7Bid%7D%2Fcommand%2Fvehicle_state
 {
 "df": false,                  // driver's side front door open
 "dr": false,                  // driver's side rear door open
 "pf": false,                  // passenger's side front door open
 "pr": false,                  // passenger's side rear door open
 "ft": false,                  // front trunk is open
 "rt": false,                  // rear trunk is open
 "car_verson": "1.19.42",      // car firmware version
 "locked": true,               // car is locked
 "sun_roof_installed": false,  // panoramic roof is installed
 "sun_roof_state": "unknown",
 "sun_roof_percent_open": 0,   // null if not installed
 "dark_rims": false,           // gray rims installed
 "wheel_type": "Base19",       // wheel type installed
 "has_spoiler": false,         // spoiler is installed
 "roof_color": "Colored",      // "None" for panoramic roof
 "perf_config": "Base"
 }
 */
public class VehicleState {
    @SerializedName("df")
    private Boolean driverSideFrontDoorOpen;

    @SerializedName("dr")
    private Boolean driverSideRearDoorOpen;

    @SerializedName("pf")
    private Boolean passengerSideFrontDoorOpen;

    @SerializedName("pr")
    private Boolean passengerSideRearDoorOpen;

    @SerializedName("ft")
    private Boolean frontTrunkOpen;

    @SerializedName("rt")
    private Boolean rearTrunkOpen;

    @SerializedName("car_version")
    private String carVersion;

    private Boolean locked;

    @SerializedName("sun_roof_installed")
    private Boolean sunRoofInstalled;

    @SerializedName("sun_roof_state")
    private String sunRoofState;

    @SerializedName("sun_roof_percent_open")
    private Integer sunRoofPercentOpen;

    @SerializedName("dark_rims")
    private Boolean darkRims;

    @SerializedName("wheel_type")
    private String wheelType;

    @SerializedName("has_spoiler")
    private Boolean hasSpoiler;

    @SerializedName("roof_color")
    private String roofColor;

    @SerializedName("perf_config")
    private String performanceConfig;
}
