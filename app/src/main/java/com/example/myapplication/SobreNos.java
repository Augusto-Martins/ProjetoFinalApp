package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SobreNos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre_nos);
    }

    private Button botãoMinhaConta;

    @Override
    public <T extends View> T findViewById(int id) {
        return super.findViewById(id);

        botãoMinhaConta = findViewById(R.id.button);

        botãoMinhaConta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(SobreNos.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }

    private Button botaoHome;

    @Override
    public <T extends View> T findViewById(int id) {
        return super.findViewById(id);

        botaoHome = findViewById(R.id.button);

        botaoHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(SobreNos.this,MainActivity.class);
                startActivity(intent);
            }
        });
}
