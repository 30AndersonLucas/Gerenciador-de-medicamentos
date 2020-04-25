package Exercicio.py;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class telaCadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_telacadastro);

    }


    public void CadastroP(View l){

        Intent intent3 = new Intent(getApplicationContext(), Tela3.class);
        startActivity(intent3);
    }

    public void Voltar(View k){
        Intent intentk = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intentk);
    }



}
