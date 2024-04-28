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

public class operaciones_de_fraccciones extends AppCompatActivity {
    private EditText et1,et2,et3,et4;
    private TextView tv1,tv2,tv3;
    private Spinner spinner;
    private String [] opciones = {"Sumar", "Restar", "Multiplicar", "Dividir"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operaciones_de_fraccciones);

        et1=(EditText) findViewById(R.id.etNumero1);
        et2=(EditText) findViewById(R.id.etNumero2);
        et3=(EditText) findViewById(R.id.etNumero3);
        et4=(EditText) findViewById(R.id.etNumero4);
        //aqui empiezan los vt
        tv1=(TextView) findViewById(R.id.tvPrimerres);
        tv2=(TextView) findViewById(R.id.tvRestultado_dop);
        tv3=(TextView) findViewById(R.id.tv_Signo);
        //Spinner
        spinner=(Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.item_manuel_garcia, opciones);
        spinner.setAdapter(adapter);
    }
    public void Calcular(View View){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();
        String valor3 = et3.getText().toString();
        String valor4 = et4.getText().toString();
        String seleccion = spinner.getSelectedItem().toString();

        if(valor1.length()>0 && valor2.length()>0 && valor3.length()>0 && valor4.length()>0){
            int numero1 = Integer.parseInt(valor1);
            int numero2 = Integer.parseInt(valor2);
            int numero3 = Integer.parseInt(valor3);
            int numero4 = Integer.parseInt(valor4);
            if(numero2 != 0 && numero4 !=0) {
                if (seleccion.equals("Sumar")) {
                    // String resultado = String.valueOf((numero1*numero4+numero2*numero3));
                    int resultado1 = numero1 * numero4;
                    int resultado2 = numero2 * numero3;
                    String primer_resultado = String.valueOf(resultado1 + resultado2);
                    String segundoResultado = String.valueOf(numero2 * numero4);
                    tv1.setText(primer_resultado);
                    tv2.setText(segundoResultado);
                    tv3.setText("+");
                }
                if (seleccion.equals("Restar")) {
                    int resultado1 = numero1 * numero4;
                    int resultado2 = numero2 * numero3;
                    String primer_resultado = String.valueOf(resultado1 - resultado2);
                    String segundoResultado = String.valueOf(numero2 * numero4);
                    tv1.setText(primer_resultado);
                    tv2.setText(segundoResultado);
                    tv3.setText("-");
                }
                if (seleccion.equals("Multiplicar")) {
                    String resultado = String.valueOf(numero1 * numero3);
                    String resultado_dos = String.valueOf(numero2 * numero4);
                    tv1.setText(resultado);
                    tv2.setText(resultado_dos);
                    tv3.setText("*");
                }
                if (seleccion.equals("Dividir")) {
                    if (numero2 != 0 && numero4 != 0) {
                        String resultado = String.valueOf(numero1 * numero4);
                        String segundo_resultado = String.valueOf(numero2 * numero3);
                        tv1.setText(resultado);
                        tv2.setText(segundo_resultado);
                        tv3.setText("/");
                    }
                }
            }else {
                Toast.makeText(this, "ERROR APRENDE MAS MATEMATICAS", Toast.LENGTH_SHORT).show();
                tv1.setText("E");
                tv2.setText("E");
                tv3.setText("E");
            }
        }else {

            Toast.makeText(this, "error al tener campo vacio", Toast.LENGTH_SHORT).show();
        }
    }

    public void Salir(View View){

        Intent Datos= new Intent(this, MainActivity.class);
        startActivity(Datos);
    }

}