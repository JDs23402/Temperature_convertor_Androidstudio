package com.example.temperature;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editcel;
    TextView editfar;
    Button convert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editcel=(EditText) findViewById(R.id.editcel);
        editfar=(TextView) findViewById(R.id.editfar);
        convert=(Button) findViewById(R.id.button);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double temp=Double.parseDouble(editcel.getText().toString());
                double result = (temp * 1.8) + 32;
                editfar.setText(String.valueOf(result));
            }
        });
    }
}