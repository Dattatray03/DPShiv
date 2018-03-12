package com.example.t962073.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtFirstNum;
    EditText edtSecondNum;
    Button btnAdd;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtFirstNum = (EditText) findViewById(R.id.edtFirstNum);
        edtSecondNum = (EditText) findViewById(R.id.edtSecoundNum);

        btnAdd = (Button) findViewById(R.id.btnAdd);

        txtResult = (TextView) findViewById(R.id.txtResult);


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtFirstNum.getText().length() == 0 && edtSecondNum.getText().length() == 0) {
                    Toast.makeText(getApplicationContext(),"Enter Nos#",Toast.LENGTH_LONG).show();
                    txtResult.setText("Addition !");
                }
                if(edtFirstNum.getText().length() == 0){
                    Toast.makeText(getApplicationContext(),"Enter First No#",Toast.LENGTH_LONG).show();
                }else if (edtSecondNum.getText().length() == 0 )
                {
                    Toast.makeText(getApplicationContext(),"Enter Second No#",Toast.LENGTH_LONG).show();
                }else{
                    int result = Integer.parseInt(edtFirstNum.getText().toString()) + Integer.parseInt(edtSecondNum.getText().toString());
                    txtResult.setText("Addition is : "+ result);
                }
            }
        });
    }
}
