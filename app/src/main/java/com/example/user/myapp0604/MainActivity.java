package com.example.user.myapp0604;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    EditText etInputName , etInputWeight, etInputHight;
    double dWeight, dHight; // , resValue
    TextView Resultvalue1;
    String res, oNmae;
    Button btn1;
//    int nValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        btn1 = (Button) findViewById(R.id.nResBtn);
        etInputWeight = (EditText) findViewById(R.id.inputWeight);
        etInputHight = (EditText) findViewById(R.id.inputHight);
        oNmae = etInputName.getText().toString();
        dWeight = (Double.parseDouble(etInputWeight.getText().toString()));
        dHight = (Double.parseDouble(etInputHight.getText().toString()));
//        res1 = Integer.parseInt(etInputHight.getText().toString()); // 정수로 나온다
        int nValue = (int) (dWeight / (dHight * dHight)) * 1000;
        Resultvalue1 = (TextView) findViewById(R.id.outResult);
        if(nValue > 30) {
            res = "비만";
        }
        else if(nValue > 24) {
            res = "과체중";
        }
        else if(nValue > 15) {
            res = "저체중";
        }
        else if(nValue > 13) {
            res = "마름";
        }
        else if(nValue > 10) {
            res = "영양실조";
        }
        else
            res = "소모증";

//        btn1.setOnTouchListener(ne );
//        {
//            Resultvalue1.setText(msg.toString());
//        }

        Resultvalue1.setText(etInputName.getText() + "님 결과res " + res);
    }
}
