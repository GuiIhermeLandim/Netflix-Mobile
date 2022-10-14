package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class InterfaceInicial extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface_inicial);
    }

    public void irParaLogin(View view){
        Intent intent = new Intent(InterfaceInicial.this, Login.class);
        startActivity(intent);
    }

    public void irParaCadastro(View view){
        Intent intent = new Intent(InterfaceInicial.this, Cadastro.class);
        startActivity(intent);
    }
}