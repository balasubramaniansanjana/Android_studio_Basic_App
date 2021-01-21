package com.example.sample_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText num1;
    private EditText num2;
    private TextView result;
    private Button add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=(EditText)findViewById(R.id.Num1);
        num2=(EditText)findViewById(R.id.Num2);
        result=(TextView)findViewById(R.id.result);
        add=(Button)findViewById(R.id.button);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int first_number=Integer.parseInt(num1.getText().toString());
                int second_number=Integer.parseInt(num2.getText().toString());
                int sum= first_number+second_number;
                result.setText("Answer is "+ String.valueOf(sum));
            }
        });
    }
}