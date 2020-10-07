package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText number1;
    EditText number2;
    double num1;
    double num2;
    double res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1 = findViewById(R.id.first_number);
        number2 = findViewById(R.id.second_number);
    }

    public void add(View view) {
        if (number1.getText().toString().isEmpty() || number2.getText().toString().isEmpty()) {
            Toast.makeText(MainActivity.this, "Empty fields!", Toast.LENGTH_SHORT).show();
        } else {
            num1 = Double.parseDouble(number1.getText().toString());
            num2 = Double.parseDouble(number2.getText().toString());
            res = num1 + num2;
            Intent intent = new Intent(this, ResultActivity.class);
            intent.putExtra("result", res);
            startActivity(intent);
        }
    }

    public void subtract(View view) {
        if (number1.getText().toString().isEmpty() || number2.getText().toString().isEmpty()) {
            Toast.makeText(MainActivity.this, "Empty fields!", Toast.LENGTH_SHORT).show();
        } else {
            num1 = Double.parseDouble(number1.getText().toString());
            num2 = Double.parseDouble(number2.getText().toString());
            res = num1 - num2;
            Intent intent = new Intent(this, ResultActivity.class);
            intent.putExtra("result", res);
            startActivity(intent);
        }
    }

    public void multiply(View view) {
        if (number1.getText().toString().isEmpty() || number2.getText().toString().isEmpty()) {
            Toast.makeText(MainActivity.this, "Empty fields!", Toast.LENGTH_SHORT).show();
        } else {
            num1 = Double.parseDouble(number1.getText().toString());
            num2 = Double.parseDouble(number2.getText().toString());
            res = num1 * num2;
            Intent intent = new Intent(this, ResultActivity.class);
            intent.putExtra("result", res);
            startActivity(intent);
        }
    }

    public void divide(View view) {
        if (number1.getText().toString().isEmpty() || number2.getText().toString().isEmpty()) {
            Toast.makeText(MainActivity.this, "Empty fields!", Toast.LENGTH_SHORT).show();
        } else {
            num1 = Double.parseDouble(number1.getText().toString());
            num2 = Double.parseDouble(number2.getText().toString());
            if (num2 == 0) {
                Toast.makeText(MainActivity.this, "Impossible!", Toast.LENGTH_SHORT).show();
            } else {
                res = num1 / num2;
                Intent intent = new Intent(this, ResultActivity.class);
                intent.putExtra("result", res);
                startActivity(intent);
            }
        }
    }
}