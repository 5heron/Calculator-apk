package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DivisionActivity extends AppCompatActivity {
    Button b1,b2;
    int num1,num2,res;
    String getNum1,getNum2,result;
    EditText et1,et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_division);
        b1=(Button) findViewById(R.id.divb);
        b2=(Button) findViewById(R.id.backb);
        et1=(EditText) findViewById(R.id.num1);
        et2=(EditText) findViewById(R.id.num2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ob = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(ob);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getNum1 = et1.getText().toString();
                getNum2 = et2.getText().toString();
                num1 = Integer.parseInt(getNum1);
                num2 = Integer.parseInt(getNum2);
                res = num1 / num2;
                result= String.valueOf(res);
                Toast.makeText(getApplicationContext(), result, Toast.LENGTH_LONG).show();
            }
        });
    }
}