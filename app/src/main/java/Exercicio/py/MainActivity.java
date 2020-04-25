package Exercicio.py;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionarBotao(View v){

        TextView Email = (TextView) findViewById(R.id.textEmail);
        TextView Senha = (TextView) findViewById(R.id.textSenha);

        String usuario = Email.getText().toString();
        String password = Senha.getText().toString();

        Intent intent1 = new Intent(MainActivity.this, Tela2.class);

        if(usuario.equals("paulo") &&password.equals("123")){
             Mensagem("Login feito com sucesso");
        startActivity(intent1);
        }else{
            Mensagem("Erro ao efetuar login");
        }


}
private void Mensagem(String s){
    Toast.makeText(this, s , Toast.LENGTH_LONG).show();
}
    public void meuCadastro(View b){
Intent intent2 = new Intent(MainActivity.this , telaCadastro.class);
    startActivity(intent2);
    }
}



