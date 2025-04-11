package edu.progavud.taller1.model;

import java.time.Duration;
import java.time.Instant;

import edu.progavud.taller1.Control.ControlLapso;

public class Lapso {

    private Duration tiempo;
    private Instant revision;
    private Instant instanteInicio;
    private Instant fin;
    private ControlLapso lapso;

    public Lapso(ControlLapso lapso){
        this.lapso = lapso;
    
    }

    public Duration getTiempo() {
        return tiempo;
    }

    public Instant getInstante() {
        return instanteInicio;
    }

    public Instant getFin() {
        return fin;
    }

    public void setFin(Instant fin) {
        this.fin = fin;
    }

    public Instant getRevision() {
        return revision;
    }

}
