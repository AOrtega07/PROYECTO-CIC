package beans.caso;

import java.io.Serializable;
import java.util.ArrayList;
import beans.bitacora.Bitacora;
import beans.persona.Detective;
import beans.persona.Sospechoso;

public abstract class Caso  implements Serializable {

    protected static int contadorCasos = 10000;
    protected int id;
    protected String clave;
    protected String descripcion;
    protected String prioridad;
    protected Bitacora bitacora;
    protected Detective detective;
    protected ArrayList<Sospechoso> sospechoso;

    public Caso() {
        this.id = ++Caso.contadorCasos;
    }

    public Caso(int id) {
        this.id = id;
    }

    public Caso(String clave, String descripcion, String prioridad, Bitacora bitacora, Detective detective, ArrayList<Sospechoso> sospechosos) {
        this();
        this.id = id;
        this.clave = clave;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.bitacora = bitacora;
        this.detective = detective;
        this.sospechoso = sospechosos;
    }

    public static int getContadorCasos() {
        return contadorCasos;
    }

    public int getId() {
        return id;
    }

    public String getClave() {
        return clave;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public Bitacora getBitacora() {
        return bitacora;
    }

    public Detective getDetective() {
        return detective;
    }

    public static void setContadorCasos(int contadorCasos) {
        Caso.contadorCasos = contadorCasos;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public void setBitacora(Bitacora bitacora) {
        this.bitacora = bitacora;
    }

    public void setDetective(Detective detective) {
        this.detective = detective;
    }

    @Override
    public String toString() {
        return "Caso{" + "id=" + id + ", clave=" + clave + ", descripcion=" + descripcion + ", bitacora=" + bitacora + ", detective=" + detective + sospechoso + '}';
    }

    public abstract String mostrarAtributos();
}
