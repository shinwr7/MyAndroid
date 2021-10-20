package com.ict.lottoprj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button lottobtn;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lottobtn = (Button)findViewById(R.id.lottobtn);
        textView = (TextView)findViewById(R.id.textView);

        lottobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<Integer> lottoNum = new ArrayList<>();

                Random r = new Random();
                for(int i = 1; i <=45; i ++) {
                    lottoNum.add(i);
                }

                Collections.shuffle(lottoNum);
                List<Integer> result = new ArrayList<>();
                for(int i =1;i <= 6;i ++ ){
                    result.add(lottoNum.indexOf(i));
                }
                int BonusNum = lottoNum.indexOf(7);

                Collections.sort(result);

                textView.setText(result.toString()+ " + 보너스넘버"+ BonusNum);





            }
        });
    }


}