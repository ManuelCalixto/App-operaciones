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

public class op_basicas extends AppCompatActivity {
    private EditText et1,et2;
    private TextView tv1,tv2;
    private Spinner spinner;
    private String [] opciones = {"Sumar", "Restar", "Multiplicar", "Dividir"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_op_basicas);

        et1=(EditText) findViewById(R.id.etNumero1);
        et2=(EditText) findViewById(R.id.etNumero2);
        tv1=(TextView) findViewById(R.id.tvResultado);
        tv2=(TextView) findViewById(R.id.tv_Signo);
        //MI SPINNER, HACER VEHINCULO
        spinner=(Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.item_manuel_garcia, opciones);
        spinner.setAdapter(adapter);
    }

    public void Calucla (View View){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        String seleccion = spinner.getSelectedItem().toString();
        if(valor1.length()>0 && valor2.length()>0){
            float numero1 = Float.parseFloat(valor1);
            float numero2 = Float.parseFloat(valor2);

            if(seleccion.equals("Sumar")){
                String resultado = String.valueOf((numero1+numero2));
                tv1.setText(resultado);
                tv2.setText("+");
            }
            else if(seleccion.equals("Restar")){
                String resultado = String.valueOf((numero1-numero2));
                tv1.setText(resultado);
                tv2.setText("-");
            }else if(seleccion.equals("Multiplicar")){
                String resultado = String.valueOf((numero1*numero2));
                tv1.setText(resultado);
                tv2.setText("*");
            }else if(seleccion.equals("Dividir")){

                if(numero2 != 0){
                    String resultado = String.valueOf((numero1/numero2));
                    tv1.setText(resultado);
                    tv2.setText("/");

                }else{
                    Toast.makeText(this, "ERROR APRENDE MAS MATEMATICAS", Toast.LENGTH_SHORT).show();
                    tv1.setText("ERROR");
                }
            }
        }else {
            Toast.makeText(this, "Completar los campos", Toast.LENGTH_SHORT).show();
        }
    }

    public void sal(View View){
        Intent Data= new Intent(this, MainActivity.class);
        startActivity(Data);
    }
}