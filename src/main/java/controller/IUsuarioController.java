
package controller;


public interface IUsuarioController {
    
    public String login (String Usuario, String Contrasena);
    public String register(String Nombre, String Apellido,int Edad,String Usuario,String Email, String Contrasena, String Identificacion); 
    public String pedir(String Usuario);
    public String modificar(String Usuario, String nuevaContrasena, String nuevoNombre, String nuevosApellidos, String nuevoEmail, String nuevaIdentificacion);

    public String eliminar(String Usuario);
           
}
