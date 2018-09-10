package com.example.erick.mid_term1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Acercade extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acercade);
    }

    public void acercaActivity(View view){
        Intent acercaDe = new Intent(Acercade.this, infoClase.class);
        Acercade.this.startActivity(acercaDe);
    }

    public void calculadoraActivity(View view){
        Intent calculadora = new Intent(Acercade.this, calculadora.class);
        Acercade.this.startActivity(calculadora);
    }

}
