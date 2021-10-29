package com.ict.explicitintentprj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SubActivity extends AppCompatActivity {

    Button cancelBtn, goBtn;
    TextView message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub);

        cancelBtn = (Button)findViewById(R.id.cancelBtn);
        goBtn = (Button)findViewById(R.id.goBtn);
        message = (TextView)findViewById(R.id.message);
        // 보내온 인텐트를 받는 순서는
        // 1. 인텐트 자체를 변수에 저장합니다.
        // getintent()를 하면 보내온 인텐트를 받아올 수 있습니다.
        Intent intent = getIntent();

        // 2. 인텐트 내부에 실려서 같이 들어온 데이터를 뽑아냅니다
        String getData = ((Intent) intent).getStringExtra("test").toString();

        // 3. 받아온 데이터를 활용합니다.
        message.setText(getData);


        cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        goBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SubActivity2.class);

                intent.putExtra("test2", message.getText().toString());
                
                startActivity(intent);
            }
        });
    }
}