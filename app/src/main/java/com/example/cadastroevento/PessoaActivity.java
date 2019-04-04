package com.example.cadastroevento;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PessoaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pessoa);

        (findViewById(R.id.buttonSave)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendResponse();
            }
        });
    }

    protected void sendResponse() {
        Intent response = new Intent();
        response.putExtra("nome", ((TextView)findViewById(R.id.textNome)).getText().toString());
        response.putExtra("extra",((TextView)findViewById(R.id.textExtra)).getText().toString());
        setResult(Activity.RESULT_OK, response);
        finish();
    }
}
