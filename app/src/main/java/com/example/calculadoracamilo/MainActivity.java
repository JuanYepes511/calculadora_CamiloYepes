package com.example.calculadoracamilo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView result,edit1,edit2;
    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnSuma,btnResta, btnMult,btnDiv,btnBorrar;
    private int editable=1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit1=findViewById(R.id.edit1);
        edit1.setText("");

        edit2=findViewById(R.id.edit2);
        edit2.setText("0");

        result=findViewById(R.id.result);
        result=findViewById(R.id.result);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btn0=findViewById(R.id.btn0);
        btnSuma=findViewById(R.id.btnSuma);
        btnMult=findViewById(R.id.btnMult);
        btnDiv=findViewById(R.id.btnDiv);
        btnResta=findViewById(R.id.btnResta);
        btnBorrar=findViewById(R.id.btnborrar);


        edit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editable=1;
                edit1.setText("");
            }
        });
        edit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editable=2;
                edit2.setText("");
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editable==1){
                    edit1.setText(edit1.getText()+"1");
                }else{
                    edit2.setText(edit2.getText()+"1");
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editable==1){
                    edit1.setText(edit1.getText()+"12");
                }else{
                    edit2.setText(edit2.getText()+"2");
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editable==1){
                    edit1.setText(edit1.getText()+"3");
                }else{
                    edit2.setText(edit2.getText()+"3");
                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editable==1){
                    edit1.setText(edit1.getText()+"4");
                }else{
                    edit2.setText(edit2.getText()+"4");
                }
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editable==1){
                    edit1.setText(edit1.getText()+"5");
                }else{
                    edit2.setText(edit2.getText()+"5");
                }
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editable==1){
                    edit1.setText(edit1.getText()+"6");
                }else{
                    edit2.setText(edit2.getText()+"6");
                }
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editable==1){
                    edit1.setText(edit1.getText()+"7");
                }else{
                    edit2.setText(edit2.getText()+"7");
                }
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editable==1){
                    edit1.setText(edit1.getText()+"8");
                }else{
                    edit2.setText(edit2.getText()+"8");
                }
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editable==1){
                    edit1.setText(edit1.getText()+"9");
                }else{
                    edit2.setText(edit2.getText()+"9");
                }
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editable==1){
                    edit1.setText(edit1.getText()+"0");
                }else{
                    edit2.setText(edit2.getText()+"0");
                }
            }
        });

        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1= Integer.parseInt(edit1.getText().toString());
                int num2= Integer.parseInt(edit2.getText().toString());
                result.setText(String.valueOf(num1+num2));
            }
        });
        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1= Integer.parseInt(edit1.getText().toString());
                int num2= Integer.parseInt(edit2.getText().toString());
                result.setText(String.valueOf(num1-num2));
            }
        });
        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1= Integer.parseInt(edit1.getText().toString());
                int num2= Integer.parseInt(edit2.getText().toString());
                result.setText(String.valueOf(num1*num2));
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1= Integer.parseInt(edit1.getText().toString());
                int num2= Integer.parseInt(edit2.getText().toString());
                result.setText(String.valueOf(num1/num2));
            }
        });

        btnBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText("0");
                edit1.setText("0");
                edit2.setText("0");
                editable=1;
            }
        });
    }
}