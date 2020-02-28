package com.e.paginglibrary;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private Api endpoints;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Endpoints to our Api interface.
        endpoints = RetrofitClient.getInstance().getApi();

        Call<StackApiResponse> stackApiResponseCall = endpoints.getAnswers(1,2,"stackoverflow");

        // Enqueue runs asynchronously unlike execute which runs on the main thread.
        stackApiResponseCall.enqueue(new Callback<StackApiResponse>() {
            @Override
            public void onResponse(Call<StackApiResponse> call, Response<StackApiResponse> response) {
                StackApiResponse stackApiResponse = response.body();
                Toast.makeText(MainActivity.this, String.valueOf(stackApiResponse.items.size()), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<StackApiResponse> call, Throwable t) {

            }
        });
    }
}
