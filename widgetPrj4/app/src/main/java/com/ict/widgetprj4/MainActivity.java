package com.ict.widgetprj4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    EditText et1;
    TextView txt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button)findViewById(R.id.btn1);
        et1 = (EditText)findViewById(R.id.et1);
        txt1 = (TextView)findViewById(R.id.txt1);
        // 버튼에 온클릭설정
        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.d("click","클릭감지");
                String Result = et1.getText().toString();
                Log.d("et1값", Result);
                // 얻어온 값을 Toast로 찍어보기
                Toast.makeText(MainActivity.this, Result, Toast.LENGTH_SHORT).show();

                txt1.setText(Result);
            }

        });

    }

}