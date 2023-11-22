package com.example.juegoestadoanimo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static final int CONTADOR_INTENTOS = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Juego juego = new Juego();

        setContentView(R.layout.activity_main);

        //Boton Comenzar
        Button btnComenzar = findViewById(R.id.botonComenzar);
        btnComenzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                juego.setDisponible(true);
                pulsa3Botones();
            }
        });

        //Boton Reset
        Button btnReiniciar = findViewById(R.id.botonReiniciar);
        btnReiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                juego.reset();
                juegoReiniciado();
            }
        });

        //Boton 1
        ImageButton btnUno = findViewById(R.id.button_1);
        btnUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llamarBotonRojo(juego);
            }
        });

        //Boton 2
        ImageButton btnDos = findViewById(R.id.button_2);
        btnDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llamarBotonNegro(juego);
            }
        });

        //Boton 3
        ImageButton btnTres = findViewById(R.id.button_3);
        btnTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llamarBotonRojo(juego);
            }
        });

        //Boton 4
        ImageButton btnCuatro = findViewById(R.id.button_4);
        btnCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llamarBotonNegro(juego);
            }
        });

        //Boton 5
        ImageButton btnCinco = findViewById(R.id.button_5);
        btnCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llamarBotonRojo(juego);
            }
        });

        //Boton 6
        ImageButton btnSeis = findViewById(R.id.button_6);
        btnSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llamarBotonNegro(juego);
            }
        });

        //Boton 7
        ImageButton btnSiete = findViewById(R.id.button_7);
        btnSiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llamarBotonRojo(juego);
            }
        });

        //Boton 8
        ImageButton btnOcho = findViewById(R.id.button_8);
        btnOcho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llamarBotonNegro(juego);
            }
        });

        //Boton 9
        ImageButton btnNueve = findViewById(R.id.button_9);
        btnNueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llamarBotonRojo(juego);
            }
        });

    }

    public void pulsa3Botones(){
        Toast.makeText(this,"Pulsa 3 botones",Toast.LENGTH_SHORT).show();
    }
    public void juegoReiniciado(){
        Toast.makeText(this,"Partida reiniciada",Toast.LENGTH_SHORT).show();
    }

    public void estasFeliz(){
        Toast.makeText(this, "¡Eres un perro bueno!", Toast.LENGTH_SHORT).show();
    }

    public void estasTriste(){
        Toast.makeText(this, "Eres un perro malo >:( ", Toast.LENGTH_SHORT).show();
    }

    // Si clicka en un boton rojo sumará uno al contador de rojo y otro al contador
    public void llamarBotonRojo (Juego juego){
        if (juego.isDisponible() && juego.getContadorJuego() < 4) {
            juego.pulsarRojo();

            if(juego.contadorJuego == CONTADOR_INTENTOS) {

                if (juego.contadorRojo >= 2) {
                    estasFeliz();
                } else {
                    estasTriste();
                }
            }
        }
    }

    // Si clicka en un boton negro sumará uno al contador
    public void llamarBotonNegro (Juego juego){
        if (juego.isDisponible() && juego.getContadorJuego() < 4) {
            juego.pulsarNegro();

            if(juego.contadorJuego == CONTADOR_INTENTOS) {

                if (juego.contadorRojo >= 2) {
                    estasFeliz();
                } else {
                    estasTriste();
                }
            }
        }
    }
}