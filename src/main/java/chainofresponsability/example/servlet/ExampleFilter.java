package chainofresponsability.example.servlet;

import javax.servlet.*;
import java.io.IOException;

public class ExampleFilter implements Filter {

    public void init(FilterConfig config) throws ServletException {
        // Este método se llama una vez cuando el filtro se inicializa
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException, IOException {
        // Agregar una cadena al comienzo de la respuesta
        String message = "Este es un mensaje agregado por el filtro.\n";
        response.getWriter().write(message);

        // Continuar con el procesamiento de la solicitud
        chain.doFilter(request, response);
    }

    public void destroy() {
        // Este método se llama una vez cuando el filtro se elimina
    }
}
