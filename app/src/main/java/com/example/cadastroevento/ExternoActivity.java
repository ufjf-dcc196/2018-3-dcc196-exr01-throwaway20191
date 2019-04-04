package com.example.cadastroevento;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.InputType;
import android.widget.TextView;

public class ExternoActivity extends PessoaActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textExtra = findViewById(R.id.textExtra);
        textExtra.setHint("E-mail");
        textExtra.setInputType(InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS);
    }
}
