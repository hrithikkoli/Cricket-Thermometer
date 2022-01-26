package com.example.cricketthermometer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.util.Formatter;

public class MainActivity extends AppCompatActivity {
    EditText chirps;
    Button calculate;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chirps = findViewById(R.id.chirps);
        calculate = findViewById(R.id.calculate);
        result = findViewById(R.id.result);
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);


        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if (chirps.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Please enter a number!", Toast.LENGTH_SHORT).show();
                }
               else {
                   int user = Integer.parseInt(chirps.getText().toString().trim());
                   double final_result = (user/3.0) + 4;
                   String display = "The approximate temperature outside is " + df.format(final_result) + " degree celsius";
                   result.setText(display);
               }

            }
        });
    }
}