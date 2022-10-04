package beans.caso;

import java.util.ArrayList;
import beans.bitacora.Bitacora;
import beans.persona.Detective;
import beans.persona.Sospechoso;

public class Homicidio extends Caso {

    private Detective detectiveAux;

    public Homicidio() {
    }

    public Homicidio(int id) {
        super(id);
    }

    public Homicidio(Detective detectiveAux, String clave, String descripcion, String prioridad, Bitacora bitacora, Detective detective, ArrayList<Sospechoso> sospechosos) {
        super(clave, descripcion, prioridad, bitacora, detective, sospechosos);
        this.detectiveAux = detectiveAux;
    }

    public Detective getDetectiveAux() {
        return detectiveAux;
    }

    public void setDetectiveAux(Detective detectiveAux) {
        this.detectiveAux = detectiveAux;
    }

    @Override
    public String toString() {
        return "Homicidio{" + "detectiveAux=" + detectiveAux + super.toString() + '}';
    }

    @Override
    public String mostrarAtributos() {
        return this.id + ";" + this.detectiveAux + ";" + this.clave + ";" + this.descripcion + ";" + this.prioridad + ";" + this.bitacora + ";" + this.detective + ";" + this.sospechoso;
    }

}
