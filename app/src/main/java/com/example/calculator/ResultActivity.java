package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import java.text.DecimalFormat;

public class ResultActivity extends AppCompatActivity {

    TextView result;
    DecimalFormat df = new DecimalFormat("###.####");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        result = findViewById(R.id.result);
        double res = getIntent().getDoubleExtra("result", 0);
        result.setText(df.format(res));

    }
}