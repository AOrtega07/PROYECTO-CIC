package controller;

import java.sql.Statement;
import beans.caso.crearCasos;
import connection.DBConnection;
import com.google.gson.Gson;

public class CasoController implements ICasoController {

    @Override
    public String registrarCasos(String caso, String descripcion, String prioridad, String fecha, String estado, String detective) {
        Gson gson = new Gson();
        DBConnection con = new DBConnection();

        String sql = "INSERT INTO caso VALUES('" + caso + "', '" + descripcion + "', '" + prioridad
                + "', '" + fecha + "', '" + estado + "', " + detective + ")";

        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);
            crearCasos casos = new crearCasos(caso, descripcion, prioridad, fecha, estado, detective);
            st.close();
            return gson.toJson(casos);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        } finally {
            con.desconectar();
        }

        return "false";

    }
}
