package com.example.trabajo_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class unidades extends AppCompatActivity {
    private EditText et1;
    private TextView tv1;

    private Spinner spinner, spinner2;
    private String [] opciones = {"Metros", "Kilometros", "Millas", "Pulgadas","Pies"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unidades);

        et1=(EditText) findViewById(R.id.etNumero);
        tv1=(TextView) findViewById(R.id.tvResultado);
        spinner=(Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.item_manuel_garcia, opciones);
        spinner.setAdapter(adapter);
        spinner2=(Spinner) findViewById(R.id.spinner2);
        adapter = new ArrayAdapter<String>(this, R.layout.item_manuel_garcia, opciones);
        spinner2.setAdapter(adapter);
    }

    public void Calp(View View){
        String valor = et1.getText().toString();
        String seleccion= spinner.getSelectedItem().toString();
        String seleccion2= spinner2.getSelectedItem().toString();

        if(valor.length()>0){
            float numero =Float.parseFloat(valor);
            //METROS
            if(seleccion.equals("Metros") && seleccion2.equals("Metros")){
                String resultado= String.valueOf(numero);
                tv1.setText(resultado);
            } else if (seleccion.equals("Metros") && seleccion2.equals("Kilometros")) {
                String resultado= String.valueOf((numero)/1000);
                tv1.setText(resultado);
            }else if (seleccion.equals("Metros") && seleccion2.equals("Millas")) {
                String resultado= String.valueOf((numero)/1609.344);
                tv1.setText(resultado);
            } else if (seleccion.equals("Metros") && seleccion2.equals("Pulgadas")) {
                String resultado = String.valueOf(numero * 39.3700787);
                tv1.setText(resultado);
            } else if (seleccion.equals("Metros") && seleccion2.equals("Pies")) {
                String resultado = String.valueOf(numero * 3.2808);
                tv1.setText(resultado);
            }
            //KILOMETROS
            else if (seleccion.equals("Kilometros") && seleccion2.equals("Metros")) {
                String resultado= String.valueOf(numero*1000);
                tv1.setText(resultado);
            }else if (seleccion.equals("Kilometros") && seleccion2.equals("Kilometros")) {
                String resultado= String.valueOf(numero);
                tv1.setText(resultado);
            } else if (seleccion.equals("Kilometros") && seleccion2.equals("Millas")) {
                String resultado= String.valueOf((numero)/1.609344);
                tv1.setText(resultado);
            }else if (seleccion.equals("Kilometros") && seleccion2.equals("Pulgadas")) {
                String resultado= String.valueOf(numero*39370);
                tv1.setText(resultado);
            }
            else if (seleccion.equals("Kilometros") && seleccion2.equals("Pies")) {
                String resultado = String.valueOf(numero * 3280.8);
                tv1.setText(resultado);
            }
            //MILLAS
            else if (seleccion.equals("Millas") && seleccion2.equals("Metros")) {
                String resultado= String.valueOf(numero * 1609.344);
                tv1.setText(resultado);
            }else if (seleccion.equals("Millas") && seleccion2.equals("Kilometros")) {
                String resultado= String.valueOf(numero*1.60934);
                tv1.setText(resultado);
            } else if (seleccion.equals("Millas") && seleccion2.equals("Millas")) {
                String resultado= String.valueOf(numero);
                tv1.setText(resultado);
            }else if (seleccion.equals("Millas") && seleccion2.equals("Pulgadas")) {
                String resultado= String.valueOf(numero*63360);
                tv1.setText(resultado);
            }
            else if (seleccion.equals("Millas") && seleccion2.equals("Pies")) {
                String resultado = String.valueOf(numero * 5280);
                tv1.setText(resultado);
            }
            //PULGADAS
            else if (seleccion.equals("Pulgadas") && seleccion2.equals("Metros")) {
                String resultado= String.valueOf((numero)/39.37007874);
                tv1.setText(resultado);
            }else if (seleccion.equals("Pulgadas") && seleccion2.equals("Kilometros")) {
                String resultado= String.valueOf((numero)/39370);
                tv1.setText(resultado);
            } else if (seleccion.equals("Pulgadas") && seleccion2.equals("Millas")) {
                String resultado= String.valueOf((numero)/63360);
                tv1.setText(resultado);
            }else if (seleccion.equals("Pulgadas") && seleccion2.equals("Pulgadas")) {
                String resultado= String.valueOf(numero);
                tv1.setText(resultado);
            }
            else if (seleccion.equals("Pulgadas") && seleccion2.equals("Pies")) {
                String resultado = String.valueOf((numero ) / 12);
                tv1.setText(resultado);
            }
            //PIES
            else if (seleccion.equals("Pies") && seleccion2.equals("Metros")) {
                String resultado= String.valueOf(numero*0.3048);
                tv1.setText(resultado);
            }else if (seleccion.equals("Pies") && seleccion2.equals("Kilometros")) {
                String resultado= String.valueOf(numero*0.0003048);
                tv1.setText(resultado);
            } else if (seleccion.equals("Pies") && seleccion2.equals("Millas")) {
                //convierteme de pie a millas
                String resultado= String.valueOf((numero)/5280);
                tv1.setText(resultado);
            }else if (seleccion.equals("Pies") && seleccion2.equals("Pulgadas")) {
                String resultado= String.valueOf(numero * 12);
                tv1.setText(resultado);
            }
            else if (seleccion.equals("Pies") && seleccion2.equals("Pies")) {
                String resultado = String.valueOf(numero );
                tv1.setText(resultado);
            }

        }else {
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
            tv1.setText("E");
        }
    }

    public void Salir_Menu(View View){
        Intent Datos= new Intent(this, MainActivity.class);
        startActivity(Datos);
    }

    public void calcular(View View) {

    }
}