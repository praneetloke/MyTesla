package com.myappfactory.tesla.api.clients;

import com.myappfactory.tesla.api.Endpoints;
import com.myappfactory.tesla.api.models.TeslaGenericResponse;
import com.myappfactory.tesla.api.models.TeslaVehicle;

import org.androidannotations.annotations.rest.Get;
import org.androidannotations.annotations.rest.RequiresCookie;
import org.androidannotations.annotations.rest.Rest;
import org.springframework.http.converter.json.GsonHttpMessageConverter;

import java.util.List;

@Rest(rootUrl = Endpoints.ROOT_URL, converters = { GsonHttpMessageConverter.class })
public interface VehicleStatusClient {
    void setCookie(String name, String value);
    String getCookie(String name);

    @Get(Endpoints.VEHICLES_PATH)
    List<TeslaVehicle> getVehicles ();

    @Get(Endpoints.BASE_VEHICLE_PATH + Endpoints.VehicleStatus.MOBILE_ENABLED)
    @RequiresCookie({"_s_portal_session", "user_credentials"})
    TeslaGenericResponse getMobileEnabled (int id);
}
