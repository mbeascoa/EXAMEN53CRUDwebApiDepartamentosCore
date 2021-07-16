package com.example.a53crudwebapidepartamentoscore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;

import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

import android.os.AsyncTask;


public class MainActivity extends AppCompatActivity {

    Button botonleer;
    TextView txtdatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.txtdatos = (TextView) findViewById(R.id.txt_datos);
        this.botonleer = (Button) findViewById(R.id.btn_alta);
    }

    public void leerServicio(View view) {
        try {
            txtdatos.setText("Insertando Registros");
            String url = "https://webapidepartamentos20210716114825.azurewebsites.net/api/Departamentos";
            new HttpAsyncTask().execute(url);
        } catch (Exception e) {
// manage exceptions
            txtdatos.setText(e.getMessage());
        }
    }




    private class HttpAsyncTask extends AsyncTask<String, Void, String> {
        @Override
        protected String doInBackground(String... urls) {

            HttpClient httpclient = new DefaultHttpClient();
            HttpPost httppost = new HttpPost(urls[0]);

            try {
                List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(3);
                nameValuePairs.add(new BasicNameValuePair("numero", "99"));
                nameValuePairs.add(new BasicNameValuePair("nombre", "COMERCIAL"));
                nameValuePairs.add(new BasicNameValuePair("localidad", "CUENCA"));


                httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));

                // Execute HTTP Post Request
                HttpResponse response = httpclient.execute(httppost);

            } catch (ClientProtocolException e) {
                // TODO Auto-generated catch block
            } catch (IOException e) {
                // TODO Auto-generated catch block
            }
            return "Executed";
            // return recuperarContenido(urls[0]);
        }

        // onPostExecute displays the results of the AsyncTask.
        @Override
        protected void onPostExecute(String result) {


        }
    }




}
