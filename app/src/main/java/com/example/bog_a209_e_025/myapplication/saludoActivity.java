package com.example.bog_a209_e_025.myapplication;

import android.content.Intent;
import android.view.View;
import android.os.FileObserver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class saludoActivity extends AppCompatActivity {

    private TextView nuevoTx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);
        init();
    }

    private void init(){
        nuevoTx = (TextView)findViewById(R.id.texto_mensaje);
        Bundle extras = getIntent().getExtras();
        if(extras!=null) {
            String valor = (String) extras.get("CAJA");
            nuevoTx.setText(valor);
        }
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this,textoSaludo.getText().toString(),
                //  Toast.LENGTH_LONG).show();
                Intent intent = new Intent(saludoActivity.this, CamaraActivity.class);
                startActivity(intent);

        }
    }


}
