package com.ict.changeimageprj;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView showApp, textView;
    CheckBox checkbox;
    RadioGroup radioGroup;
    RadioButton radio1, radio2;
    Button selectBtn;
    ImageView space, moon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showApp = (TextView)findViewById(R.id.showApp);
        textView = (TextView)findViewById(R.id.textView);
        checkbox = (CheckBox)findViewById(R.id.checkbox);
        radioGroup = (RadioGroup)findViewById(R.id.radioGroup);
        radio1 = (RadioButton)findViewById(R.id.radio1);
        radio2 = (RadioButton)findViewById(R.id.radio2);
        selectBtn=(Button)findViewById(R.id.selectBtn);
        space =(ImageView)findViewById(R.id.space);
        moon = (ImageView)findViewById(R.id.moon);

        // 체크박스 클릭을 감지하도록 하려면 setOnCheckedChangeListener를 사용하고
        // 내부에는 new C까지만 적고 자동완성
        
        checkbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.d("클릭됨", "클릭됨 ㅇㅋ");
                // true, false 여부를 체크해야함
                Log.d("isChecked", isChecked + "");
                // 클릭해서 true면 어플이 보이게, false면 안보이게 하기 위해
                // if~else 분기를 작성해주세요.

                if(isChecked){
                    // Image를 제외한 나머지 창부품 보이도록 전환
                    textView.setVisibility(View.VISIBLE);
                    showApp.setVisibility(View.VISIBLE);
                    radioGroup.setVisibility(View.VISIBLE);


                }else{
                    textView.setVisibility(View.INVISIBLE);
                    showApp.setVisibility(View.INVISIBLE);
                    radioGroup.setVisibility(View.INVISIBLE);
                    moon.setVisibility(View.INVISIBLE);
                    space.setVisibility(View.INVISIBLE);
                    if(radio1.isChecked()){
                        radio1.setChecked(false);
                    }
                    else if(radio2.isChecked()){
                        radio2.setChecked(false);
                    }

                }
            }
        });

        selectBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int checked = radioGroup.getCheckedRadioButtonId();
                Log.d("선택된 버튼은?", checked+"");

                if(radio2.isChecked()){
                    moon.setVisibility(View.INVISIBLE);
                    space.setVisibility(View.VISIBLE);
                    Log.d("우주선택", "우주선택");
                }else if(radio1.isChecked()){
                    space.setVisibility(View.INVISIBLE);
                    moon.setVisibility(View.VISIBLE);
                    Log.d("달선택", "달선택");
                }
            }
        });
    }
}