//
package servlets;

import controller.UsuarioController;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "ServletUsuarioRegistro", urlPatterns = {"/ServletUsuarioRegistro"})
public class ServletUsuarioRegistro extends HttpServlet {

    public ServletUsuarioRegistro() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        UsuarioController usuario = new UsuarioController();
        String Nombre =  request.getParameter("Nombre");
        String Apellido =  request.getParameter("Apellido");
        int Edad =  Integer.parseInt(request.getParameter("Edad"));
        String Usuario = request.getParameter("Usuario");
        String Email = request.getParameter("Email");
        String Contrasena = request.getParameter("Contrasena");
        String Identificacion = request.getParameter("Identificacion");

        String result = usuario.register(Nombre,Apellido,Edad, Usuario, Email, Contrasena, Identificacion);
        response.setContentType("text/hmtl;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println(result);
        out.flush();
        out.close();
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         doGet(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
