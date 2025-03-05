package com.example;

import com.Jugador;

public class Main {
    public static void main(String[] args) {
        
        Jugador jugador1 = new Jugador("Mario Hidalgo", 20, "Volante", 24, "Rojos FCB");
        Jugador jugador2 = new Jugador("Juan", 22, "Defensa", 66, "Amarillo FC");

        jugador1.mostrarInformacion();
        jugador2.mostrarInformacion();

        jugador1.setEdad(23);
        jugador2.setPosicion("Portero");

        jugador1.mostrarInformacion();
        jugador2.mostrarInformacion();
    }
}
