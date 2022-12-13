package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Perfil2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil2);
    }

}
    private Button botãoHome;

    @Override
    public <T extends View> T findViewById(int id) {
        return super.findViewById(id);

        botãoHome = findViewById(R.id.button);

        botãoHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, Perfil2.class);
                startActivity(intent);
            }
        });


    }
    private Button botaoSobreNos;

    @Override
    public <T extends View> T findViewById(int id) {
        return super.findViewById(id);

        botaoSobreNos = findViewById(R.id.button);

        botaoSobreNos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, Perfil2.class);
                startActivity(intent);
            }

        });

    }
}

