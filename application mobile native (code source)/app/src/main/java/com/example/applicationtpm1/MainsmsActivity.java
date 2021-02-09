package com.example.applicationtpm1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.widget.TextView;
import java.util.List;
import org.json.JSONObject;
import android.os.Bundle;
import android.widget.TextView;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainsmsActivity extends AppCompatActivity {
    private TextView textViewResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainsms);

        SmsManager smsManager = SmsManager.getDefault();
        smsManager.sendTextMessage("+237655667191", null, "sms message", null, null);


        ///textViewResult = findViewById(R.id.text_view_result);
        /*Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://www.easysendsms.com/sms/bulksms-api/bulksms-api?username=ataltalo2021&password=esm76376&from=Test&to=+237655667191&text=Hello%20world&type=0/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        JsonPlaceHolderApi jsonPlaceHolderApi = retrofit.create(JsonPlaceHolderApi.class);
        Call<List<Post>> call = jsonPlaceHolderApi.getPosts();*/


    }
}
