package com.ict.pickerprj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    DatePicker dp ;
    Button inBtn, outBtn;
    TextView inTime, outTime;

    // 전역변수에 날짜 관련 정보 저장
    Integer yearInt, month, day;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp = (DatePicker) findViewById(R.id.dPicker);
        inBtn = (Button) findViewById(R.id.inBtn);
        outBtn = (Button)findViewById(R.id.outBtn);
        inTime=(TextView)findViewById(R.id.inTime);
        outTime=(TextView)findViewById(R.id.outTime);

        yearInt = dp.getYear();
        month = dp.getMonth();
        day = dp.getDayOfMonth();

        dp.setOnDateChangedListener(new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                yearInt = year;
                month = monthOfYear + 1;
                day = dayOfMonth;

                Log.d("날짜", yearInt + "년/" + month + "월/" + day + "일");
            }
        });
        inBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inTime.setText(yearInt + "년/" + month + "월/" + day + "일");
            }
        });

        outBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                outTime.setText(yearInt + "년/" + month + "월/" + day + "일");
            }
        });
    }
}