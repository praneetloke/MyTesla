package com.myappfactory.tesla.api;

import org.androidannotations.annotations.sharedpreferences.SharedPref;

@SharedPref(value= SharedPref.Scope.UNIQUE)
public interface CookieManager {
    String portalSession();
    String userCredentials();
}
