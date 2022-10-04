package beans.persona;

import java.io.Serializable;

public class Detective extends Usuario implements Serializable {

    private int añosExperiencia;
    private String tipoCaso;

    public Detective() {
    }

    public Detective(int id) {
        this.id = id;
    }

    public Detective(int añosExperiencia, String tipoCaso, int id, String nombre, String apellido) {
        super(id, nombre, apellido);
        this.añosExperiencia = añosExperiencia;
        this.tipoCaso = tipoCaso;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public String getTipoCaso() {
        return tipoCaso;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    public void setTipoCaso(String tipoCaso) {
        this.tipoCaso = tipoCaso;
    }

    @Override
    public String toString() {
        return "Detective{" + super.toString() + "a\u00f1osExperiencia=" + añosExperiencia + ", tipoCaso=" + tipoCaso + '}';
    }

   

}

