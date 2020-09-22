package com.example.actividad_1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Actividad2 extends AppCompatActivity {
    private TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);
        txt = (TextView)findViewById(R.id.txt);
        String dato = getIntent().getStringExtra("dato");
        txt.setText("Datos recibidos: "+dato);
    }
    public void Volver(View view){
        Intent elintent = new Intent(this, MainActivity.class);
        startActivity(elintent);
    }
}