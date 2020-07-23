package com.example.lmao;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    TextView txt;
    EditText editfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = findViewById(R.id.txt);
        editfo = findViewById(R.id.editfo);
    }
    public void display(View v){
        txt.setText(editfo.getText().toString());
        editfo.setText("");
    }
}