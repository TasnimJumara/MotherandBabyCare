package com.example.lenovo.motherandbabycare;

import com.example.lenovo.motherandbabycare.Remote.IGoogleAPIService;
import com.example.lenovo.motherandbabycare.Remote.RetrofitClient;

public class Common {
    private static final String  GOOGLE_API_URL="https://maps.googleapis.com/";

    public static IGoogleAPIService getGoogleAPIService()
    {
        return RetrofitClient.getClient(GOOGLE_API_URL).create(IGoogleAPIService.class);
    }
}
