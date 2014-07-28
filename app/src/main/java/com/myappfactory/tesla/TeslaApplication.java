package com.myappfactory.tesla;

import android.app.Application;

import com.myappfactory.tesla.api.clients.LoginClient;
import com.myappfactory.tesla.api.clients.VehicleCommandClient;
import com.myappfactory.tesla.api.clients.VehicleStatusClient;

import org.androidannotations.annotations.EApplication;
import org.androidannotations.annotations.rest.RestService;

@EApplication
public class TeslaApplication extends Application {

    @RestService
    LoginClient loginClient;

    @RestService
    VehicleStatusClient vehicleStatusClient;

    @RestService
    VehicleCommandClient vehicleCommandClient;

    public LoginClient getLoginClient () {
        return loginClient;
    }

    public VehicleStatusClient getVehicleStatusClient () {
        return vehicleStatusClient;
    }

    public VehicleCommandClient getVehicleCommandClient () {
        return vehicleCommandClient;
    }
}
