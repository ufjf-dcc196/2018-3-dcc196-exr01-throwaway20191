package com.example.cadastroevento;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.InputType;
import android.widget.TextView;

public class ServidorActivity extends PessoaActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textExtra = findViewById(R.id.textExtra);
        textExtra.setHint("SIAPE");
        textExtra.setInputType(InputType.TYPE_NUMBER_FLAG_DECIMAL);
    }
}
