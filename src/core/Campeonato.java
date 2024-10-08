package core;

import java.util.ArrayList;

public class Campeonato {

    private ArrayList<Juego> juegos;

    public Campeonato() {

        this.juegos = new ArrayList<>();

    }

    public boolean addJuego(Juego juego) {
        if (!this.juegos.contains(juego)) {
            this.juegos.add(juego);
            return true;
        }
        return false;
    }

    public Juego getJuego(int index) {
        return this.juegos.get(index);
    }

    /*
* Jugador 1: Rafael Nadal 
 * Jugador 2: Martina Hingis 
 * Juez: Pedro Perez 
 * Set 1: 6 - 4 
 * Set 2: 1 - 6 
 * Set 3: 6 - 3 
 * Ganador: Rafael Nadal
     */
    public void showResumen() {
        ArrayList<Juego> ganador = new ArrayList<>();
        int index = this.juegos.size();
        int controller = 0;
        for (Juego juego : this.juegos) {
            System.out.println("Jugador 1: " + juego.getJugador1().getNombre());
            System.out.println("Jugador 2: " + juego.getJugador2().getNombre());
            System.out.println("Juez: " + juego.getJuez().getNombre());
            for (int i = 0; i < juego.getSets().size(); i++) {
                Set set = juego.getSets().get(i);
                System.out.println("Set " + (i + 1) + ": " + set.getPuntosJugador1() + " - " + set.getPuntosJugador2());
                
            }
            System.out.println("Ganador: " + juego.getGanador().getNombre());
            System.out.println("");
            controller++;
            
            if (controller == index){
                System.out.println("El ganador del campeonato es: "+juego.getGanador().getNombre());
            }
        }

    }

}
