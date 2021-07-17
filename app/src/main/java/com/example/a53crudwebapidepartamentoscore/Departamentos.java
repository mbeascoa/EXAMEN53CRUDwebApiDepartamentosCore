package com.example.a53crudwebapidepartamentoscore;


import android.os.Build;
import androidx.annotation.RequiresApi;
import java.util.Objects;

    public class Departamentos {

        private String mNumero;
        private String mNombre;
        private String mLocalidad;


        public Departamentos() {
        }

        public Departamentos(String numero, String nombre, String localidad) {
            this.mNumero = numero;
            this.mNombre = nombre;
            this.mLocalidad = localidad;

        }

        public String getNumero() {
            return this.mNumero;
        }

        public void setNumero(String mNumero) {
            this.mNumero = mNumero;
        }

        public String getNombre() {
            return this.mNombre;
        }

        public void setNombre(String mNombre) {
            this.mNombre = mNombre;
        }

        public String getLocalidad() {
            return this.mLocalidad;
        }

        public void setLocalidad(String mLocalidad) {
            this.mLocalidad = mLocalidad;
        }

        @Override
        public String toString() {
            return  mNombre;
        }
    }
