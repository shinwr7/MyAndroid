package com.ict.loginprj;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity2 extends Activity {

    TextView tv1;
    Button logoutBtn, logBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv1 = (TextView)findViewById(R.id.tv1);
        logoutBtn=(Button)findViewById(R.id.logoutBtn);
        logBtn = (Button)findViewById(R.id.logBtn);

        Intent intent= getIntent();
        String id = intent.getStringExtra("id");
        String pw = intent.getStringExtra("pw");

        Log.d("디버깅 id", id);
        Log.d("디버깅 pw", pw);
        if(id.equals("android") && pw.equals("android")) {
            tv1.setText("로그인에 성공하셨습니다!");

            logoutBtn.setVisibility(View.VISIBLE);

            logoutBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });

        } else {
            tv1.setText("로그인 실패하셨습니다.");

            logBtn.setVisibility(View.VISIBLE);

            logBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent1 = new Intent(getApplicationContext(), MainActivity.class);

                    startActivity(intent1);
                }
            });
        }





    }
}