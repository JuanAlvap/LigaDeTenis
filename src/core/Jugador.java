package core;

import java.util.ArrayList;

public class Jugador extends Persona {

    private int sueldo;
    private ArrayList<Juego> juegos;

    public Jugador(String nombre, int sueldo) {
        super(nombre);
        this.sueldo = sueldo;
        this.juegos = new ArrayList<>();
    }

    public boolean addJuego(Juego juego) {
        if (!this.juegos.contains(juego)) {
            this.juegos.add(juego);
            return true;
        }
        return false;
    }
}
