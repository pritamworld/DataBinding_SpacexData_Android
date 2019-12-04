package com.pritesh.midterm_spacexdata_android.network;

/**
 * Created by Pritesh Patel.
 * Toronto, Canada
 */


import com.pritesh.midterm_spacexdata_android.models.Launches;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface SpacexApiInterface {
    @GET("v3/launches")
    Call<List<Launches>> getLaunches();

    /*
    @GET("/api/search")
    Call<Recipes> getAllRecipes(@QueryMap Map<String, String> options);

    //http://food2fork.com/api/search?key=daa96adf20a389f3b63634535ec8a938&q=shredded%20chicken
    @GET("/api/search")
    Call<List<Recipes>> searchRecipe(@Query("key") String apiKey,
                                     @Query("q") String searchString);
   */
}