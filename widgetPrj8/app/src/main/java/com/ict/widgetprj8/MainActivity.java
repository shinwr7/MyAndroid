package com.ict.widgetprj8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    // 자동완성 관련 부품 선언

    AutoCompleteTextView acv;
    MultiAutoCompleteTextView macv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // 자동완성 부품 연결
        acv = (AutoCompleteTextView) findViewById(R.id.acv);
        macv=(MultiAutoCompleteTextView)findViewById(R.id.macv);

        // 검색창에 띄울 아이템들 나열
        String [] items = {"사과", "수박", "오렌지", "포도", "참외", "블루베리", "파인애플"};

        // 부품과 데이터를 연결하기 위해 "어댑터"라는 개념이 등장함
        // 파라미터 2개는 고정(this와 simple_dropdow_items_1line)
        // 가장 마지막 순번에 적는 아이템만 원하는대로 입력
        ArrayAdapter<String> adp = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, items);

        // setAdapter() 기능을 이용해 ArrayAdapter와 부품 연결
        acv.setAdapter(adp);

        // macv에도 연결해서 확인해보세요.

        MultiAutoCompleteTextView.CommaTokenizer token =
                new MultiAutoCompleteTextView.CommaTokenizer();
        // 토크나이징을 통해 쉼표로 자료들을 구분한다.
        macv.setTokenizer(token);

        macv.setAdapter(adp);


    }
}