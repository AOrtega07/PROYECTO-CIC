package servlets;

import controller.CasoController;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServletCasoCrear", urlPatterns = {"/ServletCasoCrear"})
public class ServletCasoCrear extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public ServletCasoCrear() {
        super();

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        CasoController casos = new CasoController();

        String caso = request.getParameter("input-clave");
        String descripcion = request.getParameter("input-descripcion");
        String prioridad = request.getParameter("input-prioridad");
        String fecha = request.getParameter("input-fecha");
        String estado = request.getParameter("input-estado");
        String detective = request.getParameter("input-detect");

        String result = casos.registrarCasos(caso, descripcion, prioridad, fecha, estado, detective);

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println(result);
        out.flush();
        out.close();

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
