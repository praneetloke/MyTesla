package com.myappfactory.tesla.api.clients;

import com.myappfactory.tesla.api.Endpoints;
import com.myappfactory.tesla.api.models.ChargeState;
import com.myappfactory.tesla.api.models.ClimateState;
import com.myappfactory.tesla.api.models.DriveState;
import com.myappfactory.tesla.api.models.GuiSettings;
import com.myappfactory.tesla.api.models.TeslaGenericResponse;
import com.myappfactory.tesla.api.models.VehicleState;

import org.androidannotations.annotations.rest.Get;
import org.androidannotations.annotations.rest.RequiresCookie;
import org.androidannotations.annotations.rest.Rest;
import org.springframework.http.converter.json.GsonHttpMessageConverter;

@Rest(rootUrl = Endpoints.ROOT_URL, converters = { GsonHttpMessageConverter.class })
public interface VehicleCommandClient {
    void setCookie (String name, String value);
    String getCookie (String name);

    @Get(Endpoints.BASE_COMMAND_PATH + Endpoints.VehicleCommand.CHARGE_STATE)
    @RequiresCookie({"_s_portal_session", "user_credentials"})
    ChargeState getChargeState (int id);

    @Get(Endpoints.BASE_COMMAND_PATH + Endpoints.VehicleCommand.CLIMATE_STATE)
    @RequiresCookie({"_s_portal_session", "user_credentials"})
    ClimateState getClimateState (int id);

    @Get(Endpoints.BASE_COMMAND_PATH + Endpoints.VehicleCommand.DRIVE_STATE)
    @RequiresCookie({"_s_portal_session", "user_credentials"})
    DriveState getDriveState (int id);

    @Get(Endpoints.BASE_COMMAND_PATH + Endpoints.VehicleCommand.GUI_SETTINGS)
    @RequiresCookie({"_s_portal_session", "user_credentials"})
    GuiSettings getGuiSettings (int id);

    @Get(Endpoints.BASE_COMMAND_PATH + Endpoints.VehicleCommand.VEHICLE_STATE)
    @RequiresCookie({"_s_portal_session", "user_credentials"})
    VehicleState getVehicleState (int id);

    @Get(Endpoints.BASE_COMMAND_PATH + Endpoints.VehicleCommand.CHARGE_PORT_DOOR_OPEN)
    @RequiresCookie({"_s_portal_session", "user_credentials"})
    TeslaGenericResponse openChargePortDoor (int id);

    @Get(Endpoints.BASE_COMMAND_PATH + Endpoints.VehicleCommand.CHARGE_STANDARD)
    @RequiresCookie({"_s_portal_session", "user_credentials"})
    TeslaGenericResponse chargeStandard (int id);

    @Get(Endpoints.BASE_COMMAND_PATH + Endpoints.VehicleCommand.CHARGE_MAX_RANGE)
    @RequiresCookie({"_s_portal_session", "user_credentials"})
    TeslaGenericResponse chargeMaxRange (int id);

    @Get(Endpoints.BASE_COMMAND_PATH + Endpoints.VehicleCommand.SET_CHARGE_LIMIT)
    @RequiresCookie({"_s_portal_session", "user_credentials"})
    TeslaGenericResponse chargeMaxRange (int id, int limit_value);

    @Get(Endpoints.BASE_COMMAND_PATH + Endpoints.VehicleCommand.CHARGE_START)
    @RequiresCookie({"_s_portal_session", "user_credentials"})
    TeslaGenericResponse startCharge (int id);

    @Get(Endpoints.BASE_COMMAND_PATH + Endpoints.VehicleCommand.CHARGE_STOP)
    @RequiresCookie({"_s_portal_session", "user_credentials"})
    TeslaGenericResponse stopCharge (int id);

    @Get(Endpoints.BASE_COMMAND_PATH + Endpoints.VehicleCommand.FLASH_LIGHTS)
    @RequiresCookie({"_s_portal_session", "user_credentials"})
    TeslaGenericResponse flashLights (int id);

    @Get(Endpoints.BASE_COMMAND_PATH + Endpoints.VehicleCommand.HONK_HORN)
    @RequiresCookie({"_s_portal_session", "user_credentials"})
    TeslaGenericResponse honkHorn (int id);

    @Get(Endpoints.BASE_COMMAND_PATH + Endpoints.VehicleCommand.DOOR_UNLOCK)
    @RequiresCookie({"_s_portal_session", "user_credentials"})
    TeslaGenericResponse unlockDoor (int id);

    @Get(Endpoints.BASE_COMMAND_PATH + Endpoints.VehicleCommand.SET_TEMPS + Endpoints.VehicleCommand.SET_TEMPS_DRIVER_SIDE_QUERY_ARG + "&" + Endpoints.VehicleCommand.SET_TEMPS_PASSENGER_SIDE_QUERY_ARG)
    @RequiresCookie({"_s_portal_session", "user_credentials"})
    TeslaGenericResponse setPassengerSideTemp (int id, int driver_degC, int pass_degC);

    @Get(Endpoints.BASE_COMMAND_PATH + Endpoints.VehicleCommand.SET_TEMPS + Endpoints.VehicleCommand.SET_TEMPS_DRIVER_SIDE_QUERY_ARG)
    @RequiresCookie({"_s_portal_session", "user_credentials"})
    TeslaGenericResponse setDriverSideTemp (int id, int driver_degC);

    @Get(Endpoints.BASE_COMMAND_PATH + Endpoints.VehicleCommand.SET_TEMPS + Endpoints.VehicleCommand.SET_TEMPS_PASSENGER_SIDE_QUERY_ARG)
    @RequiresCookie({"_s_portal_session", "user_credentials"})
    TeslaGenericResponse setPassengerSideTemp (int id, int pass_degC);

    @Get(Endpoints.BASE_COMMAND_PATH + Endpoints.VehicleCommand.AUTO_CONDITIONING_START)
    @RequiresCookie({"_s_portal_session", "user_credentials"})
    TeslaGenericResponse startAC (int id);

    @Get(Endpoints.BASE_COMMAND_PATH + Endpoints.VehicleCommand.AUTO_CONDITIONING_STOP)
    @RequiresCookie({"_s_portal_session", "user_credentials"})
    TeslaGenericResponse stopAC (int id);

    @Get(Endpoints.BASE_COMMAND_PATH + Endpoints.VehicleCommand.SUN_ROOF_CONTROL)
    @RequiresCookie({"_s_portal_session", "user_credentials"})
    TeslaGenericResponse changeSunRoofState (int id, String state);
}
