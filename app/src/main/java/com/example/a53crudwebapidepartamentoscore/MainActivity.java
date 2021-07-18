package com.example.a53crudwebapidepartamentoscore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    ImageButton botonleer, botonalta;
    TextView txtdatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.txtdatos = (TextView) findViewById(R.id.txExamenAndroid);
        this.botonleer = (ImageButton) findViewById(R.id.button_topleft);
        this.botonalta = (ImageButton) findViewById(R.id.button_downleft);
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
