package com.example.bog_a209_e_025.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnSaludo;
    private EditText textoSaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        btnSaludo = (Button) findViewById(R.id.saludo_button);
        textoSaludo = (EditText) findViewById(R.id.saludo);
        btnSaludo.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {

                //Toast.makeText(MainActivity.this,textoSaludo.getText().toString(),
                //  Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, saludoActivity.class);
                intent.putExtra("CAJA",textoSaludo.getText().toString());
                startActivity(intent);
            }

        });
    }



}
