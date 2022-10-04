
package beans.caso;

import java.sql.Date;


public class crearCasos {
    
    private String caso;
    private String descripcion;
    private String prioridad;
    private String fecha;
    private String estado;
    private String detective;

    public crearCasos(String caso, String descripcion, String prioridad, String fecha, String estado, String detective) {
        this.caso = caso;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.fecha = fecha;
        this.estado = estado;
        this.detective = detective;
        
        
        
    }

    public String getCaso() {
        return caso;
    }

    public void setCaso(String caso) {
        this.caso = caso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDetective() {
        return detective;
    }

    public void setDetective(String detective) {
        this.detective = detective;
    }

    @Override
    public String toString() {
        return "crearCasos{" + "caso=" + caso + ", descripcion=" + descripcion + ", prioridad=" + prioridad + ", fecha=" + fecha + ", estado=" + estado + ", detective=" + detective + '}';
    }
    
    
    

}