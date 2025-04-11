package edu.progavud.taller1.Control;

import edu.progavud.taller1.control.ControlPrincipal;
import edu.progavud.taller1.model.Lapso;

public class ControlLapso {
    
    private Lapso lapso;
    private ControlPrincipal controlPrincipal;
    
    public ControlLapso(ControlPrincipal controlPrincipal){
        this.controlPrincipal = controlPrincipal;
    }

    public boolean isContarLapso(){
        lapso.setFin(lapso.getInstante().now().plus(lapso.getTiempo().ofMinutes(1)));
        while(lapso.getRevision().now().isBefore(lapso.getFin())){
            return true;
        }
        return false;
    }
}
