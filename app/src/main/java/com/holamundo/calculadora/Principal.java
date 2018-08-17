package com.holamundo.calculadora;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ResourceCursorAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class Principal extends AppCompatActivity {

    private EditText n1,n2;
    private TextView res;
    private Resources recursos;
    private Spinner operaciones;
    private String op[];


    public Principal() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        //Capturo los objetos que estan en el proyecto
        n1 = findViewById(R.id.txtPrimerNumero);
        n2 = findViewById(R.id.txtSegundoNumero);
        res = findViewById(R.id.txtResultado);
        operaciones = findViewById(R.id.cmbOpciones);
        //Es una variable guardo la referencia a los recursos de la aplicacion
        recursos = this.getResources();
        op = recursos.getStringArray(R.array.opciones);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>( this,android.R.layout.simple_spinner_item,op);
        operaciones.setAdapter(adapter);

    }

    public void calcular (View v) {

        int opcion;
        double num1, num2, resultado = 0;

        opcion = operaciones.getSelectedItemPosition();
        num1 = Double.parseDouble(n1.getText().toString());
        num2 = Double.parseDouble(n2.getText().toString());

        switch (opcion) {

            case 1:
                resultado = Metodos.sumar(num1, num2);
                break;
            case 2:
                resultado = Metodos.resta(num1, num2);
            case 3:
                resultado = Metodos.multiplicacion(num1, num2);
            case 4:
                resultado = Metodos.division(num1, num2);


        }
        res.setText("" + String.format("%.2f", resultado));
    }

    public void  Limpiar (View v){

        n1.setText("");
        n2.setText("");
        operaciones.setSelection(0);
        res.setText("");
        n1.requestFocus();
    }

}
