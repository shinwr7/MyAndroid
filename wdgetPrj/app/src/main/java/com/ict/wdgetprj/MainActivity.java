package com.ict.wdgetprj;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    // 창부품 선언
    Button btn1;
    TextView tv2;
    TextView tv3;
    TextView tv4;
    // 클릭할떄마다 색상변경을 위한 if문 처리용 논리변수
    Boolean bool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bool = true;

        btn1 = (Button)findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Log.i("태그명", "로깅할 내용");

                if(bool){
                    tv2.setTextSize(50);
                    tv2.setTextColor(Color.BLUE);
                    tv2.setTypeface(Typeface.SERIF);

                    tv2.setText("한국ICT인재개발원 - 신우람");
                    bool=false;

                }else{
                    tv2.setTextColor(Color.BLACK);
                    bool=true;
                }
            }

        });

        tv2 = (TextView)findViewById(R.id.textView2);
        tv3 = (TextView)findViewById(R.id.textView3);
        tv4 = (TextView)findViewById(R.id.textView4);

        tv2.setText("하이요? 텍스트2입니다.");
    }
}