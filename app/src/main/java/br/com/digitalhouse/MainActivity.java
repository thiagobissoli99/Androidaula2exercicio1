package br.com.digitalhouse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editTextNome;
    EditText editTextSenha;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNome = findViewById(R.id.edit_text_nome);
        editTextSenha = findViewById(R.id.edit_text_senha);
        btnLogin =findViewById(R.id.btnLogin):;

    }
}
