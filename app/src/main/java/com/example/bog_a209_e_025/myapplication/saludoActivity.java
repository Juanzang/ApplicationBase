package com.example.bog_a209_e_025.myapplication;

import android.content.Intent;
import android.view.View;
import android.os.FileObserver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class saludoActivity extends AppCompatActivity {

    private TextView nuevoTx;
    private Button btnSaludo2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);
        init();
    }

    private void init(){
        nuevoTx = (TextView)findViewById(R.id.texto_mensaje);
        btnSaludo2 = (Button) findViewById(R.id.btnSiguiente);
        btnSaludo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle extras = getIntent().getExtras();
                if(extras!=null) {
                    String valor = (String) extras.get("CAJA");
                    nuevoTx.setText(valor);
                }
                Intent intent = new Intent(saludoActivity.this, CamaraActivity.class);
                intent.putExtra("CAJA2",nuevoTx.getText().toString());
                startActivity(intent);
            }
        });
        }
}


