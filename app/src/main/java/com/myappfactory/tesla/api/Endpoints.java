package com.myappfactory.tesla.api;

public class Endpoints {
    public static final String ROOT_URL = "https://portal.vn.teslamotors.com";
    public static final String LOGIN = "/login";

    public static final String VEHICLES_PATH = "/vehicles";
    public static final String ID_PATH = "/{id}";
    public static final String BASE_VEHICLE_PATH = VEHICLES_PATH + ID_PATH;
    public static final String BASE_COMMAND_PATH = BASE_VEHICLE_PATH + "/command";

    //VEHICLE STATUS.../vehicles/{id}/*
    public static class VehicleStatus {
        public static final String MOBILE_ENABLED = "/mobile_enabled";
    }

    //VEHICLE COMMANDS.../vehicles/{id}/command/*
    public static class VehicleCommand {
        //STATES
        public static final String CHARGE_STATE = "/charge_state";
        public static final String CLIMATE_STATE = "/climate_state";
        public static final String DRIVE_STATE = "/drive_state";
        public static final String VEHICLE_STATE = "/vehicle_state";

        public static final String GUI_SETTINGS = "/gui_settings";

        //CHARGING
        public static final String CHARGE_PORT_DOOR_OPEN = "/charge_port_door_open";
        public static final String CHARGE_STANDARD = "/charge_standard";
        public static final String CHARGE_MAX_RANGE = "/charge_max_range";
        public static final String SET_CHARGE_LIMIT = "/set_charge_limit?percent={limit_value}";
        public static final String CHARGE_START = "/charge_start";
        public static final String CHARGE_STOP = "/charge_stop";

        //HOOTIN' AND THE HOLLERIN'
        public static final String FLASH_LIGHTS = "/flash_lights";
        public static final String HONK_HORN = "/honk_horn";

        //DOORS
        public static final String DOOR_UNLOCK = "/door_unlock";
        public static final String DOOR_LOCK = "/door_lock";

        //TEMPERATURE
        public static final String SET_TEMPS = "/set_temps?";
        public static final String SET_TEMPS_DRIVER_SIDE_QUERY_ARG = "driver_temp={driver_degC}";
        public static final String SET_TEMPS_PASSENGER_SIDE_QUERY_ARG = "passenger_temp={pass_degC}";

        //HVAC
        public static final String AUTO_CONDITIONING_START = "/auto_conditioning_start";
        public static final String AUTO_CONDITIONING_STOP = "/auto_condition_stop";

        //SUN ROOF
        public static final String SUN_ROOF_CONTROL = "/sun_roof_control?state={state}";
    }
}
