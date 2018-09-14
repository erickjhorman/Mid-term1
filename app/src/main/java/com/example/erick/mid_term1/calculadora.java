package com.example.erick.mid_term1;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class calculadora extends AppCompatActivity {

    // I declare the variable to use

    TextView tvDisplay;
    double n1, n2, resultado; // These variables save the numbers enter
    String Operador;  // it depicts the operation to do

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
    }

    public void backAcercade(View view) {
        Intent back = new Intent(calculadora.this, Acercade.class);
        calculadora.this.startActivity(back);
    }

    //The methods of the buttons

    //Button Zero
    public void bCero(View view) {
        tvDisplay = (TextView) findViewById(R.id.tvDisplay);
        tvDisplay.setText(tvDisplay.getText() + "0"); //
    }

    //Button One
    public void bUno(View view) {
        tvDisplay = (TextView) findViewById(R.id.tvDisplay);
        tvDisplay.setText(tvDisplay.getText() + "1"); //
    }

    //Button Two
    public void bTwo(View view) {
        tvDisplay = (TextView) findViewById(R.id.tvDisplay);
        tvDisplay.setText(tvDisplay.getText() + "2"); //
    }

    //Button Three
    public void bThree(View view) {
        tvDisplay = (TextView) findViewById(R.id.tvDisplay);
        tvDisplay.setText(tvDisplay.getText() + "3"); //
    }

    //Button four
    public void bFour(View view) {
        tvDisplay = (TextView) findViewById(R.id.tvDisplay);
        tvDisplay.setText(tvDisplay.getText() + "4"); //
    }

    //Button Five
    public void bFive(View view) {
        tvDisplay = (TextView) findViewById(R.id.tvDisplay);
        tvDisplay.setText(tvDisplay.getText() + "5"); //
    }

    //Button Six
    public void bSix(View view) {
        tvDisplay = (TextView) findViewById(R.id.tvDisplay);
        tvDisplay.setText(tvDisplay.getText() + "6"); //
    }

    //Button Seven
    public void bSeven(View view) {
        tvDisplay = (TextView) findViewById(R.id.tvDisplay);
        tvDisplay.setText(tvDisplay.getText() + "7"); //
    }

    //Button Eight
    public void bEight(View view) {
        tvDisplay = (TextView) findViewById(R.id.tvDisplay);
        tvDisplay.setText(tvDisplay.getText() + "8"); //
    }

    //Button Nine
    public void bNine(View view) {
        tvDisplay = (TextView) findViewById(R.id.tvDisplay);
        tvDisplay.setText(tvDisplay.getText() + "9"); //
    }

    //Button Dot
    public void bDot(View view) {
        tvDisplay = (TextView) findViewById(R.id.tvDisplay);
        tvDisplay.setText(tvDisplay.getText() + "."); //
    }

    //Method to ger the first numbers

    public void onClickOperationCaptuteNumber1(View view) {
        tvDisplay = (TextView) findViewById(R.id.tvDisplay); // To get the number in the screen
        n1 = Double.parseDouble(tvDisplay.getText().toString()); // To cast it to Double
        tvDisplay.setText(""); // To clean the TextView
    }

    public void sumar(View view) {
        Operador = "+";  // To identify the operarator
        onClickOperationCaptuteNumber1(view);

    }

    public void Restar(View view) {
        Operador = "-";
        onClickOperationCaptuteNumber1(view);
    }

    public void Multiplicar(View view) {
        Operador = "*";
        onClickOperationCaptuteNumber1(view);
    }

    public void Dividir(View view) {
        Operador = "/";
        onClickOperationCaptuteNumber1(view);
    }

    public void expn(View view) {
        Operador = "exp";
        tvDisplay = (TextView) findViewById(R.id.tvDisplay);
        try {
            n1 = Double.parseDouble(tvDisplay.getText().toString());
            tvDisplay.setText("");
        } catch (NumberFormatException nfe) {
            nfe.printStackTrace();
        }
    }

    // Operation of the buttin equals
    public void bIgual(View view) {
        tvDisplay = (TextView) findViewById(R.id.tvDisplay);
        n2 = Double.parseDouble(tvDisplay.getText().toString());

        if (Operador.equals("+")) {
            resultado = n1 + n2;

        } else if (Operador.equals("-")) {
            resultado = n1 - n2;

        } else if (Operador.equals("*")) {
            resultado = n1 * n2;

        } else if (Operador.equals("/")) {
            resultado = n1 / n2;
        } else if (Operador.equals("exp")) {
            tvDisplay = (TextView) findViewById(R.id.tvDisplay);
            n2 = Double.parseDouble(tvDisplay.getText().toString());
            tvDisplay.setText("");
            resultado = Math.pow(n1, n2);
        }
        tvDisplay.setText("" + resultado);
    }

    // Button random

    public void Rnd(View viw) {
        for (int x = 0; x <= 100; x++) {
            int na = (int) Math.floor(Math.random() + (100 - (1 + 1) + (1))); // To create the ramdon to get the number using the expression MATH.RAMDOM
            tvDisplay.setText(String.valueOf(na));
        }
    }

    // Method SQRT

    public void Raiz(View view) {
        tvDisplay = (TextView) findViewById(R.id.tvDisplay);
        try {
            n1 = Double.parseDouble(tvDisplay.getText().toString());
            resultado = Math.sqrt(n1);
            tvDisplay.setText(String.valueOf(resultado));
        } catch (NumberFormatException nfe) {
            nfe.printStackTrace();
        }
    }

    // Method exponent squared
    public void ExpCuadrado(View view) {
        tvDisplay = (TextView) findViewById(R.id.tvDisplay);
        try {
            n1 = Double.parseDouble(tvDisplay.getText().toString());
            resultado = Math.pow(n1, 2);
            tvDisplay.setText(String.valueOf(resultado));
        } catch (NumberFormatException nfe) {
            nfe.printStackTrace();
        }
    }

    // exponent cubed
    public void ExpCubo(View view) {
        tvDisplay = (TextView) findViewById(R.id.tvDisplay);
        try {
            n1 = Double.parseDouble(tvDisplay.getText().toString());
            resultado = Math.pow(n1, 3);
            tvDisplay.setText(String.valueOf(resultado));
        } catch (NumberFormatException nfe) {
            nfe.printStackTrace();
        }
    }

    // exponent sin
    public void Sen(View view) {
        tvDisplay = (TextView) findViewById(R.id.tvDisplay);
        try {
            n1 = Double.parseDouble(tvDisplay.getText().toString());
            double rd = Math.toRadians(n1);
            resultado = Math.sin(rd);
            tvDisplay.setText(String.valueOf(resultado));
        } catch (NumberFormatException nfe) {
            nfe.printStackTrace();
        }
    }

    // exponent Cos
    public void Cos(View view) {
        tvDisplay = (TextView) findViewById(R.id.tvDisplay);
        try {
            n1 = Double.parseDouble(tvDisplay.getText().toString());
            double rd = Math.toRadians(n1);
            resultado = Math.cos(rd);
            tvDisplay.setText(String.valueOf(resultado));
        } catch (NumberFormatException nfe) {
            nfe.printStackTrace();
        }
    }

    // exponent Tan
    public void Tan(View view) {
        tvDisplay = (TextView) findViewById(R.id.tvDisplay);
        try {
            n1 = Double.parseDouble(tvDisplay.getText().toString());
            double rd = Math.toRadians(n1);
            resultado = Math.tan(rd);
            tvDisplay.setText(String.valueOf(resultado));
        } catch (NumberFormatException nfe) {
            nfe.printStackTrace();
        }
    }

    // exponent factorial
    public void factorial(View view) {
        int fact = 1;
        int x;
        try {
            for (x = 1; x <= n1; x++) {
                fact = fact * x;
            }

            tvDisplay.setText(String.valueOf(resultado));
        } catch (NumberFormatException nfe) {
            nfe.printStackTrace();
        }
    }

    // Remove lastNumber

    public  void BorrarUl(View view)
    {
        if (!tvDisplay.getText().toString().equals(""));

           tvDisplay.setText(tvDisplay.getText().subSequence(0, tvDisplay.getText().length() - 1) + ""); // To delete the last number

    }

    // Button remove all the information
    public  void bBorrarTodo (View view){
        n1 = 0.0;
        n2 = 0.0;
        tvDisplay = (TextView) findViewById(R.id.tvDisplay);
        tvDisplay.setText("");
    }

    public void salir(View view)
    {
        finish(); // To exit from the app
    }
}
