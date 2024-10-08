package core;

import java.util.ArrayList;

public class Juez extends Persona{
    
    private int edad;
    private ArrayList<Juego> juegos;

    public Juez(String nombre, int edad) {
        super(nombre);
        this.edad = edad;
        this.juegos = new ArrayList<>();
    }
    
    
    
}
