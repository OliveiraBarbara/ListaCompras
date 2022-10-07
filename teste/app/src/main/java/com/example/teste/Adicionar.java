package com.example.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Adicionar extends AppCompatActivity {

    private TextView tNomeLista;
    private TextView tMarcaLista;
    private TextView tQtdLista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar);

        tNomeLista = findViewById(R.id.tNomeLista);
        tMarcaLista = findViewById(R.id.tMarcaLista);
        tQtdLista = findViewById(R.id.tQtdLista);

        Intent i = getIntent();

        String nome = i.getStringExtra("nome");
        String marca = i.getStringExtra("marca");
        String qtd = i.getStringExtra("qtd");

        tNomeLista.setText(nome);
        tMarcaLista.setText(marca);
        tQtdLista.setText(qtd);
    }
}