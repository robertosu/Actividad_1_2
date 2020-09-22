package com.example.actividad_1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText plaintxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        plaintxt = (EditText)findViewById(R.id.edittext);
    }
    //Metodo boton enviar
    public void Enviar(View view){
        Intent i = new Intent(this, Actividad2.class);
        i.putExtra("dato",plaintxt.getText().toString());
        startActivity(i);
    }

}