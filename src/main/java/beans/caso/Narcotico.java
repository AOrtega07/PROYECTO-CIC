package beans.caso;

import java.util.ArrayList;
import beans.bitacora.Bitacora;
import beans.persona.Detective;
import beans.persona.Sospechoso;

public class Narcotico extends Caso {

    private String tipoNarcotico;

    public Narcotico() {
    }

    public Narcotico(String tipoNarcotico, String clave, String descripcion, String prioridad, Bitacora bitacora, Detective detective, ArrayList<Sospechoso> sospechosos) {
        super(clave, descripcion, prioridad, bitacora, detective, sospechosos);
        this.tipoNarcotico = tipoNarcotico;
    }

    public String getTipoNarcotico() {
        return tipoNarcotico;
    }

    public void setTipoNarcotico(String tipoNarcotico) {
        this.tipoNarcotico = tipoNarcotico;
    }

    @Override
    public String toString() {
        return "Caso » Narcotico   {" + "tipoNarcotico=" + tipoNarcotico + '}';
    }

    @Override
    public String mostrarAtributos() {
        return this.id + ";" + this.tipoNarcotico + ";" + this.clave + ";" + this.descripcion + ";" + this.prioridad
                + ";" + this.bitacora + ";" + this.detective + ";" + this.sospechoso;
    }

}
