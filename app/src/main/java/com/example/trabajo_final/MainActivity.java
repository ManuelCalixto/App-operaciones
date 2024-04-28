package com.example.trabajo_final;

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
    public void fra(View View){
        Intent datos= new Intent(this, operaciones_de_fraccciones.class);
        startActivity(datos);
    }

    public void Basicas(View View){
        Intent Datos = new Intent(this, op_basicas.class);
        startActivity(Datos);
    }

    public void Conversiones(View View){
        Intent Da = new Intent(this, unidades.class);
        startActivity(Da);
    }
}