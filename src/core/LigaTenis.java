package core;

import java.util.ArrayList;

public class LigaTenis {
    
    private ArrayList<Campeonato> campeonatos;
    private ArrayList<Juez> jueces;
    private ArrayList<Jugador> jugadores;

    public LigaTenis() {
        this.campeonatos = new ArrayList<>();
        this.jueces = new ArrayList<>();
        this.jugadores = new ArrayList<>();
    }

    public boolean addJuez(Juez juez){
        if(!this.jueces.contains(juez)){
            this.jueces.add(juez);
            return true;
        }
        return false;
    }
    
    public boolean addJugador(Jugador jugador){
        if(!this.jugadores.contains(jugador)){
            this.jugadores.add(jugador);
            return true;
        }
        return false;
    }
    
    public boolean addCampeonato(Campeonato campeonato){
        if(!this.campeonatos.contains(campeonato)){
            this.campeonatos.add(campeonato);
            return true;
        }
        return false;
    }
    
    public Jugador getJugador(int index){
        return this.jugadores.get(index);
    }
    
    public Juez getJuez(int index){
        return this.jueces.get(index);
    }
    
    public Campeonato getCampeonato(int index){
        return this.campeonatos.get(index);
    }
    
    public void calcSetsGanadosJugadoresCampeonato(int index){
        
    }
    
}
