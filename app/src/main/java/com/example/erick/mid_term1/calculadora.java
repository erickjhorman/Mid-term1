package com.example.erick.mid_term1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class calculadora extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
    }

    public void backAcercade(View view){
        Intent back = new Intent(calculadora.this, Acercade.class);
        calculadora.this.startActivity(back);
    }
}
