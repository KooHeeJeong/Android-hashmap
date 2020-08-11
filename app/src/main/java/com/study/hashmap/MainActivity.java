package com.study.hashmap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MainActivity extends AppCompatActivity {
    private Map<String, String> fruits;
    private EditText edt_key,edt_value;
    private TextView tv_result;
    private Button btn_save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_key = findViewById(R.id.edt_key);
        edt_value = findViewById(R.id.edt_value);
        tv_result = findViewById(R.id.tv_result);
        btn_save = findViewById(R.id.btn_save);

        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String key = edt_key.getText().toString();
                String value = edt_value.getText().toString();
                fruits = new HashMap<>();
                fruits.put(key,value);

                tv_result.setText(String.format("Key - %s \n Value - %s", key , fruits.get(key)));
            }
        });

    }
}