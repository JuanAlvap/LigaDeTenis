package core;

import java.util.ArrayList;
import java.util.HashMap;

public class LigaTenis {

    private ArrayList<Campeonato> campeonatos;
    private ArrayList<Juez> jueces;
    private ArrayList<Jugador> jugadores;

    public LigaTenis() {
        this.campeonatos = new ArrayList<>();
        this.jueces = new ArrayList<>();
        this.jugadores = new ArrayList<>();
    }

    public boolean addJuez(Juez juez) {
        if (!this.jueces.contains(juez)) {
            this.jueces.add(juez);
            return true;
        }
        return false;
    }

    public boolean addJugador(Jugador jugador) {
        if (!this.jugadores.contains(jugador)) {
            this.jugadores.add(jugador);
            return true;
        }
        return false;
    }

    public boolean addCampeonato(Campeonato campeonato) {
        if (!this.campeonatos.contains(campeonato)) {
            this.campeonatos.add(campeonato);
            return true;
        }
        return false;
    }

    public Jugador getJugador(int index) {
        return this.jugadores.get(index);
    }

    public Juez getJuez(int index) {
        return this.jueces.get(index);
    }

    public Campeonato getCampeonato(int index) {
        return this.campeonatos.get(index);
    }

    /*
    El jugador: Rafael Nadal gano 3 sets en el campeonato
    El jugador: Martina Hingis gano 1 sets en el campeonato
    El jugador: Roger Federer gano 1 sets en el campeonato
    El jugador: Monica Seles gano 5 sets en el campeonato
    El jugador: Novak Djokovic gano 0 sets en el campeonato
    El jugador: Venus Williams gano 3 sets en el campeonato
    El jugador: Andre Agassi gano 6 sets en el campeonato
    El jugador: Martina Navratilova gano 0 sets en el campeonato 
     */
    public void calcSetsGanadosJugadoresCampeonato(int index) {
        Campeonato campeonato = getCampeonato(index);
        HashMap<String, Integer> setsJugador = new HashMap<String, Integer>();
        for (Juego juego : campeonato.getJuegos()) {
            String nombre1 = juego.getJugador1().getNombre();
            String nombre2 = juego.getJugador2().getNombre();
            if (!setsJugador.containsKey(juego.getJugador1().getNombre())){
                setsJugador.put(juego.getJugador1().getNombre(), 0);
            }
            if (!setsJugador.containsKey(juego.getJugador2().getNombre())){
                setsJugador.put(juego.getJugador2().getNombre(), 0);
            }
            for (Set set : juego.getSets()) {
                if (set.getPuntosJugador1() > set.getPuntosJugador2()){
                    setsJugador.put(nombre1, setsJugador.get(nombre1)+1);
                }else{
                    setsJugador.put(nombre2, setsJugador.get(nombre2)+1);
                }
            }
        }
        
        setsJugador.forEach( (k, v) -> { System.out.println("El Jugador: " +k + " gano " + v+ " sets en el campeonato"); } );
    }

}
