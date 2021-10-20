package com.ict.calculatorprj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    Button plusbtn;
    Button minusbtn;
    Button multibtn;
    Button divbtn;
    TextView result;
    EditText right;
    EditText left;
    Integer rightCal;
    Integer leftCal;
    Integer resultCal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        plusbtn = (Button)findViewById(R.id.plusbtn);
        minusbtn = (Button)findViewById(R.id.minusbtn);
        multibtn = (Button)findViewById(R.id.multibtn);
        divbtn = (Button)findViewById(R.id.divbtn);
        result = (TextView)findViewById(R.id.result);
        right = (EditText) findViewById(R.id.right);
        left = (EditText) findViewById(R.id.left);


        plusbtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                rightCal = Integer.parseInt(right.getText().toString());
                leftCal = Integer.parseInt(left.getText().toString());
                resultCal = rightCal + leftCal;

                result.setText(resultCal.toString());
            }



        });

        minusbtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                rightCal = Integer.parseInt(right.getText().toString());
                leftCal = Integer.parseInt(left.getText().toString());
                resultCal = rightCal - leftCal;

                result.setText(resultCal.toString());

            }
        });

        multibtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                rightCal = Integer.parseInt(right.getText().toString());
                leftCal = Integer.parseInt(left.getText().toString());
                resultCal = rightCal * leftCal;

                result.setText(resultCal.toString());

            }

        });

        divbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                rightCal = Integer.parseInt(right.getText().toString());
                leftCal = Integer.parseInt(left.getText().toString());
                resultCal = leftCal/rightCal;

                result.setText(resultCal.toString());

            }

        });


    }












}