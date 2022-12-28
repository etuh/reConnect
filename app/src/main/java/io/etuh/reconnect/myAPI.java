package io.etuh.reconnect;

import java.util.List;

import io.etuh.reconnect.model.Typicode;
import retrofit2.Call;
import retrofit2.http.GET;

public interface myAPI {
    @GET("/posts")
    Call<List<Typicode>> getPosts();
}
