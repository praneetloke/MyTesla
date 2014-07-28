package com.myappfactory.tesla.api.clients;

import com.myappfactory.tesla.api.Endpoints;

import org.androidannotations.annotations.rest.Accept;
import org.androidannotations.annotations.rest.Get;
import org.androidannotations.annotations.rest.Post;
import org.androidannotations.annotations.rest.Rest;
import org.androidannotations.annotations.rest.SetsCookie;
import org.androidannotations.api.rest.MediaType;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.util.LinkedMultiValueMap;

@Rest(rootUrl = Endpoints.ROOT_URL, converters = { FormHttpMessageConverter.class, StringHttpMessageConverter.class })
@Accept(MediaType.TEXT_HTML)
public interface LoginClient {
    void setCookie (String name, String value);
    String getCookie (String name);

    @Get(Endpoints.LOGIN)
    @SetsCookie({"_s_portal_session"})
    String getLoginForm();

    @Post(Endpoints.LOGIN)
    @SetsCookie({"user_credentials"})
    String postLoginForm(LinkedMultiValueMap<String, String> user_session);
}
