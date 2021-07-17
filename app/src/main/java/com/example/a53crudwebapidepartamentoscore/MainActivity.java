package com.example.a53crudwebapidepartamentoscore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Button botonleer, botonalta;
    TextView txtdatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.txtdatos = (TextView) findViewById(R.id.txt_datos);
        this.botonleer = (Button) findViewById(R.id.btn_daralta);
        this.botonalta = (Button) findViewById(R.id.btn_daralta);
    }



    public void insertarRegistro (View view){

        txtdatos.setText("Vamos a la pantalla para insertar registros");
        Intent i = new Intent(this, Alta_registro.class);
        startActivity(i);

    }
    public void leerRegistros (View view){

        txtdatos.setText("Vamos a la pantalla para leer registros");
        Intent i = new Intent(this, Listado_registros.class);
        startActivity(i);

    }



}
