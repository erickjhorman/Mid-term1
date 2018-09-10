package com.example.erick.mid_term1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class infoClase extends AppCompatActivity {

    // I created a variable to my text
   TextView Mitext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_clase);

        Mitext = (TextView) findViewById(R.id.txtMyinformation);

    }

        public void backAcercade(View view){
        Intent back = new Intent(infoClase.this, Acercade.class);
        infoClase.this.startActivity(back);
    }
}
