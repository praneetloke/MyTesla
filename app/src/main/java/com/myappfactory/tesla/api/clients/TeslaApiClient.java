package com.myappfactory.tesla.api.clients;

/**
 * Created by ploke on 7/27/14.
 */
public interface TeslaApiClient {
    void setCookie(String name, String value);
    String getCookie(String name);
}
