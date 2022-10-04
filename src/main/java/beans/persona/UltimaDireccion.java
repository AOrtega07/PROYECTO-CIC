package beans.persona;

public class UltimaDireccion {

    private String noVivienda;
    private String localidad;
    private String ciudad;
    private String departamento;
    private String pais;
    private boolean fotografia;
    private String decripcion;

    public UltimaDireccion() {
    }

    public UltimaDireccion(String noVivienda, String localidad, String ciudad, String departamento, String pais, boolean fotografia, String decripcion) {
        this.noVivienda = noVivienda;
        this.localidad = localidad;
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.pais = pais;
        this.fotografia = fotografia;
        this.decripcion = decripcion;
    }

    public String getNoVivienda() {
        return noVivienda;
    }

    public String getLocalidad() {
        return localidad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getPais() {
        return pais;
    }

    public boolean isFotografia() {
        return fotografia;
    }

    public String getDecripcion() {
        return decripcion;
    }

    public void setNoVivienda(String noVivienda) {
        this.noVivienda = noVivienda;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setFotografia(boolean fotografia) {
        this.fotografia = fotografia;
    }

    public void setDecripcion(String decripcion) {
        this.decripcion = decripcion;
    }

    @Override
    public String toString() {
        return "UltimaDireccion{" + "noVivienda=" + noVivienda + ", localidad=" + localidad + ", ciudad=" + ciudad + ", departamento=" + departamento + ", pais=" + pais + ", fotografia=" + fotografia + ", decripcion=" + decripcion + '}';
    }
}
