package com.ict.explicitintentprj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SubActivity2 extends AppCompatActivity {

    TextView tv1;
    Button cancelBtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub2);

        Intent intent = getIntent();

        // 2. 인텐트 내부에 실려서 같이 들어온 데이터를 뽑아냅니다
        String getData = ((Intent) intent).getStringExtra("test2").toString();

        tv1.setText(getData);

        cancelBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}