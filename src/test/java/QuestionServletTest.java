import com.example.questone.controllers.QuestionServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.IOException;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class QuestionServletTest {


@Test
void doPostTest() throws ServletException, IOException {
        HttpServletResponse resp = mock(HttpServletResponse.class);
        HttpServletRequest req = mock(HttpServletRequest.class);
        RequestDispatcher dispatcher = mock(RequestDispatcher.class);
        QuestionServlet servlet = new QuestionServlet();

        when(req.getRequestDispatcher("/WEB-INF/questions.jsp")).thenReturn(dispatcher);

        servlet.doPost(req, resp);

        verify(req, times(1)).getRequestDispatcher("/WEB-INF/questions.jsp");
        verify(dispatcher).forward(req, resp);
  }
}