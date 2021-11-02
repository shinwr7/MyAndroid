package com.ict.movieprj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.ict.movieprj.retrofit.RetrofitClient;
import com.ict.movieprj.retrofit.Retrofitinterface;

public class MainActivity extends AppCompatActivity {

    // 비동기 요청 담당하는 RetroFit관련 변수들 선언
    private RetrofitClient retrofitClient;
    private Retrofitinterface retrofitInterface;

    Button asyncBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        asyncBtn = (Button)findViewById(R.id.asyncBtn);

        retrofitClient = RetrofitClient.getInstance();
        retrofitInterface = RetrofitClient.getRetrofitInterface();
    }
}