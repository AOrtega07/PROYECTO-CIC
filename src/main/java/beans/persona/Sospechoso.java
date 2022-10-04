package beans.persona;

public class Sospechoso extends Usuario {

    private String alias;
    private int edad;
    private UltimaDireccion ultimaDireccion;

    public Sospechoso() {
    }

    public Sospechoso(int id, String nombre, String apellido, String alias, int edad, UltimaDireccion ultimaDireccion) {
        super(id, nombre, apellido);
        this.alias = alias;
        this.edad = edad;
        this.ultimaDireccion = ultimaDireccion;
    }

    public String getAlias() {
        return alias;
    }

    public int getEdad() {
        return edad;
    }

    public UltimaDireccion getUltimaDireccion() {
        return ultimaDireccion;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setUltimaDireccion(UltimaDireccion ultimaDireccion) {
        this.ultimaDireccion = ultimaDireccion;
    }

    @Override
    public String toString() {
        return "Sospechoso {" + super.toString() + "; ALIAS: " + alias + "; EDAD: " + edad + " AÑOS; ULTIMA DIRECCIÓN: " + ultimaDireccion + '}';
    }

  

}
