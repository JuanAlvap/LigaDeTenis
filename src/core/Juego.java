package core;

import java.util.ArrayList;

public class Juego {

    private Jugador jugador1;
    private Jugador jugador2;
    private Juez juez;
    private Juego juegoPrevio1;
    private Juego juegoPrevio2;
    private Juego juegoSiguiente;
    private ArrayList<Set> sets;

    public Juego(Jugador jugador1, Jugador jugador2, Juez juez) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.juez = juez;
        this.juegoPrevio1 = null;
        this.juegoPrevio2 = null;
        this.juegoSiguiente = null;
        this.sets = new ArrayList<>();

    }

    public Juego(Juego juegoPrevio1, Juego juegoPrevio2, Juez juez) {
        this.juez = juez;
        this.juegoPrevio1 = juegoPrevio1;
        this.juegoPrevio2 = juegoPrevio2;
        this.jugador1 = juegoPrevio1.getGanador();
        this.jugador2 = juegoPrevio2.getGanador();
        this.juegoSiguiente = null;
        this.sets = new ArrayList<>();
    }
    
    public Jugador getGanador(){
        int jugador1 = 0; 
            int jugador2 = 0;
            for (int i = 0; i < getSets().size(); i++) {
                Set set = getSets().get(i);
                if ((set.getPuntosJugador1()-2) == set.getPuntosJugador2()){
                    jugador1 ++;
                }else if (set.getPuntosJugador1() == (set.getPuntosJugador2()-2)){
                    jugador2 ++;
                }else if(set.getPuntosJugador1() == 6){
                    jugador1 ++;
                }else if(set.getPuntosJugador2() == 6){
                    jugador2 ++;
                } 
            }
            if (jugador1 > jugador2){
                return this.jugador1;
            }else{
                return this.jugador2;
            }
    }

    // Revisar por si se explota el codigo
    public boolean addSets(Set sets1, Set sets2, Set sets3) {
        if (!this.sets.contains(sets1) || !this.sets.contains(sets2) || !this.sets.contains(sets3)) {
            if (!this.sets.contains(sets1) && !this.sets.contains(sets2) && !this.sets.contains(sets3)) {
                this.sets.add(sets1);
                this.sets.add(sets2);
                this.sets.add(sets3);
            } else if (!this.sets.contains(sets1) && !this.sets.contains(sets2)) {
                this.sets.add(sets1);
                this.sets.add(sets2);
            } else if (!this.sets.contains(sets2) && !this.sets.contains(sets3)) {
                this.sets.add(sets2);
                this.sets.add(sets3);
            } else if (!this.sets.contains(sets1) && !this.sets.contains(sets3)) {
                this.sets.add(sets1);
                this.sets.add(sets3);
            } else if (!this.sets.contains(sets1)) {
                this.sets.add(sets1);
            } else if (!this.sets.contains(sets2)) {
                this.sets.add(sets2);
            } else if (!this.sets.contains(sets3)) {
                this.sets.add(sets3);
            }
            return true;
        }
        return false;
    }

    public boolean addSets(Set sets1, Set sets2) {
        if (!this.sets.contains(sets1) || !this.sets.contains(sets2)) {
            if (!this.sets.contains(sets1) && !this.sets.contains(sets2)) {
                this.sets.add(sets1);
                this.sets.add(sets2);
            } else if (!this.sets.contains(sets1)) {
                this.sets.add(sets1);
            } else if (!this.sets.contains(sets2)) {
                this.sets.add(sets2);
            }
            return true;
        }
        return false;
    }
    
    public Jugador getJugador1() {
        return jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public Juez getJuez() {
        return juez;
    }

    public ArrayList<Set> getSets() {
        return sets;
    }
    
}
