package beans.persona;

import java.io.Serializable;

public class Usuario implements Serializable {

    protected int id;
    protected String Nombre;
    protected String Apellido;
    protected int Edad;
    protected String Usuario;
    protected String Email;
    protected String Contrasena;
    protected String Identificacion;
    protected int Administrador;
    protected int Detective;

    public Usuario() {
    }

    public Usuario(int id) {
        this.id = id;
    }

    public Usuario(String Email, String Contrasena) {
        this.Email = Email;
        this.Contrasena = Contrasena;
    }
    
    
    public Usuario(int id, String Nombre, String Apellido) {
        this.id = id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
    }

    public Usuario(int id, String Nombre, String Apellido, int Edad, String Usuario, String Email, String Contrasena, String Identificacion, int Administrador, int Detective) {
        this.id = id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.Usuario = Usuario;
        this.Email = Email;
        this.Contrasena = Contrasena;
        this.Identificacion = Identificacion;
        this.Administrador = Administrador;
        this.Detective = Detective;
    }
       

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contraseña) {
        this.Contrasena = Contrasena;
    }

    public String getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(String Identificacion) {
        this.Identificacion = Identificacion;
    }

    public int getAdministrador() {
        return Administrador;
    }

    public void setAdministrador(int Administrador) {
        this.Administrador = Administrador;
    }

    public int getDetective() {
        return Detective;
    }

    public void setDetective(int Detective) {
        this.Detective = Detective;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", Edad=" + Edad + ", Usuario=" + Usuario + ", Contrasena=" + Contrasena + ", Identificacion=" + Identificacion + ", Administrador=" + Administrador + ", Detective=" + Detective + '}';
    }

    

 
}
