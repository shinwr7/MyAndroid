package com.ict.explicitintentprj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button subBtn;
    EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        subBtn = (Button)findViewById(R.id.subBtn);
        et1=(EditText)findViewById(R.id.et1);
        subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),
                                            SubActivity.class);
                // Intent 는 startActivity로 보내기 전에
                // intetn.putExtra("호출명", 자료);와 같이
                // 데이터를 실어둔 다음 전송할 수 있습니다.
                String etText= et1.getText().toString();
                intent.putExtra("test", etText );

                startActivity(intent);
            }
        });
    }
}