package com.study.hashmap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

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

        _put();
        _PutAll();
        _get();
        _remove();
        _keyset();

        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //사용하고 싶은 예제를 넣어서 사용하시기 바랍니다.
                String key = edt_key.getText().toString();
                String value = edt_value.getText().toString();
                Map<String,String> fruits = new HashMap<>();
                fruits.put(key,value);

                tv_result.setText(String.format("Key - %s \n Value - %s", key , fruits.get(key)));
            }
        });

    }

    public void _put(){
        Map<String, String> fruits = new HashMap<>();
        fruits.put("apple", "one");
        fruits.put("banana", "two");
        fruits.put("melon", "three");
        fruits.put(null, "five");
        System.out.println("fruits : " + fruits);
    }
    public void _PutAll(){
        Map<String, Integer> animal = new HashMap<>();
        animal.put("cat", 1);
        animal.put("dog", 3);
        animal.put("pig", 5);
        animal.put(null, 2);

        Map<String, Integer> food = new HashMap<>();
        food.put("coffee", 3);
        food.put("chicken", 1);
        food.put("pizza", 2);

        System.out.println("animal : " + animal);
        animal.putAll(food);
        System.out.println("food : " + food);
        System.out.println("animal : " + animal);
    }
    public void _get() {
        Map<String, Integer> animal = new HashMap<>();
        animal.put("dog",1);
        animal.put("pig",2);
        animal.put("cat",5);

        System.out.println("dog : " + animal.get("dog"));
        System.out.println("pig : " + animal.get("pig"));
        System.out.println("cat : " + animal.get("cat"));
        System.out.println("fish : " + animal.get("fish"));
    }
    public void _remove() {
        Map<String, Integer> fruits = new HashMap<>();
        fruits.put("apple", 2);
        fruits.put("banana", 5);
        fruits.put("pear", 7);

        System.out.println("apple : " + fruits.get("apple"));
        System.out.println("apple : " + fruits.remove("apple"));
        System.out.println("melon : " + fruits.remove("melon"));
        System.out.println("apple : " +fruits.get("apple"));
    }
    public void _keyset(){
        Map<String , Integer> animal = new HashMap<>();
        animal.put("dog", 2);
        animal.put("pig", 5);
        animal.put("cat", 3);

        System.out.println("animal_keyset : " + animal.keySet());
    }
}
