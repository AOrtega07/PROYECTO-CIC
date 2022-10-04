package beans.bitacora;

import java.io.Serializable;

public class Anotacion implements Serializable {

    private String fecha;
    private String observacion;

    public Anotacion() {
    }

    public Anotacion(String fecha, String observacion) {
        this.fecha = fecha;
        this.observacion = observacion;
    }

    public String getFecha() {
        return fecha;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Override
    public String toString() {
        return fecha + ";" + observacion;
    }

}
