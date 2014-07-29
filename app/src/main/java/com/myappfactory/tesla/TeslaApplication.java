package com.myappfactory.tesla;

import android.app.Application;

import com.myappfactory.tesla.api.CookieManager_;
import com.myappfactory.tesla.api.clients.LoginClient;
import com.myappfactory.tesla.api.clients.VehicleCommandClient;
import com.myappfactory.tesla.api.clients.VehicleStatusClient;

import org.androidannotations.annotations.EApplication;
import org.androidannotations.annotations.rest.RestService;
import org.androidannotations.annotations.sharedpreferences.Pref;

@EApplication
public class TeslaApplication extends Application {

    @RestService
    LoginClient loginClient;

    @RestService
    VehicleStatusClient vehicleStatusClient;

    @RestService
    VehicleCommandClient vehicleCommandClient;

    @Pref
    CookieManager_ cookieManager;

    @Override
    public void onCreate () {
        if (cookieManager.portalSession().exists()) {
            setCookie("_s_portal_session", cookieManager.portalSession().get(), false);
        }

        if (cookieManager.userCredentials().exists()) {
            setCookie("user_credentials", cookieManager.userCredentials().get(), false);
        }
    }

    public LoginClient getLoginClient () {
        return loginClient;
    }

    public VehicleStatusClient getVehicleStatusClient () {
        return vehicleStatusClient;
    }

    public VehicleCommandClient getVehicleCommandClient () {
        return vehicleCommandClient;
    }

    public void setCookie (String name, String value, boolean shouldPersist) {
        vehicleStatusClient.setCookie(name, value);
        vehicleCommandClient.setCookie(name, value);

        CookieManager_.CookieManagerEditor_ cookieManagerEditor = cookieManager.edit();
        if (name.equals("user_credentials")) {
            cookieManagerEditor.userCredentials().put(value);
        } else if (name.equals("_s_portal_session")) {
            cookieManagerEditor.portalSession().put(value);
        }
        cookieManagerEditor.apply();
    }
}
