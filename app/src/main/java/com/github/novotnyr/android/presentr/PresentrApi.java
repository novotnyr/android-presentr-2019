package com.github.novotnyr.android.presentr;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PresentrApi {
    public static final String BASE_URL = "http://ics.upjs.sk/~novotnyr/android/demo/presentr/index.php/";

    @GET("available-users")
    Call<List<User>> getUsers();
}
