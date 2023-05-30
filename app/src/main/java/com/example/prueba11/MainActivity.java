package com.example.prueba11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText nu1EditText, nu2EditText;

    Button  sumButton, subtractButton, multiplyButton, divideButton;

    TextView resultTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nu1EditText = findViewById(R.id.nu1EditText);
        nu2EditText = findViewById(R.id.nu2EditText);
        sumButton = findViewById(R.id.sumButton);
        subtractButton = findViewById(R.id.subtractButton);
        multiplyButton = findViewById(R.id.multiplyButton);
        divideButton = findViewById(R.id.divideButton);
        resultTextView = findViewById(R.id.resultTextView);

        sumButton.setOnClickListener(view -> {
            double num1 = Double.parseDouble(nu1EditText.getText().toString());
            double num2 = Double.parseDouble(nu2EditText.getText().toString());
            double result = num1 + num2;
            resultTextView.setText(String.valueOf(result));
        });

        subtractButton.setOnClickListener(view -> {
            double num1 = Double.parseDouble(nu1EditText.getText().toString());
            double num2 = Double.parseDouble(nu2EditText.getText().toString());
            double result = num1 - num2;
            resultTextView.setText(String.valueOf(result));
        });

        multiplyButton.setOnClickListener(view -> {
            double num1 = Double.parseDouble(nu1EditText.getText().toString());
            double num2 = Double.parseDouble(nu2EditText.getText().toString());
            double result = num1 * num2;
            resultTextView.setText(String.valueOf(result));
        });

        divideButton.setOnClickListener(view -> {
            double num1 = Double.parseDouble(nu1EditText.getText().toString());
            double num2 = Double.parseDouble(nu2EditText.getText().toString());
            double result = num1 / num2;
            resultTextView.setText(String.valueOf(result));
        });


    }
}