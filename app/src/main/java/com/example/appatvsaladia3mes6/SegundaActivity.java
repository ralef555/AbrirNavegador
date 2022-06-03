package com.example.appatvsaladia3mes6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SegundaActivity extends AppCompatActivity {

    Button btprincipal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        btprincipal = (Button) findViewById(R.id.bttelaprincipal);

        btprincipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SegundaActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void abrirNavegador(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://google.com.br"));
        startActivity(intent);
    }

}