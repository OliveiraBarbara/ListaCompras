package com.example.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Inserir extends AppCompatActivity {

    private Button bInserir;
    private Button bCancela;

    private EditText tNomeLista;
    private EditText tMarca;
    private EditText tQtd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inserir);

        this.bInserir = findViewById(R.id.bInserir);
        this.bCancela = findViewById(R.id.bCancela);

        this.tNomeLista = findViewById(R.id.tNomeLista);
        this.tMarca = findViewById(R.id.tMarca);
        this.tQtd = findViewById(R.id.tQtd);

        bInserir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome, marca, qtd;

                nome = tNomeLista.getText().toString();
                marca = tMarca.getText().toString();
                qtd = tQtd.getText().toString();

                Intent i = new Intent(getApplicationContext(), Adicionar.class);

                i.putExtra("nome", nome);
                i.putExtra("marca", marca);
                i.putExtra("qtd", qtd);

                startActivity(i);
            }
        });

        bCancela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}