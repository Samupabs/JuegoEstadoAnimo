package com.example.juegoestadoanimo;

public class Juego {
    protected int contadorRojo = 0;
    protected int contadorJuego = 0;

    protected boolean disponible = false;
    public Juego() {
    }

    public void reset(){
        setContadorJuego(0);
        setContadorRojo(0);
    }
    public void pulsarRojo(){
        contadorRojo++;
        contadorJuego++;
    }

    public void pulsarNegro(){
        contadorJuego++;
    }

    public int getContadorRojo() {
        return contadorRojo;
    }

    public void setContadorRojo(int contadorRojo) {
        this.contadorRojo = contadorRojo;
    }

    public int getContadorJuego() {
        return contadorJuego;
    }

    public void setContadorJuego(int contadorJuego) {
        this.contadorJuego = contadorJuego;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
