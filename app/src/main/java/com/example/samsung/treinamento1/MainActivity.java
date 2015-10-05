package com.example.samsung.treinamento1;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private EditText nome;
    private EditText telefone;
    private EditText email;
    private Button agendar;
    private Button enviar;
    private Button compartilhar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nome = (EditText) findViewById(R.id.editNome);
        telefone = (EditText) findViewById(R.id.editTelefone);
        email = (EditText) findViewById(R.id.editEmail);
        agendar = (Button) findViewById(R.id.button);
        agendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "Nome: " + nome.getText().toString() + " Telefone: " + telefone.getText().toString() + " Email: " + email.getText().toString();

                Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();

            }
        });
        enviar = (Button) findViewById(R.id.enviar);
        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "Nome: " + nome.getText().toString() + " Telefone: " + telefone.getText().toString() + " Email: " + email.getText().toString();

                Intent i = new Intent(MainActivity.this, Exercicio2.class);
                i.putExtra("mensagem", msg);
                startActivity(i);

            }
        });
        compartilhar = (Button) findViewById(R.id.compartilhar);
        compartilhar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "Nome: " + nome.getText().toString() + " Telefone: " + telefone.getText().toString() + " Email: " + email.getText().toString();

                Intent i = new Intent();
                i.setAction(Intent.ACTION_SEND);
                i.putExtra(Intent.EXTRA_TEXT, msg);
                i.setType("text/plain");
                startActivity(i);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
