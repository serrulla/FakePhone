package com.serrulla.eric.fakephone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PhoneActivity extends AppCompatActivity {


    //private final int btn_id = R.id.btn1;
    private Button btn_num;
    private EditText field;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone);

        btn_num = findViewById(R.id.btn1);

        field = findViewById(R.id.phoneNumber);
        btn_num.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                field.append(btn_num.getText());
            }
        });

    }





}
