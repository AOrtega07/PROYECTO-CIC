package controller;

import java.sql.ResultSet;
import java.sql.Statement;
import beans.persona.Usuario;
import connection.DBConnection;
import com.google.gson.Gson;

public class UsuarioController implements IUsuarioController {

    @Override
    public String login(String Usuario, String Contrasena) {
        Gson gson = new Gson();
        DBConnection con = new DBConnection();

        String sql = "SELECT * FROM usuario WHERE Usuario = '" + Usuario + "' and Contrasena = '" + Contrasena + "'";
        try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");
                String Nombre = rs.getString("Nombre");
                String Apellido = rs.getString("Apellido");
                int Edad = rs.getInt("Edad");
                String Email = rs.getString("Email");
                String Identificacion = rs.getString("Identificacion");
                int Administrador = rs.getInt("Administrador");
                int Detective = rs.getInt("Detective");

                Usuario usuario = new Usuario(id, Nombre, Apellido, Edad, Usuario, Email, Contrasena, Identificacion, Administrador, Detective);

                return gson.toJson(usuario);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        } finally {
            con.desconectar();
        }

        return "false";
    }

    @Override
    public String register(String Nombre, String Apellido, int Edad, String Usuario, String Email, String Contrasena, String Identificacion) {
        Gson gson = new Gson();
        DBConnection con = new DBConnection();

        String sql = "INSERT INTO usuario VALUES (NULL,'" + Nombre + "','" + Apellido + "'," + Edad + ",'" + Usuario + "','" + Email + "','" + Contrasena + "','" + Identificacion + "',0,0)";

        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);

            Usuario usuario = new Usuario(Email, Contrasena);

            st.close();
            return gson.toJson(usuario);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        } finally {
            con.desconectar();
        }

        return "false";
    }

    @Override
    public String pedir(String Usuario) {
        Gson gson = new Gson();
        DBConnection con = new DBConnection();

        String sql = "SELECT * FROM usuario WHERE Usuario = 'RRR'";

        try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");
                String Nombre = rs.getString("Nombre");
                String Apellido = rs.getString("Apellido");
                int Edad = rs.getInt("Edad");
                String Email = rs.getString("Email");
                String Contrasena = rs.getString("Contrasena");
                String Identificacion = rs.getString("Identificacion");
                int Administrador = rs.getInt("Administrador");
                int Detective = rs.getInt("Detective");

                Usuario usuario = new Usuario(id, Nombre, Apellido, Edad, Usuario, Email, Contrasena, Identificacion, Administrador, Detective);

                return gson.toJson(usuario);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        } finally {
            con.desconectar();
        }

       return "false";
      
    }

    @Override
    public String modificar(String Usuario, String nuevaContrasena, String nuevoNombre, String nuevosApellidos, String nuevoEmail, String nuevaIdentificacion) {
        DBConnection con = new DBConnection();

        String sql = "Update Usuario set Contrasena = '" + nuevaContrasena
                + "', Nombre = '" + nuevoNombre + "', "
                + "Apellido = '" + nuevosApellidos + "', Email = '"
                + nuevoEmail + "'";


        sql += " where Usuario = '" + Usuario + "'";

        try {

            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);

            return "true";
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }

        return "false";

    }



    @Override
    public String eliminar(String Usuario) {
                DBConnection con = new DBConnection();

        String sql1 = "Delete from usuario where Usuario = '" + Usuario + "'";

        try {
            Statement st = con.getConnection().createStatement();
            
            st.executeUpdate(sql1);

            return "true";
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }

        return "false";
    }

}
