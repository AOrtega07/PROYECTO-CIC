package beans.bitacora;

import java.util.ArrayList;

public class Bitacora {

    private ArrayList<Anotacion> anotaciones;

    public Bitacora() {
    }

    public Bitacora(ArrayList<Anotacion> anotaciones) {
        this.anotaciones = anotaciones;
    }

    public ArrayList<Anotacion> getAnotaciones() {
        return anotaciones;
    }

    public void setAnotaciones(ArrayList<Anotacion> anotaciones) {
        this.anotaciones = anotaciones;
    }

    @Override
    public String toString() {
        return "" + anotaciones;
    }

    public void agregarAnotacion(Anotacion anotacion) {
        this.anotaciones.add(anotacion);
    }

    public void listarAnotaciones() {
        for (Anotacion anotacion : anotaciones) {
            System.out.println(anotaciones.size() + ". " + anotacion);
        }
    }
}
