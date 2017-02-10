package br.com.app.hungry4pizza;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText etLogin;
    private EditText etSenha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Recuperar os dados da tela (xml)
        etLogin = (EditText) findViewById(R.id.etLogin);
        etSenha = (EditText) findViewById(R.id.etSenha);

    }

    // Clique ao logar
    public void logar(View view){
        // Recuperar os valores digitados na tela
        String login = etLogin.getText().toString();
        String senha = etSenha.getText().toString();

        // Validar o usuário e a senha
        if (login.equals("admin") && senha.equals("1234")) {
            // Vai para a tela referente
            Intent intent = new Intent(this, PedidoActivity.class);
            // passa o valor do usuario para a proxima tela
            intent.putExtra("usuario", login);
            // iniciar a outra tela
            startActivity(intent);
            finish();
        } else {
            // caso o login ou a senha sejam inválidos
            Toast.makeText(this, "Usuário ou Senha inválidos", Toast.LENGTH_SHORT).show();
        }

    }

}
