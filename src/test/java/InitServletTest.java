import com.example.questone.controllers.InitServlet;
import com.example.questone.entities.User;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.mockito.Mockito.*;

public class InitServletTest {

    @Test
    public void testDoPost() throws ServletException, IOException {
        InitServlet servlet = new InitServlet();
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse resp = mock(HttpServletResponse.class);
        RequestDispatcher requestDispatcher = mock(RequestDispatcher.class);
        HttpSession session = mock(HttpSession.class);
        session.setAttribute("user", new User("Nick", 0));

        when(req.getSession()).thenReturn(session);
        when(req.getParameter("textinput")).thenReturn("Nick");
        when(req.getRequestDispatcher("/question")).thenReturn(requestDispatcher);

        servlet.doPost(req, resp);

        verify(req, times(1)).getRequestDispatcher("/question");
        verify(requestDispatcher).forward(req, resp);

        
    }
}
