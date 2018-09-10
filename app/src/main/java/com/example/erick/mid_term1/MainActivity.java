package com.example.erick.mid_term1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // Global variable
   private EditText u , p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // We add the items of the XML to the activity through class R
        u = (EditText) findViewById(R.id.et_user);
        p = (EditText) findViewById(R.id.et_password);

    }

    public  void loginValidation(View view){ // This method receives the values

        String user = u.getText().toString().trim(); // I get the value to a string
        String password = p.getText().toString().trim();

        if (user.equals("admin".toLowerCase()) && password.equals("admin".toLowerCase())){   /* If i select the firts Radio, i'll add the numbers and set it into de textView3 **/
            System.err.println("Credentials Accepted.");
            login();

        } else  {
            System.err.println("Login failed wrong user credentials");
        }
    }

         public void login(){
             Intent intentLogin = new Intent (MainActivity.this, Acercade.class); // I instanted  the intent to call the activity
             MainActivity.this.startActivity(intentLogin);

        }






}
