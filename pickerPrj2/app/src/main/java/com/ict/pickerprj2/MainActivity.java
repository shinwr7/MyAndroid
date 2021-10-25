package com.ict.pickerprj2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.time.Month;
import java.time.Year;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    Button inBtn, outBtn;
    TextView tv1, tv2;
    DatePicker dPicker;
    Integer yearInt, month, day, hour, minute ;
    TimePicker tPicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        inBtn = (Button) findViewById(R.id.inBtn);
        outBtn = (Button) findViewById(R.id.outBtn);
        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        dPicker= (DatePicker) findViewById(R.id.dPicker);
        tPicker=(TimePicker)findViewById(R.id.tPicker);

        inBtn.setVisibility(1);

        inBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                yearInt = dPicker.getYear();
                month = dPicker.getMonth() + 1;
                day = dPicker.getDayOfMonth();
                hour = tPicker.getHour();
                minute = tPicker.getMinute();

                tv1.setText(yearInt + "년/" + month + "월/" + day + "일/" + hour + "시/" + minute + "분");
                outBtn.setVisibility(1);
                inBtn.setVisibility(-1);
            }
        });

        outBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                yearInt = dPicker.getYear();
                month = dPicker.getMonth() + 1;
                day = dPicker.getDayOfMonth();

                tv2.setText(yearInt + "년/" + month + "월/" + day + "일/" + hour + "시/" + minute + "분");
                outBtn.setVisibility(-1);
                inBtn.setVisibility(1);
            }
        });

    }
}