package edu.br.infnet;

import java.io.*;
import java.util.Date;
import java.util.Enumeration;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        String telefone = request.getParameter("fone");

        out.println("<h1> Bem vinda " + nome + " ! </h1>");
        out.println("<h3>" + email + "</h3>");
        out.println("<h3>" + telefone + "</h3>");
        out.println("<h2>" + new Date() + "</h2>");

        Enumeration<String>nomesCabec = request.getHeaderNames();
        while (nomesCabec.hasMoreElements()){

            String nomeCabec = nomesCabec.nextElement();
            String valorCabec = request.getHeader(nomeCabec);

            out.println("<h2>" +
                            "<b style='color: red'>" + nomeCabec + "</b>" +
                             " ---- " +
                            "<b style='color: blue'>" + valorCabec + "</b>" +
                    "</h2>");
        }
        out.println("</body></html>");
    }

    public void destroy() {
    }
}