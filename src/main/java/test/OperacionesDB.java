
package test;

import beans.persona.Usuario;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;


public class OperacionesDB{
    
    public static void main(String[] args) {
          listarUsuario();
    }
    
    
    public static void actualizarUsuario(int id, String Nombre){
        DBConnection con = new DBConnection();
        String sql = "UPDATE usuario SET Nombre = '" + Nombre +"' WHERE id =" +id;
        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        finally{
            con.desconectar();
        }
    }
    
    public static void listarUsuario(){
        DBConnection con = new DBConnection();
        String sql = "SELECT * FROM usuario";
        try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                int id = rs.getInt("id");
                String Nombre = rs.getString("Nombre");
                String Apellido = rs.getString("Apellido");
                int Edad  = rs.getInt("Edad");
                String Usuario   = rs.getString("Usuario");
                String Email = rs.getString("Email");
                String Contrasena = rs.getString("Contrasena");
                String Identificacion = rs.getString("Identificacion");
                int Administrador = rs.getInt("Administrador");
                int Detective = rs.getInt("Detective");

                Usuario usuario = new Usuario(id, Nombre, Apellido, Edad, Usuario, Email, Contrasena, Identificacion, Administrador, Detective); 
                   
                         
                System.out.println(usuario.toString());
            }
        st.executeQuery(sql);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        finally{
            con.desconectar();
        }
    }
    
    public static void eliminarUsuario(int id){
        DBConnection con = new DBConnection();
        String sql = "DELETE FROM usuario WHERE id ="+ id;
        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        finally{
            con.desconectar();
        }
    }
    
    public static void crearUsuario(int id, String Nombre, String Apellido, int Edad, String Usuario, String Email,String Contrasena, String Identificacion){
       DBConnection con = new DBConnection();
        String sql = "INSERT INTO usuario VALUES ("+id+",'"+Nombre+"','"+Apellido+"',"+Edad+",'"+Usuario+"','"+Email+"','"+Contrasena+"','"+Identificacion+"',0,0)";
        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        finally{
            con.desconectar();
        } 
    }
    
}


