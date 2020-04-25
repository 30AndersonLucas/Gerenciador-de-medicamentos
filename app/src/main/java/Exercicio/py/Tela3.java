package Exercicio.py;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Tela3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);
    }

    public void contaview(View w){
        TextView mail = findViewById(R.id.textMail);
        TextView pass = findViewById(R.id.textPass);
        TextView conpass = findViewById(R.id.textConfirmarS);

        String paulo = mail.getText().toString();
        String senha = pass.getText().toString();
        String and = conpass.getText().toString();

        Intent intentp = new Intent(getApplicationContext(), MainActivity.class);

         if(paulo.equals("paulo") &&senha.equals("123") &&and.equals("123")){
        Alerta("Cadastro realizado com sucesso");
            startActivity(intentp);
        }else{
            Alerta("Você digitou algo errado");
        }
}

public void Volta(View hj){
    Intent intentk1 = new Intent(getApplicationContext(), telaCadastro.class);
    startActivity(intentk1);
}

private void Alerta(String g){
    Toast.makeText(this, g , Toast.LENGTH_LONG).show();
}
}
