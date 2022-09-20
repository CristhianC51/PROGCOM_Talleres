package com.example.aeae;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Pag2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag2);
    }

    public void Regresar(View view) {
        Intent Regresar = new Intent(this, MainActivity.class);
        startActivity(Regresar);
    }
}