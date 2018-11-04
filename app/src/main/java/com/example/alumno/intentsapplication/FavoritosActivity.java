package com.example.alumno.intentsapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;

public class FavoritosActivity extends AppCompatActivity {

    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent miIntent = getIntent();

        String nombre = miIntent.getStringExtra("nombre");
        int edad = miIntent.getIntExtra("edad", 0);

        text = findViewById(R.id.nameText);

        text.setText(nombre + " " + edad);

        Toast.makeText(this, nombre + " " + edad, Toast.LENGTH_SHORT).show();
    }

    public void regresar(View v){
        finish();
    }


}
