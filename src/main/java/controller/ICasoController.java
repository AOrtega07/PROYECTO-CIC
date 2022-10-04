package controller;

import java.sql.Date;

public interface ICasoController {

    public String registrarCasos(String caso, String descripcion, String prioridad, String fecha, String estado, String detective);

}
