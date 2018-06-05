/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.epfc.javaweb.lesson32;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author jedepaepe
 */
@WebServlet(name = "HorlogeServlet", urlPatterns = {"/HorlogeServlet"})
public class HorlogeServlet extends HttpServlet {
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        // algorythme pour garder l'heure de chargement de la page
        LocalTime now = LocalTime.now();
        HttpSession httpSession = request.getSession();     // récupère une référence sur la session
        LocalTime start = (LocalTime) httpSession.getAttribute("key-start");    // récupère l'heure du premier chargement de page à partir de la session
        // start est-il valide (au premier chargement de la page, la session est vide)
        if(start == null) {
            start = now;        // initialise start avec l'heure courante
            httpSession.setAttribute("key-start", start);
        }
        
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        
        Duration duration = Duration.between(start, now);
        long seconds = duration.toMillis() / 1000;
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet HorlogeServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<section id='maincontent' class='twelve columns'>");
            out.println("<h2>Heure du premier chargement de la page: " + start.format(dateTimeFormatter) + "</h2>");
            out.println("<h2>Heure courante: " + now.format(dateTimeFormatter) + "</h2>");
            out.println("<h2>Nombre de secondes écoulées: " + seconds + "</h2>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Démo Servlet, affichage de l'horloge, de l'heure du premier chargement et du temps écoulé";
    }// </editor-fold>

}
