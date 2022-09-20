package com.example.aeae;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Ingresar(View view) {
        Intent Ingresar = new Intent(this, Pag2Activity.class);
        startActivity(Ingresar);
    }
}