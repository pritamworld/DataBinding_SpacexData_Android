package com.pritesh.midterm_spacexdata_android.network;

/**
 * Created by Pritesh Patel.
 * Toronto, Canada
 */

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SpacexApiClient {

    private static final String BASE_URL = "https://api.spacexdata.com/";
    private static Retrofit retrofit = null;


    public static Retrofit getClient() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
