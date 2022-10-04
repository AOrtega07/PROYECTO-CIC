package beans.caso;

import java.util.ArrayList;
import beans.bitacora.Bitacora;
import beans.persona.Detective;
import beans.persona.Sospechoso;

public class CiberCrimen extends Caso {

    private String cibercrimenAsociado;

    public CiberCrimen() {
    }

    public CiberCrimen(int id) {
        super(id);
    }

    public CiberCrimen(String cibercrimenAsociado, String clave, String descripcion, String prioridad, Bitacora bitacora, Detective detective, ArrayList<Sospechoso> sospechosos) {
        super(clave, descripcion, prioridad, bitacora, detective, sospechosos);
        this.cibercrimenAsociado = cibercrimenAsociado;
    }

    public String getCibercrimenAsociado() {
        return cibercrimenAsociado;
    }

    public void setCibercrimenAsociado(String cibercrimenAsociado) {
        this.cibercrimenAsociado = cibercrimenAsociado;
    }

    @Override
    public String toString() {
        return "Cibercrimen{" + "cibercrimenAsociado=" + cibercrimenAsociado + super.toString() + '}';
    }

    @Override
    public String mostrarAtributos() {
        return this.id + ";" + cibercrimenAsociado + ";" + this.clave + ";" + this.descripcion + ";"
                + this.prioridad + ";" + this.bitacora + ";" + this.detective + ";" + this.sospechoso;
    }

}