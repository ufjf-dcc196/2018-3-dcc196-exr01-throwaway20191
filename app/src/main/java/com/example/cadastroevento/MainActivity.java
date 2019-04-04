package com.example.cadastroevento;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.cadastroevento.models.Aluno;
import com.example.cadastroevento.models.Event;
import com.example.cadastroevento.models.Externo;
import com.example.cadastroevento.models.Servidor;

public class MainActivity extends AppCompatActivity {
    private static final int REQUEST_SIAPE = 1;
    private static final int REQUEST_MATRICULA = 2;
    private static final int REQUEST_EMAIL = 3;

    private final Event event = new Event();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        updateCountText();
        Button btnExterno = findViewById(R.id.buttonExterno);
        btnExterno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ExternoActivity.class);
                startActivityForResult(intent, REQUEST_EMAIL);
            }
        });

        Button btnAluno = findViewById(R.id.buttonAluno);
        btnAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AlunoActivity.class);
                startActivityForResult(intent, REQUEST_MATRICULA);
            }
        });

        Button btnServidor = findViewById(R.id.buttonServidor);
        btnServidor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ServidorActivity.class);
                startActivityForResult(intent, REQUEST_SIAPE);
            }
        });
    }

    private void updateCountText() {
        String text =
                "Alunos: " + Integer.toString(event.alunos.size()) + "\n" +
                "Servidores: " + Integer.toString(event.servidores.size()) + "\n" +
                "Externos: " + Integer.toString(event.externos.size()) + "\n";
        ((TextView)findViewById(R.id.textCount)).setText(text);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (Activity.RESULT_OK == resultCode && data != null){
            String nome = data.getStringExtra("nome");
            String extra = data.getStringExtra("extra");

            switch (requestCode) {
                case REQUEST_EMAIL:
                    event.externos.add(new Externo(nome, extra));
                    break;
                case REQUEST_MATRICULA:
                    event.alunos.add(new Aluno(nome, extra));
                    break;
                case REQUEST_SIAPE:
                    event.servidores.add(new Servidor(nome, extra));
            }
            updateCountText();
        }
    }
}
