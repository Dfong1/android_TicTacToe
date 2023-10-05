package com.example.practica3eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button Reiniciar;
    TextView CuadroUno;
    TextView CuadroDos;
    TextView CuadroTres;
    TextView CuadroCuatro;
    TextView CuadroCinco;
    TextView CuadroSeis;
    TextView CuadroSiete;
    TextView CuadroOcho;
    TextView CuadroNueve;
    TextView Ganador;
    boolean turno = true;

    public void setGanador(){

        if((CuadroUno.getText() == "X" && CuadroDos.getText() == "X" && CuadroUno.getText() == "X")
            || (CuadroUno.getText() == "X" && CuadroCuatro.getText() == "X" && CuadroSiete.getText() == "X")){

            Ganador.setText("Ganador: X");

        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CuadroUno = findViewById(R.id.Text1);
        CuadroDos = findViewById(R.id.Text2);
        CuadroTres = findViewById(R.id.Text3);
        CuadroCuatro = findViewById(R.id.Text4);
        CuadroCinco = findViewById(R.id.Text5);
        CuadroSeis = findViewById(R.id.Text6);
        CuadroSiete = findViewById(R.id.Text7);
        CuadroOcho = findViewById(R.id.Text8);
        CuadroNueve = findViewById(R.id.Text9);
        Ganador = findViewById(R.id.ganador);

        Reiniciar = findViewById(R.id.reiniciar);

        View.OnClickListener cuadroUno = new View.OnClickListener(){
            @Override
            public void onClick(View v){
                CuadroUno = (TextView) v;

                if(!CuadroUno.getText().toString().equals("")){
                    return;
                }

                if(turno == true){
                    CuadroUno.setText("X");
                    turno = false;
                }
                else{
                    CuadroUno.setText("O");
                    turno = true;
                }
            }
        };
        View.OnClickListener cuadroDos = new View.OnClickListener(){
            @Override
            public void onClick(View v){
                CuadroDos = (TextView) v;

                if(!CuadroDos.getText().toString().equals("")){
                    return;
                }

                if(turno == true){
                    CuadroDos.setText("X");
                    turno = false;
                }
                else{
                    CuadroDos.setText("O");
                    turno = true;
                }
            }
        };
        View.OnClickListener cuadroTres = new View.OnClickListener(){
            @Override
            public void onClick(View v){
                CuadroTres = (TextView) v;

                if(!CuadroTres.getText().toString().equals("")){
                    return;
                }

                if(turno == true){
                    CuadroTres.setText("X");
                    turno = false;
                }
                else{
                    CuadroTres.setText("O");
                    turno = true;
                }
            }
        };
        View.OnClickListener cuadroCuatro = new View.OnClickListener(){
            @Override
            public void onClick(View v){
                CuadroCuatro = (TextView) v;

                if(!CuadroCuatro.getText().toString().equals("")){
                    return;
                }

                if(turno == true){
                    CuadroCuatro.setText("X");
                    turno = false;
                }
                else{
                    CuadroCuatro.setText("O");
                    turno = true;
                }
            }
        };
        View.OnClickListener cuadroCinco = new View.OnClickListener(){
            @Override
            public void onClick(View v){
                CuadroCinco = (TextView) v;

                if(!CuadroCinco.getText().toString().equals("")){
                    return;
                }

                if(turno == true){
                    CuadroCinco.setText("X");
                    turno = false;
                }
                else{
                    CuadroCinco.setText("O");
                    turno = true;
                }
            }
        };
        View.OnClickListener cuadroSeis = new View.OnClickListener(){
            @Override
            public void onClick(View v){
                CuadroSeis = (TextView) v;

                if(!CuadroSeis.getText().toString().equals("")){
                    return;
                }

                if(turno == true){
                    CuadroSeis.setText("X");
                    turno = false;
                }
                else{
                    CuadroSeis.setText("O");
                    turno = true;
                }
            }
        };
        View.OnClickListener cuadroSiete = new View.OnClickListener(){
            @Override
            public void onClick(View v){

                if(!CuadroSiete.getText().toString().equals("")){
                    return;
                }

                CuadroSiete = (TextView) v;
                if(turno == true){
                    CuadroSiete.setText("X");
                    turno = false;
                }
                else{
                    CuadroSiete.setText("O");
                    turno = true;
                }
            }
        };
        View.OnClickListener cuadroOcho = new View.OnClickListener(){
            @Override
            public void onClick(View v){
                CuadroOcho = (TextView) v;

                if(!CuadroOcho.getText().toString().equals("")){
                    return;
                }

                if(turno == true){
                    CuadroOcho.setText("X");
                    turno = false;
                }
                else{
                    CuadroOcho.setText("O");
                    turno = true;
                }
            }
        };
        View.OnClickListener cuadroNueve = new View.OnClickListener(){
            @Override
            public void onClick(View v){
                CuadroNueve = (TextView) v;

                if(!CuadroNueve.getText().toString().equals("")){
                    return;
                }

                if(turno == true){
                    CuadroNueve.setText("X");
                    turno = false;
                }
                else{
                    CuadroNueve.setText("O");
                    turno = true;
                }
            }
        };

        View.OnClickListener reiniciar = new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Reiniciar = (Button) v;

                CuadroUno.setText("");
                CuadroDos.setText("");
                CuadroTres.setText("");
                CuadroCuatro.setText("");
                CuadroCinco.setText("");
                CuadroSeis.setText("");
                CuadroSiete.setText("");
                CuadroOcho.setText("");
                CuadroNueve.setText("");
            }
        };

        CuadroUno.setOnClickListener(cuadroUno);
        CuadroDos.setOnClickListener(cuadroDos);
        CuadroTres.setOnClickListener(cuadroTres);
        CuadroCuatro.setOnClickListener(cuadroCuatro);
        CuadroCinco.setOnClickListener(cuadroCinco);
        CuadroSeis.setOnClickListener(cuadroSeis);
        CuadroSiete.setOnClickListener(cuadroSiete);
        CuadroOcho.setOnClickListener(cuadroOcho);
        CuadroNueve.setOnClickListener(cuadroNueve);

        setGanador();
        Reiniciar.setOnClickListener(reiniciar);
    }
}