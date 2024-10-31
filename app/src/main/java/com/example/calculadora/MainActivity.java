package com.example.calculadora;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button cero, uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, limpiar, division, por, menos, mas, igual ;

    private TextView resultado;

    private String number1 = "", number2 = "";

    private int Number1, Number2, cont;
    private double Result;

    private int estado;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        cero = findViewById(R.id.cero);
        uno = findViewById(R.id.uno);
        dos = findViewById(R.id.dos);
        tres = findViewById(R.id.tres);
        cuatro = findViewById(R.id.cuatro);
        cinco = findViewById(R.id.cinco);
        seis = findViewById(R.id.seis);
        siete = findViewById(R.id.siete);
        ocho = findViewById(R.id.ocho);
        nueve = findViewById(R.id.nueve);
        limpiar = findViewById(R.id.limpiar);
        division = findViewById(R.id.division);
        por = findViewById(R.id.por);
        mas = findViewById(R.id.mas);
        menos = findViewById(R.id.menos);
        igual = findViewById(R.id.igual);

        resultado = findViewById(R.id.total);

        cero.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                resultado.setText(resultado.getText().toString()+"0");

                if(cont == 0) {
                    number1 += "0";
                }else if (cont == 2){
                    number2 += "0";
                }
            }
        });

        uno.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                resultado.setText(resultado.getText().toString()+"1");

                if(cont == 0) {
                    number1 += "1";
                }else if (cont == 2){
                    number2 += "1";
                }
            }
        });


        dos.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                resultado.setText(resultado.getText().toString()+"2");

                if(cont == 0) {
                    number1 += "2";
                }else if (cont == 2){
                    number2 += "2";
                }
            }
        });

        tres.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                resultado.setText(resultado.getText().toString()+"3");

                if(cont == 0) {
                    number1 += "3";
                }else if (cont == 2){
                    number2 += "3";
                }
            }
        });

        cuatro.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                resultado.setText(resultado.getText().toString()+"4");

                if(cont == 0) {
                    number1 += "4";
                }else if (cont == 2){
                    number2 += "4";
                }
            }
        });

        cinco.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                resultado.setText(resultado.getText().toString()+"5");

                if(cont == 0) {
                    number1 += "5";
                }else if (cont == 2){
                    number2 += "5";
                }
            }
        });

        seis.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                resultado.setText(resultado.getText().toString()+"6");

                if(cont == 0) {
                    number1 += "6";
                }else if (cont == 2){
                    number2 += "6";
                }
            }
        });

        siete.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                resultado.setText(resultado.getText().toString()+"7");

                if(cont == 0) {
                    number1 += "7";
                }else if (cont == 2){
                    number2 += "7";
                }
            }
        });

        ocho.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                resultado.setText(resultado.getText().toString()+"8");

                if(cont == 0) {
                    number1 += "8";
                }else if (cont == 2) {
                    number2 += "8";
                }
            }
        });

        nueve.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                resultado.setText(resultado.getText().toString()+"9");

                if(cont == 0) {
                    number1 += "9";
                }else if (cont == 2){
                    number2 += "9";
                }
            }
        });

        mas.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                estado = 1;
                cont = 2;
                resultado.setText(resultado.getText().toString()+"+");
            }
        });
        menos.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                estado = 2;
                cont = 2;
                resultado.setText(resultado.getText().toString()+"-");
            }
        });
        por.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                estado = 3;
                cont = 2;
                resultado.setText(resultado.getText().toString()+"*");
            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                estado = 4;
                cont = 2;
                resultado.setText(resultado.getText().toString()+"/");
            }
        });

        igual.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                cont = 1;
                Number1 = Integer.parseInt(number1);
                Number2 = Integer.parseInt(number2);
                switch(estado) {
                    case 1:
                        Result = Number1 + Number2;
                        resultado.setText(""+Result);
                        break;
                    case 2:
                        Result = Number1 - Number2;
                        resultado.setText(""+Result);
                        break;
                    case 3:
                        Result = Number1 * Number2;
                        resultado.setText(""+Result);
                        break;
                    case 4:
                        Result = (double) Number1 / Number2;
                        resultado.setText(""+Result);
                        break;
                    case 0:
                        resultado.setText(Number1);
                        break;
                }
                number1 = "";
                number2 = "";
                cont = 0;
                estado = 0;
                cero.setEnabled(false);
                uno.setEnabled(false);
                dos.setEnabled(false);
                tres.setEnabled(false);
                cuatro.setEnabled(false);
                cinco.setEnabled(false);
                seis.setEnabled(false);
                siete.setEnabled(false);
                ocho.setEnabled(false);
                nueve.setEnabled(false);
                igual.setEnabled(false);
                division.setEnabled(false);
                por.setEnabled(false);
                mas.setEnabled(false);
                menos.setEnabled(false);
            }
        });
        limpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText("");
                cero.setEnabled(true);
                uno.setEnabled(true);
                dos.setEnabled(true);
                tres.setEnabled(true);
                cuatro.setEnabled(true);
                cinco.setEnabled(true);
                seis.setEnabled(true);
                siete.setEnabled(true);
                ocho.setEnabled(true);
                nueve.setEnabled(true);
                igual.setEnabled(true);
                division.setEnabled(true);
                por.setEnabled(true);
                mas.setEnabled(true);
                menos.setEnabled(true);
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}