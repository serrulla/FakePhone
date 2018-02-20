package com.serrulla.eric.fakephone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PhoneActivity extends AppCompatActivity {


    private final int[] btn_ids = {R.id.btn1,R.id.btn2,R.id.btn3,R.id.btn4,R.id.btn5,R.id.btn6,R.id.btn7,R.id.btn8,R.id.btn9,R.id.btn0};
    private Button[] btn_num ={};
    private EditText field;
    private Button reset;
    private Button call;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone);

        field = findViewById(R.id.phoneNumber);

        for (int i=0; i<btn_ids.length; i++){
            Button btn = findViewById(btn_ids[i]);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    addNumber(v);
                }
            });
        }
        /*btn_num = findViewById(R.id.btn1);

        btn_num.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                field.append(btn_num.getText());
            }
        });*/

        reset = findViewById(R.id.deleteBtn);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                field.setText("");
            }
        });

        call = findViewById(R.id.callBtn);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Editable number = field.getText();
                call(number);
            }
        });

    }

    private void call(Editable number){
        Toast.makeText(this, "Llamando al "+number+"...", Toast.LENGTH_SHORT).show();
    }

    private void addNumber(View v){
        Button b = (Button)v;
        field.append(b.getText());
    }

}
